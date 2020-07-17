import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";
import { ActivatedRoute, ParamMap } from "@angular/router";
import { ResultsService } from "./results.service";
import { IResultsModel } from "./results.model";

@Component({
  selector: "app-results-cards",
  templateUrl: "./results-cards.component.html",
  styleUrls: ["./results-cards.component.scss"],
})
export class ResultsCardsComponent implements OnInit {
  @ViewChild("searchValue") searchValue: ElementRef;

  private results: IResultsModel;

  public searchText: string;
  public monthText: string;

  constructor(
    private _route: ActivatedRoute,
    private resultsService: ResultsService
  ) {}

  ngOnInit() {
    this._route.paramMap.subscribe((params: ParamMap) => {
      this.searchText = params.get("search");
      this.monthText = params.get("month");
      this.ngOnStartSearch(this.searchText, this.monthText);
    });
  }

  ngOnStartSearch(searchText: string, monthText?: string) {
    this.resultsService.getResultData(searchText, monthText).subscribe(
      (resultData: any) => {
        if (resultData["data"]) {
          if (resultData["data"].length > 0) {
            this.results = resultData["data"];
          } else {
            this.results = null;
          }
        }
      },
      (err) => console.error(err)
    );

    return this.results;
  }

  getResults() {
    return this.results;
  }
}

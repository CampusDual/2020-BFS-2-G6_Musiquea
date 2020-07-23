import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, ParamMap, Router } from "@angular/router";
import { ResultsService } from "./results.service";
import { IResultsModel } from "./results.model";

@Component({
  selector: "app-results-cards",
  templateUrl: "./results-cards.component.html",
  styleUrls: ["./results-cards.component.scss"],
})
export class ResultsCardsComponent implements OnInit {

  results: IResultsModel;

  searchValue: string;
  monthValue: string;

  constructor(
    private router: Router,
    private actRoute: ActivatedRoute,
    private resultsService: ResultsService
  ) { }

  ngOnInit() {
    this.actRoute.paramMap.subscribe((params: ParamMap) => {
      this.searchValue = params.get("search");
      this.monthValue = params.get("month");
      this.ngOnStartSearch(this.searchValue, this.monthValue);
    });
  }

  ngOnStartSearch(searchValue: string, monthValue?: string) {
    this.resultsService.getResultData(searchValue, monthValue).subscribe(
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

  public openDetail(concertId: number) {
					this.router.navigate(['main/concerts', concertId]);
  }

  public getCollaborators(collaborators: any) {
    if (collaborators == 0) {
      return "";
    } else {
      return " +";
    }
  }

  public getPlace(place_name: string, city: string) {
    if (place_name == null && city == null) {
      return "Concierto online";
    } else {
      return place_name + ", " + city;
    }
  }

  public getDate(concert_date: Date) {
    return new Date(concert_date).toLocaleString();
  }
}

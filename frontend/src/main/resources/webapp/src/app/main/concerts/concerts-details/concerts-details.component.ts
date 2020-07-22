import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";
import { Router, ActivatedRoute, ParamMap } from "@angular/router";
import { PlatformLocation } from "@angular/common";
import { IConcertsModel } from "./concerts.model";
import { ConcertsService } from "./concerts.service";

@Component({
  selector: "app-concerts-details",
  templateUrl: "./concerts-details.component.html",
  styleUrls: ["./concerts-details.component.scss"],
})
export class ConcertsDetailsComponent implements OnInit {
  @ViewChild("collaboratorsTitle") collaboratorsTitle: ElementRef;
  @ViewChild("collaborators") collaborators: ElementRef;

  details: IConcertsModel;

  concertId: number;
  constructor(
    private router: Router,
    private actRoute: ActivatedRoute,
    private location: PlatformLocation,
    private concertsService: ConcertsService
  ) {
    this.location.onPopState(() => {
      this.goHome();
    });
  }

  ngOnInit() {
    this.actRoute.paramMap.subscribe((params: ParamMap) => {
      this.concertId = parseInt(params.get("concert_id"));
      this.ngOnStartSearch(this.concertId);
    });
  }

  goHome() {
    this.router.navigate(["../../home/recommendations"], {
      relativeTo: this.actRoute
    });
  }

  onSubmit($event) {
    if ($event == "") {
      this.goHome();
    } else {
      localStorage.setItem('search', $event);
      this.router.navigate(["../../home/results/" + $event], {
        relativeTo: this.actRoute
      });
    }
  }

  ngOnStartSearch(concertId: number) {
    this.concertsService.getDetailsData(concertId).subscribe(
      (resultData: any) => {
        if (resultData["data"]) {
          if (resultData["data"].length > 0) {
            this.details = resultData["data"];
          } else {
            this.details = null;
          }
        }
      },
      (err) => console.error(err)
    );

    return this.details;
  }

  getDetails() {
    return this.details;
  }

  public getCollaborators(collaborators: string) {
    if (collaborators != null) {
      this.collaboratorsTitle.nativeElement.style.display = "block";
      let collaborator = new Array(collaborators.split(", "));
      let list = this.collaborators.nativeElement;

      while (list.firstChild) {
        list.removeChild(list.firstChild);
      }

      for (const name in collaborator) {
        let element = document.createElement("li");
        element.innerHTML = name;
        list.appendChild(element);
      }
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

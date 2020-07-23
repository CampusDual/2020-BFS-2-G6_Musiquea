import { Component, OnInit } from "@angular/core";
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

  det: IConcertsModel;

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
            this.det = resultData["data"];
          } else {
            this.det = null;
          }
        }
      },
      (err) => console.error(err)
    );

    return this.det;
  }

  getDetails() {
    return this.det;
  }

  public getCollaborators(collaborators: string) {
    if (collaborators != null) {
      return true;
    } else {
      return false;
    }
  }

  public getPlace(place_name: string, city: string, province: string) {
    if (place_name == null && city == null && province == null) {
      return false;
    } else {
      return true;
    }
  }

  public getDate(concert_date: Date) {
    return new Date(concert_date).toLocaleString();
  }

  getButtonValue(type_id: any) {
    let buttonValue = "";
    if (type_id == 1) {
      buttonValue = 'STREAMING';
    } else {
      buttonValue = 'TICKETS';
    }
    return buttonValue;
  }

}

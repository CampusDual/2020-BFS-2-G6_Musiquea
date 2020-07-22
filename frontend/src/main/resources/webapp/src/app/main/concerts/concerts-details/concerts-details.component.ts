import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";
import { Router, ActivatedRoute } from "@angular/router";
import { PlatformLocation } from "@angular/common";

@Component({
  selector: "app-concerts-details",
  templateUrl: "./concerts-details.component.html",
  styleUrls: ["./concerts-details.component.scss"],
})
export class ConcertsDetailsComponent implements OnInit {
  @ViewChild("searchText") searchText: ElementRef;

  search: string;
  router: string;
  constructor(
    private _router: Router,
    private actRoute: ActivatedRoute,
    private location: PlatformLocation
  ) {
    this.router = _router.url;

    this.location.onPopState(() => {
      this.goHome();
    });
  }

  ngOnInit() {}

  goHome() {
    this._router.navigate(["../../home/recommendations"], {
      relativeTo: this.actRoute,
    });
    this.search = "";
  }

  onSubmit($event) {
    if ($event == "") {
      this.goHome();
    } else {
      this._router.navigate(["../../home/results/" + $event], {
        relativeTo: this.actRoute,
      });
    }
  }

  getButtonValue(type_id: any) {
    let buttonValue = "";
    if (type_id == 1) {
      buttonValue == "{{ 'STREAMING' | oTranslate }}";
    } else {
      buttonValue == "{{ 'TICKETS' | oTranslate }}";
    }
    return buttonValue;
  }

}

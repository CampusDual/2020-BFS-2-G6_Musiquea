import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";
import { Router, ActivatedRoute } from "@angular/router";
import { PlatformLocation } from "@angular/common";

@Component({
  selector: "home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.scss"],
})
export class HomeComponent implements OnInit {
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

  ngOnInit() {
    document.getElementById("formMonth").style.display = "none";
  }

  goHome() {
    this._router.navigate(["../home/recommendations"], {
      relativeTo: this.actRoute,
    });
    let div = document.getElementById("formMonth");
    div.style.display = "none";
    this.search = "";
  }

  changeMonth($event) {
    let searchValue = this.searchText.nativeElement.value;
    this._router.navigate(["../home/results/" + searchValue + "/" + $event], {
      relativeTo: this.actRoute,
    });
  }

  onSubmit($event) {
    if ($event == "") {
      this.goHome();
    } else {
      this._router.navigate(["../home/results/" + $event], {
        relativeTo: this.actRoute,
      });
      let month = document.getElementById("formMonth");
      month.style.display = "block";
      this.getNextMonths();
    }
  }

  getNextMonths() {
    let select = document.getElementById("month");

    while (select.firstChild) {
      select.removeChild(select.firstChild);
    }

    let currentDate = new Date();
    let currentMonth = currentDate.getUTCMonth() + 1;
    let month = currentMonth;
    let firstOption = true;

    if (firstOption) {
      let option = document.createElement("option");
      let year = currentDate.getUTCFullYear();
      let day;

      if (currentDate.getUTCDate() >= 1 && currentDate.getUTCDate() <= 9) {
        day = "0" + currentDate.getUTCDate();
      } else {
        day = "" + currentDate.getUTCDate();
      }

      if (month == 12) {
        option.value =
          year + "-" + month + "-" + day + "_" + (year + 1) + "-01-01";
      } else {
        if (month >= 1 && month <= 9 && month + 1 != 10) {
          option.value =
            year +
            "-0" +
            month +
            "-" +
            day +
            "_" +
            year +
            "-0" +
            (month + 1) +
            "-01";
        } else if (month >= 1 && month <= 9 && month + 1 == 10) {
          option.value =
            year +
            "-0" +
            month +
            "-" +
            day +
            "_" +
            year +
            "-" +
            (month + 1) +
            "-01";
        } else {
          option.value =
            year +
            "-" +
            month +
            "-" +
            day +
            "_" +
            year +
            "-" +
            (month + 1) +
            "-01";
        }
      }
      option.innerHTML = this.getMonthName(month);
      select.appendChild(option);
      month++;
    }

    do {
      let option = document.createElement("option");
      let year = currentDate.getUTCFullYear();
      if (month == 12) {
        option.value = year + "-" + month + "-01_" + (year + 1) + "-01-01";
      } else {
        option.value = this.getOptionValue(month, year);
      }
      option.innerHTML = this.getMonthName(month);
      select.appendChild(option);
      month++;
    } while (month <= 12);

    month = 1;

    do {
      let option = document.createElement("option");
      let year = currentDate.getUTCFullYear() + 1;
      option.value = this.getOptionValue(month, year);
      option.innerHTML = this.getMonthName(month);
      select.appendChild(option);
      month++;
    } while (month < currentMonth);
  }

  getOptionValue(month, year) {
    let value;
    if (month >= 1 && month <= 9 && month + 1 != 10) {
      value = year + "-0" + month + "-01_" + year + "-0" + (month + 1) + "-01";
    } else if (month >= 1 && month <= 9 && month + 1 == 10) {
      value = year + "-0" + month + "-01_" + year + "-" + (month + 1) + "-01";
    } else {
      value = year + "-" + month + "-01_" + year + "-" + (month + 1) + "-01";
    }
    return value;
  }

  getMonthName(month) {
    let monthName;

    switch (month) {
      case 1:
        monthName = "Enero";
        break;
      case 2:
        monthName = "Febrero";
        break;
      case 3:
        monthName = "Marzo";
        break;
      case 4:
        monthName = "Abril";
        break;
      case 5:
        monthName = "Mayo";
        break;
      case 6:
        monthName = "Junio";
        break;
      case 7:
        monthName = "Julio";
        break;
      case 8:
        monthName = "Agosto";
        break;
      case 9:
        monthName = "Septiembre";
        break;
      case 10:
        monthName = "Octubre";
        break;
      case 11:
        monthName = "Noviembre";
        break;
      case 12:
        monthName = "Diciembre";
        break;
    }
    return monthName;
  }
}

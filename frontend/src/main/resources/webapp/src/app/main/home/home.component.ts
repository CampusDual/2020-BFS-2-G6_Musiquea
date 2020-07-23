import { Component, OnInit, ViewChild, ElementRef } from "@angular/core";
import { Router, ActivatedRoute, ParamMap } from "@angular/router";
import { PlatformLocation } from "@angular/common";

@Component({
  selector: "home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.scss"],
})
export class HomeComponent implements OnInit {
  @ViewChild("search") search: ElementRef;
  @ViewChild("formMonth") formMonth: ElementRef;
  @ViewChild("month") month: ElementRef;

  searchValue: string;

  constructor(
    private router: Router,
    private actRoute: ActivatedRoute,
    private location: PlatformLocation
  ) {
    this.location.onPopState(() => {
      this.goHome();
    });
  }

  ngOnInit() {
    this.formMonth.nativeElement.style.display = "none";
    const myData = localStorage.getItem("search");
    if (myData != null) {
      this.formMonth.nativeElement.style.display = "block";
      this.search.nativeElement.value = myData;
      this.getNextMonths();
    }
  }

  goHome() {
    this.router.navigate(["../home/recommendations"], {
      relativeTo: this.actRoute
    });
    this.formMonth.nativeElement.style.display = "none";
    localStorage.removeItem("search");
  }

  changeMonth($event) {
    if (this.search.nativeElement.value != "") {
      this.searchValue = this.search.nativeElement.value
    }
    this.router.navigate(["../home/results/" + this.searchValue + "/" + $event], {
      relativeTo: this.actRoute
    });
  }

  onSubmit($event) {
    if ($event == "") {
      this.goHome();
    } else {
      this.router.navigate(["../home/results/" + $event], {
        relativeTo: this.actRoute
      });
      this.formMonth.nativeElement.style.display = "block";
      this.getNextMonths();
    }
  }

  getNextMonths() {
    while (this.month.nativeElement.firstChild) {
      this.month.nativeElement.removeChild(this.month.nativeElement.firstChild);
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
          option.value = year + "-0" + month + "-" + day + "_" + year + "-0" + (month + 1) + "-01";
        } else if (month >= 1 && month <= 9 && month + 1 == 10) {
          option.value = year + "-0" + month + "-" + day + "_" + year + "-" + (month + 1) + "-01";
        } else {
          option.value = year + "-" + month + "-" + day + "_" + year + "-" + (month + 1) + "-01";
        }
      }
      option.innerHTML = this.getMonthName(month);
      this.month.nativeElement.appendChild(option);
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
      this.month.nativeElement.appendChild(option);
      month++;
    } while (month <= 12);

    month = 1;

    do {
      let option = document.createElement("option");
      let year = currentDate.getUTCFullYear() + 1;
      option.value = this.getOptionValue(month, year);
      option.innerHTML = this.getMonthName(month);
      this.month.nativeElement.appendChild(option);
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

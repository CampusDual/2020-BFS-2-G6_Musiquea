import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { directiveCreate } from '@angular/core/src/render3/instructions';
import { getLocaleMonthNames } from '@angular/common';
import { MatOptionSelectionChange } from '@angular/material';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(
    private router: Router,
    private actRoute: ActivatedRoute
  ) {
  }

  ngOnInit() {
    document.getElementById("formMonth").style.display = "none";
  }

  navigate() {
    this.router.navigate(['../', 'login'], { relativeTo: this.actRoute });
  }

  goHome() {
    let div = document.getElementById("formMonth");
    div.style.display = "none";
  }

  onSubmit(form) {
    this.router.navigate(['../home/results'], { relativeTo: this.actRoute });
    let div = document.getElementById("formMonth");
    div.style.display = "block";
    this.getNextMonths();
  }

  getNextMonths() {
    let select = document.getElementById("month");
    let currentDate = new Date();
    let currentMonth = (currentDate.getUTCMonth() + 1);
    let month = currentMonth;
    let firstOption = true;

    if (firstOption) {
      let option = document.createElement('option');
      let year = currentDate.getUTCFullYear();
      let day;

      if (currentDate.getUTCDate() >= 1 && currentDate.getUTCDate() <= 9) {
        day = "-0" + (currentDate.getUTCDate());
      }

      if (month == 12) {
        option.value = year + "-" + month + day + (year + 1) + "-01-01";
      } else {
        if (month >= 1 && month <= 9 && (month + 1) != 10) {
          option.value = year + "-0" + month + day + "/" + year + "-0" + (month + 1) + "-01";
        } else if (month >= 1 && month <= 9 && (month + 1) == 10) {
          option.value = year + "-0" + month + day + year + "-" + (month + 1) + "-01";
        } else {
          option.value = year + "-" + month + day + year + "-" + (month + 1) + "-01";
        }
      }

      switch (month) {
        case 1:
          option.innerHTML = "Enero";
          break;
        case 2:
          option.innerHTML = "Febrero";
          break;
        case 3:
          option.innerHTML = "Marzo";
          break;
        case 4:
          option.innerHTML = "Abril";
          break;
        case 5:
          option.innerHTML = "Mayo";
          break;
        case 6:
          option.innerHTML = "Junio";
          break;
        case 7:
          option.innerHTML = "Julio";
          break;
        case 8:
          option.innerHTML = "Agosto";
          break;
        case 9:
          option.innerHTML = "Septiembre";
          break;
        case 10:
          option.innerHTML = "Octubre";
          break;
        case 11:
          option.innerHTML = "Noviembre";
          break;
        case 12:
          option.innerHTML = "Diciembre";
          break;
      }
      select.appendChild(option);
      month++;
    }

    do {
      let option = document.createElement('option');
      let year = currentDate.getUTCFullYear();
      if (month == 12) {
        option.value = year + "-" + month + "-01/" + (year + 1) + "-01-01";
      } else {
        if (month >= 1 && month <= 9 && (month + 1) != 10) {
          option.value = year + "-0" + month + "-01/" + year + "-0" + (month + 1) + "-01";
        } else if (month >= 1 && month <= 9 && (month + 1) == 10) {
          option.value = year + "-0" + month + "-01/" + year + "-" + (month + 1) + "-01";
        } else {
          option.value = year + "-" + month + "-01/" + year + "-" + (month + 1) + "-01";
        }
      }

      switch (month) {
        case 1:
          option.innerHTML = "Enero";
          break;
        case 2:
          option.innerHTML = "Febrero";
          break;
        case 3:
          option.innerHTML = "Marzo";
          break;
        case 4:
          option.innerHTML = "Abril";
          break;
        case 5:
          option.innerHTML = "Mayo";
          break;
        case 6:
          option.innerHTML = "Junio";
          break;
        case 7:
          option.innerHTML = "Julio";
          break;
        case 8:
          option.innerHTML = "Agosto";
          break;
        case 9:
          option.innerHTML = "Septiembre";
          break;
        case 10:
          option.innerHTML = "Octubre";
          break;
        case 11:
          option.innerHTML = "Noviembre";
          break;
        case 12:
          option.innerHTML = "Diciembre";
          break;
      }
      select.appendChild(option);
      month++;
    } while (month <= 12);

    month = 1;

    do {
      let option = document.createElement('option');
      let year = currentDate.getUTCFullYear() + 1;
      if (month >= 1 && month <= 9 && (month + 1) != 10) {
        option.value = year + "-0" + month + "-01/" + year + "-0" + (month + 1) + "-01";
      } else if (month >= 1 && month <= 9 && (month + 1) == 10) {
        option.value = year + "-0" + month + "-01/" + year + "-" + (month + 1) + "-01";
      } else {
        option.value = year + "-" + month + "-01/" + year + "-" + (month + 1) + "-01";
      }
      switch (month) {
        case 1:
          option.innerHTML = "Enero";
          break;
        case 2:
          option.innerHTML = "Febrero";
          break;
        case 3:
          option.innerHTML = "Marzo";
          break;
        case 4:
          option.innerHTML = "Abril";
          break;
        case 5:
          option.innerHTML = "Mayo";
          break;
        case 6:
          option.innerHTML = "Junio";
          break;
        case 7:
          option.innerHTML = "Julio";
          break;
        case 8:
          option.innerHTML = "Agosto";
          break;
        case 9:
          option.innerHTML = "Septiembre";
          break;
        case 10:
          option.innerHTML = "Octubre";
          break;
        case 11:
          option.innerHTML = "Noviembre";
          break;
        case 12:
          option.innerHTML = "Diciembre";
          break;
      }
      select.appendChild(option);
      month++;
    } while (month <= currentMonth);
  }

}
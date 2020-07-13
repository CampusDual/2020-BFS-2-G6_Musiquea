import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
	selector: 'home',
	templateUrl: './home.component.html',
	styleUrls: ['./home.component.scss']
})

export class HomeComponent implements OnInit {

	constructor(private router: Router, private actRoute: ActivatedRoute) {
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
					option.value = year + "-0" + month + day + "/" + year + "-" + (month + 1) + "-01";
				} else {
					option.value = year + "-" + month + day + "/" + year + "-" + (month + 1) + "-01";
				}
			}
			option.innerHTML = this.getMonthName(month);
			select.appendChild(option);
			month++;
		}

		do {
			let option = document.createElement('option');
			let year = currentDate.getUTCFullYear();
			if (month == 12) {
				option.value = year + "-" + month + "-01/" + (year + 1) + "-01-01";
			} else {
				option.value = this.getOptionValue(month, year);
			}
			option.innerHTML = this.getMonthName(month);
			select.appendChild(option);
			month++;
		} while (month <= 12);
		month = 1;

		do {
			let option = document.createElement('option');
			let year = currentDate.getUTCFullYear() + 1;
			option.value = this.getOptionValue(month, year);
			option.innerHTML = this.getMonthName(month);
			select.appendChild(option);
			month++;
		} while (month < currentMonth);
	}

	getOptionValue(month, year) {
		let value;
		if (month >= 1 && month <= 9 && (month + 1) != 10) {
			value = year + "-0" + month + "-01/" + year + "-0" + (month + 1) + "-01";
		} else if (month >= 1 && month <= 9 && (month + 1) == 10) {
			value = year + "-0" + month + "-01/" + year + "-" + (month + 1) + "-01";
		} else {
			value = year + "-" + month + "-01/" + year + "-" + (month + 1) + "-01";
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
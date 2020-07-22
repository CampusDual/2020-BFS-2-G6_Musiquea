import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
	selector: 'app-recommendations-cards',
	templateUrl: './recommendations-cards.component.html',
	styleUrls: ['./recommendations-cards.component.scss']
})

export class RecommendationsCardsComponent implements OnInit {

	constructor(
		private router: Router,
		private actRoute: ActivatedRoute) {
	}

	ngOnInit() {
	}

	public openDetail(concertId: number) {
		// this.router.navigate(["../../../../concerts/" + concertId], {
		// 	relativeTo: this.actRoute
		// });
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

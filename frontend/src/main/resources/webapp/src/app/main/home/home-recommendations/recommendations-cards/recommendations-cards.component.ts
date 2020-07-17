import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-recommendations-cards",
  templateUrl: "./recommendations-cards.component.html",
  styleUrls: ["./recommendations-cards.component.scss"],
})
export class RecommendationsCardsComponent implements OnInit {
  constructor() {}

  ngOnInit() {}

  cards = new Array(8);

  cardContentAttributes: Object = {
    color: "gray",
  };
}

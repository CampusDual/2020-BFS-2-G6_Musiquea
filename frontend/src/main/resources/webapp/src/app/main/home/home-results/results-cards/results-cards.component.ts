import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-results-cards',
  templateUrl: './results-cards.component.html',
  styleUrls: ['./results-cards.component.scss']
})
export class ResultsCardsComponent implements OnInit {

  cards = new Array(3);

  constructor() { }

  ngOnInit() {
  }

}

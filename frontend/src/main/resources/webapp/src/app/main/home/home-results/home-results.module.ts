import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeResultsRoutingModule } from './home-results-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { ResultsCardsComponent } from './results-cards/results-cards.component';

@NgModule({
  imports: [
    CommonModule,
    OntimizeWebModule,
    HomeResultsRoutingModule
  ],
  declarations: [
    ResultsCardsComponent
  ]
})
export class HomeResultsModule { }

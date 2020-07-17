import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeResultsRoutingModule } from './home-results-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { ResultsCardsComponent } from './results-cards/results-cards.component';
import { ResultsService } from './results-cards/results.service';

@NgModule({
  imports: [
    CommonModule,
    OntimizeWebModule,
    HomeResultsRoutingModule
  ],
  declarations: [
    ResultsCardsComponent
  ],
  providers: [ResultsService]
})
export class HomeResultsModule { }

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { HomeComponent } from './home.component';
import { ResultsCardsComponent } from './home-results/results-cards/results-cards.component';
import { RecommendationsCardsComponent } from './home-recommendations/recommendations-cards/recommendations-cards.component';
import { HomeRecommendationsRoutingModule } from './home-recommendations/home-recommendations-routing.module';
import { HomeResultsRoutingModule } from './home-results/home-results-routing.module';

@NgModule({
  imports: [
    CommonModule,
    OntimizeWebModule,
    HomeRoutingModule
  ],
  declarations: [
    HomeComponent
  ]
})
export class HomeModule { }

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRecommendationsRoutingModule } from './home-recommendations-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { RecommendationsCardsComponent } from './recommendations-cards/recommendations-cards.component';

@NgModule({
  imports: [
    CommonModule,
    OntimizeWebModule,
    HomeRecommendationsRoutingModule
  ],
  declarations: [
    RecommendationsCardsComponent
  ]
})
export class HomeRecommendationsModule { }

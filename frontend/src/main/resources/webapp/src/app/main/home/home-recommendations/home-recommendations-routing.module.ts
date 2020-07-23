import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RecommendationsCardsComponent } from './recommendations-cards/recommendations-cards.component';

const routes: Routes = [
  {
    path: '',
    component: RecommendationsCardsComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRecommendationsRoutingModule { }

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ResultsCardsComponent } from './results-cards/results-cards.component';

const routes: Routes = [
  {
    path: '',
    component: ResultsCardsComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeResultsRoutingModule { }

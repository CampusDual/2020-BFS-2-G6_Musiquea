import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home.component';
import { HomeRecommendationsModule } from './home-recommendations/home-recommendations.module';
import { HomeResultsModule } from './home-results/home-results.module';
import { AuthGuardService } from 'ontimize-web-ngx';
import { ConcertsModule } from '../concerts/concerts.module';

export function loadHomeRecommendationsModule() {
  return HomeRecommendationsModule;
}

export function loadHomeResultsModule() {
  return HomeResultsModule;
}

export function loadConcertsDetailsModule() {
  return ConcertsModule;
}

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    canActivate: [AuthGuardService],
    children: [
      { path: '', redirectTo: 'recommendations', pathMatch: 'full' },
      {
        path: 'recommendations',
        loadChildren: loadHomeRecommendationsModule
      },
      {
        path: 'results/',
        loadChildren: loadHomeResultsModule
      },
      {
        path: 'results/:search',
        loadChildren: loadHomeResultsModule
      },
      {
        path: 'results/:search/:month',
        loadChildren: loadHomeResultsModule
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
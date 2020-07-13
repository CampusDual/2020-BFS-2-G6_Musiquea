import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ConcertsDetailsComponent } from './concerts-details/concerts-details.component';
import { AuthGuardService } from 'ontimize-web-ngx';
import { loadConcertsDetailsModule } from '../home/home-routing.module';

const routes: Routes = [
  {
    path: '',
    component: ConcertsDetailsComponent,
    canActivate: [AuthGuardService],
    children: [
      { path: '', redirectTo: 'concert-details', pathMatch: 'full' },
      {
        path: 'concert-details',
        loadChildren: loadConcertsDetailsModule
      }
    ]
  }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ConcertsRoutingModule { }

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ConcertsDetailsComponent } from './concerts-details/concerts-details.component';


const routes: Routes = [
  {
    path: ':concert_id',
    component: ConcertsDetailsComponent
  }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ConcertsRoutingModule { }

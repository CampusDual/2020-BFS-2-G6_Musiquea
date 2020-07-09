import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { HomeComponent } from './home.component';

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

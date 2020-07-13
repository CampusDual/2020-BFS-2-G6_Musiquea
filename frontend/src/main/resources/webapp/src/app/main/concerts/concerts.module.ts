import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ConcertsRoutingModule } from './concerts-routing.module';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { ConcertsDetailsComponent } from './concerts-details/concerts-details.component';

@NgModule({
  imports: [
    CommonModule,
    OntimizeWebModule,
    ConcertsRoutingModule
  ],
  declarations: [
    ConcertsDetailsComponent
  ]
})
export class ConcertsModule { }

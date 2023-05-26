import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ClubListComponent } from './club-list/club-list.component';
import { ClubFormComponent } from './club-form/club-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ClubListComponent,
    ClubFormComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

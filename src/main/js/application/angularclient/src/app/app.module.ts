import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ClubListComponent} from './club-list/club-list.component';
import { ClubFormComponent } from './club-form/club-form.component';
import { ClubService } from './service/club-service.service';

@NgModule({
  declarations: [
    AppComponent,
    ClubListComponent,
    ClubFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ClubService],
  bootstrap: [AppComponent]
})
export class AppModule { }

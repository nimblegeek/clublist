import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClubListComponent } from './Club-list/Club-list.component';
import { ClubFormComponent } from './Club-form/Club-form.component';

const routes: Routes = [
  { path: 'Clubs', component: ClubListComponent },
  { path: 'addClub', component: ClubFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

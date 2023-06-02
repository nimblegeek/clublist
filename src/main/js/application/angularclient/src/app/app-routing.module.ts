import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClubListComponent } from './club-list/club-list.component';
import { ClubFormComponent } from './club-form/club-form.component';

const routes: Routes = [
  { path: 'clubs', component: ClubListComponent },
  { path: 'addclub', component: ClubFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

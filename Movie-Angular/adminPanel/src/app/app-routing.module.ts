import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CgguardService } from './Services/cgguard.service';
import { AdminAddTheatreComponent } from './components/adminPanel/admin-add-theatre/admin-add-theatre.component';
import { AdminBookingsComponent } from './components/adminPanel/admin-bookings/admin-bookings.component';
import { AdminHomeComponent } from './components/adminPanel/admin-home/admin-home.component';
import { AdminMovieComponent } from './components/adminPanel/admin-movie/admin-movie.component';
import { AdminTheatresComponent } from './components/adminPanel/admin-theatres/admin-theatres.component';
import { AdminusersComponent } from './components/adminPanel/adminusers/adminusers.component';
import { AddMovieComponent } from './components/theatrePanel/add-movie/add-movie.component';
import { PhotosModuleComponent } from './components/theatrePanel/photos-module/photos-module.component';
import { TheatreHomeComponent } from './components/theatrePanel/theatre-home/theatre-home.component';
import { TheatreMoviesComponent } from './components/theatrePanel/theatre-movies/theatre-movies.component';
import { ViewAllMoviesComponent } from './components/theatrePanel/view-all-movies/view-all-movies.component';
import { LoginComponent } from './login/login.component';
import { AddUserComponent } from './components/adminPanel/add-user/add-user.component';
import { ViewSubAdminsComponent } from './components/adminPanel/view-sub-admins/view-sub-admins.component';
import { AddSubAdminComponent } from './components/adminPanel/add-sub-admin/add-sub-admin.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { ViewAllTheatreComponent } from './components/adminPanel/view-all-theatre/view-all-theatre.component';
import { AddShowComponent } from './components/theatrePanel/add-show/add-show.component';
import { ViewAllShowsComponent } from './components/theatrePanel/view-all-shows/view-all-shows.component';
import { AddNewScreenComponent } from './components/theatrePanel/add-new-screen/add-new-screen.component';
import { ViewAllScreenComponent } from './components/theatrePanel/view-all-screen/view-all-screen.component';





const routes: Routes = [

  // {path:'SuperDashboard',component:AdminHomeComponent,canActivate:[CgguardService],data:{role:'admin'}},
  // {path:'TheatreDashboard',component:TheatreHomeComponent,canActivate:[CgguardService],data:{role:'user'}},


  {
    path: 'TheatreDashboard',component:TheatreHomeComponent, 
    children: [
      { path: 'movies', component: TheatreMoviesComponent },
      { path: 'theatres', component: AdminTheatresComponent },
      { path: 'users', component: AdminusersComponent },
      { path: 'addMovie', component: AddMovieComponent },
      { path: 'ViewAllMovies', component: ViewAllMoviesComponent },
      { path: 'photos', component: PhotosModuleComponent },
      { path :'addShow' ,component :AddShowComponent },
      { path: 'viewAllShows' ,component: ViewAllShowsComponent },

      {  path:'addNewScreen',component:AddNewScreenComponent},
      {  path:'viewAllScreenList',component: ViewAllScreenComponent}



      
    ]
  },
 
  {
    path: 'SuperDashboard', component: AdminHomeComponent,
    children: [
      { path: 'movies', component: AdminMovieComponent },
      { path: 'theatres', component: AdminTheatresComponent },
      { path: 'users', component: AdminusersComponent },
      { path: 'bookings', component: AdminBookingsComponent },
      { path: 'addTheatre', component: AdminAddTheatreComponent },
      { path: 'addUser', component: AddUserComponent },
      { path: 'ViewAllMovies', component: ViewAllMoviesComponent },
      { path: 'addMovie', component: AddMovieComponent },
      { path: 'userList', component: AddMovieComponent },
      { path: 'subAdmins', component: ViewSubAdminsComponent },
      { path: 'addSubAmin', component: AddSubAdminComponent },
      { path: 'ViewAllMovies', component: ViewAllMoviesComponent },
      {path:'viewAllTheatre',component:ViewAllTheatreComponent},

      
      
    ]
     
  },
  { path: 'login', component: LoginComponent },
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: '**', component:NotfoundComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

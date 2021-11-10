import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminHomeComponent } from './components/adminPanel/admin-home/admin-home.component';
import { AdminNavBarComponent } from './components/adminPanel/admin-nav-bar/admin-nav-bar.component';
import { AdminSideBarComponent } from './components/adminPanel/admin-side-bar/admin-side-bar.component';
import { TheatreHomeComponent } from './components/theatrePanel/theatre-home/theatre-home.component';
import { TheatreNavBarComponent } from './components/theatrePanel/theatre-nav-bar/theatre-nav-bar.component';
import { TheatreSideBarComponent } from './components/theatrePanel/theatre-side-bar/theatre-side-bar.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AdminMovieComponent } from './components/adminPanel/admin-movie/admin-movie.component';
import { AdminTheatresComponent } from './components/adminPanel/admin-theatres/admin-theatres.component';
import { AdminBookingsComponent } from './components/adminPanel/admin-bookings/admin-bookings.component';
import { AdminusersComponent } from './components/adminPanel/adminusers/adminusers.component';
import { AdminAddTheatreComponent } from './components/adminPanel/admin-add-theatre/admin-add-theatre.component';
import { TheatreMoviesComponent } from './components/theatrePanel/theatre-movies/theatre-movies.component';
import { AddMovieComponent } from './components/theatrePanel/add-movie/add-movie.component';
import { ViewAllMoviesComponent } from './components/theatrePanel/view-all-movies/view-all-movies.component';
import { PhotosModuleComponent } from './components/theatrePanel/photos-module/photos-module.component';
import { AddUserComponent } from './components/adminPanel/add-user/add-user.component';
import { AddSubAdminComponent } from './components/adminPanel/add-sub-admin/add-sub-admin.component';
import { ViewSubAdminsComponent } from './components/adminPanel/view-sub-admins/view-sub-admins.component';
import { ViewAllTheatreComponent } from './components/adminPanel/view-all-theatre/view-all-theatre.component';
import { AddShowComponent } from './components/theatrePanel/add-show/add-show.component';
import { ViewAllShowsComponent } from './components/theatrePanel/view-all-shows/view-all-shows.component';
import { AdminShowComponent } from './components/adminPanel/admin-show/admin-show.component';
import { AddNewScreenComponent } from './components/theatrePanel/add-new-screen/add-new-screen.component';
import { ViewAllScreenComponent } from './components/theatrePanel/view-all-screen/view-all-screen.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminHomeComponent,
    AdminNavBarComponent,
    AdminSideBarComponent,
    TheatreHomeComponent,
    TheatreNavBarComponent,
    TheatreSideBarComponent,
    AdminMovieComponent,
    AdminTheatresComponent,
    AdminBookingsComponent,
    AdminusersComponent,
    AdminAddTheatreComponent,
    TheatreMoviesComponent,
    AddMovieComponent,
    ViewAllMoviesComponent,
    PhotosModuleComponent,
    AddUserComponent,
    AddSubAdminComponent,
    ViewSubAdminsComponent,
    ViewAllTheatreComponent,
    AddShowComponent,
    ViewAllShowsComponent,
    AdminShowComponent,
    AddNewScreenComponent,
    ViewAllScreenComponent,   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

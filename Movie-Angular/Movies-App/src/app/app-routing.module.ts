import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookTicketComponent } from './Component/BookTicket/book-ticket/book-ticket.component';
import { HerosectionComponent } from './Component/Home/herosection/herosection.component';
import { HomeAllComponent } from './Component/Home/home-all/home-all.component';
import { ShowMovieComponent } from './Component/MovieShow/show-movie/show-movie.component';
import { LoginComponent } from './Component/Registration/login/login.component';
import { RegisterComponent } from './Component/Registration/register/register.component';
import { SeatLayoutComponent } from './Component/Seat/seat-layout/seat-layout.component';
import { SummaryComponent } from './Component/SummaryPage/summary/summary.component';
import { ThanksComponent } from './Component/Thanks/thanks/thanks.component';
import { CggaurdServiceService } from './Services/Cggraurd/cggaurd-service.service';

const routes: Routes = [
  {path:'home',component:HomeAllComponent},
  {path:'',component:HomeAllComponent},
  {path:'bookTicket',component:BookTicketComponent},
  {path:'seatBooking',component:SeatLayoutComponent, canActivate:[CggaurdServiceService]},
  {path:'summary',component:SummaryComponent, canActivate:[CggaurdServiceService]},
  {path:'register',component:RegisterComponent},
  {path:'login',component:LoginComponent},
  {path:'movieShow',component:ShowMovieComponent},
  {path:'thanks',component:ThanksComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

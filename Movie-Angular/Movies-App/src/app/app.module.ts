import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HerosectionComponent } from './Component/Home/herosection/herosection.component';
import { OngoingmoviesComponent } from './Component/Home/ongoingmovies/ongoingmovies.component';
import { UpgoingmoviesComponent } from './Component/Home/upgoingmovies/upgoingmovies.component';
import { BestRatedMoviesComponent } from './Component/Home/best-rated-movies/best-rated-movies.component';
import { HomeAllComponent } from './Component/Home/home-all/home-all.component';

//======= social media login======
import { GoogleLoginProvider, SocialAuthServiceConfig, SocialLoginModule } from 'angularx-social-login';
import { NavComponent } from './Component/navAndFooter/nav/nav.component';
import { FooterComponent } from './Component/navAndFooter/footer/footer.component';
import { NavFootComponent } from './Component/navAndFooter/nav-foot/nav-foot.component';
import { SeatLayoutComponent } from './Component/Seat/seat-layout/seat-layout.component';
import { BookTicketComponent } from './Component/BookTicket/book-ticket/book-ticket.component';
import { SummaryComponent } from './Component/SummaryPage/summary/summary.component';
import { RegisterComponent } from './Component/Registration/register/register.component';
import { LoginComponent } from './Component/Registration/login/login.component';
import { ShowTimeComponent } from './Component/ShowTime/show-time/show-time.component';
import { ShowMovieComponent } from './Component/MovieShow/show-movie/show-movie.component';
import { ThanksComponent } from './Component/Thanks/thanks/thanks.component';


@NgModule({
  declarations: [
    AppComponent,
    HerosectionComponent,
    OngoingmoviesComponent,
    UpgoingmoviesComponent,
    BestRatedMoviesComponent,
    HomeAllComponent,
    NavComponent,
    FooterComponent,
    NavFootComponent,
    SeatLayoutComponent,
    BookTicketComponent,
    SummaryComponent,
    RegisterComponent,
    LoginComponent,
    ShowTimeComponent,
    ShowMovieComponent,
    ThanksComponent,
  

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    SocialLoginModule,
    


  ],
  providers: [
    {
      provide: 'SocialAuthServiceConfig',
      useValue: {
        autoLogin: false,
        providers: [
          {
            id: GoogleLoginProvider.PROVIDER_ID,
            provider: new GoogleLoginProvider(
              '851545939439-9fkp89b9jphh02bfhf4e1tpjkl7o274o.apps.googleusercontent.com'    
                     )
          }
          
        ]
      } as SocialAuthServiceConfig,
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

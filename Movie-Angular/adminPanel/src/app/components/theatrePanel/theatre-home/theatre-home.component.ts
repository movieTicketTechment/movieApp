import { Component, OnInit } from '@angular/core';
import { ScreenService } from 'src/app/Services/screen.service';
import { Router } from '@angular/router';
import { Screen } from 'src/app/Model/screen';

@Component({
  selector: 'app-theatre-home',
  templateUrl: './theatre-home.component.html',
  styleUrls: ['./theatre-home.component.css']
})
export class TheatreHomeComponent implements OnInit {
  screen :any=[];
  userCredLocal: any;

  constructor(private screenService:ScreenService,private router:Router) { }

  ngOnInit(): void {
    this.screenService.viewAllScreen().subscribe(data=>
      
      {
        this.screen=data;
        console.log(data);
      
      },
      error=>
      {
        console.log("error occured",error)
      }
      );
  }

  showMovieDashboard(){

    this.router.navigateByUrl("TheatreDashboard/movies");

  }

  showHomeDashboard(){
    this.router.navigateByUrl("TheatreDashboard/home");

  }
  screenGet: Screen = new Screen();
getScreenById(id: number) {
  this.screenService.getScreenById(id).subscribe(
    (data) => {
      this.screenGet = data;
    },
    (error) => console.log(error)
  );
}


  screenPut: Screen = new Screen();
  updateScreen() {
  console.log(this.screenGet.screenId)
        this.screenService.updateScreenDetail(this.screenGet.screenId, this.screenGet).subscribe(
          (data) => alert(data),
         
          (error) => console.log(error)
        );
  }

}

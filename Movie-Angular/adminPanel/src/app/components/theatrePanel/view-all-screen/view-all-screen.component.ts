import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Screen } from 'src/app/Model/screen';
import { ScreenService } from 'src/app/Services/screen.service';

@Component({
  selector: 'app-view-all-screen',
  templateUrl: './view-all-screen.component.html',
  styleUrls: ['./view-all-screen.component.css']
})
export class ViewAllScreenComponent implements OnInit {
  screen:any[]=[];
  constructor(private screenService:ScreenService,private router:Router) { }

  ngOnInit(): void {
    this.screenService.viewAllScreen().subscribe(data=>
      
      {
        this.screen=data;
      
      },
      error=>
      {
        console.log("error occured",error)
      }
      );
  }
  addScreen(){

    this.router.navigateByUrl("TheatreDashboard/addNewScreen");
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

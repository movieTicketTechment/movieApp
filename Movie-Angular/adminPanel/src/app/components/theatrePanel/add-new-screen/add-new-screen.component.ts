import { importType } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';
import { Screen } from 'src/app/Model/screen';
import { Router } from '@angular/router';
import { TheatreService } from 'src/app/Services/theatre.service';
import { ScreenService } from 'src/app/Services/screen.service';
import { Theatre } from 'src/app/Model/theatre';
import { Seat } from 'src/app/Model/seat';


@Component({
  selector: 'app-add-new-screen',
  templateUrl: './add-new-screen.component.html',
  styleUrls: ['./add-new-screen.component.css']
})
export class AddNewScreenComponent implements OnInit {

  newScreen:Screen=new Screen();
  theatres:Theatre[]=[];
  theatreSlected!:Theatre[];
  seat:Seat=new Seat();
  seatNum!:string;
  userCredLocal: any;
  

  constructor(private screenService:ScreenService,private router:Router) { }

  ngOnInit(): void {
    // this.userCredLocal = localStorage.getItem("userCred");
    // this.userCredLocal = JSON.parse(this.userCredLocal);
    // alert(this.userCredLocal.userName)

    // this.screenService.viewAllScreen(this.userCredLocal.userName).subscribe(data=>
      
    //   {
    //     this.newScreen=data;
      
    //   },
    //   error=>
    //   {
    //     console.log("error occured",error)
    //   }
    //   );


  }

  createScreen():void{

    this.screenService.createNewScreen(this.newScreen).subscribe(data=>
      {
        console.log(this.newScreen);
      alert("Screen added");
    },
    error=>
    {
      console.log("error occured",error);
    }
  
    );
    
    this.createSeat();
    
 }


 createSeat()
 {
   
   for(let i=0;i<this.newScreen.screenRows;i++)
   {
     for(let j=0;j<this.newScreen.screenColumns;j++)
     {
      this.seatNum = String.fromCharCode(65+ i) + j;
      this.seat.seatNumber=this.seatNum;
      //this.seat.screen.screenId;
      this.screenService.createNewSeat(this.seat).subscribe(data=>
        {
          console.log(this.seat);
          //console.log(this.seat.screen.screenId);
        },
      error=>
      {
        console.log("error occured",error);
      }
    
      );

     }
   }
 }
 
}
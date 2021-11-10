import { Component, OnInit } from '@angular/core';
import { Theatre } from 'src/app/Model/theatre';
import { TheatreService } from 'src/app/Services/theatre.service';

@Component({
  selector: 'app-admin-add-theatre',
  templateUrl: './admin-add-theatre.component.html',
  styleUrls: ['./admin-add-theatre.component.css']
})
export class AdminAddTheatreComponent implements OnInit {

  theatre:Theatre= new Theatre();

  constructor(private theatreService:TheatreService) { }

  ngOnInit(): void {

  }

  createTheatre():void{

    this.theatreService.createNewtheatre(this.theatre).subscribe(data=>
      {
      alert("theatre added");
    },
    error=>
    {
      console.log("error occured",error);
    }
  
      );
  
  
  }

}

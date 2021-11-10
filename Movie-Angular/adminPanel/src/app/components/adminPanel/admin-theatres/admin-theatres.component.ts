import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Theatre } from 'src/app/Model/theatre';
import { TheatreService } from 'src/app/Services/theatre.service';

@Component({
  selector: 'app-admin-theatres',
  templateUrl: './admin-theatres.component.html',
  styleUrls: ['./admin-theatres.component.css']
})
export class AdminTheatresComponent implements OnInit {
i=1;
  
  theatres:Theatre[]=[];
  nTheatreId:any;

  constructor(private theatreService:TheatreService,private router:Router) { }

  ngOnInit(): void {
  
    this.theatreService.getAllTheatres().subscribe(data=>{
      console.log("data:"+data);
      this.theatres= data;
    },
    error=>{
      console.log(error);
    }
    )
  }


  addTheatre(){

    this.router.navigateByUrl("SuperDashboard/addTheatre");
  }
//findById
theatreGet:Theatre = new Theatre();
getTheatreById(id: number) {
  this.theatreService.getAllTheatresById(id).subscribe(
    (data) => {
      this.theatreGet = data;
    },
    (error) => console.log(error)
  );
}


  
  updateTheatre() {
  alert(this.theatreGet.theatreId)
        this.theatreService.updateTheatre(this.theatreGet.theatreId, this.theatreGet).subscribe(
          (data) => alert(data),
         
          (error) => console.log(error)
        );
  }
  theatreGet1:Theatre = new Theatre();

  deleteTheatreById(id:number)
  {
    this.theatreService.deleteTheatre(id).subscribe(
      (data) => alert("Deleted sucessfully"),
      
     
      (error) => console.log(error)
     
    );
}

}

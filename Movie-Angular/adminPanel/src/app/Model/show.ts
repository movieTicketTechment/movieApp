import { Movie } from './movie'
import { Theatre } from './theatre'
import { Screen } from './screen'


export class Show {

    showId!: number;
	showStartTime !:String;
	showEndTime !:String;
	showName !:string;	
	updatedBy !:string;
    updatedOn!:Date;
    deleteField!:String;
    status!:String;
    remark!:String;
    token!:String;
    movie!:Movie;
    theatre!:Theatre;
    screen!:Screen;
   
    // screen:Object={
    //          screenId:0,
    //     };
   

    // movie:Object={
    //     movieId:0,
    // }
    // theatre:Object={
    //     theatreId:0,
    // };
    // screen:Object={
    //     screenId:0,
    // }
	
}



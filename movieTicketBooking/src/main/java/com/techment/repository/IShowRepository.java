package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;

import com.techment.dto.ShowMovieTheatreDto;
import com.techment.entity.Show;

public interface IShowRepository extends JpaRepository<Show, Integer> {
	
	@Query("select new com.techment.dto.ShowMovieTheatreDto( s.showId, s.showStartTime, s.showEndTime, s.showName, m.movieId,m.movieName,m.movieHours, m.releaseDate, t.theatreId, t.theatreName)from Theatre t,Movie m,Show s where s.theatre=t.theatreId and s.movie=m.movieId")
	public List<ShowMovieTheatreDto> getJoindata();
	
//	@Query("select new com.techment.dto.ShowMovieTheatreDto( s.showId, s.showStartTime, s.showEndTime, s.showName, m.movieId,m.movieName,m.movieHours, m.releaseDate, t.theatreId, t.theatreName,t.theatreCity,ss.screenId)from Theatre t,Movie m,Show s,Screen ss where s.movie=m.movieId and m.movieId=:sMovieId and s.movie=:sMovieId and t.theatreCity=:sTheatreCity and s.screen=ss.screenId and ss.theatre=t.theatreId")
//    public List<ShowMovieTheatreDto> getShowData(@Param("sMovieId")int sMovieId,@Param("sTheatreCity")  String sTheatreCity);

	@Query("select new com.techment.dto.ShowMovieTheatreDto( s.showId, s.showStartTime, s.showEndTime, s.showName, m.movieId,m.movieName,m.movieHours, m.releaseDate, t.theatreId, t.theatreName,t.theatreCity,ss.screenId)from Theatre t,Movie m,Show s,Screen ss where s.movie=m.movieId and m.movieId=:sMovieId and s.movie=:sMovieId and t.theatreCity=:sTheatreCity and s.screen=ss.screenId and ss.theatre=t.theatreId and s.status=:sDate")
    public List<ShowMovieTheatreDto> getShowdata(@Param("sMovieId")int sMovieId,@Param("sTheatreCity")  String sTheatreCity,@Param("sDate") String sDate);
}

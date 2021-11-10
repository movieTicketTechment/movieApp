package com.techment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techment.dto.MovieBannerDto;
import com.techment.entity.Movie;

public interface IMovieRepository extends JpaRepository<Movie, Integer>{

	@Query("select new com.techment.dto.MovieBannerDto( m.movieId, m.movieName, m.movieGenre, m.movieHours,m.movieDescription,m.releaseDate,i.imageId,i.picByte)from Movie m,ImageModel i where m.imageBanner = i.imageId ")
	public List<MovieBannerDto> getMovieWithBanner();
}

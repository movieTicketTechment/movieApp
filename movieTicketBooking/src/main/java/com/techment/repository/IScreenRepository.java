package com.techment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techment.dto.ScreenTheatreDto;
import com.techment.entity.Screen;

@Repository
public interface IScreenRepository extends JpaRepository<Screen, Integer>{
	// query for joining theatre and screen entity
			@Query("select new com.techment.dto.ScreenTheatreDto( s.screenId,s.screenName,t.theatreId,t.theatreName,t.managerName,s.screenRows,s.screenColumns) from  Theatre t join Screen s  on t.theatreId=s.theatre ")
			public List<ScreenTheatreDto> getJoindata();
		

}

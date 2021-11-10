package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.dto.SeatDto;
import com.techment.entity.Seat;

@Repository
public interface ISeatRepository extends JpaRepository<Seat, Integer> {


}

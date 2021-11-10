package com.techment.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techment.dto.ShowMovieTheatreDto;
import com.techment.dto.TicketBookingDto;
import com.techment.entity.TicketBooking;
import com.techment.entity.User;

@Repository
public interface ITicketBookingRepository extends JpaRepository<TicketBooking, Integer> {
	
	Optional<TicketBooking> findByBookingRef(String bookingRef);
	
	@Query("select new com.techment.dto.TicketBookingDto( b.BookingId,b.bookingDate, b.totalPrice, b.bookingRef,b.bookingStatus, b.updatedBy, b.deleteField, b.status, b.remark, b.token,b.paymentId, b.showId, b.seatIds)from TicketBooking b where  b.showId=:getShowId")
    public List<TicketBookingDto> getJoindata(@Param("getShowId") int showId);
	
	
}
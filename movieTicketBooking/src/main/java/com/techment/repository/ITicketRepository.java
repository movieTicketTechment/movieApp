package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Ticket;

public interface ITicketRepository extends JpaRepository<Ticket, Integer> {

}

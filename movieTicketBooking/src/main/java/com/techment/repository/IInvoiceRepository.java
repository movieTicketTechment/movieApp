package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Invoice;

public interface IInvoiceRepository extends JpaRepository<Invoice, Integer> {

}

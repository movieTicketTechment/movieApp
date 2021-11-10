package com.techment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



//@EnableMongoRepositories(basePackageClasses = IPhotosRepository.class)
//@EnableJpaRepositories(excludeFilters = 
//@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = IPhotosRepository.class))

@SpringBootApplication
public class MovieTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingApplication.class, args);
	}

}
 
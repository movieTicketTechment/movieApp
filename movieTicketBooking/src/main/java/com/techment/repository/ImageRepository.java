package com.techment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Integer>{

	Optional<ImageModel> findByName(String name);
//	Optional<ImageModel> findById(int imageId);
}

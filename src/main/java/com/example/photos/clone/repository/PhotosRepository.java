package com.example.photos.clone.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.photos.clone.model.Photo;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {

    
}

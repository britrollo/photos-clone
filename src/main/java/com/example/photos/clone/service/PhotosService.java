package com.example.photos.clone.service;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.photos.clone.model.Photo;
import com.example.photos.clone.repository.PhotosRepository;

//@Component
@Service
public class PhotosService {

    private final PhotosRepository photosRepository;
    
    public PhotosService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }

    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photosRepository.deleteById(id);
    }

    public Photo save(String filename, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(filename);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }

    
}

package com.izdebski.SpringBootCommandLineRunnerDV.service;

import com.izdebski.SpringBootCommandLineRunnerDV.domain.Image;
import com.izdebski.SpringBootCommandLineRunnerDV.repository.ImageRepository;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    private ImageRepository imageRepository;


    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public void save(Image image){
        imageRepository.save(image);
    }
}
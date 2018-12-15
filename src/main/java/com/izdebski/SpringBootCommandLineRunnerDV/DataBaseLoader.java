package com.izdebski.SpringBootCommandLineRunnerDV;

import com.izdebski.SpringBootCommandLineRunnerDV.domain.Image;
import com.izdebski.SpringBootCommandLineRunnerDV.service.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
//@Order(value=2)
public class DataBaseLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DataBaseLoader.class);

    private ImageService imageService;

    public DataBaseLoader(ImageService imageService) {
        this.imageService = imageService;
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Loading data from DatabaseLoader.....");
        imageService.save( new Image("Image 1"));
        imageService.save( new Image("Image 2"));
        imageService.save( new Image("Image 3"));
    }
}
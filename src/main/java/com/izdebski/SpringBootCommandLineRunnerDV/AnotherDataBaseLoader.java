package com.izdebski.SpringBootCommandLineRunnerDV;

import com.izdebski.SpringBootCommandLineRunnerDV.domain.Image;
import com.izdebski.SpringBootCommandLineRunnerDV.service.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
//@Order(value=1)
public class AnotherDataBaseLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(AnotherDataBaseLoader.class);

    private ImageService imageService;

    public AnotherDataBaseLoader(ImageService imageService) {
        this.imageService = imageService;
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Loading data from DatabaseLoader.....");
        imageService.save( new Image("Image 4"));
        imageService.save( new Image("Image 5"));
        imageService.save( new Image("Image 6"));
    }
}
package com.izdebski.SpringBootCommandLineRunnerDV;

import com.izdebski.SpringBootCommandLineRunnerDV.domain.Image;
import com.izdebski.SpringBootCommandLineRunnerDV.service.ImageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCommandLineRunnerDvApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootCommandLineRunnerDvApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ImageService imageService){
		return args ->{
			imageService.save( new Image("Image 1"));
			imageService.save( new Image("Image 2"));
			imageService.save( new Image("Image 3"));
		};
	}
}
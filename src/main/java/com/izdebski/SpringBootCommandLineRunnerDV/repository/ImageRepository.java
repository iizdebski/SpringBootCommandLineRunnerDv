package com.izdebski.SpringBootCommandLineRunnerDV.repository;

import com.izdebski.SpringBootCommandLineRunnerDV.domain.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<Image,Integer> {
}

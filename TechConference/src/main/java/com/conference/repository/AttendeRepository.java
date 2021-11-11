package com.conference.repository;

import com.conference.model.Attendes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AttendeRepository extends CrudRepository<Attendes, Long> {

    Optional<Attendes> findById(Long id);
}

package com.conference.repository;

import com.conference.model.ConferenceDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConferenceDetailsRepository extends CrudRepository<ConferenceDetails, Long> {

    List<ConferenceDetails> findByTalkId(Long id);
}

package com.conference.service;

import com.conference.model.Attendes;
import com.conference.model.ConferenceDetails;
import com.conference.model.Talk;

import java.util.List;

public interface ConferenceService {

     List<Talk> getAllTalks();

     Talk addTalk(Talk t);

     Attendes addAttendes(Attendes attendes);

     ConferenceDetails addAttendesToTalk(Long talk_id, Long attendes_id);
}

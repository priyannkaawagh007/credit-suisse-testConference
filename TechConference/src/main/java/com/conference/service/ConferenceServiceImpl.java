package com.conference.service;

import com.conference.model.Attendes;
import com.conference.model.ConferenceDetails;
import com.conference.model.Talk;
import com.conference.repository.AttendeRepository;
import com.conference.repository.ConferenceDetailsRepository;
import com.conference.repository.TalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConferenceServiceImpl implements ConferenceService {

    @Autowired
    public TalkRepository talkRepository;

    @Autowired
    public ConferenceDetailsRepository conferenceDetailsRepository;

    @Autowired
    public AttendeRepository attendeRepository;

    @Override
    public List<Talk> getAllTalks() {

        List<Talk> talksList = talkRepository.findAll();
        for(Talk talk : talksList){

            List<ConferenceDetails> conferenceDetailsList = conferenceDetailsRepository.findByTalkId(talk.getId());
            List<Attendes> attendesList = new ArrayList<>();

            for(ConferenceDetails conferenceDetails : conferenceDetailsList){
                attendesList.add(attendeRepository.findById(conferenceDetails.getAttendeId()).get());
            }
            talk.setAttendes(attendesList);
        }

        return talksList;
    }

    @Override
    public Talk addTalk(Talk t) {
        return talkRepository.save(t);
    }

    @Override
    public Attendes addAttendes(Attendes attendes) {
        return attendeRepository.save(attendes);
    }

    @Override
    public ConferenceDetails addAttendesToTalk(Long talk_id, Long attendes_id) {
        ConferenceDetails conferenceDetails = new ConferenceDetails();
        conferenceDetails.setAttendeId(attendes_id);
        conferenceDetails.setTalkId(talk_id);
        return conferenceDetailsRepository.save(conferenceDetails);
    }
}

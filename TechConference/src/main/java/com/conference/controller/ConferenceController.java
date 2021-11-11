package com.conference.controller;


import com.conference.model.Attendes;
import com.conference.model.ConferenceDetails;
import com.conference.model.Talk;
import com.conference.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConferenceController {

    @Autowired
    public ConferenceService conferenceService;

    @RequestMapping(value = "/talks", method = RequestMethod.GET)
    public ResponseEntity<List<Talk>> getTalks(){

        return new ResponseEntity<>(conferenceService.getAllTalks(), HttpStatus.OK);
    }

    @RequestMapping(value = "/talks", method = RequestMethod.POST)
    public ResponseEntity<Talk> addTalks(@RequestBody Talk talk){

        Talk talkSaved = conferenceService.addTalk(talk);
        return new ResponseEntity<>(talkSaved, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/attendes", method = RequestMethod.POST)
    public ResponseEntity<Attendes> addAttendes(@RequestBody Attendes attendes){

        Attendes addAttendes = conferenceService.addAttendes(attendes);
        return new ResponseEntity<>(addAttendes, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/talks/{talk_id}/attende/{attendes_id}", method = RequestMethod.PUT)
    public ResponseEntity<String> addAttendeToTalk(@PathVariable("talk_id") Long talk_id, @PathVariable("attendes_id") Long attendes_id){

        conferenceService.addAttendesToTalk(talk_id, attendes_id);

        return new ResponseEntity<String>("Added attende to the Talk", HttpStatus.ACCEPTED);
    }
}

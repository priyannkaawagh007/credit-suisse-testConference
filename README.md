Background : 
A Tech Conference requires someone to design a RESTful API for data for talks at a conference and attendees. 

Requirements :
   •	Demonstrate use of REST conventions
   •	Create the specified API routes/endpoints and list the endpoints in documentation.
   •	Use object oriented programming to create data structures mirroring talks and attendees
   •	Create RESTful routes of the form:
            o	POST baseurl/talksto add a talk
            o	POST baseurl/attendees to add an attendee
            o	POST baseurl/talks/:talk_id/attendees to add an attendee to a talk (or PUT baseurl/talks/:talk_id/attendees/:attendee_id)

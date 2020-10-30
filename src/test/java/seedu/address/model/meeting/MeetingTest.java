package seedu.address.model.meeting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import seedu.address.model.id.BidderId;
import seedu.address.model.id.PropertyId;

class MeetingTest {

    private Meeting firstMeeting = new Meeting(new BidderId("B1"),
            new PropertyId("P1"), new Date("12 Oct 2020"), new Venue("bedok"),
            new StartTime("14:00"), new EndTime("14:45"));
    private Meeting firstMeetingIdentical = new Meeting(new BidderId("B1"),
            new PropertyId("P1"), new Date("12 Oct 2020"),
            new Venue("bedok") , new StartTime("14:00"), new EndTime("14:45"));
    private Meeting firstMeetingDiff = new Meeting(new BidderId("B2"),
            new PropertyId("P2"), new Date("15 Oct 2020"),
            new Venue("tampines"), new StartTime("14:00"), new EndTime("14:45"));
    private Viewing meetingDiffViewingType = new Viewing(new BidderId("B2"),
            new PropertyId("P2"), new Date("15 Oct 2020"),
            new Venue("tampines"), new StartTime("14:00"), new EndTime("14:45"));
    private Admin meetingDiffAdminType = new Admin(new BidderId("B2"),
            new PropertyId("P2"), new Date("15 Oct 2020"),
            new Venue("tampines"), new StartTime("14:00"), new EndTime("14:45"));
    private Paperwork meetingDiffPaperworkType = new Paperwork(new BidderId("B2"),
            new PropertyId("P2"), new Date("15 Oct 2020"),
            new Venue("tampines"), new StartTime("14:00"), new EndTime("14:45"));
    private Paperwork meetingPaperworkType = new Paperwork(new BidderId("B2"),
            new PropertyId("P2"), new Date("15 Oct 2020"),
            new Venue("tampines"), new StartTime("14:00"), new EndTime("14:45"));

    @Test
    void getMeetingBidderId() {
        assertTrue(firstMeeting.getBidderId().equals(firstMeetingIdentical.getBidderId()));
        assertFalse(firstMeeting.getBidderId().equals(firstMeetingDiff.getBidderId()));
        assert (firstMeeting.getBidderId().equals(firstMeetingIdentical.getBidderId()));
    }

    @Test
    void getMeetingPropertyId() {
        assertTrue(firstMeeting.getPropertyId().equals(firstMeetingIdentical.getPropertyId()));
        assertFalse(firstMeeting.getPropertyId().equals(firstMeetingDiff.getPropertyId()));
    }

    @Test
    void getMeetingTime() {
        assertTrue(firstMeeting.getDate().equals(firstMeetingIdentical.getDate()));
        assertFalse(firstMeeting.getDate().equals(firstMeetingDiff.getDate()));
    }

    @Test
    void getMeetingVenue() {
        assertTrue(firstMeeting.getVenue().equals(firstMeetingIdentical.getVenue()));
        assertFalse(firstMeeting.getVenue().equals(firstMeetingDiff.getVenue()));
    }

    @Test
    void isViewing() {
        assertFalse(firstMeeting.isViewing() && firstMeetingDiff.isViewing());
        assertTrue(meetingDiffViewingType.isViewing());
    }

    @Test
    void isPaperWork() {
        assertFalse(firstMeeting.isViewing() && firstMeetingDiff.isViewing());
        assertTrue(meetingDiffViewingType.isViewing());
    }

    @Test
    void isAdmin() {
        assertFalse(firstMeeting.isAdmin() && firstMeetingDiff.isAdmin());
        assertTrue(meetingDiffAdminType.isAdmin());
    }

    @Test
    void equals() {
        assertTrue(firstMeeting.equals(firstMeetingIdentical));
        assertFalse(firstMeeting.equals(firstMeetingDiff));
    }

}

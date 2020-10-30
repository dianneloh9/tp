package seedu.address.model.meeting;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.model.id.BidderId;
import seedu.address.model.id.PropertyId;

/**
 * A meeting object where the type if of administration.
 */
public class Admin extends Meeting {

    private static final String PREFIX = "a";

    /**
     *  Constructor for admin meeting.
     * @param bidderId Bidder ID.
     * @param propertyId Property ID.
     * @param date Calendar Date.
     * @param venue Calendar Venue.
     * @param startTime Start Time.
     * @param endTime End TIme.
     */
    public Admin(BidderId bidderId, PropertyId propertyId, Date date, Venue venue,
                 StartTime startTime, EndTime endTime) {
        super(bidderId, propertyId, date, venue, startTime, endTime);
        requireAllNonNull(bidderId, propertyId, date, venue, startTime, endTime);
        super.isAdmin = true;
    }

    /**
     * Returns true if either the venue, date, bidderId, start time, end time and propertyId is the same.
     *
     * @param other The other property.
     * @return True if both property objects represent the same meeting.
     */
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Admin // instanceof handles nulls
                && this.bidderId.equals(((Admin) other).getBidderId())
                && this.propertyId.equals(((Admin) other).getPropertyId())
                && this.date.equals(((Admin) other).getDate())
                && this.venue.equals(((Admin) other).getVenue())
                && this.startTime.equals(((Admin) other).getStartTime())
                && this.endTime.equals(((Admin) other).getEndTime())); // state check
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

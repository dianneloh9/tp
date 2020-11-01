package seedu.address.logic.commands.meetingcommands;

import static seedu.address.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.address.logic.commands.seller.SellerCommandTestUtil.showSellerAtIndex;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_MEETING;
import static seedu.address.testutil.TypicalMeeting.getTypicalMeetingAddressBook;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;
import static seedu.address.testutil.bidder.TypicalBidder.getTypicalBidderAddressBook;
import static seedu.address.testutil.property.TypicalProperties.getTypicalPropertyBook;
import static seedu.address.testutil.seller.TypicalSeller.getTypicalSellerAddressBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;
import seedu.address.model.bidbook.BidBook;


class ListMeetingCommandTest {
    private Model model;
    private Model expectedModel;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalAddressBook(), new UserPrefs(), new BidBook(),
                getTypicalPropertyBook(), getTypicalBidderAddressBook(), getTypicalSellerAddressBook(),
                getTypicalMeetingAddressBook());
        expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs(), model.getBidBook(),
                model.getPropertyBook(), model.getBidderAddressBook(),
                model.getSellerAddressBook(), model.getMeetingBook());
    }

    @Test
    public void execute_listIsNotFiltered_showsSameList() {
        assertCommandSuccess(new ListMeetingCommand(), model, ListMeetingCommand.MESSAGE_SUCCESS, expectedModel);
    }

    @Test
    public void execute_listIsFiltered_showsEverything() {
        showSellerAtIndex(model, INDEX_FIRST_MEETING);
        assertCommandSuccess(new ListMeetingCommand(), model, ListMeetingCommand.MESSAGE_SUCCESS, expectedModel);
    }

}
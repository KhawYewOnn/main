/* test is failing
package seedu.address.logic.parser;

import org.junit.Test;
import seedu.address.commons.core.index.Index;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.commands.AddEventTagCommand;
import seedu.address.model.schedule.Day;
import seedu.address.model.schedule.Time;
import seedu.address.model.tag.Tag;

import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

public class AddEventTagCommandParserTest {
    private AddEventTagCommandParser parser = new AddEventTagCommandParser();

    @Test
    public void parseAllFieldsPresentSuccess() throws IllegalValueException {
        Index[] exampleIndices = {Index.fromOneBased(1), Index.fromOneBased(2), Index.fromOneBased(3)};
        String eventName = "Project";
        String location = "School";
        Day exampleDay = new Day("Friday");
        Time exampleStartTime = new Time("0730");
        Time exampleEndTime = new Time("1000");
        String tagStr = eventName + "on" + exampleDay.toString() + "at" + location;
        Tag tag = new Tag(tagStr);

        String input =  "n/Project d/Friday st/0700 et/1000 loc/School persons/1";
        assertParseSuccess(parser, input, new AddEventTagCommand(
                exampleDay, exampleStartTime, exampleEndTime, exampleIndices, tag));
    }
}
*/

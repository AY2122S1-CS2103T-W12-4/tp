package seedu.address.logic.parser;

import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_CS2100;
import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_CS2103T;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_CS2100;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_CS2103T;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.AddModCommand;
import seedu.address.logic.commands.EditCommand;
import seedu.address.testutil.EditPersonDescriptorBuilder;

class AddModCommandParserTest {
    private AddModCommandParser parser = new AddModCommandParser();

    @Test
    void parse_oneInput_success() {
        String userInput = TAG_DESC_CS2100;
        EditCommand.EditPersonDescriptor descriptor =
                new EditPersonDescriptorBuilder().withTags(VALID_TAG_CS2100).build();
        AddModCommand expectedCommand = new AddModCommand(descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    void parse_multipleInputs_success() {
        String userInput = TAG_DESC_CS2100 + TAG_DESC_CS2103T;
        EditCommand.EditPersonDescriptor descriptor =
                new EditPersonDescriptorBuilder().withTags(VALID_TAG_CS2100, VALID_TAG_CS2103T).build();
        AddModCommand expectedCommand = new AddModCommand(descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);
    }
}

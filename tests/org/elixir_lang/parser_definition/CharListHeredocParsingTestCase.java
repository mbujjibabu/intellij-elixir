package org.elixir_lang.parser_definition;

/**
 * Created by luke.imhoff on 8/8/14.
 */
public class CharListHeredocParsingTestCase extends ParsingTestCase {
    public void testEmpty() {
        assertParsedAndQuotedAroundError();
    }

    public void testEmptyUnicodeEscapeSequence() {
        assertParsedAndQuotedAroundExit();
    }

    public void testEscapeSequences() {
        assertParsedAndQuotedCorrectly();
    }

    public void testInterpolation() {
        assertParsedAndQuotedCorrectly();
    }

    public void testMinimal() {
        assertParsedAndQuotedCorrectly();
    }

    public void testWhitespaceEndPrefix() {
        assertParsedAndQuotedAroundError();
    }

    @Override
    protected String getTestDataPath() {
        return super.getTestDataPath() + "/char_list_heredoc_parsing_test_case";
    }
}

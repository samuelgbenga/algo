package week_7.practice1.algo14;

//Background
//        Markdown is a formatting syntax used by many documents (these instructions, for example!)
//        because of its plain-text simplicity and its ability to be translated directly into HTML.
//
//        Task
//        Let's write a simple markdown parser function that will take in a single line of markdown
//        and be translated into the appropriate HTML. To keep it simple, we'll support only one
//        feature of markdown in atx syntax: headers.
//
//        Headers are designated by (1-6) hashes followed by a space, followed by text, meaning
//<h7> is not a valid header. The number of hashes determines the header level of the HTML output.
//
//        Specifications
//        Challenge.markdownParser(markdown)
//        Transforms given string into correct header form
//
//        Parameters
//        markdown: String - String to be changed into markdown format
//
//        Return Value
//        String - Formatted string
//
//        Examples
//        markdown	Return Value
//        "# Header"	"<h1>Header</h1>"
//        "## Header"	"<h2>Header</h2>"
//        "###### Header"	"<h6>Header</h6>"
//        Additional Rules
//        Header content should only come after the initial hashtag(s) plus a space character.
//
//        Invalid headers should just be returned as the markdown that was recieved, no translation necessary.
//
//        Spaces before and after both the header content and the hashtag(s) should be ignored in the
//        resulting output.
//
//

// Test cases
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DisplayName("markdownParser")
//public class MarkdownParserTest {
//    @Nested
//    @DisplayName("basic tests")
//    class BasicTests {
//
//        @Test
//        @DisplayName("basic valid cases")
//        public void basicValidCases() {
//            assertEquals("<h1>header</h1>", Challenge.markdownParser("# header"));
//            assertEquals("<h2>smaller header</h2>", Challenge.markdownParser("## smaller header"));
//        }
//
//        @Test
//        @DisplayName("basic invalid cases")
//        public void basicInvalidCases() {
//            assertEquals("#Invalid", Challenge.markdownParser("#Invalid"));
//        }
//    }
//}



public class MarkdownParser {
    public static void main(String[] args) {

        // test your cases here
    }

    public static String markdownParser(String markdown) {

        // do your magic here
        return "";
    }
}
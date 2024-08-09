package my_algos.algo2_strings.algo_section2.algo14;

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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("markdownParser")
 class MarkdownParserTest {
    @Nested
    @DisplayName("basic tests")
    class BasicTests {

        @Test
        @DisplayName("basic valid cases")
        public void basicValidCases() {
            assertEquals("<h1>header</h1>", MarkdownParser.markdownParser("# header"));
            assertEquals("<h2>smaller header</h2>", MarkdownParser.markdownParser("## smaller header"));
        }

        @Test
        @DisplayName("basic invalid cases")
        public void basicInvalidCases() {
            assertEquals("#Invalid", MarkdownParser.markdownParser("#Invalid"));
        }
    }
}



public class MarkdownParser {
    public static void main(String[] args) {

        // test your cases here
       String str =  markdownParser("###### Heading with nothing in it");

        System.out.println(str);
    }

    public static String markdownParser(String markdown) {

        // do your magic here
        // check the markdown against regex "#+//s+.*" else return
        if(!markdown.matches("#+\\s+.*")) return markdown;


        // split the # tag and the content
        int splitIndex = markdown.indexOf(' '); // get the index to split

        String hashStr = markdown.substring(0, splitIndex); // get the hash tag part

        String content = markdown.substring(splitIndex).trim(); // get the content part

        // get the length of the hashtag or the number of hashtag
        int len = hashStr.length();

        if( len < 1 || len > 7) return content;
        // get the number of hashtag
        // peg it to the content html standard
        // return the value

        return "<h"+ len+">"+content+"</h"+len+">";
    }
}
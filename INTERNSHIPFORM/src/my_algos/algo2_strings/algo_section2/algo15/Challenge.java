package my_algos.algo2_strings.algo_section2.algo15;

public class Challenge {
    public static String markdownParser(String markdown) {
        // Trim leading and trailing whitespace from the input
        markdown = markdown.trim();

        // Check for at least one '#' and a space and some more content (.*)
        if (!markdown.matches("^#+\\s+.*")) {
            return markdown;
        }

        // Split the string into two parts: hashes and content
        int spaceIndex = markdown.indexOf(' ');
        String hashes = markdown.substring(0, spaceIndex);
        String content = markdown.substring(spaceIndex).trim();


        // Count the number of hashes
        int headerLevel = hashes.length();

        // Check if the number of hashes is between 1 and 6
        if (headerLevel < 1 || headerLevel > 6) {
            return markdown;
        }

        // Format the header in HTML
        return "<h" + headerLevel + ">" + content + "</h" + headerLevel + ">";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(markdownParser("# Header many more "));        // Output: <h1>Header</h1>
//        System.out.println(markdownParser("## Header"));       // Output: <h2>Header</h2>
//        System.out.println(markdownParser("###### Header"));   // Output: <h6>Header</h6>
//        System.out.println(markdownParser("####### Header"));  // Output: ####### Header (invalid)
//        System.out.println(markdownParser("#Header"));         // Output: #Header (invalid)
//        System.out.println(markdownParser("Header"));          // Output: Header (invalid)
    }
}

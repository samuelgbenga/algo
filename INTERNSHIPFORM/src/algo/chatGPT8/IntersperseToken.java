package algo.chatGPT8;

public class IntersperseToken {
    public static String intersperse(String mainString, String token, int interval) {

        //1 return default
        if (mainString == null || token == null || interval <= 0) {
            throw new IllegalArgumentException("Invalid input parameters.");
        }

        //2 intialize Stringbuilder
        StringBuilder result = new StringBuilder();

        //3 intiailize lentght to equel to string length
        int length = mainString.length();

        //4 loop through the length and append token and string to result
        for (int i = 0; i < length; i++) {
            //4.1 append mainString at i to result
            result.append(mainString.charAt(i));
            //4.2 impement if interval logic is true then append token
            if ((i + 1) % interval == 0 && (i + 1) != length) {
                result.append(token);
            }
        }

        //5 return result.
        return result.toString();
    }

    public static void main(String[] args) {
        String mainString = "HelloWorld";
        String token = "-";
        int interval = 2;

        String result = intersperse(mainString, token, interval);
        System.out.println(result);  // Output: He-ll-oW-or-ld
    }
}

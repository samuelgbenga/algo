package algo.chatGPT8;

public class IntersperseToken {
    public static String intersperse(String mainString, String token, int interval) {
        if (mainString == null || token == null || interval <= 0) {
            throw new IllegalArgumentException("Invalid input parameters.");
        }

        StringBuilder result = new StringBuilder();
        int length = mainString.length();

        for (int i = 0; i < length; i++) {
            result.append(mainString.charAt(i));
            if ((i + 1) % interval == 0 && (i + 1) != length) {
                result.append(token);
            }
        }

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

package matocham.exercise11;

public class GreatestCommonSubstring {
    public static String getGreatest(String s1, String s2) {
        String theLongestCommonPart = "";
        int longestCommonPartSize = 0;
        int s1Length = s1.length();
        int s2Length = s2.length();
        for (int i = 0; i < s1Length; i++) {
            for (int j = 0; j < s2Length; j++) {
                if (s1.charAt(i) != s2.charAt(j)) {
                    continue;
                }
                int index = 1;
                while (i + index < s1Length && j + index < s2Length && s1.charAt(i + index) == s2.charAt(j + index)) {
                    index++;
                }
                if (index > longestCommonPartSize) {
                    longestCommonPartSize = index;
                    theLongestCommonPart = s1.substring(i, i + index);
                }
            }
        }
        return theLongestCommonPart;
    }

    public static String getGreatest2(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int helperArray[][] = new int[s1Length + 1][s2Length + 1];

        String theLongestCommonPart = "";
        int longestCommonPartSize = 0;

        for (int i = 0; i < s1Length; i++) {
            for (int j = 0; j < s2Length; j++) {
                if (s1.charAt(i) != s2.charAt(j)) {
                    helperArray[i + 1][j + 1] = 0;
                    continue;
                }
                helperArray[i + 1][j + 1] = helperArray[i][j] + 1;
                if (helperArray[i + 1][j + 1] > longestCommonPartSize) {
                    longestCommonPartSize = helperArray[i + 1][j + 1];
                    theLongestCommonPart = s1.substring(i - longestCommonPartSize + 1, i + 1);
                }
            }
        }
        return theLongestCommonPart;
    }
}

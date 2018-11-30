package matocham.exercise7;

public class Palindrom {
    public boolean isPalindrom(String s) {
        s = s.toLowerCase().replaceAll(" ", "");
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

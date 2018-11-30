package matocham.exercise8;

public class CezarCipher {
    private int step;

    public CezarCipher(int step) {
        this.step = step;
    }

    public String cipher(String words) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            char charAt = words.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                int pos = charAt - 'a';
                pos = (pos + step) % 26;
                charAt = (char) ('a' + pos);
            } else if (charAt >= 'A' && charAt <= 'Z') {
                int pos = charAt - 'A';
                pos = (pos + step) % 26;
                charAt = (char) ('A' + pos);
            }
            output.append(charAt);

        }
        return output.toString();
    }

    public String decipher(String words) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            char charAt = words.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                int pos = charAt - 'a';
                pos = Math.floorMod(pos - step, 26);
                charAt = (char) ('a' + pos);
            } else if (charAt >= 'A' && charAt <= 'Z') {
                int pos = charAt - 'A';
                pos = Math.floorMod(pos - step, 26);
                charAt = (char) ('A' + pos);
            }
            output.append(charAt);

        }
        return output.toString();
    }
}

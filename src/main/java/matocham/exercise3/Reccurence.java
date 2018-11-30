package matocham.exercise3;

public class Reccurence {
    public int getPower(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return getPower(n, p - 1) * n;
    }

    public int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void printReversed(String word) {
        if (word.isEmpty()) {
            return;
        }
        printReversed(word, 0);
    }

    private void printReversed(String word, int index) {
        if (index < word.length() - 1) {
            printReversed(word, index + 1);
        }
        System.out.print(word.charAt(index));
    }
}

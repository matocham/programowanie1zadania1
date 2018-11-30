package matocham.exercise2;

public class Sequence {
    public int seq1(int n) {
        int a0 = 1;
        for (int i = 0; i < n; i++) {
            a0 += 2;
            if (a0 > 55) {
                throw new RuntimeException("Maximum value of this sequence is 55");
            }
        }
        return a0;
    }

    public int seq2(int n) {
        int a = 1;
        a += n / 2;
        a *= 10;
        if (n % 2 == 0) {
            a *= 10;
        }
        return a;
    }

    public int seq3(int n) {
        n = n % 6;
        int nn = n - 3;
        int r = n * 2;
        nn = nn < 0 ? 0 : nn;
        return r - (4 * nn);
    }

    public int seq4(int n) {
        return n * n;
    }

    public int seq5(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}

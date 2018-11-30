package matocham.exercise4;

public class Search {
    public int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int find2(int[] sortedArray, int value) {
        return biSearch(0, sortedArray.length-1, value, sortedArray);
    }

    private int biSearch(int start, int end, int value, int[] sortedArray) {
        if (end < start) {
            return -1;
        }
        int c = (start + end) / 2;
        if (sortedArray[c] == value) {
            return value;
        }
        if (sortedArray[c] < value) {
            return biSearch(c+1, end, value, sortedArray);
        } else {
            return biSearch(start, c-1, value, sortedArray);
        }
    }
}

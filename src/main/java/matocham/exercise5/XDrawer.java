package matocham.exercise5;

public class XDrawer implements Drawer {
    @Override
    public void drawShape(int width, int height) {
        double b = 1;
        double a = (width - b) / height;

        for (int i = 0; i < height; i++) {
            double number = i * a + b;
            double secondNumber = width - number;
            if (secondNumber < number) {
                number -= 0.5;
                double temp = number;
                number = secondNumber;
                secondNumber = temp;
            } else {
                secondNumber -= 0.5;
            }
            int j = 0;
            for (; j < number - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (secondNumber - number > 0) {
                j++;
                for (; j < secondNumber; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

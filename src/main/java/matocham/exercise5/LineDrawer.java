package matocham.exercise5;

public class LineDrawer implements Drawer {
    @Override
    public void drawShape(int width, int height) {
        double b = 1;
        double a = (width - b) / height;
        for (int i = 0; i < height; i++) {
            double number = i * a + b;
            for (int j = 0; j < number-1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}

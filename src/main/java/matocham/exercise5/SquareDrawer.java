package matocham.exercise5;

public class SquareDrawer implements Drawer {
    @Override
    public void drawShape(int width, int height) {
        drawAsterisks(width);
        for (int i = 1; i < height - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < width - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        drawAsterisks(width);
    }

    private void drawAsterisks(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

import matocham.exercise5.Drawer;
import matocham.exercise5.LineDrawer;
import matocham.exercise5.SquareDrawer;
import matocham.exercise5.TriangleDrawer;
import matocham.exercise5.XDrawer;
import matocham.exercise6.FileGenerator;
import matocham.exercise6.NumbersCounter;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        showExercise6();
    }

    private static void showExercise7() throws IOException {
        //  FileGenerator.generateFile(200, "numbers.txt");
        NumbersCounter counter = new NumbersCounter("numbers.txt");
        counter.count();
    }

    private static void showExercise6() {
        Drawer drawer = new TriangleDrawer();
        drawer.drawShape(5,5);
        System.out.println();
        drawer = new LineDrawer();
        drawer.drawShape(5,5);
        System.out.println();
        drawer = new SquareDrawer();
        drawer.drawShape(5,5);
        System.out.println();
        drawer = new XDrawer();
        drawer.drawShape(6,6);
    }
}

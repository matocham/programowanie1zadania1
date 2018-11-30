package matocham.exercise3;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
public class ReccurenceTest {
   Reccurence reccurence = new Reccurence();

   @Test
   public void shouldReturnProperPowersOfGivenNumber(){
       assertThat(reccurence.getPower(2,3)).isEqualTo(8);
       assertThat(reccurence.getPower(3,0)).isEqualTo(1);
       assertThat(reccurence.getPower(4,1)).isEqualTo(4);
       assertThat(reccurence.getPower(5,2)).isEqualTo(25);
       assertThat(reccurence.getPower(0,0)).isEqualTo(1);
   }

   @Test
   public void shouldReturnProperValuesForGivenN(){
       assertThat(reccurence.fibonacci(0)).isEqualTo(1);
       assertThat(reccurence.fibonacci(1)).isEqualTo(1);
       assertThat(reccurence.fibonacci(2)).isEqualTo(2);
       assertThat(reccurence.fibonacci(3)).isEqualTo(3);
       assertThat(reccurence.fibonacci(10)).isEqualTo(89);
       assertThat(reccurence.fibonacci(11)).isEqualTo(144);
    }

    @Test
    public void shouldPrintWordInReversed(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        reccurence.printReversed("this should be reversed");
        assertThat(outContent.toString()).isEqualTo("desrever eb dluohs siht");
    }
}

package matocham.exercise1;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private boolean[] numbers = new boolean[100001];

    public SieveOfEratosthenes(){
        Arrays.fill(numbers, true);
        for(int i=2;i<Math.sqrt(numbers.length);i++){
            if(numbers[i]){
                for(int j = i*i; j<numbers.length; j+=i){
                    numbers[j] = false;
                }
            }
        }
    }

    public boolean isPrime(int i){
        if(i>=numbers.length){
            throw new RuntimeException("Value is too great!");
        }
        if(i <2) {
            throw new RuntimeException("Value is too small. Minimal value is 2");
        }
        return numbers[i];
    }
}

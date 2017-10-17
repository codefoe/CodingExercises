package MyPackahe;

import java.util.Random;

public class RandomDice {
    public static void main(String[] args) {
        int[] freq = new int[7];
        int sum = 0;
        Random random = new Random();
        for (int i = 1; i < 1000; i++) {
            ++freq[1 + random.nextInt(6)];
        }

        sum = freq[1] + 1;
        for (int j = 1; j < freq.length; j++) {
            System.out.println(j + "Number of dice " + freq[j]);
        }
        System.out.println("Total" + sum);
    }
}

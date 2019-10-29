package Test;
import java.util.Random;

public class Quest {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Random rand = new Random();

        for(int i = 0; i < mas.length; i++)
            mas[i] = rand.nextInt(100);

        for(int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");

        int max = mas[0];

        for(int i = 0; i < mas.length; i++)
        {
            if(max < mas[i])
                max = mas[i];
        }
        System.out.println("Maximum = " + max);
    }
}

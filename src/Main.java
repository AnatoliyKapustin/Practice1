import java.io.PrintStream;

/**
 * Created by AnatoliyKapustin on 12.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        System.out.println("Ostatok" + " " + q / w + " " + q % w);

        int a = 5255;
        int sum = 0;
        while (a != 0)
        {
            sum += a % 10;
            a /= 10;
        }
        System.out.println("Sum" + " " + sum);

        double c = 2.5;
        if ((c * 10) % 10 >= 5)
            c += 1;
        System.out.println("Number" +  " " + (int)c);
    }

}

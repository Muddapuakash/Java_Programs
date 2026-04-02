import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double happy = n / 2.0;
        double sad = n / 2.0;

        int iterations = 4;

        for (int i = 0; i < iterations; i++) {

            double newHappy = (happy * 0.30) + (sad * 0.50);
            double newSad   = (happy * 0.70) + (sad * 0.50);

            happy = newHappy;
            sad = newSad;
        }

        System.out.println("Happy: " + (int)happy);
        System.out.println("Sad: " + (int)sad);
    }
}
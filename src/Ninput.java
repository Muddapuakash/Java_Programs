import java.util.*;

public class Ninput {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        int n = sc1.nextInt();
        sc1.nextLine(); 

    
        String line = sc1.nextLine();
        String[] parts = line.split(" ");

        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
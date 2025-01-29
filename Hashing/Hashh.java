package Hashing;
import java.util.Scanner;

public class Hashh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] hashhh = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hashhh[s.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();
        sc.nextLine(); 

        while (q-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println(hashhh[c - 'a']);
        }

        sc.close();
    }
}

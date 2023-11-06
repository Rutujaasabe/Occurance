package Java;

import java.util.Scanner;

public class Occurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("searching letter from string");
        char search = sc.next().charAt(0);
        ;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (search == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

package Module4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the height");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++){
            for (int sp = 1; sp <= h - i; sp++){
                System.out.print(" ");
            }
            for (int c = 0; c <= i - 1; c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < h; i++){
            for (int sp = 1; sp <= h - i; sp++){
                System.out.print(" ");
            }
            for (int c = 0; c < i - 1; c++){
                if (c == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= h - i; j++) {
                if (j == 0) System.out.print("*");
            }

            System.out.println();
            if (i == h - 1){
                for (int j = 0; j < h; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}

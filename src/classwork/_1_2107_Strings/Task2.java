package classwork._1_2107_Strings;

/*Создайте массив из 12 случайных чисел из отрезка [-15; 15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив*/

import java.util.Random;

public class Task2 {

    public void displayArray (int [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void maxNumberOfArray (int [] a){
        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        for (int i = a.length - 1; i > 0; i--){
            if (a[i] == max){
                indexOfMax = i;
                break;
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Index of max = " + indexOfMax);
        System.out.println();
    }


    public static void main(String[] args) {
        Task2 obj = new Task2();
        int [] arrayOfNumbers = new int[12];

        Random random = new Random();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(15 + 15) - 15;
        }

        obj.displayArray(arrayOfNumbers);
        obj.maxNumberOfArray(arrayOfNumbers);


        int [] ar = {1, 5, 3, 2, 6, 4, 6, 3, 3, 6};
        obj.displayArray(ar);
        obj.maxNumberOfArray(ar);
    }
}

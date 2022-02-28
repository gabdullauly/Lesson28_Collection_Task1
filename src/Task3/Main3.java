/*
3) Дан массив размера N. Найти среднее арифметическое всех элементов массива
 */


package Task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();         //6

        ArrayList<Integer> mass1 = new ArrayList<>();
        for (int i=0; i<n; i++){
            System.out.print("Enter value of "+i+" index: ");       //2 5 6 9 8 4
            int k = scan.nextInt();
            mass1.add(k);
        }

        double sum=0;
        for (int i=0; i<mass1.size(); i++){       //2, 5
            sum = sum+ mass1.get(i);
        }
        System.out.println(sum/mass1.size());
    }
}

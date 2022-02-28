/*
1) Дан массив размера N. Вывести его элементы в обратном порядке
 */

package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            System.out.print("Введите "+i+" элемент массива: ");
            int k = scan.nextInt();
            arr.add(k);
        }
        for (int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for (int i=arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i)+" ");
        }

    }
}

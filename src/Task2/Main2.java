/*
2) Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве четные числа в порядке убывания
их индексов, а также их количество K.
 */

package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();

        ArrayList<Integer>numbs = new ArrayList<>();
        for (int i=0; i<n; i++){
            System.out.print("Введите "+i+" элемент массива: ");
            int k = scan.nextInt();
            numbs.add(k);
        }

        System.out.println(numbs);
        int sum=0;
        for (int i=numbs.size()-1; i>=0; i--){
            if(numbs.get(i)%2==0){
                sum = sum+1;
                System.out.println("Элемент: "+numbs.get(i)+"Индекс "+i);
            }
        }
        System.out.println(sum);
    }
}

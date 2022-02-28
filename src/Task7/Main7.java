/*
3) Дан массив A размера N. Вывести четные числа массива в порядке убывания.
 */

package Task7;

import java.util.ArrayList;
import java.util.Scanner;



public class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();     //9

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            int k = scan.nextInt();     //11 6 8 9 1 0 15 16 22
            arr.add(k);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i=0; i< arr.size(); i++){
            if (arr.get(i)%2==0){
                arr2.add(arr.get(i));
            }
        }
        for (int i= arr2.size()-1; i>=0; i--){
            System.out.print(arr2.get(i)+" ");
        }
    }
}

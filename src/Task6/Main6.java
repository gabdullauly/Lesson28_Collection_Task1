/*
6) Дан массив A размера N. Вывести вначале его элементы с четными номерами (в порядке возрастания номеров),
а затем — элементы с нечет- ными номерами (также в порядке возрастания номеров):
A0, A2, A4, A6, ..., A1, A3, A5, .... Условный оператор не использовать.
 */

package Task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //7

        ArrayList<Integer> mass = new ArrayList<>();
        for (int i=0; i<n; i++){
            int k = scan.nextInt();         //2 6 9 8 5 11 3
            mass.add(k);
        }
        for (int i=0; i< mass.size(); i+=2){
            System.out.print(mass.get(i)+" ");
        }
        System.out.println();
        for (int i=1; i< mass.size(); i+=2){
            System.out.print(mass.get(i)+" ");
        }
    }
}

/*
5) Дан массив A размера N (N — нечетное число). Вывести его элементы с нечетными
номерами в порядке убывания номеров: AN, AN−2, AN−4, ..., A1. Условный оператор не использовать.
 */
package Task5;
import java.util.ArrayList;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
//        2 6 9 8 5 11 3
//        0 1 2 3 4 5  6
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();             //7
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++){
//            System.out.print("Enter value of "+i+" index: "); //2 6 9 8 5 11 3
            int k = scan.nextInt();
            a.add(k);
        }

        for (int i=a.size()-2; i>=0; i-=2){
            System.out.print(a.get(i)+" ");
        }
    }
}

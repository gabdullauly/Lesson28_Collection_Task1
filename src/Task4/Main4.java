/*
4) Create a list of strings, output the contents to the console
 */

package Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> som = new ArrayList<>();
        som.add("Ais");
        som.add("Aino");
        som.add("GQ");
        som.add("Sam");
        som.add("Tanya");

        for (int i=0; i< som.size(); i++){
            System.out.print(som.get(i)+" ");
        }


    }
}

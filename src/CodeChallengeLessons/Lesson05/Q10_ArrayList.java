package CodeChallengeLessons.Lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_ArrayList {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

          /*
		A list has elements “H”, “G” and “E”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
        */



        ArrayList<String> list = new ArrayList<>(List.of("H", "G", "E"));
        System.out.println("list = " + list);
        System.out.println("Lütfen bir harf giriniz");
        String letter = scan.next().trim().substring(0,1).toUpperCase();


            if(list.contains(letter)){
                list.set(list.indexOf(letter),"Got it");
            } else {
                list.add(letter);
            }
            

        System.out.println("list = " + list);
    }

    }

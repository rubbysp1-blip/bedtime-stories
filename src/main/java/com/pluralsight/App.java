package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("""
                    What story do you want to read
                    -------------------------------
                    Goldi Locks
                    Hansel and Gretel
                    Mary had a little lamb:\s""");
        String storyChoice = input.nextLine().trim();

        try {

            if(storyChoice.equalsIgnoreCase("Goldi Locks")){
                BufferedReader bufferedReader = new BufferedReader(new FileReader("goldilocks.txt"));

                String line;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            }

            if(storyChoice.equalsIgnoreCase("Hansel and Gretel")){
                BufferedReader bufferedReader = new BufferedReader(new FileReader("hansel_and_gretel.txt"));

                String line;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            }

            if(storyChoice.equalsIgnoreCase("Mary had a little lamb")){
                BufferedReader bufferedReader = new BufferedReader(new FileReader("mary_had_a_little_lamb.txt"));

                String line;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println("---------------------------------\n" + line);
                }
            }






        } catch (IOException e) {
            System.out.println("Sorry could not read file or not one of the stories.");
            e.printStackTrace();
        }


    }
}

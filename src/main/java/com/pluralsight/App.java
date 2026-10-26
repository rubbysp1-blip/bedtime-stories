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
        String storyChoice = input.nextLine();

        try {
            if(storyChoice.equalsIgnoreCase("Goldi Locks")){
                BufferedReader bufferedReader = new BufferedReader(new FileReader("goldilocks.txt"));

                String line;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }

            }

            //FileReader fileReader = new FileReader("goldilocks.txt");






        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

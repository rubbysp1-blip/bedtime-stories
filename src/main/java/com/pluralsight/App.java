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
        String storyChoice = input.nextLine().trim().toLowerCase();

        try {
            String line;
            int numberLine = 1;
            String fileName = "";

            switch (storyChoice) {
                case "goldi locks" -> fileName = "goldilocks.txt";
                case "hansel and gretel"-> fileName = "hansel_and_gretel.txt";
                case "mary had a little lamb"-> fileName = "mary_had_a_little_lamb.txt";
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            System.out.println("-------------------------------");
            while((line = bufferedReader.readLine()) != null){
                System.out.println(numberLine + " " + line);
                numberLine ++;
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Sorry could not read file or not one of the stories.");
            //e.printStackTrace();
        }


    }
}

/*
    UCF COP3330 Fall 2021 Assignment 23 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        String r;
        Scanner s = new Scanner(System.in);

        // Prompt
        System.out.print("Is the car silent when you turn the key? ");
        r = s.nextLine();
        if (r.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            r = s.nextLine();
            if (r.equals("y")){
                System.out.print("Clean terminals and try again.");
                return;
            }
            else {
                System.out.print("Replace cables and try again.");
                return;
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            r = s.nextLine();
            if (r.equals("y")) {
                System.out.print("Replace the battery.");
                return;
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                r = s.nextLine();
                if (r.equals("y")){
                    System.out.print("Check spark plug connections.");
                    return;
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    r = s.nextLine();
                    if (r.equals("y")){
                        System.out.print("Does your car have a fuel injection? ");
                        r = s.nextLine();
                        if (r.equals("y")) {
                            System.out.print("Get it in for service.");
                            return;
                        }
                        else {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else {
                        System.out.print("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}

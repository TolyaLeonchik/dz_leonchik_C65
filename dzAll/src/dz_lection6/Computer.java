package dz_lection6;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String cpu = " Core i3-10100";
    int ram = 4;
    int hdd = 2;
    int resource;
    void displayInfo() {
        System.out.printf("Описание комплектующих компьютера:\n CPU: %s \tRAM: %d Gb\n HDD: %d Tb\t Resource: %d\n", cpu, ram, hdd, resource);
    }
    Random random = new Random();
    int rndm;
    Scanner sc = new Scanner(System.in);
    int guess;
    boolean workingPC = true;
    void launch() {
        rndm = random.nextInt(2);
        guess = sc.nextInt();
        if (workingPC) {
            if (rndm == guess) {
                System.out.println("Your PC is ON");
            } else {
                workingPC = false;
                System.out.println("//BLACK SCREEN//");
            }
        }
    }
    void shutdown() {
        rndm = random.nextInt(2);
        if (workingPC) {
            guess = sc.nextInt();
            if (rndm == guess) {
                System.out.println("//BLACK SCREEN//");
            } else {
                workingPC = false;
                System.out.println("//BLACK SCREEN//");
            }
        }
    }
}

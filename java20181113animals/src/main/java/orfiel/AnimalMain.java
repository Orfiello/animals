package orfiel;

import orfiel.model.Animal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the ZOO");

    }
    private static void read(Scanner input) {
        String fileName = inp
    }


}


//    private static Animal[] read(File file) {
//        try (BufferedReader br = new BufferedReader(new FileReader(file))){
//            String countText = br.readLine();
//            int count = Integer.parseInt(countText);
//            Animal[] animals = new Animal[count];
//            for (int i = 0; i <count; i++) {
//                String name = br.readLine();
//                String ageText = br.readLine();
//                int age = Integer.parseInt(ageText);
//                animals[i] = new Animal(name, age);
//            }
//
//        }catch (IOException ex) {
////                System.err.println(ex);
////                return new Animal[0];
//
//    }
//
//}

package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap13A {
    public static void main(String[] args) {
        //createNewFile();
        numbersExceptionHandling();
    }
    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (Exception ex){
            System.out.println("Directory does not exist");
            ex.printStackTrace();
        }
    }
    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader = new Scanner(file)){
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}

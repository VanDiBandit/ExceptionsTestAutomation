package Exceptions;

import java.io.File;
import java.io.IOException;

public class Chap13B {
    public static void main(String[] args) {

    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }




}

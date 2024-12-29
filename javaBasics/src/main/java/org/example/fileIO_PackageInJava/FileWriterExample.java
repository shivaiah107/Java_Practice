package org.example.fileIO_PackageInJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\sivaiahp\\IdeaProjects\\Java_Practice\\javaBasics\\src\\main\\java\\org\\example\\fileIO_PackageInJava\\sample.txt");
            BufferedWriter write = new BufferedWriter(file);
            write.write("you have created this file using coding congrats...!");
            write.newLine();
            write.write("the way you are improving your career is awesome .....");
            write.newLine();
            write.write("the way you are improving your career is awesome .....");

            write.newLine();
            write.write("the way you are improving your career is awesome .....");

            write.close();

        } catch (IOException e) {
            System.out.println("input output exception has created");
        }
    }
}

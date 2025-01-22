package org.example.fileIO_PackageInJava;

import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\Users\\sivaiahp\\IdeaProjects\\Java_Practice\\javaBasics\\src\\main\\java\\org\\example\\fileIO_PackageInJava\\sample.txt");
            BufferedReader read = new BufferedReader(file);

            String line ;
            while((line = read.readLine()) != null){
                System.out.println(line);
            }
            read.close();

        } catch (IOException e) {
            System.out.println("file not found exception "+ e);
        }
    }
}

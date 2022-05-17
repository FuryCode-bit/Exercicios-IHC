package com.fichas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.fichas.printDataCell;


public class Main {

    public static void main(String[] args) {
        BufferedReader reader;
        int i = 0;
        try {
            reader = new BufferedReader(new FileReader("nutrition.txt"));
            String line = reader.readLine();

            while (line != null) {
                //System.out.println(line);
                String[] parts = line.split("\\|");
                new printDataCell(parts);
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new printCell();
    }
}

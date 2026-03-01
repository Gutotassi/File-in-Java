package application;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[]  {"Good morning", "Good afternoon", "Good night"};

        String path = "/var/tmp/out.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

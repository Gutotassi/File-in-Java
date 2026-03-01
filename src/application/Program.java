package application;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        String path = "/home/guto_tassi/Documents/lattes.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

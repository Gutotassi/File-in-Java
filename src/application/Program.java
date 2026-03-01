package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        File file = new File("/home/guto_tassi/Documents/lattes.txt");
//        Scanner input = null;
//
//        try {
//            input = new Scanner(file);
//            while (input.hasNextLine()){
//                System.out.println(input.nextLine());
//            }
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        finally {
//            if (input != null){
//                input.close();
//            }
//        }
        String path = "/home/guto_tassi/Documents/lattes.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

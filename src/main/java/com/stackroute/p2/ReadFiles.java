package com.stackroute.p2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

   public static void main(String a[]){
       BufferedReader br = null;
       String strLine = "";
       try {
           br = new BufferedReader( new FileReader("/home/abhishek/Documents/JAVA/ExerciseStep2/src/main/java/Profile.txt"));
           while( (strLine = br.readLine()) != null){
               System.out.println(strLine.toUpperCase());
           }
       } catch (FileNotFoundException e) {
           System.err.println("Unable to find the file: fileName");
       } catch (IOException e) {
           System.err.println("Unable to read the file: fileName");
       }
   }
}
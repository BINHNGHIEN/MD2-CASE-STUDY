package com.company.config;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile<T> {
    public static String PATH = "/Users/mac/IdeaProjects/MD2-Final-Exam/src/com/company/data/";
    public List<T> readFromFile(String path){
        List<T> tList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            tList = (List<T>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e){


        }
        return tList;
    }
    public void writeToFile(String path, List<T> tList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){

        }
    }
}

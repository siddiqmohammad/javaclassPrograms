package com.codegnan.iostreams;

import java.io.*;

public class SerDesrDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Serialization started");

        try (FileOutputStream fos = new FileOutputStream("abc.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Employee emp = new Employee(101, "malli", 60000);
            oos.writeObject(emp);

            System.out.println("Serialization ended " + emp);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("De-Serialization Started");

        try (FileInputStream fis = new FileInputStream("abc.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Employee emp = (Employee) ois.readObject();

            System.out.println("De-Serialization Ended " + emp);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
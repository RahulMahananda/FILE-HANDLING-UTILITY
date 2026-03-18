import java.io.*;
import java.util.Scanner;
public class StudentFileTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "student.txt";
        System.out.println("Student File Program\n");
        
        // taking input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();

        // create and write file
        try {
            System.out.println("\nCreating file.......");
            FileWriter fw = new FileWriter(fileName);

            fw.write("Student Details\n");
            fw.write("Name: " + name + "\n");
            fw.write("Course: MCA\n");
            fw.write("Roll No: " + roll + "\n");
            fw.write("College: GITA Autonomous, BBSR\n");
            fw.write("Address: " + address + "\n");
            fw.close();

            System.out.println("File created.\n");
        } 
        catch (Exception e) {
            System.out.println("Something went wrong while creating file");
        }

        // reading file
        try {
            System.out.println("Reading file...\n");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } 
        catch (Exception e) {
            System.out.println("Error while reading file");
        }

        // updating file
        try {
            System.out.println("\nUpdating file...");
            FileWriter fw = new FileWriter(fileName, true);
            fw.write("Status: Updated Successfully\n");
            fw.close();
            System.out.println("File updated.\n");
        } 
        catch (Exception e) {
            System.out.println("Error while updating file");
        }

        // showing final content
        try {
            System.out.println("Final content:\n");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } 
        catch (Exception e) {
            System.out.println("Error showing final file");
        }
        sc.close();
    }
}
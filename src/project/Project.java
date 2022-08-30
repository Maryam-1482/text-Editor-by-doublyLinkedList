package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project {
public static void main(String[] args) 
        throws FileNotFoundException, IOException
          
    {   doublyLinkedList m= new doublyLinkedList();
        String word;
        char r;
        do{
      System.out.println("Please Enter R :if you want to read from file\n"
        + "Or W :if you want to write line \n"
        + "Or I : if you want to insert line in specific position \n"
        + "Or D : if you want to Delete a specific line \n"
      + "Or DP : if you want to Delete a specific line by it's "
                + "position\n"
    + "Or L : if you want to get length of specific line "
                + "by it's position \n"
      + "Or S :if you want to show all lines in file \n"
        + "Or C : if you want to replace line with new one.\n"
              + "Enter your choice:");
        Scanner getWord= new Scanner(System.in);
        String g;
        g= getWord.nextLine();
        
        if("R".equals(g)){
        try {
        File myObj = new File("koko.txt");
        try (Scanner myReader = new Scanner(myObj)) {
        while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        m.insert(data);
        try (PrintWriter writer = new PrintWriter("koko.txt")) {
        writer.print("");}}}
        } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");}}
        
        else if("W".equals(g)){
        m.insertFile();}
        
        else if("I".equals(g)){
         System.out.println("Please Enter the line:");
        Scanner getlin= new Scanner(System.in);
         Scanner get= new Scanner(System.in);
        String item;
        int v=0;
        item= getlin.nextLine();
        System.out.println("Enter Position:");
        v= get.nextInt();
        m.insertPosition(v, item);}
        
        else if("D".equals(g)){
        System.out.println("Please Enter the line you want to delete it:");
        Scanner getl= new Scanner(System.in);
        String item;
        item= getl.nextLine();
        m.delete(item);}
        
        else if("DP".equals(g)){
 System.out.println("Please Enter the Position of line you want to delete it:");
        Scanner getl= new Scanner(System.in);
        int item;
        item= getl.nextInt();
        m.deletePosition(item);}
        
        else if("L".equals(g)){
        System.out.println("Please Enter the Position of line you want to "
        + "get length of it:");
        Scanner getl= new Scanner(System.in);
        int item;
        item= getl.nextInt();
        System.out.println(m.getLength(item));}
        
        else if("S".equals(g)){
       m.diplay();}
        
        else if("C".equals(g)){
         System.out.println("Please Enter the New line:");
        Scanner getlin= new Scanner(System.in);
         Scanner get= new Scanner(System.in);
        String item;
        int v=0;
        item= getlin.nextLine();
        System.out.println("Enter Position:");
        v= get.nextInt();
        m.replaceLine(v, item);
        m.insertFile();}
        
        
        System.out.println("Do you want to do any thing more :- Enter yes or no");
        Scanner getlin= new Scanner(System.in);
        word= getlin.nextLine();
        r=word.charAt(0);}
        while(r =='y'); 
      
    }}
    

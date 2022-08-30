
package project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class doublyLinkedList {
    node first,last;
  public void insert(String line){
          node newNode= new node(line);
          newNode.data=line;
        if(first==null){
            first=newNode;}
        else{
            last.next=newNode;
            newNode.prev=last;}
           last=newNode;}
  
  public void insertFrist(String item){
     node newNode=new node(item);
     newNode.data=item;
     if(first==null){
         last=newNode;}
     else{
         first.prev=newNode;}
     newNode.next=first;
     first=newNode;}
  
  public void insertFile() throws IOException{
      node curr=first;
      File myObj = new File("koko.txt");
        try (Scanner myReader = new Scanner(myObj)) {
        while (myReader.hasNextLine()) {
            try (PrintWriter writer = new PrintWriter("koko.txt")) {
        writer.print("");}
        }
      while(curr!=null){
          FileWriter fw = new FileWriter("koko.txt",true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write(curr.data);
        bw.newLine();
        bw.flush();}
        curr=curr.next;}}}
  
  int c=0;
  public int size(){
    node curr=first;
    while(curr!=null){
        c++;
        curr=curr.next;}
    return c;}
  
 public void insertPosition(int pos,String item){
     int g=size();
     if(pos<0|| pos>g){
         System.out.println("Out Of Range");}
     else{
         node newNode=new node(item);
         if(pos==1){
             newNode.data=item;
     insertFrist(item);}
         else if(pos==g){
             insert(item);}
         else{
             node temp=first;
             for(int i=2;i<pos;i++){
                 temp=temp.next;}
             newNode.next=temp.next;
             temp.prev=temp;
         temp.next=newNode;
         temp.next.prev=newNode;}}}
 
 public void deletePosition(int pos){
     int g=size();
     if(pos<0|| pos>g){
         System.out.println("Out Of Range");}
     else{
         if(pos==1){
        if(first.next == null)
            last =first= null;
        else
            first.next.prev = null;
        first = first.next;}
         else if(pos==g){
        if(first.next == null)
            first= null;
        else
            last.prev.next = null;
        last = last.prev;}
         else{
             node temp=first;
             for(int i=1;i<pos;i++){
                 temp=temp.next;}
              temp.prev.next = temp.next;
              temp.next.prev = temp.prev;}}}
 
 public String delete(String searchkey){
        node current =first;
        while(!current.data.equals(searchkey)){
            current = current.next;
            if(current == null)
              System.out.println("Not Found (" + searchkey +") To Delete After"
                        + " It");}
        if(current == first)
            first = current.next;
        else
            current.prev.next = current.next;
        if(current == last)
            last = current.prev;
        else
            current.next.prev = current.prev;
        return current.data;}
 
   int len=0;
 public int getLength(int pos){
     int g=size();
     if(pos<0|| pos>g){
         System.out.println("Out Of Range");}
     else{
         if(pos==1){
        node curr=first;
        len=curr.data.length();}
         else if(pos==g){
         node curr=last;
        len=curr.data.length();}
         else{
             node temp=first;
             for(int i=1;i<pos;i++){
                 temp=temp.next;}
                 len=temp.data.length();}}
            return len;}
 
 public void diplay(){
     node current=first;
     while(current!=null){
         System.out.println(current.data);
         current=current.next;}}
 
 public void replaceLine(int pos, String item){
     int g=size();
     if(pos<0|| pos>g){
         System.out.println("Out Of Range");}
     else{
         if(pos==1){
        node curr=first;
        curr.data=item;}
         else if(pos==g){
         node curr=last;
        curr.data=item;}
         else{
             node temp=first;
             for(int i=1;i<pos;i++){
                 temp=temp.next;}
                 temp.data=item;}}}
 }
            
    

         
    

 

          

      
      
      
      
      
      
      
            
        


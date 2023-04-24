package S01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedReaderExample {
    public static void main(String args[])throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);  
        
        System.out.println("Enter your name");  
        String name=br.readLine();  
        System.out.println("Welcome "+name);  
    }
}
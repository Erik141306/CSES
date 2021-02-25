import java.util.*;
import java.io.*;
import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) throws IOException, FileNotFoundException{
        StringBuilder cad = new StringBuilder();
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        long n;
        
        n = Integer.parseInt(f.readLine());
        
        while(n!=1){
            cad.append(n);
            cad.append(" ");
            
            if(n%2==0){
                n/=2;
            }
            else{
                n=n*3+1;
            }
        }
        
        cad.append(1);
        System.out.println(cad);
    }
    
}

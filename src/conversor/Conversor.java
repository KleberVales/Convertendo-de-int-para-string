package conversor;

import java.io.*; 
import java.util.*;

public class Conversor {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String s = new Integer(n).toString();

    if(s.getClass().getSimpleName().equals("String")){
        System.out.println("Good job");
    }
    else{
        System.out.println("Wrong answer");
    }

}
}

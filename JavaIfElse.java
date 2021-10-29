import java.io.*;
import java.util.*;

public class JavaIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 != 0)
            System.out.println("Weird");
        else if(2 <= n && n <= 5)
            System.out.println("Not Weird");
        else if(6 <= n && n <= 20)
            System.out.println("Weird");
        else if(n > 20)
            System.out.println("Not Weird");
        sc.close();
    }
}

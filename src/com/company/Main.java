package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        boolean a= (((x*x+y*y)<=1 && y>=x) || ((x*x+y*y)<=1 && y<=x && x<0));

        if (a==true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.arraycopy;
import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {
//        задание 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type your name");
//        String smth = scanner.nextLine();
//        System.out.println("HI " + smth);

        // задание 2
        //        Scanner in = new Scanner(System.in);
//        String[] tt = in.nextLine().split(" ");
//        for (int j = tt.length; j >0; j--)
//        System.out.println(tt[j-1]);

        //      задание 3
//        Scanner in = new Scanner(System.in);
//        int[] num = new int[2];
//        for (int i = 0; i < num.length; i++) {
//            num[i] = in.nextInt();
//        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]);
//            System.out.println(num[i]);


//      задание 4
//        int a = 12345;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Type your password");
//        int smth = in.nextInt();
//        if (a == smth)
//            System.out.println("Your password is correct ");
//        else
//            System.out.println("Your password is incorrect ");

//       задание 5
//        Scanner in = new Scanner(System.in);
//        System.out.println("Type first number");
//        int smth = in.nextInt();
//        System.out.println("Type second number");
//        int smth2 = in.nextInt();
//        int smth3=smth+smth2;
//        System.out.println("Sum is " + smth3);


//
        // задание 6.1
//                Scanner in = new Scanner(System.in);
//        int[] num = new int[3];
//        for (int i = 0; i < num.length; i++)
//        num[i] = in.nextInt();
//        System.out.println("Введите три целых числа");
//        for (int i = 0; i < num.length; i++)
//            if (i%2==0)
//            System.out.println("Это число нечетное: "+ num[i]);
//        else
//                System.out.println("Это число четное: " + num[i]);

// Жалкие потуги этого же задания  System.out.println("Chet"+i);
//        Scanner in = new Scanner(System.in);
//        int tt = in.nextInt();
//        int[] y = new int[tt];
//
//        for (int i = 0; i < tt; i++) {
//            if (y[i] % 2 != 0)
//                System.out.println(y[i]);
//            else if (y[i] % 2 == 0)
//                System.out.println(y[i]);

//         задание 6.2
//        Scanner in = new Scanner(System.in);
//        int[] num = new int[5];
//        System.out.println("Введите три целых числа  и мы покажем вам максимальное");
//        for (int i = 0; i < num.length; i++)

//            num[i] = in.nextInt();
//        int min = num[5];
//        for (int i = 0; i > num.length; i++)
//            if (min > num[i])
//                min = num[i];
//        System.out.println("Это максимальное: " + min);
//        else
//                System.out.println("Это число немаксимальное: " + min);

//        System.out.print("Enter 4isla here:");
//        Scanner scan = new Scanner(System.in);
//        String[] num = scan.nextLine().split(" ");
//
//        int w = Integer.parseInt(num[0]);
//        for (int i = 0; i < num.length; i++) {
//            int q = Integer.parseInt(num[i]);
//            if (w < q) {
//                w = q;
//            }
//        }
//        System.out.print("Max 4islo: " + w);
//        System.out.println();
//
//
//        int e = Integer.parseInt(num[0]);
//        for (int i = 0; i < num.length; i++) {
//            int q = Integer.parseInt(num[i]);
//            if (e > q) {
//                e = q;
//            }
//        }
//        System.out.print("Min 4islo: " + e);
//        System.out.println();

//    задание 6.3
//        Scanner in = new Scanner(System.in);
//        int[] num = new int[3];
//        System.out.println("Введите три целых числа и мы скажем делится ли оно на 3 или 9");
//        for (int i = 0; i < num.length; i++)
//        num[i] = in.nextInt();
//        for (int i = 0; i < num.length; i++)
//            if (i%3!=0 & i%9!=0)
//            System.out.println("Это число делится на 3 или 9: "+ num[i]);
//                else
//                System.out.println("Это число не делится ни на три ни на девять " + num[i]);

//        задание 6.4
//        Scanner in = new Scanner(System.in);
//        int[] num = new int[3];
//        System.out.println("Введите три целых числа и мы скажем делится ли оно на 5 или 7");
//        for (int i = 0; i < num.length; i++)
//            num[i] = in.nextInt();
//        for (int i = 0; i < num.length; i++)
//            if (i%5==0 && i%7==0)
//                System.out.println("Это число делится на 5 или 7: "+ num[i]);
//            else
//                System.out.println("Это число не делится ни на 5 ни на 7: " + num[i]);


//        задание 6.7

        Scanner in = new Scanner(System.in);
        int[] num = new int[2];
        System.out.println("Введите числа");
        for (int i = 0; i < num.length; i++)
            num[i] = in.nextInt();
        for (int i = 0; i < num.length; i++)
            if ((num[i]) + (num[i + 2]) / 2 == num[i + 1])
                System.out.println("Это число, то самое: "+ num[i+1]);


    }


}



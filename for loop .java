1)Write a program to print numbers from 1 to 10.

import java.util.*;
class Main{
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
--------------------------------------------------------------
2)Write a program to calculate the sum of first 10 natural number.

import java.util.*;
class Main{
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}------------------------------------------------------------
3)Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

import java.util.*;
class Main{
    public static void main(String args[]){
       for(int i=1;i<=10;i++){
           int table=2*i;
           System.out.println(2+" x "+i+" = "+table);
       }
    }
}
-------------------------------------------------------------
4)Write a program to find the factorial value of any number entered through the keyboard.

import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String args[]){
      int fact=1;
      int num=5;
      for(int i=1;i<=5;i++){
          fact=fact*i;
      }
      System.out.println(fact);

       }
    }

-----------------------------------------------------------------
5)1--->100 number print 

import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String args[]){

      for(int i=1;i<=100;i++){
          System.out.println(i);
      }
       }
    }
--------------------------------------------------------------
6)100--->1
number print 

import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String args[]){

      for(int i=100;i>=1;i--){
          System.out.println(i);
      }
       }
    }

--------------------------------------------------------------
8)100---->1
odd number print sum

import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String args[]){

      for(int i=100;i>=1;i--){
          if(i%2!=0){
              System.out.println(i);
          }

      }
       }
    }
9)50--->1000 even number sum

import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String args[]){

      for(int i=50;i<=1000;i++){
          if(i%2==0){
              System.out.println(i);
          }

      }
       }
    }



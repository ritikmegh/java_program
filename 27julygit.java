1). Write a C program to enter two numbers and find their sum.
import java.util.*; 
public class Main{
    public static void main(String []args){
      Scanner  sc=new Scanner(System.in);
     System.out.println("enter the value of a= ");
     int a=sc.nextInt();
     
     System.out.println("enter the value of b= ");
     int b=sc.nextInt();
     
     int sum=a+b;
     System.out.println(sum);
     
     
    }
}
-------------------------------------------------------------------------
2). Write a C program to enter two numbers and perform all arithmetic operations.
import java.util.*;
public  class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a= ");
        int a=sc.nextInt();
        
        if(a<=20){
            System.out.println("a is less than equil to");
        }
        else if(a>=20){
            System.out.println("a is greater than equil to");
        }
        else if(a==20){
            System.out.println("a is equil ");
        }
    }
}
-----------------------------------------------------------------------------
3).Write a C program to convert days into years, weeks and days.
import java.util.*;
public  class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the days= ");
       int d=sc.nextInt();
       
       if(d==365){
           System.out.println("these days are called 1 year");
       }
       else if(d==7){
           System.out.println("these days are called 1 week");
       }
       else if(d==30){
           System.out.println("these days are called 1 month");
       }
    }
}
4) write and make a program user input any number and user input like factorial then calculate a factorial of code and user input a string like reverse then calculate a reverse number only.
import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number= ");
        int num=sc.nextInt();
        int sum=0;
        int rem=0;
        int temp=num;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println(sum);
          
    }
}
-----------------------------------------------------------------------
5)print 2 table : 
like this format : 
2 X 1 =2 
2 X 2 =4 
import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number= ");
		int a=sc.nextInt();
		for(int i=1; i<=10; i++) {
			int table=a*i;
			System.out.println(a+" x "+i+" = "+table);
		}
	}
}


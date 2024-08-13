1)1000--->500 odd numbers sum
import java.util.*;
class Main{
    public static void main(String args[]){
       int sum=0;
      for(int i=50;i<=1000;i++){
          if(i%2!=0){
               sum=sum+i;
             System.out.println(i);
          }
            

      }
      
       }
    }
average level: 
2)table 2 to 10 
import java.util.*;
class Main{
    public static void main(String args[]){
        int a=2;
        for(int i=1;i<=10;i++){
            int table=2*i;
            System.out.println(table);
        }
       
       }
    }
3)table print between range from user input 

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number= ");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            int table=a*i;
            System.out.println(table);
        }
       
       }
    }
4)print 2 table opposite 
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number= ");
        int a=sc.nextInt();
        for(int i=10;i>=1;i--){
            int table=a*i;
            System.out.println(table);
        }
       
       }
    }
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

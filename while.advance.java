1)while : 
reverse number 
657
756 
import java.util.*;
 class Main{
     public static void main(String args[]){
        int num=657;
        int rem=0;
        int sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println(sum);
         

     }

}
2)
pallindrome number 
12321 
import java.util.*;
 class Main{
     public static void main(String args[]){
        int num=151;
        int rem=0;
        int sum=0;
        int temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
      if(temp==sum)
      {
          System.out.println("palindrome");
      }
      else {
          System.out.println("not palindrome");
      }

     }

}
3)
armstrong number 
153 
import java.util.*;
 class Main{
     public static void main(String args[]){
        int num=153;
        int rem=0;
        int sum=0;
        int temp=num;
        while(temp==sum)
        {
            rem=num%10;
            sum=sum*10+rem*rem*rem;
            num=num/10;
        }
      if(temp==num)
      {
          System.out.println("armstrong");
      }
      else {
          System.out.println("not armstrong");
      }

     }

}
4)
neon number 
9 ka square 
81 => 8+1=(9) 
import java.util.*;
 class Main{
     public static void main(String args[]){
       int num=9;
       int digit;
       int square;
       int sum=0;
       square=num*num;
       while(square>0)
       {
           digit=num%10;
           sum=sum+digit;
           square=square/10;
       }
       if(num==sum)
       {
           System.out.println("this is neon number");
       }
       else {
           System.out.println("this is not a neon number");
       }

     }

}
5)
factorial 
5 
1*2*3*4*5
import java.util.*;
 class Main{
     public static void main(String args[]){
     int n=5;
     int fact=1;
     for(int i=1;i<=5;i++)
     {
         fact=fact*i;
     }
     System.out.println(fact);

     }

}
6
fibonacci series 
0 1 1 2 3 5 
import java.util.*;
 class Main {
     public static void main(String args[]) {
         int n1 = 0;
         int n2 = 2;
         int sum;

         for (int i = 1; i <= 5; i++) {
             sum = n1 + n2;

             System.out.println(sum + " ");
             n1 = n2;
             n2 = sum;

         }
     }
 }
7)
mport java.util.*;
 class Main {
     public static void main(String args[]) {
       int num=1;
       while(num<=100)
       {
           if(num%2==0)
           {
               System.out.println(num);
           }
           num++;

       }
     }
 }
type2 : 1--->100 even number ka sum 









































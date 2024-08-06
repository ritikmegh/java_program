1)write a program to read a week day number and print weekday name using switch 
eg 1 =>sunday 
1 sunday 
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the weekname= ");
        int a=sc.nextInt();
        switch(a){
            case 1:
            {
                System.out.println("monday");
                break;
            }
            case 2:
            {
                System.out.println("tuesday");
                break;
            }
            case 3:
            {
                System.out.println("wednesday");
                break;
            }
            case 4:
            {
                System.out.println("thursday");
                break;
            }
            case 5:
            {
                System.out.println("friday");
                break;
            }
            case 6:
            {
                System.out.println("saturday");
                break;
            }
            case 7:
            {
                System.out.println("sunday");
                break;
            }
            default:
            System.out.println("please enter the 1 to 7 number");

        }


    }
}
------------------------------------------------------------------------------------------------------------

2) 
write a program to read gender (M/F) and print the corresponding gender using a switch statement 

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender= ");
        char s=sc.nextLine().charAt(0);
        switch(a){
            case 'm':
            {
                System.out.println("male");
                break;
        }
            case 'f':
            {
                System.out.println("female");
                break;
            }



}}}
---------------------------------------------------------------------------------------------------------------
3)
write a program to check whether the number is even or odd 
type1: 1 even number 
2 :odd number 

type2: e =>even number 
o=>odd number 
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender= ");
        int  a=sc.nextInt();
        switch(a%2){
            case 1:
            {
                System.out.println("even number");
                break;
        }
            case 2:
            {
                System.out.println("odd number");
                break;
            }



}}}
------------------------------------------------------------------------------------------------------------------
4)write a program to check month ? 
12 month 
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month name= ");
        int a=sc.nextInt();
        switch(a){
            case 1:
            {
                System.out.println("january");
                break;
            }
            case 2:
            {
                System.out.println("february");
                break;
            }
            case 3:
            {
                System.out.println("march");
                break;
            }
            case 4:
            {
                System.out.println("april");
                break;
            }
            case 5:
            {
                System.out.println("may");
                break;
            }
            case 6:
            {
                System.out.println("jun");
                break;
            }
            case 7:
            {
                System.out.println("july");
                break;
            }
            case 8:
                {
                    System.out.println("august");
                    break;
                }
            case 9:
                {
                    System.out.println("setember");
                    break;
                }
            case 10:
                {
                    System.out.println("october");
                }break;
                case 11:
                    {
                        System.out.println("november");
                        break;
                    }
               case 12:
                        {
                            System.out.println("december");
                            break;
                        }
                        default:
                        System.out.println("imput mismatch");
        }


    }
}
------------------------------------------------------------------------------------------------------------
5)

a p e o f r l 
a=armstrong number 
p =prime number 
e =even 
o =odd 
f =factorial 
r =reverse 
l =fibonacci 
t =perfect number 
n =neon number 
w =leap year 
s =swap one way 
v =vowel and consonant 
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month name= ");
        char a=sc.nextLine().charAt(0);
        switch(a){
            case 'a':
            {
                System.out.println("armstrong number");
                break;
            }
            case 'p':
            {
                System.out.println("prime number");
                break;
            }
            case 'e':
            {
                System.out.println("even");
                break;
            }
            case 'o':
            {
                System.out.println("odd");
                break;
            }
            case 'f':
            {
                System.out.println("factorial");
                break;
            }
            case 'r':
            {
                System.out.println("reverse");
                break;
            }
            case 'l':
            {
                System.out.println("fibanacci");
                break;
            }
            case 't':
                {
                    System.out.println("perfect number");
                    break;
                }
            case 'n':
                {
                    System.out.println("neon number");
                    break;
                }
            case 'w':
                {
                    System.out.println("leap number");
                }break;
                case 's':
                    {
                        System.out.println("swap one way");
                        break;
                    }
               case 'v':
                        {
                            System.out.println("vowel and consonant");
                            break;
                        }
                        default:
                        System.out.println("imput mismatch");
        
        }


    }
}
---------------------------------------------------------------------------------------------------------------
6)
write a program to check whether a person is eligible or not for vote
v :check voter id valid or not 
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character= ");
        char a=sc.nextLine().charAt(00);
        switch(a){
            case 'v':
                {
                    System.out.println("eligible for vote");
                    break;
                }
            case 'n':
                {
                    System.out.println("you are not eligible for vote");
                    break;
                }
        }
    }
}



















int random data first element and last element mid element 
public class Main{
    public static void main(String[]args){
        int[] a={34,25,64,63,46,15,36};
        System.out.print(a[0]+" "+a[a.length-1]+" "+a[a.length-4]);
    }
}
-----------------------------------------------------------------------
float random data second element and last second element mid element 
public class Main {
	public static void main(String[]args) {
		float[] a= {34.2f,25.4f,64.9f,63.5f,46.3f,15.2f,36.1f};
		System.out.print(a[0]+" "+a[a.length-1]+" "+a[a.length-4]);
	}
}
---------------------------------------------------------------------------
char random data  first element and last element mid element 
public class Main {
	public static void main(String[]args) {
		char[] a={'a','d','f','g','e'};
		System.out.print(a[0]+" "+a[a.length-1]+" "+a[a.length-3]);
	}
}
------------------------------------------------------------------------------
String random data second element and last second element mid element 
public  class Main{
    public static void main(String[]args){
        String a[]={"who","are","you","and","me"};
        System.out.print(a[0]+" "+a[a.length-1]+" "+a[a.length-3]);
    }
}
---------------------------------------------------------------------------
long random data  first element and last element mid element 
public  class Main{
    public static void main(String[]args){
        long a[]={3500l,34557579l,153254l,3533l,2346l,2363l,23464l};
        System.out.print(a[0]+" "+a[a.length-1]+" "+a[a.length-3]);
    }
}
--------------------------------------------------------------------------

double random data second element and last second element mid element
public  class Main{
    public static void main(String[]args){
        double a[]={3500.4,34557579.2,153254.1,3533.0,2346.6,2363.3,23464.9};
        System.out.print(a[0]+" "+a[a.length-1]+" "+a[a.length-4]);
    }
}
----------------------------------------------------------------------------
//print array from user input
import java.util.*;
public class UserInput{
    public static void main(String []args){
        Scanner array=new Scanner(System.in);
        System.out.println("enter the size = ");
        int size=array.nextInt();
        //create array
        int a[]=new int[size];
        //for loop for input data
        for(int i=0;i<size;i++){
            System.out.print("enter value= ");
            a[i]=array.nextInt();
        }
        //for loop for print data
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
-----------------------------------------------------------------------------

 





















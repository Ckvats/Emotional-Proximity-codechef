/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int i=0;i<t;i++)
	{
	    double p = sc.nextDouble();
	    double x = sc.nextInt();
	    double y = sc.nextInt();
	    double z = sc.nextInt();
	    double d =0;
	    if(z==1)
	    {
	         d = p+p*(y/100);
	    }
	    else{
	        d = p-p*(x/100);
	    }
	    System.out.printf("%.10f",d);
	    System.out.println();

	}
	}
}

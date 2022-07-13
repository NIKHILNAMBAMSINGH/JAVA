/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String []a={"nikhil","tomba","nokpahde"};
		String b="124";
		char c=b.charAt(0);
		String d=a[c-'0'];
		System.out.println(d);
		for(int i=0;i<d.length();i++)
		{
		    char g=d.charAt(i);
		    System.out.println(g);
		}
		//System.out.print(c);
		//System.out.print(a[0]);
		String e=a[2];
		//System.out.print(e);
		for(int i=0;i<e.length();i++)
		{
		    char f=e.charAt(i);
		    System.out.print(f);
		}
	}
}
	
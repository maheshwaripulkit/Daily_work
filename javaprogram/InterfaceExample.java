package com.cognizant.training;

public class InterfaceExample {
    public static void main(String[] args)
    {
    	impl imp=new impl();
    	System.out.println(imp.add(2,3));
    	System.out.println(Math.abs(imp.sub(2,3)));
    	System.out.println(Add.mod(4,3));
    }
}
class impl extends Div implements Add,Sub
{
 public int add(int a,int b)
 {
	 return a +b;
	 
 }
 
 public int sub(int a,int b)
 {
	 return a -b;
	 
 }
 int abcd=Add.mod(4,3);
 
}

interface Add
{	public static final int AGE=20;
	int add(int a,int b);
	default int mult(int a,int b)
	{
		return a*b;
	}
	static int mod(int a ,int b)
	{
		return a% b;
		
	}
	
}
interface Sub
{
	int sub(int a,int b);
}

class Div 
{
public int div(int a,int b)
{
	return a/b;
}
}
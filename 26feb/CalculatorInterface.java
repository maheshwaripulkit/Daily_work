package com.cognizant.training.LambdaExpression;

public class CalculatorInterface {

public static void main(String[] args) {
	calculate ca=(a,b)->a+b;
	calculate cb=(a,b)->a-b;
	calculate cc=(a,b)->a*b;
	calculate cd=(a,b)->a/b;	
	System.out.println(ca.calcu(10, 5));
	System.out.println(cb.calcu(10, 5));
	System.out.println(cc.calcu(10, 5));
	System.out.println(cd.calcu(10, 5));
}
}



interface calculate
{
	int calcu(int a,int b);
}
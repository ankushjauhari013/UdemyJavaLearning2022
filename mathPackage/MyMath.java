package mathPackage;
public class MyMath {
public double addition(double a, double b)
{return a+b;}

public double substract(double a, double b)
{return a-b;}

public double multiply(double a, double b)
{return a*b;}

public double division(double a, double b)
{return a/b;}

public long factorial(int n)
{ if(n<=1) return 1; 
  else return n * factorial(n-1); }
}


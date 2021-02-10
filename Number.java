//(c) A+ Computer Science
//www.apluscompsci.com
//Name Alejandra Quismorio


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number{
//private instance variable (must be an Integer)
private Integer num;
//constructor (default and one parameter)
public Number()
{
  num = 0;
}

public Number(Integer n)
{
  num = n;
}

//getter method
public Integer getNumber()
{
  return num;
}

//setter method
public void setNumber(Integer newNum)
{
  num = newNum;
}

//isOdd method

//isPerfect method


//toString
public String toString()
{
  return num + "is Odd and is Perfect";
}
}

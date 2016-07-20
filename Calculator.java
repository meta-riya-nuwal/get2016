public class Calculator
{
	
	
	Layout l=new Layout();
	l.GridLayout();
	l.boarderLayout();
	Button b=new Button();
	/*
	 * input is enter by user
	 * Until any operator is not come numbers have to append to string then convert that string into integer
	 * */
	
	
	b.inputButton(input);
	/* 
	  Accordingly input is number or operator it called inputButton of Numbers or Button
	*/
	
}
public class Layout
{
	void Gridlayout();
	void boarderLyout();
}
public class Button
{
	int first, second;
	String op;
	int result=0;
	int count=0;
}
public class Numbers extends Button
{
	
	/*
	 * if count of number is 2 then call operate method 
	 */
	int sum=0;
	void inputButton(String number);
	Operator opr=new Operator();
	if(count==2)
	{
		sum=opr.operate(int first,int second,op);
		result=result+sum;
		first=result;
		count=1;
	}
	
	
	
}
public class Operator extends Button
{
	void inputButton(String operator);
	/*
	 * If '=' is press then display function is called
	 * Display d=new Display();
	 * d.display(result);
	 */
}
public class Operations
{
	int operate(int first,int second,String op);
	
}
public class Display
{
	void display(int num);
	
	/*
	 If option of variable display available on calculator suppose LCD display ,linear display 
	 then accordingly below mentioned functions will be called
	void lcdDisplay(num);
	void Linear(num);
	*/
	
}
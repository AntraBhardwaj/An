package number;
import java.util.*;
public class Checkchar 
{
    public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int year;
		Scanner s= new Scanner(System.in);
		year = s.nextInt();	
		s.close();
	       if((year%4 == 0) && (year%100!=0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else if((year%100==0)&&(year%400 == 0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else if(year%400 == 0)
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else
	       {
	           System.out.print("This is not a Leap Year");
	       }
  }	
}

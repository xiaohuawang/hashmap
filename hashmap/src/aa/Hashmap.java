package aa;
import java.util.HashMap;
import java.util.Scanner;
public class Hashmap {

	 public static void main( String[] args )
	 {
	 HashMap<Integer,String> map = new HashMap<Integer,String>();
	 map.put( 10, "ten" );
	 map.put( 9, "nine" );
	 map.put( 8, "eight" );
	 map.put( 7, "seven" );
	 map.put( 6, "six" );
	 
     System.out.println("Would you like to try again? y/n");
	 Scanner sc=new Scanner(System.in);
	 String a=sc.nextLine();
	
	 
	 
	 while (a.equals("y"))
	 {
	 
		 System.out.println("Enter a number");
		 int b=sc.nextInt();
		 if(b!=10&&b!=9&&b!=8&&b!=7&&b!=6)
		 { //System.out.println("woshigou");
		System.out.print("it doesn't exist,import word ");
		Scanner ma=new Scanner(System.in);
		String c=ma.nextLine();	 
		 map.put(b,c);
		 }
		 
		 System.out.println(map.get(b));
		 
		 
		 System.out.println("Would you like to try again? y/n");
		 Scanner mm=new Scanner(System.in);
		 a=mm.nextLine();
		 if(a.equals("n"))
			 break;
		 
		 
	 }
	 //map.put( 10, "ten" );
	 //map.put( 9, "nine" );
	 //map.put( 8, "eight" );
	 //map.put( 7, "seven" );
	 System.out.println( "map = " + map );
	 
	 
	//System.out.println("10  " + map.get(10));
	// System.out.println("9 " +  map.get(9));
	
	 }
}
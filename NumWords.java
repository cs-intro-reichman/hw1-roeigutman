
public class NumWords {
	public static void main(String[] args){
	    
	int number = Integer.parseInt(args[0]);

	int a = number / 100;
	int b = number % 100 / 10;
	int c = number % 10;

	
    System.out.println( a + " hundreds, " + b + " tens, "+ "and "   + c + " ones. ");

	}

}

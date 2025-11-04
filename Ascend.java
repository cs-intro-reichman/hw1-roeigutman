
public class Ascend {
	public static void main(String[] args) {
		
    int lim = Integer.parseInt(args[0]);
    
    int number1 = (int)(Math.random() * lim);

    int number2 = (int)(Math.random() * lim);

	int number3 = (int)(Math.random() * lim);
	
	
	System.out.println( number1 + " " + number2 + " " + number3);
      
    int x = Math.min(number3, Math.min(number1, number2));

    int y = Math.max(number3, Math.max(number1, number2));
   
    int sum = number1 + number2 + number3; 
    
	int s = sum - x - y;

    System.out.println( x + " " + s + " " + y);
}








}

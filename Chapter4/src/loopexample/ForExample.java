package loopexample;

public class ForExample {

	public static void main(String[] args) {
		
		int count;
		int sum = 0;
		
		for(count = 1; count <= 10; count++) {
			sum += count;
		}
		
		/* °°Àº ½Ä
		 int count = 1;
		 int sum = 0;
		 for(int i = 0; i < 10; i++, count++){
		 	sum += count;
		 }
		 
		 */
		
		System.out.println(sum);
	}

}

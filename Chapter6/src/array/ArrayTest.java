package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		double[] dArr = new double[5];
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
	}

}

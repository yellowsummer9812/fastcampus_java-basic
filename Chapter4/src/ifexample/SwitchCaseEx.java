package ifexample;
import java.util.*;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				System.out.println("�ݸ޴�");
				break;
			case 2: medalColor = 'S';
				System.out.println("���޴�");
				break;
			case 3: medalColor = 'B';
				System.out.println("���޴�");
				break;
			default: medalColor = 'A';
		}
		
		System.out.println("rank : " + rank);
		System.out.println("medalColor : " + medalColor);
	}

}

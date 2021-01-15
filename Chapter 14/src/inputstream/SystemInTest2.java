package inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("입력 후 '끝'이라고 쓰세요 : ");
		
		try {
			int i;
			// 한 바이트씩을 인식하는 애를 multi byte를 읽을 수 있게 해주기 위해 보조스트림 InputStreamReader 사용
			// 바이트로 읽어들인 것을 문자로 바꿔줌
			InputStreamReader isr = new InputStreamReader(System.in);
			while( (i = isr.read()) != '끝') {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

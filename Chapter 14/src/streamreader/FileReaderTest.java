package streamreader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fis1 = new FileReader("reader.txt");
		int i;
		while((i = fis1.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis1.close();
		
		System.out.println();
		
		// ������Ʈ�� ���
		FileInputStream fis2 = new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis2); 
		int j;
		while((j = isr.read()) != -1) {
			System.out.print((char)j);
		}
		
		isr.close(); // ������Ʈ�� close�ϸ� ���� stream�� close�ȴ�.
		
	}

}

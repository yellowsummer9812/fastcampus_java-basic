package serialization;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer()); // 포인터 어디에있는지 알 수 있음
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		// 처음부터 읽으려면 파일 포인터를 파일의 맨 처음으로 옮겨주어야 한다.
		rf.seek(0);
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();
	}

}

package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c3 = Class.forName("java.lang.String");
		
		// 해당 Class 객체에 어떤 constructor가 있는지 확인하고싶을 때
		Constructor[] cons = c3.getConstructors();
		for(Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		// 해당 Class 객체에 어떤 method들이 있는지 확인하고싶을 때
		Method[] methods = c3.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}

}

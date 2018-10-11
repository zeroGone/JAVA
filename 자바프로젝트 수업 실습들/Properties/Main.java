import java.io.IOException;
/* 이메일을 보내는 기능을 구현할 때, 보내는 사람 이메일 계정과 비밀번호가 필요하다.
 * 이메일 계정과 비밀번호를 Java 소스 코드에 하드 코딩하는 것은 바람직하지 않다.
 * Properties 파일에 입력된 이메일 계정과 비밀번호를 읽어서 static member variable에 대입하는 코드를
 * SMTP 클래스의 static constructor에 구현하라.
 * */

import java.io.InputStream;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		System.out.println(STMP.JDBC_DRIVER_NAME); 
		System.out.println(STMP.DB_URL); 
		System.out.println(STMP.USER_EMAIL); 
		System.out.println(STMP.USER_PASSWORD);
	}
}

class STMP{
	static String JDBC_DRIVER_NAME; 
	static String DB_URL; 
	static String USER_EMAIL; 
	static String USER_PASSWORD;
	static {
		Properties properties = new Properties(); 
		try { 
			InputStream in = Main.class.getClassLoader().getResourceAsStream("res/DB.properties"); 
			properties.load(in); 
		}catch (IOException e) { 
			e.printStackTrace(); 
		} 
		JDBC_DRIVER_NAME = properties.getProperty("JDBC_DRIVER_NAME"); 
		DB_URL = properties.getProperty("DB_URL"); 
		USER_EMAIL = properties.getProperty("USER_EMAIL"); 
		USER_PASSWORD = properties.getProperty("USER_PASSWORD"); 
	}
}
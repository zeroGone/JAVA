import java.io.IOException;
/* �̸����� ������ ����� ������ ��, ������ ��� �̸��� ������ ��й�ȣ�� �ʿ��ϴ�.
 * �̸��� ������ ��й�ȣ�� Java �ҽ� �ڵ忡 �ϵ� �ڵ��ϴ� ���� �ٶ������� �ʴ�.
 * Properties ���Ͽ� �Էµ� �̸��� ������ ��й�ȣ�� �о static member variable�� �����ϴ� �ڵ带
 * SMTP Ŭ������ static constructor�� �����϶�.
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
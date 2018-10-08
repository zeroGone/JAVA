/* etFileExtension �޼ҵ带 �����϶�.
 * �� �޼ҵ�� ��θ��� ������ Ȯ���ڸ� �����Ѵ�.
 * ��θ� ������ Ȯ���ڰ� ���Ե��� ���� ��쿡, null �� �����Ѵ�.
 * */
public class Main {

	static String getFileExtension(String path) {
		if(path.lastIndexOf('.')==-1) return null;
		else return path.substring(path.lastIndexOf('.')+1);
	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx",
				"c:/www/mainpage.html",
		"c:/program files/java/readme" };
		for (String s : a) {
			String extension = getFileExtension(s);
			System.out.printf("%s  ", extension);
		}
	}
}

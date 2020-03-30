/* getFileExtension �޼ҵ带 �����϶�.
 * �� �޼ҵ�� ��θ��� ������ Ȯ���ڸ� �����Ѵ�.
 * */
public class Main {

	static String getFileExtension(String path) {
		return path.substring(path.lastIndexOf('.')+1);
	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx",
				"c:/www/mainpage.html",
		"c:/program files/java/javac.exe" };
		for (String s : a) {
			String extension = getFileExtension(s);
			System.out.printf("%s  ", extension);
		}
	}
}

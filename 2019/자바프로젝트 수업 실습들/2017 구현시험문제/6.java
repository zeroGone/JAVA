/* getFileExtension 메소드를 구현하라.
 * 이 메소드는 경로명에서 파일의 확장자를 리턴한다.
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

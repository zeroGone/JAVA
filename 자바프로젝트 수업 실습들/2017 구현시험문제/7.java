/* etFileExtension 메소드를 구현하라.
 * 이 메소드는 경로명에서 파일의 확장자를 리턴한다.
 * 경로명에 파일의 확장자가 포함되지 않은 경우에, null 을 리턴한다.
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

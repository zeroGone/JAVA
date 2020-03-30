package exam1;

public class Exam06 {

	static String getExtension(String path) {
		return path.substring(path.lastIndexOf("."));
	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx",
				"c:/www/mainpage.html",
		"c:/program files/java/javac.exe" };
		for (String s : a) {
			String ext = getExtension(s);
			System.out.println(ext);
		}

	}
}

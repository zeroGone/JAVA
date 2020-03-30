public class Main {
    static String getFileName1(String path) {
    	//lastIndexOf 메소드
    	//파라미터가 나오는 맨끝 인덱스를 리턴
    	int a = path.lastIndexOf("/");
    	return path.substring(a+1);
    }

    static String getFileName2(String path) {
    	String[] temp = path.split("/");
    	return temp[temp.length-1];
    }

    public static void main(String[] args) {
        String[] a = { "c:/data/student/lecture.docx",
                       "c:/www/mainpage.html",
                       "c:/program files/java/javac.exe" };
        for (String s : a) {
            String fileName1 = getFileName1(s);
            String fileName2 = getFileName2(s);
            System.out.printf("%s, %s\n", fileName1, fileName2);
        }

    }


}
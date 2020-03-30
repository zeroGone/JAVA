import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static String readTextFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void main(String[] args) throws IOException {        
        String path = "C:\\Users\\younggon\\Desktop\\자플 강의자료\\홈페이지_게시판.html";
        String s = readTextFile(path, Charset.forName("EUC-KR"));
        
        System.out.println(s);
        String regex = "<a href=\"http://www.skhu.ac.kr/board/boardread.aspx\\?idx=([0-9]+)[^>]+>([^<]+)</a>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        System.out.println();
        while (matcher.find()) System.out.printf("%s %s\n", matcher.group(1), matcher.group(2));
    }
}

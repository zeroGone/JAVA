public class Main {
	//trim length 사용해서 공백이거나 빈문자열까지검사
    public static boolean isNullEmptyBlank(String s) {
    	return s==null||(s=s.trim()).length()==0?true:false;
    }

    public static void main(String[] args) {
        String[] a = { null, "", " ", "  ", " \t ", " \t\n", " . "};
        
        for (String s : a) 
            System.out.println(isNullEmptyBlank(s));
    }

}
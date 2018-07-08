import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<String> output = new ArrayList<String>();
		
		int num=0;
		//사용자가 입력한 줄이 있을 때 반복문실행 hasNextLine을 안할경우 nosuchelement 오류가뜬다
		while(input.hasNextLine()) {
			output.add(input.nextLine());
			if(++num>100) break;//100번 이상
		}
		
		for(int i=0; i<output.size(); i++) {
			System.out.println(output.get(i));
		}
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<String> output = new ArrayList<String>();
		
		int num=0;
		//����ڰ� �Է��� ���� ���� �� �ݺ������� hasNextLine�� ���Ұ�� nosuchelement ���������
		while(input.hasNextLine()) {
			output.add(input.nextLine());
			if(++num>100) break;//100�� �̻�
		}
		
		for(int i=0; i<output.size(); i++) {
			System.out.println(output.get(i));
		}
	}

}

/* ����ä�ù� 
 * �׽�Ʈ���̽��� ��������� ��Ÿ�ӿ����� Ʋ�� ����
 * īī���� ����ä�ù濡���� ģ���� �ƴ� ������ ��ȭ�� �� �� �ִµ�, ���� �г����� �ƴ� ������ �г����� ����Ͽ� ä�ù濡 �� �� �ִ�.

���Ի���� ��ũ��� īī���� ���� ä�ù��� ������ ����� ����, �پ��� ������� ������, ������ ���� ���Ѻ� �� �ִ� ������â�� ������ �ߴ�. ä�ù濡 ������ ������ ���� �޽����� ��µȴ�.

[�г���]���� ���Խ��ϴ�.

ä�ù濡�� ������ ������ ���� �޽����� ��µȴ�.

[�г���]���� �������ϴ�.

ä�ù濡�� �г����� �����ϴ� ����� ������ ���� �� �����̴�.

ä�ù��� ���� ��, ���ο� �г������� �ٽ� ����.
ä�ù濡�� �г����� �����Ѵ�.
�г����� ������ ���� ������ ä�ù濡 ��µǾ� �ִ� �޽����� �г��ӵ� ���� ����ȴ�.

���� ���, ä�ù濡 Muzi�� Prodo��� �г����� ����ϴ� ����� ������� ������ ä�ù濡�� ������ ���� �޽����� ��µȴ�.

Muzi���� ���Խ��ϴ�.
Prodo���� ���Խ��ϴ�.

ä�ù濡 �ִ� ����� ������ ä�ù濡�� ������ ���� �޽����� ���´�.

Muzi���� ���Խ��ϴ�.
Prodo���� ���Խ��ϴ�.
Muzi���� �������ϴ�.

Muzi�� ������ �ٽ� ���� ��, Prodo ��� �г������� ���� ��� ������ ä�ù濡 �����ִ� Muzi�� Prodo�� ������ ���� ����ȴ�.

Prodo���� ���Խ��ϴ�.
Prodo���� ���Խ��ϴ�.
Prodo���� �������ϴ�.
Prodo���� ���Խ��ϴ�.

ä�ù��� �ߺ� �г����� ����ϱ� ������, ���� ä�ù濡�� Prodo��� �г����� ����ϴ� ����� �� ���� �ִ�. ����, ä�ù濡 �� ��°�� ���Դ� Prodo�� Ryan���� �г����� �����ϸ� ä�ù� �޽����� ������ ���� ����ȴ�.

Prodo���� ���Խ��ϴ�.
Ryan���� ���Խ��ϴ�.
Prodo���� �������ϴ�.
Prodo���� ���Խ��ϴ�.

ä�ù濡 ������ �����ų�, �г����� ������ ����� ��� ���ڿ� �迭 record�� �Ű������� �־��� ��, ��� ����� ó���� ��, ���������� ���� ������ ����� ���� �Ǵ� �޽����� ���ڿ� �迭 ���·� return �ϵ��� solution �Լ��� �ϼ��϶�.

���ѻ���
record�� ������ ���� ���ڿ��� ��� �迭�̸�, ���̴� 1 �̻� 100,000 �����̴�.
������ record�� ��� ���ڿ��� ���� �����̴�.
��� ������ [���� ���̵�]�� �����Ѵ�.
[���� ���̵�] ����ڰ� [�г���]���� ä�ù濡 ���� - Enter [���� ���̵�] [�г���] (ex. Enter uid1234 Muzi)
[���� ���̵�] ����ڰ� ä�ù濡�� ���� - Leave [���� ���̵�] (ex. Leave uid1234)
[���� ���̵�] ����ڰ� �г����� [�г���]���� ���� - Change [���� ���̵�] [�г���] (ex. Change uid1234 Muzi)
ù �ܾ�� Enter, Leave, Change �� �ϳ��̴�.
�� �ܾ�� �������� ���еǾ� ������, ���ĺ� �빮��, �ҹ���, ���ڷθ� �̷�����ִ�.
���� ���̵�� �г����� ���ĺ� �빮��, �ҹ��ڸ� �����Ѵ�.
���� ���̵�� �г����� ���̴� 1 �̻� 10 �����̴�.
ä�ù濡�� ���� ������ �г����� �����ϴ� �� �߸� �� �Է��� �־����� �ʴ´�.
 * */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
//		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] record = {""};
		System.out.println(Arrays.toString(solution(record)));
	}

	public static String[] solution(String[] record) {
		ArrayList<Object[]> users = new ArrayList<Object[]>();
		for(int i=record.length-1; i>=0; i--) {//�ڿ������� �˻�
			String[] value = record[i].split(" ");
			String id = value[1];
			
			int index = 0;
			boolean check = false;
			//������ ����� �ִ��� �˻�
			while(index<users.size()) {
				if(id.equals((String)users.get(index)[0])) {
					check=true;
					break;
				}
				index++;
			}
			
			if(!check) {
				Object[] user = new Object[3];
				user[0]=id;
				if(value[0].equals("Leave")) {
					user[2]=false;
				}
				else {
					user[1]=value[2];
					user[2]=true;
				}
				users.add(user);
			}else {
				Object[] user = users.get(index);
				if(user[1].equals(null)) {
					user[1]=value[2];
					user[2]=true;
				}
			}
		}		
		
		ArrayList<String> output = new ArrayList<String>();
		
		for(String value:record) {
			String[] temp = value.split(" ");
			String id = temp[1];
			String nick = "";
			
			int index = 0;
			while(index<users.size()) {
				if(users.get(index)[0].equals(id)) break;
				index++;
			}
			nick=(String)users.get(index)[1];
			
			if(temp[0].equals("Enter")) output.add(nick+"���� ���Խ��ϴ�.");
			else if(temp[0].equals("Leave")) output.add(nick+"���� �������ϴ�.");
		}
		return output.toArray(new String[output.size()]);
    }
	
}
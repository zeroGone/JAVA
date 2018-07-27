/* 2941번 크로아티아 알파벳
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
 * 따라서, 다음과 같이 크로아티아 알파벳을 다음과 같이 변경해서 입력했다.
 * č	c=
 * ć	c-
 * dž	dz=
 * ñ	d-
 * lj	lj
 * nj	nj
 * š	s=
 * ž	z=
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
 * lj와 nj도 마찬가지이다. 
 * 위 목록에 없는 알파벳은 한 글자씩 센다.
 * 입력:
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 
 * 알파벳 소문자와 '-', '='로만 이루어져 있다.
 * 문제 설명에 나와있는 크로아티아 알파벳만 주어진다.
 * 출력:
 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word = input.next();
		int num=0;
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			num++;
			if(ch=='='||ch=='-'||ch=='j') num+=croCheck(word,i-1);
		}
		
		System.out.println(num);
	}
	
	private static int croCheck(String word,int index) {
		char ch = word.charAt(index);
		if(word.charAt(index+1)=='j'&&ch!='n'&&ch!='l') return 0;
		if(ch=='z'&& word.charAt(index-1)=='d') return -2;
		return -1;
	}
}


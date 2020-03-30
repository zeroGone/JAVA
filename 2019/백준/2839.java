/* 백준 2839번 설탕배달 
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 
 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
 * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 * */

import java.util.Scanner;

public class Main {
	
	private static final int 삼봉지 = 3;
	private static final int 오봉지 = 5;
	private static int 봉지개수 =-1;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int kg = input.nextInt();
		
		System.out.println(봉지개수(kg));
	}
	
	private static int 봉지개수(int kg) {//봉지개수 구하는 메소드
		//몫에 근접한 5의 최고배수를 뺀 나머지가 삼으로 나누어지면 통과
		//통과를 못하면 5의 최고배수 이전 배수를 뺀 뒤 나머지가 삼의 배수로 다 나누어지면 통과
		//5의 배수들로 다 안 나누어질 경우 삼의 배수로 다 나누어지면 통과
		//위 절차를 다 통과하지 못하면 -1
		for(int 오봉지개수=kg/오봉지;오봉지개수>=0;오봉지개수--) {
			if((kg-(오봉지개수*오봉지))%삼봉지==0) {
				봉지개수=오봉지개수+(kg-(오봉지개수*오봉지))/삼봉지;
				break;
			}
		}
		return 봉지개수;
	}
}

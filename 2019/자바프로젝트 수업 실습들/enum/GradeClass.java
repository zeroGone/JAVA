/* 교수님이 만든 Grade enum을
 * Class로 바꿔 구현해보았다
 * */
public class GradeClass {
	public static final GradeClass Ap = new GradeClass(4.5);
	public static final GradeClass A = new GradeClass(4);
	public static final GradeClass Bp = new GradeClass(3.5);
	public static final GradeClass B = new GradeClass(3);
	public static final GradeClass Cp = new GradeClass(2.5);
	public static final GradeClass C = new GradeClass(2);
	public static final GradeClass Dp = new GradeClass(1.5);
	public static final GradeClass D = new GradeClass(1);
	public static final GradeClass F = new GradeClass(0);

	private double value;

	private GradeClass(double value) {
		this.value = value;
	}

	public double getValue() {
		return this.value;
	}
	
	public static GradeClass[] values(){
		return new GradeClass[] { Ap, A, Bp, B, Cp, C, Dp, D, F};
 	}
	
	@Override
	public String toString() {
		if(value==4.5) return "Ap";
		else if(value==4) return "A";
		else if(value==3.5) return "Bp";
		else if(value==3) return "B";
		else if(value==2.5) return "Cp";
		else if(value==2) return "C";
		else if(value==1.5) return "Dp";
		else if(value==1) return "D";
		else return "F";
	}
}

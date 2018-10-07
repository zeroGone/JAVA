/* enum 타입의 Grade
 * 외부에서 객체를 생성할 수 없고
 * 여기에 정의된 객체만 사용할 수 있음
 * */
public enum Grade {
	Ap(4.5), A(4), Bp(3.5), B(3), Cp(2.5), C(2), Dp(1.5), D(1), F(0);

    private double value;
    
    Grade(double value) {
        this.value = value;
    }
    
    public double getValue() {
        return this.value;
    }

}

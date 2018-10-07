public class Main {
    public static void main(String[] args) {

        Grade[] myGrades = { Grade.Ap, Grade.A, Grade.Bp, Grade.B, Grade.A };
        
        double sum = 0;
        for (Grade grade : myGrades)
            sum += grade.getValue();
        System.out.printf("sum=%.2f  average=%.2f\n", sum, sum / myGrades.length);
        System.out.println(Grade.Ap);

        GradeClass[] myGrades2 = { GradeClass.Ap, GradeClass.A, GradeClass.Bp, GradeClass.B, GradeClass.A};
        
        sum = 0;
        for (GradeClass grade2 : myGrades2) 
        	sum += grade2.getValue();
        
        System.out.printf("sum=%.2f  average=%.2f\n", sum, sum / myGrades2.length);
        System.out.println(GradeClass.Ap);
    }

}


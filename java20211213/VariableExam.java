package java20211213;

public class VariableExam {
    /*변수의 영향 범위
    전역변수와 지역변수 */
    int a; //전역변수의 사용은 지양한다.
    public void varTest(VariableExam testvar){
        testvar.a++;
    }
    public static void main(String[] args) {
        //a=1;
        VariableExam testvar=new VariableExam();
        testvar.a=1;
        
        System.out.println(testvar.a);

    }
}

package java20211213;

public class MethodExam {
     //1. input과 output이 모두 있는 메서드(일반적인 형태)
     public int sum(int a, int b){
        return a+b;
    }
    //2.input/output이 모두 없는 매서드
    public void noino(){
        System.out.println("no input no output");
        
    }
    //3. input만 있는 메서드
    public void onlyInput(String a){
        System.out.println(a);
    }
    //4. output만 있는 메서드
    public String onlyOutput(){
        return "hi";// 돌아가기 
    }

    //*리턴의 다른 사용법
    public void sayNick(String nick){
        if("fool".equals(nick)){
            return; //그냥 끝내기
        }
        System.out.println("my nick name is "+nick);
    }
    public static void main(String[] args) {
       MethodExam inandout=new MethodExam();
       System.out.println(inandout.sum(3,4));
       inandout.noino();
       inandout.onlyInput("Hello World!");
       System.out.println(inandout.onlyOutput());
       inandout.sayNick("mimi");

    }
    
}

package java20211213;


import java.util.Scanner;

public class IfExam {
    public static void main(String[] args) { 
        System.out.print("점수를 입력하세요 :");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String score=new String();
        if(a>=90){
            score="A";
        }
        else if(a>=80){
            score="B";
        }
        else if(a>=70){
            score="C";
        }
        else if(a>=60){
            score="D";
        }
        else{
            score="F";
        }

        System.out.println("당신의 점수는"+score+"입니다.");
        System.out.println();

 
       


    }
}

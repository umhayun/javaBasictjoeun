package java20211213;

import java.util.Scanner;

public class ForExam {
    public static void main(String[] args) {
        System.out.print("줄 수 입력");
        Scanner a=new Scanner(System.in);
        int line=a.nextInt();
        int i=0;
        
        for(i=0;i<=(line-1);i++){
            for(int k=0;k<=(line-1);k++){
            System.out.print("*");
        }
            System.out.println("");
            

        }
        for(i=0;i<=(line-1);i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
                System.out.println("");
        }
    }
    
}

package java20211210;

import java.util.ArrayList;


public class ArrayExam {
    public static void main(String[] args) {
        //Array배열 - 배열의 길이는 고정된다. 수정할 수 없다.

        int[] num={1,2,3,4,5};
        System.out.println(num[2]);
        System.out.println(num.length);

        ArrayList<String> lists=new ArrayList<String>();
        
        lists.add("1234");
        lists.add("6543");
        lists.add("5432");
        System.out.println(lists.get(0));

    }
}

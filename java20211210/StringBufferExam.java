package java20211210;

public class StringBufferExam {
    public static void main(String[] args) {
       

        //String Buffer - 문자열을 수정/ 변경할때 사용]
        
        StringBuffer sb=new StringBuffer();
        
        sb.append("hello");
        sb.append(" ");
        sb.append("nice to meet you");
        
        String result=sb.toString();
        System.out.println(result);
        // String result="";
        // result+="hello"; 
        // result+=" ";
        // result+="World!";
        // System.out.println(result);

        //1. 하나의 객체를 수정 방식
        //2.객체를 계속 추가해서 변경 - 불필요한 동작/ 자료형에 +연산이 사용될 때마다
        //계속 새로운 객체가 추가되어 생성된다.(새로운 객체를 만들어낸다.)
        //String 자로형은 한번 만들게 되면 수정이 불가능하다.
        //그 값 자체를 변경할 수 없다. immutable 하다고 표현한다.
        //toUpperCase와 같은 매서드의 경우도 문자열이 변경되는 것처럼 보일수는 있지만
        //매서드 수행 시 또다른 객체르 생성하여 리턴하는 것이다.

        //그렇다면 무조건 StringBuffer()를 사용하는 것이 좋은가!!
        //상황에 따라 다르다. StringBuffer()는 기본적으로 String보다 무겁다.
        //기본적인 메모리 사용양도 크고 속도도 느리다. 
        //문자열 추가나 변경이 많을 경우에만 StringBuffer를 사용하고
        //변경/수정작업에 거의 없는 경우에는 그냥 String을 사용하자.

    }

   
    
}

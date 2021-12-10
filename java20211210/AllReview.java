package java20211210;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class AllReview {
    public static void main(String[] args) {
        ArrayList<String> a= new ArrayList<String>();
        a.add("my name hayun");
        a.add("what?");
        a.add("thank you");
        System.out.println(a.get(2));
        HashMap<String, String> id= new HashMap<String, String>();
        id.put("f","d");
        System.out.println(id.get("f"));

        StringBuffer bu=new StringBuffer();
        bu.append("nice ");
        
        bu.append("to ");
        bu.append("meet ");
        bu.append("you");
        System.out.println(bu);
        
        Scanner x=new Scanner(System.in);
        Scanner y=new Scanner(System.in);
        int x1=x.nextInt();
        int y1=y.nextInt();
        String c=(x1>y1?"first":"second");
        System.out.println(c);
        
        
        
       
    

        
    }
    
}

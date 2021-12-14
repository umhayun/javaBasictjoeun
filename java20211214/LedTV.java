package java20211214;

public class LedTV implements TV{
    //LedTV클래스는 TV인터페이스를 구현했다.
    //TV 인터페이스에 정의된 메서드 들을 모두 구현해야만 한다.
    //@____ : annotation 애너테이션 
    //확인요청, 필수는 아닌 선택
    //웹개발에선 실행도 해줌
    @Override 
    public void turnOn(){
        System.err.println("TV ON");
    }
    @Override 
    public void turnOff(){
        System.out.println("TV OFF");
    }
    @Override 
    public void changeVolume(int volume){
        System.out.println("VOLUME CHANGE : "+volume);
    }
    @Override 
    public void changeChannel(int channel){
        System.out.println("CHANNEL CHANGE : "+channel);
    }


    
}

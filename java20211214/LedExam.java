package java20211214;

public class LedExam {
    public static void main(String[] args) {
        TV tv=new LedTV();
        tv.turnOn();
        tv.changeVolume(10);
        tv.changeChannel(11);
        tv.turnOff();
        
    }
}

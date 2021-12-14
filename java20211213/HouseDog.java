package java20211213;

public class HouseDog extends Dog{

    public HouseDog(String name){
        //생성자
        this.setName(name);
    }
    //생성자 오버로딩
    public HouseDog(int type){
        if(type==1){
            this.setName("york");
        }else if(type==2){
           this.setName("bulldog");
        }
    }
    public void sleep(){
        System.out.println(this.name+" zzz in house");
    }
    public void sleep(int hour){
        System.out.println(this.name+" zzz in house for "+hour+"hours");
    }

    public static void main(String[] args) {
        HouseDog houseDog=new HouseDog("happy");
        // houseDog.setName("happy");
        System.out.println(houseDog.name);
        HouseDog houseDog2=new HouseDog(2);
        System.out.println(houseDog2.name);
        // houseDog.sleep();
        // houseDog.sleep(3);


    }
}

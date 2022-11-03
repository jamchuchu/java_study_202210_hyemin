package J12_상속;

public class Human extends Animal{
    public Human(String name){
        super(name);
        System.out.println("Human 생성");
    }
    @Override
    public void move(){
        super.move();
        System.out.println("두발로 걷습니다");
    }

    public void runMove(){
        move();
    }
}

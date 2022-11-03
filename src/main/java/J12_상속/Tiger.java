package J12_상속;

public class Tiger extends Animal{
    public Tiger(String name){
        super(name);
    }

    @Override
    public void move() {
        super.move();
    }
    /*메소드 오버라이딩(오버라이드)
    * 상위 객체의 메소드를 하위 객체에서 다시 정의 하는것*/

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}

package J13_추상화.추상클래스;

/*abstract : 추상적인
* 중괄호 이전-> 선언부
* 중괄호 안 -> 구현부
* */
public abstract class Factory {

    private String name;

    public Factory(String name) {
        this.name = name;
    }
    public abstract void produce(String model);
    public abstract void management();

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다");
        System.out.println("공장이름: " + name);
    }
}

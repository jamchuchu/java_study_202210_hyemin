package J12_상속;

public class Main {
    public static void main(String[] args) {
//        Animal animal =  new Animal();
        Human human = new Human("혜민");
        Tiger tiger =  new Tiger("혜민이의타이거");

//        animal.move();
        human.move();
        tiger.move();

        System.out.println("사람의 이름: " + human.getName());
        System.out.println("동물의 이름: " + tiger.getName());


    }
}

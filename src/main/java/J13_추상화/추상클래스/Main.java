package J13_추상화.추상클래스;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory = new TabletFactory("이플 태블릿 공장");

        phoneFactory.produce("아이폰 14");
        tabletFactory.produce("아이패드 프로 5");

        phoneFactory.printInfo();
        phoneFactory.printInfo();
    }
}

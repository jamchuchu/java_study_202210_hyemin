package J07_반복;

public class Loop1 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 0; i < 100; i++){
            result += i+1;
        }

        System.out.println("1-100 까지 더한값: " + result);

        for (int i = 0; i < 100; i++) {
            System.out.println(1+i);
        }
    }
}

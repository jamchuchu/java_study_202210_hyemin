package J07_반복;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dan = 0;
        System.out.println("단 입력");
        dan = scanner.nextInt();

        for (int i = 1; i < 10 ; i++){
            System.out.println(dan + "x" + i +"=" + dan*i);
        }
    }
}

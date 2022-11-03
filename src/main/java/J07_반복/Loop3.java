package J07_반복;

import java.util.Scanner;

public class Loop3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        System.out.print("반복할 숫자를 입력하세요: ");
        num =  scanner.nextInt();


        for(int i = 0; i < num ; i++) {
            System.out.println(num-i);
        }

        System.out.println();

        for(int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}

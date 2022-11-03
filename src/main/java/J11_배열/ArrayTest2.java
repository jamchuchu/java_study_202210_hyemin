package J11_배열;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
        * 10명의 학생이름을 담을 수 있는
        * StduentNames 배열을 만들어보자*/

        Scanner scanner = new Scanner(System.in);
        String[] studentNames = new String[10];

//        studentNames[0] = "학생1";
//        studentNames[1] = "학생2";
//        studentNames[2] = "학생3";
//        studentNames[3] = "학생4";
//        studentNames[4] = "학생5";
//        studentNames[5] = "학생6";
//        studentNames[6] = "학생7";
//        studentNames[7] = "학생8";
//        studentNames[8] = "학생9";
//        studentNames[9] = "학생10";
        for(int i = 0; i < studentNames.length; i++){
            studentNames[i] = scanner.next();
        }

        for(int i = 0; i < studentNames.length; i++){
            System.out.println(studentNames[i]);
        }
    }
}

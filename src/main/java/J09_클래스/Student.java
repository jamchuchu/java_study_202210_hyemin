package J09_클래스;

public class Student {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    public void increaseStudentYear() {
        if(studentYear != 5){
            studentYear+= 1;
        }else{
            System.out.println("최고학년 입니다");
        }
    }

    public void showStudentinfo(){
        System.out.println("< 학생 정보 출력 >");
        System.out.println(schoolName);
        System.out.println(studentCode);
        System.out.println(studentYear);
        System.out.println(name);
        System.out.println();
    }
}

package J09_클래스;

public class StudentMain {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20220001;
        s1.studentYear = 2;
        s1.name = "김준일";

        s2.schoolName = "인하대학교";
        s2.studentCode = 20220001;
        s2.studentYear = 5;
        s2.name = "장혜민";

        s1.showStudentinfo();
        s1.increaseStudentYear();
        s1.showStudentinfo();
        System.out.println();

        s2.showStudentinfo();
        s2.increaseStudentYear();
        s2.showStudentinfo();
    }
}

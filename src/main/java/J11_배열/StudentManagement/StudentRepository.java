package J11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students;

    public StudentRepository(Student[] students) {
        students = new Student[0];
    }

    public void addStudnet(Student student) {
        int index = indexOfEmpty();
        students[index] = student;
    }

    private int indexOfEmpty(){
        int num = -1;
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null){
                num = i;// return 을 만나면 메소드는 끝이 남
            }
        }
        if(num == -1){
            increaseArray();
            num = students.length-1;
        }
        return num;
    }

    private void increaseArray(){
        Student[] tempArray = new Student[students.length+1];
        for (int i = 0; i< students.length; i++){
            tempArray[i] = students[i];
        }
        students = tempArray;
    }


}

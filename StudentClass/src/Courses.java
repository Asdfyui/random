public class Courses {
    Student student;
    private String subjectName;
    public int studentGrade;
    private int averageGrade;

    Courses(){
    subjectName = "";
    studentGrade = 0;

    }

    Courses(String subjectName, int studentGrade){
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;

    }

    public String toString() {
        return this.subjectName;
    }

    public int getStudentGrade() {
        return this.studentGrade;
    }
    public int getAverageGrade(){
        //getStudentGrade()
        return 0;
   }

}

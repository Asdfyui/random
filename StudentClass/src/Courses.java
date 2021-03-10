public class Courses {
    Student student;
    private String subjectName;
    private int studentGrade;

    Courses(){
    subjectName = "";
    studentGrade = 0;
    }

    Courses(String subjectName, int studentGrade){
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;

    }
    public String getSubjectName() {

        return subjectName;
    }

    public void setSubjectName(String subjectName) {

        this.subjectName = subjectName;
    }

    public int getStudentGrade() {

        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {

        this.studentGrade = studentGrade;
    }
    public String toString() {
        return this.subjectName;
    }
}

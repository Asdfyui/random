import javax.rmi.CORBA.StubDelegate;

public class Student {
    String firstName;
    static int idNum = 1;
    private int id;
    Student(){
        firstName = "";
        id = idNum;
        idNum++;
    }

    Student(int id, String firstName){
    this.id = idNum;
    this.firstName = "";
    }

    Courses[] course;

    int index= 0;
    Student(String firstName){
        this.firstName = firstName;
        course = new Courses[8];


    }
    private Courses[] addItem(Courses courses){
        Courses[] returnVal = new Courses [course.length + 1];
        //copy and add on course
        return returnVal;
    }


    public void addCourses(Courses courses){
        if (index == 8){
            course[index] = courses;
            index++;
        }
        else{
            course = addItem(courses);
        }

    }

}

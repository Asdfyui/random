import java.util.Arrays;

public class Main   {
    public static void main(String[] args){
        Student asdf = new Student("Asdf");
        System.out.println(asdf);

        Courses course1 = new Courses("English", 11 );
        asdf.addCourses(course1);
        Courses course2 = new Courses("Math", 54 );
        asdf.addCourses(course2);
        Courses course3 = new Courses("Math1", 88 );
        asdf.addCourses(course3);
        Courses course4 = new Courses("Math2", 35 );
        asdf.addCourses(course4);
        Courses course5 = new Courses("Math3", 78 );
        asdf.addCourses(course5);
        Courses course6 = new Courses("Math4", 99 );
        asdf.addCourses(course6);
        Courses course7 = new Courses("Math5", 66 );
        asdf.addCourses(course7);
        Courses course8 = new Courses("Math6", 76 );
        asdf.addCourses(course8);

        System.out.println(Arrays.toString(asdf.course));
        System.out.println();









    }
}

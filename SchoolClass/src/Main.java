public class Main {
    public static void main(String[] args) {
        Student asdf = new Student("asdf", "yui", 9);
        Student asdff = new Student("asdfasd", "fsdafsa", 10);

        Teacher teacher1 = new Teacher("Science", "Teacher", "Science");
        Teacher teacher2 = new Teacher("Math", "Teacher", "Math");
        Teacher teacher3 = new Teacher("History", "Teacher", "History");

        System.out.println(asdf);
        System.out.println(teacher1);
        School school = new School("school123", 4123, 1010);
        school.add(asdf);
        school.add(asdff);
        school.add(teacher1);
        school.add(teacher2);
        school.add(teacher3);

        school.setSchoolNum(1312);
        System.out.println(school);
        System.out.println(school.teachersList);
        System.out.println(school.studentsList);



    }
}

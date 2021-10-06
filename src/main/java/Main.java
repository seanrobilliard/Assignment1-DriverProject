import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DateTime Now = DateTime.now();

//create courses

        courseProgramme course1 = new courseProgramme("Computer Science",DateTime.parse("2018-09-01"),DateTime.parse("2022-05-05"));
        courseProgramme course2 = new courseProgramme("Math Science ",DateTime.parse("2019-08-05"),DateTime.parse("2023-05-05"));
        courseProgramme course3 = new courseProgramme("Biotechnology ",DateTime.parse("2017-06-06"),DateTime.parse("2021-05-05"));

        courseProgramme[] Courses = {course1,course2,course3};

        //create modules
        module module1 = new module("Maths","CT343");
        module module2 = new module("Software Engineering","CT343");
        module module3 = new module("Biology","CT343");
        module module4 = new module("Games programming","CT343");
        module module5 = new module("Networks","CT343");



//add modules to course
        module[] moduleArray = {module1, module5, module3};
        List<module> modulelist = Arrays.asList(moduleArray);
        course1.setModules( modulelist);

        module[] moduleArray2 = {module2, module4, module3};
        List<module> modulelist2 = Arrays.asList(moduleArray2);
        course2.setModules( modulelist2);

        module[] moduleArray3 = {module1, module2, module3};
        List<module> modulelist3 = Arrays.asList(moduleArray3);
        course3.setModules( modulelist3);


        //create students

        student student1 = new student("Sean", 20, "29/06/2001", 1111111);
        student student2 = new student(" Tim", 21, "12/04/2000", 2433232);
        student student3 = new student("Mary", 19, "09/02/2002", 235525);
        student student4 = new student("Oisin", 25, "02/01/1995", 11545711);
        student student5 = new student("Tina", 21, "24/011/2000", 35758547);


        //add students to module
        student[] students = {student1,student2,student3};
        List<student> studentList = Arrays.asList(students);
        module1.setStudents(studentList);

        student[] students2 = {student3,student3,student4};
        List<student> studentList2 = Arrays.asList(students);
        module2.setStudents(studentList2);

        student[] students3 = {student1,student2,student3};
        List<student> studentList3 = Arrays.asList(students);
        module3.setStudents(studentList3);

        student[] students4 = {student3,student5,student1};
        List<student> studentList4 = Arrays.asList(students);
        module4.setStudents(studentList4);

        student[] students5 = {student1,student4,student5};
        List<student> studentList5 = Arrays.asList(students);
        module5.setStudents(studentList5);


for (int i =0 ; i<Courses.length ; i++)
{
    System.out.println("Course : " +Courses[i].getName() );
    for (int f = 0 ; f< Courses[i].getModules().size() ;f++ )
    {   System.out.println("Module : " +Courses[i].getModules().get(f).getName());
        for (int h = 0 ; h< +Courses[i].getModules().get(f).getStudents().size() ;h++ )
        {  System.out.println("Student enrolled in module : " +Courses[i].getModules().get(f).getStudents().get(h).getName());
        System.out.println("Username : " +Courses[i].getModules().get(f).getStudents().get(h).getUsername());
        }
    }

}










    }
}
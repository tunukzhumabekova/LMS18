package seshn15;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        School school2 = new School("exampleSchool", "USA", LocalDate.of(2015, 8, 20));
        School school3 = new School("learningAcademy", "CAN", LocalDate.of(2018, 4, 12));
        School school4 = new School("knowledgeInstitute", "IND", LocalDate.of(2019, 11, 5));

        University university2 = new University("exampleUniversity", "USA", LocalDate.of(1990, 5, 15));
        University university3 = new University("learningInstitute", "CAN", LocalDate.of(2005, 12, 3));
        University university4 = new University("knowledgeCampus", "IND", LocalDate.of(2012, 7, 21));

        College college2 = new College("exampleCollege", "USA", LocalDate.of(1995, 3, 12));
        College college3 = new College("learningInstitution", "CAN", LocalDate.of(2008, 11, 5));
        College college4 = new College("knowledgeCenter", "IND", LocalDate.of(2016, 6, 25));

        Student student2 = new Student("John", "Doe", "Male", LocalDate.of(2001, 5, 15), school2);
        Student student3 = new Student("Alice", "Johnson", "Female", LocalDate.of(2002, 9, 28), school3);
        Student student4 = new Student("Bob", "Smith", "Male", LocalDate.of(2000, 3, 10), school4);
        Student student5 = new Student("Emily", "Williams", "Female", LocalDate.of(2003, 11, 20), university2);
        Student student6 = new Student("Michael", "Brown", "Male", LocalDate.of(2002, 8, 5), university3);
        Student student7 = new Student("Sophia", "Jones", "Female", LocalDate.of(2001, 12, 8), university4);
        Student student8 = new Student("David", "Lee", "Male", LocalDate.of(2003, 4, 17), college2);
        Student student9 = new Student("Olivia", "Martinez", "Female", LocalDate.of(2002, 6, 22), college3);
        Student student10 = new Student("William", "Garcia", "Male", LocalDate.of(2001, 10, 12), college4);
        Student student11 = new Student("Ava", "Rodriguez", "Female", LocalDate.of(2003, 2, 25), college2);
Student [] students={student2,student3,student4,student5,student6,student7,student8,student9,student10,student11};
students1(students);
    }
    public static void students1(Student[] students){
        for (Student stu:students) {
            stu.getStudentsStudyingYear();
            stu.getStudentsEducationCenter();
            System.out.println();
        }

    }


    }

package seshn15;

import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surname;
    private String gender;
    private LocalDate DataOfStart;
    private Education EducationCenter;

    public Student(String name, String surname, String gender, LocalDate dataOfStart, Education educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        DataOfStart = dataOfStart;
        EducationCenter = educationCenter;
    }

    public Student(Student[] students) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDataOfStart() {
        return DataOfStart;
    }

    public void setDataOfStart(LocalDate dataOfStart) {
        DataOfStart = dataOfStart;
    }

    public Education getEducationCenter() {
        return EducationCenter;
    }

    public void setEducationCenter(Education educationCenter) {
        EducationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", DataOfStart=" + DataOfStart +
                ", EducationCenter=" + EducationCenter +
                '}';
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println("name:"+getName()+"surname:"+getSurname()+"EducationCenter"+EducationCenter);
    }

    @Override
    public void getStudentsStudyingYear() {
        System.out.println("name:"+getName()+"surname"+getSurname()+"DataOfStart"+getDataOfStart());

    }
}

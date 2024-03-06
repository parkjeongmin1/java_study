package ch13.sec05;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        //모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));


//        Course.registerCourse2(new Applicant<Person>(new Person()));
//        Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
//        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
//        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));


        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
//        Course.registerCourse3(new Applicant<Student>(new Student()));
//        Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//        Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

        List<Course> arr = new ArrayList<>();
    }
}

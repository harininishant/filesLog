package io.pragra.log;

import io.pragra.log.FileExample;
import io.pragra.log.Student;

public class TestRun {


    public static void main(String[] args) {

        FileExample E = new FileExample();


        E.CreateStudent(new Student(30, null, "java"));
        E.CreateStudent(new Student(40, "ajk", "QA"));
        System.out.println(E.getH());
    }
}

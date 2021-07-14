package io.pragra.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class FileExample {

    private final Logger log = LogManager.getLogger(FileExample.class);
    public List<Student> stu = new ArrayList<>();
    public boolean CreateStudent(Student S) {

        //System.out.println("file example");
        log.info("creating student");
        log.debug("creating student with following details {}", S);
        log.trace("entering method: CreateStudent at {}", System.currentTimeMillis());
        if (S.getName() == null) {
            log.warn("io.pragra.log.Student name {} is not valid", S.getName());
        }
        if (S.getAge() < 18) {
            log.error("io.pragra.log.Student age cant be less than `18 supplies {}", S.getAge());
            throw new RuntimeException("Not a valid age");
        }
        log.trace("Leaving method: CreateStudent at {}", System.currentTimeMillis());
        return stu.add(S);
    }

    public List<Student> getH() {
        return stu;
    }
// rollingfile is used to create new file and zip the old file. as the size keeps increasing in the file appender.

}







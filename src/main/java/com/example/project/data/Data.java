package com.example.project.data;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Data {

    private final StudentRepository studentRepository;

    public Data(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostConstruct
    public void addData() {
        for(int i=0;i<5;i++) {
            Student student = new Student("StudentFirstName" + i, "StudentLastName" + i);
            studentRepository.save(student);
        }
    }
}

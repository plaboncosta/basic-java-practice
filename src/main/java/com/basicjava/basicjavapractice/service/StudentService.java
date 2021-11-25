package com.basicjava.basicjavapractice.service;

import com.basicjava.basicjavapractice.model.StudentModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<StudentModel> getStudent() {
        return List.of(
                new StudentModel(
                        1L,
                        "Plabon Joseph Costa",
                        "plabon@gmail.com",
                        LocalDate.of(1998, 9, 8),
                        23
                )
        );
    }
}

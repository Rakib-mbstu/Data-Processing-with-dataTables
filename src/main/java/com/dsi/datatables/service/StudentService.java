package com.dsi.datatables.service;

import com.dsi.datatables.entity.Student;
import com.dsi.datatables.repository.StudentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Page<Student> findAllStudent(Pageable pageable){
        return studentRepository.findAll(pageable);
    }

    public void save(Student student) {
        studentRepository.save(student);
    }
}

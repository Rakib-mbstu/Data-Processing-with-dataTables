package com.dsi.datatables.controller;

import com.dsi.datatables.dto.DataTableResponse;
import com.dsi.datatables.entity.Student;
import com.dsi.datatables.service.StudentService;
import com.github.javafaker.Faker;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    private final StudentService studentService;
    private final DataTableResponse<Student> dataTableResponse;

    public StudentController(StudentService studentService, DataTableResponse<Student> dataTableResponse) {
        this.studentService = studentService;
        this.dataTableResponse = dataTableResponse;
    }

    @GetMapping("/students")
    public DataTableResponse<Student> getAllStudent(HttpServletRequest request) {



        Integer start = Integer.parseInt((request.getParameter("start") == null ? String.valueOf(0)
                : request.getParameter("start")));
        int length = Integer.parseInt((request.getParameter("length") == null ? String.valueOf(0)
                : request.getParameter("length")));
        int draw = Integer.parseInt((request.getParameter("draw") == null ? String.valueOf(0)
                : request.getParameter("draw")));
        String search = request.getParameter("search");
        Page<Student> studentList;
        Pageable pageable = PageRequest.of(0,100);
        studentList = studentService.findAllStudent(pageable);
         //= new DataTableResponse<>();//can be autowired in configuration
        dataTableResponse.setDraw(draw);
        dataTableResponse.setData(studentList.getContent());
        dataTableResponse.setRecordsTotal(studentList.getTotalElements());
        dataTableResponse.setRecordsTotal(studentList.getTotalElements());
        return dataTableResponse;
    }
}

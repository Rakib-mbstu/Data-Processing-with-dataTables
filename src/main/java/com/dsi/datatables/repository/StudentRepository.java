package com.dsi.datatables.repository;

import com.dsi.datatables.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

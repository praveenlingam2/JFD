package com.nseit.studentcourse.repository;

import com.nseit.studentcourse.model.Course;
import com.nseit.studentcourse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}

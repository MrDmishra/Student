package com.student.sms;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.sms.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
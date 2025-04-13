package com.vaccination.vaccination_portal.repository;

import com.vaccination.vaccination_portal.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { }

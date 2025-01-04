package com.ganpat.SpringDataJpaP01.Repo;

import com.ganpat.SpringDataJpaP01.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}

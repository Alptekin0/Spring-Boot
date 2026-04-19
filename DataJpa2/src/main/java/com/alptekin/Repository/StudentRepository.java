package com.alptekin.Repository;

import com.alptekin.Enitity.students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<students, Integer> {
}

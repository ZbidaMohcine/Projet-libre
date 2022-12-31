package com.spring.backend.Repository;

import com.spring.backend.Entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepo extends JpaRepository<Class,Long> {
}

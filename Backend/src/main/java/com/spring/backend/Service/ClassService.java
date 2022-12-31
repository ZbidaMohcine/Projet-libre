package com.spring.backend.Service;

import com.spring.backend.Entity.Class;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClassService {

    public Class save(Class aClass);
    public List<Class> getAll();
    public Optional<Class> getOne(Long id);
    public Class delete(Long id);
    public Class update(Long id, Class aClass);
    public boolean exist(Long id);

}

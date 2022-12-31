package com.spring.backend.Service.Imp;

import com.spring.backend.Entity.Class;
import com.spring.backend.Repository.ClassRepo;
import com.spring.backend.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassRepo classRepo;

    @Override
    public Class save(Class aClass) {
        return classRepo.save(aClass);
    }

    @Override
    public List<Class> getAll() {
        return classRepo.findAll();
    }

    @Override
    public Optional<Class> getOne(Long id) {
        return classRepo.findById(id);
    }

    @Override
    public Class delete(Long id) {
        Class aClass =classRepo.findById(id).orElse(null);
        classRepo.delete(aClass);
        return aClass;
    }

    @Override
    public Class update(Long id, Class classUpdate) {
        Class aClass =classRepo.findById(id).orElse(null);
        aClass.setNiveau(aClass.getNiveau());
        aClass.setLibelle(aClass.getLibelle());
       // aClass.setEleves(classUpdate.getEleves());
        return aClass;
    }

    @Override
    public boolean exist(Long id) {
        return classRepo.existsById(id);
    }
}

package com.spring.backend.Service;

import com.spring.backend.Entity.Eleve;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EleveService {
    public Eleve save(Eleve eleve);
    public List<Eleve> getAll();
    public Eleve getOne(Long id);
    public Eleve delete(Long id);
    public Eleve update(Long id, Eleve eleve);
    public boolean exist(Long id);

}

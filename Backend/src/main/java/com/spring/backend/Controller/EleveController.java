package com.spring.backend.Controller;

import com.spring.backend.Entity.Eleve;
import com.spring.backend.Service.EleveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EleveController {
    private EleveService eleveService;
    public EleveController(EleveService eleveService) {
        this.eleveService = eleveService;
    }
    @PostMapping("/eleve")
    public Eleve saveEtd(@RequestBody Eleve eleve){
        return eleveService.save(eleve);
    }
    @GetMapping("/eleve")
    public List<Eleve> getAll(){
        return eleveService.getAll();
    }
}

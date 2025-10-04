package com.superdev.api.controller;

import com.superdev.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/todos-alunos")
    public List<String> getAll(){
        return alunoService.getALl();
    }


    @GetMapping("/{nome}")
    public String insert(@PathVariable String nome){
        return alunoService.insert(nome);
    }







}

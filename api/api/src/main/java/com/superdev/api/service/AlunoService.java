package com.superdev.api.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    private List<String> alunoList = new ArrayList<>();

    public List<String> getALl(){
        return this.alunoList;
    }

    public String insert(String novoAluno){
        if (alunoList.contains(novoAluno)){
            System.out.println("Aluno já cadastrado.");
        }else {
            this.alunoList.add(novoAluno);
        }
        return novoAluno;
    }


}

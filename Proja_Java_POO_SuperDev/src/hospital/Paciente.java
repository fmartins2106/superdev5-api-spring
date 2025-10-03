package hospital;

import java.util.List;
import java.util.Scanner;

public class Paciente {
    private String nome;
    private int idade;
    private List<String> historicoMedicos;

    public Paciente(String nome, int idadee) {
        this.nome = nome;
        this.idade = idadee;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadee() {
        return idade;
    }

    public void setIdadee(int idadee) {
        this.idade = idadee;
    }

    public List<String> getHistoricoMedicos() {
        return historicoMedicos;
    }

    public void setHistoricoMedicos(List<String> historicoMedicos) {
        this.historicoMedicos = historicoMedicos;
    }


    public void adicionarHistorico(String registro){
        historicoMedicos.add(registro);
    }

    public void mostrarHistorico(){
        historicoMedicos.forEach(System.out::println);
    }

    public void historicoMedicoPaciente(String nome){
        if (historicoMedicos.isEmpty()){
            System.out.println("Nenhum histórico registrado.");
            return;
        }
        System.out.println("Histórico internação - paciente:"+this.nome);
        historicoMedicos.forEach(s -> System.out.println(nome));
    }
}

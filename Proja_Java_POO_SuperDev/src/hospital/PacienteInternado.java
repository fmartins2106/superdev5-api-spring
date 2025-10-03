package hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class PacienteInternado extends Paciente{
    private int numeroLeito;
    private int diasInternados;

    private final Scanner scanner = new Scanner(System.in);

    public PacienteInternado(String nome, int idade, int numeroLeito, int diasInternados) {
        super(nome, idade);
        this.numeroLeito = numeroLeito;
        this.diasInternados = diasInternados;
    }


    public int getNumeroLeito() {
        return numeroLeito;
    }

    public void setNumeroLeito(int numeroLeito) {
        this.numeroLeito = numeroLeito;
    }

    public int getDiasInternados() {
        return diasInternados;
    }

    public void setDiasInternados(int diasInternados) {
        this.diasInternados = diasInternados;
    }

    public void aumentarDias(int dias){
        int totaLDiasInternados = this.diasInternados + dias;
        if (totaLDiasInternados > 30){
            System.out.println("Alerta. Paciente não pode permanecer mais de 30 dias internados.");
        }
    }

    public void mostrarInfo(String nome, int idade, int numeroLeito, int diasInternados){
        PacienteInternado pacienteInternado = new PacienteInternado(nome, idade, numeroLeito, diasInternados);
        System.out.println(pacienteInternado);
        historicoMedicoPaciente(nome);
    }

}

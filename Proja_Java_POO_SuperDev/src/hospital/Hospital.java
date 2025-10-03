package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<PacienteInternado> pacientesInternados = new ArrayList<>();

    public static void main(String[] args) {

        while (true){
            try {
                System.out.println("[1] Cadastrar um paciente.");
                System.out.println("[2] Aumentar dias internação.");
                System.out.println("[3] Histórico paciente.");
                System.out.println("[4] Adicionar Histórico paciente.");
                System.out.println("[4] Sair. ");
                System.out.print("Digite uma das opções acima:");
                int opcao = Integer.parseInt(scanner.nextLine().trim());
                switch (opcao){
                    case 1:
                        cadastroPacienteInternado();
                        break;
                    case 2:
                        aumentarDiasInternados();
                        break;
                    case 3:
                        historicoPacienteInternado();
                    case 4:
                        addHistoricoPaciente();
                        break;
                    case 5:
                        System.out.println(">>>Finalizando sistema.");
                        return;
                    default:
                        System.out.println("Erro. Valor inválido.");
                }
            }catch (NumberFormatException e){
                System.out.println("Erro. Digite uma opção válida.");
            }
        }

    }

    private static void addHistoricoPaciente() {

    }


    public static void historicoPacienteInternado(){
        String nome = validandoNomePaciente();
        pacientesInternados.forEach(s ->
                System.out.println(nome));
    }

    public static void cadastroPacienteInternado(){
        String nome = validandoNomePaciente();
        int idade = validandoIdade();
        int numeroLeito = numeroLeito();
        int diasInternados = diasInternados();
        PacienteInternado pacienteInternado1 = new PacienteInternado(nome, idade, numeroLeito, diasInternados);
        pacientesInternados.add(pacienteInternado1);
    }

    public static int aumentarDiasInternados() {
        int numeroleito = numeroLeito();
        int aumentarDias = 0;
        for (PacienteInternado pacientesInternado : pacientesInternados) {
            if (pacientesInternado.getNumeroLeito() == numeroleito) {
                aumentarDias = diasInternados() + pacientesInternado.getDiasInternados();
            }
        }
        return aumentarDias;
    }


    public static String validandoNomePaciente(){
        System.out.print("Nome do paciente:");
        String nome = scanner.nextLine().trim();
        return nome;
    }
    public static int validandoIdade(){
        while (true){
            try {
                System.out.print("Quantidade:");
                int idade = Integer.parseInt(scanner.nextLine().trim());
                return idade;
            }catch (NumberFormatException e){
                System.out.println("Erro. Número digitado inválido.");
            }
        }
    }

    public static int numeroLeito(){
        while (true){
            try {
                System.out.print("Número de leito:");
                int nLeito = Integer.parseInt(scanner.nextLine().trim());
                return nLeito;
            }catch (NumberFormatException e){
                System.out.println("Erro. Número digitado inválido.");
            }
        }
    }

    public static int diasInternados(){
        while (true){
            try {
                System.out.print("Quantidade:");
                int dInternados = Integer.parseInt(scanner.nextLine().trim());
                return dInternados;
            }catch (NumberFormatException e){
                System.out.println("Erro. Número digitado inválido.");
            }
        }
    }



}

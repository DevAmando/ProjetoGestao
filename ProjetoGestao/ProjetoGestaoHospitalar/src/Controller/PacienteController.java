package Controller;

import Model.Paciente;

public class PacienteController {
    
    public boolean SalvarPaciente(String nome, String CPF, int idade, int Telefone){
        Paciente p = new Paciente(nome,CPF, idade, Telefone);
        return p.persitir();
    }
}

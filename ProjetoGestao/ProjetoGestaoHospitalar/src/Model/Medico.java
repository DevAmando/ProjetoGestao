
package Model;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    private String crm;
    private List<Especialidade> especialidades;
    private String email;
    
    
    
    public Medico(String nome, String crm, String cpf, String email) {
        super(nome, cpf );
        this.crm = crm;
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void adicionarEspecialidade(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }

    public void removerEspecialidade(Especialidade especialidade) {
        this.especialidades.remove(especialidade);
    }

    @Override
    public String toString() {
        return "Médico: " + getNome() + "\nCRM: " + crm + "\nEspecialidades: " + especialidades;
    }
}



package Model;

import java.util.List;

public class Medico extends Pessoa{
    private static Integer ID;
    private String crm;
    private List<Especialidade> especialidades;
    private Login login;
     
    
    public Medico(String nome, String crm, String cpf, String email, String senha) {
        super(nome, cpf );
        this.crm = crm;
        this.login = new Login(email, senha);
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

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    public boolean autenticar(String email, String senha) {
        return this.login.getEmail().equals(email) && this.login.getSenha().equals(senha);
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        Medico.ID = ID;
    }
    
    
}


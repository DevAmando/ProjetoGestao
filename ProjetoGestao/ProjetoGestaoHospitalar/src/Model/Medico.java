
package Model;

import java.util.ArrayList;


public class Medico {
    
    private Integer ID;
    private String nome;
    private ArrayList<String> especialidade = new ArrayList<>();
    private String especialidadeMedica;

    public Medico(){}
    
    public Medico( String nome, String especialidadeMedica) {
        this.nome = nome;
        this.especialidadeMedica = especialidadeMedica;
    }

    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<String> especialidade) {
        this.especialidade = especialidade;
    }
    
   
    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public void setEspecialidadeMedica(String especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }
    
}

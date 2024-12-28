package Model;

public class Paciente {
  
    private Integer ID;
    private String nome;
    private String CPF;
    private int idade;
    private int Telefone;

    public Paciente() {
    }

    public Paciente(String nome, String CPF, int idade, int Telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public boolean persitir(){
        return true;
    
    }
    
    public Integer getId() {
        return ID;
    }

    public void setId(String id) {
        this.ID = ID;
    }
    
    
}

package Model;

public class Login {
    
    private String email;
    private String senha;
    private String nome;
    private String crm;

   
    public Login(String email, String senha, String nome, String crm) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.crm = crm;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
}

package Model;

public abstract class Pessoa {

    private String nome;
    String telefone;
    String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido!");
        }
    }

    private boolean validarCPF(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11 || !cpf.matches("\\d+")) {
            return false;
        }

        if (cpf.chars().distinct().count() == 1) {
            return false;
        }

        int primeiroDigito = calcularDigitoVerificador(cpf.substring(0, 9));
        int segundoDigito = calcularDigitoVerificador(cpf.substring(0, 10));

        return cpf.charAt(9) == (char) (primeiroDigito + '0')
                && cpf.charAt(10) == (char) (segundoDigito + '0');
    }

    private int calcularDigitoVerificador(String base) {
        int soma = 0;
        int peso = base.length() + 1;

        for (char c : base.toCharArray()) {
            soma += (c - '0') * peso--;
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }
}

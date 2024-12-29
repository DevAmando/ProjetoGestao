package Model;

import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;
    private double valor;
    private String status;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.valor = valor;
        this.status = "Confirmada";
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void cancelar() {
        this.status = "Cancelada";
    }
    
    public void horariomedico (){
    
        
    }
}

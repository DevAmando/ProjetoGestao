package Model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Medico medico;
    private List<Consulta> consultas;

    public Agenda(Medico medico) {
        this.medico = medico;
        this.consultas = new ArrayList<>();
    }

    public boolean adicionarConsulta(Consulta consulta) {
        for (Consulta c : consultas) {
            if (c.getDataHora().equals(consulta.getDataHora())) {
                return false; // Conflito de horário
            }
        }
        consultas.add(consulta);
        return true;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}

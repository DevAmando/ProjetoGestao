
package Model;

import java.util.ArrayList;


public class Especialidade {
     public void EscolherEspecialidadeMedica(ArrayList<String> especialidade) {
        especialidade.add("Cardiologia");
        especialidade.add("Ortopedia");
        especialidade.add("Pediatria");
        especialidade.add("Ginecologia");
        especialidade.add("Dermatologia");
        especialidade.add("Neurologia");
        especialidade.add("Oncologia");
        especialidade.add("Psiquiatria");
        especialidade.add("Endocrinologia");
        especialidade.add("Urologia");
        especialidade.add("Anestesiologia");
        especialidade.add("Reumatologia");
        especialidade.add("Gastroenterologia");
        
         for (int i = 0; i < especialidade.size(); i++) {
            System.out.println(especialidade.get(i));
        }
         String especialidadeMedica = especialidade.get(1);
    }

}

package Controller;

import Model.Medico;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NewMain1 {

    public static void main(String[] args) {

        Map<String, Object> dados = new HashMap<>();

        String filePath = "C:\\Users\\david\\Downloads\\ProjetoPOO\\ProjetoGestao\\ProjetoGestaoHospitalar\\src\\Persistir\\LoginMedico.json";
        dados.put("senha", 123);
        dados.put("cpf", "12233233213");
        dados.put("nome", "David");
        dados.put("email", "david@gmail.com");
        dados.put("crm", 12344);
        dados.put("horario", Arrays.asList(12, 15));
        dados.put("id", 1);

        
        for (Map.Entry<String, Object> entry : dados.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println(dados);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(dados, writer);
            System.out.println("Dados salvos no arquivo 'dados.json'");
        } catch (IOException e) {
        }
    }

}

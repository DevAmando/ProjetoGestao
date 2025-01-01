package Controller;

import Model.Medico;
import View.TelaCadastroMedicoView;
import View.TelaLogin;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class LoginController {

    public void loginUsuario(TelaLogin view) throws IOException {

        String senha = view.getjTextFieldemailLogi().getText();
        String email = view.getjPasswordFieldsenhaLogin().getText();

        String filePath = "C:\\caminho\\para\\medicos.json";
        List<Medico> medicos = carregarMedicos(filePath);

        for (Medico medico : medicos) {
            if (medico.autenticar(email, senha)) {

                System.out.println("Login bem-sucedido para o usuário: " + medico.getNome());
                return;
            }
        }

    }

    public static List<Medico> carregarMedicos(String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.exists() || file.length() == 0) {
            throw new FileNotFoundException("O arquivo JSON não foi encontrado ou está vazio.");
        }

        try (FileReader reader = new FileReader(file)) {

            return new Gson().fromJson(reader, new TypeToken<List<Medico>>() {
            }.getType());
        }
    }

    public void CadastrarUsuario(TelaCadastroMedicoView view) throws IOException {
        String nome = view.getjTextFieldNomeCadastroMedico3().getText();
        String crm = view.getjTextFieldCRMMedico().getText();
        String senha = view.getjTextFieldsenhaMedico1().getText();
        String cpf = view.getjTextFieldCPFMedico().getText();
        String email = view.getjTextFieldemailMedico().getText();

        Medico medico = new Medico(nome, crm, cpf, email, senha);

        Map<String, Object> novoRegistro = new HashMap<>();
        novoRegistro.put("senha", medico.getLogin().getSenha());
        novoRegistro.put("cpf", medico.getCpf());
        novoRegistro.put("nome", medico.getNome());
        novoRegistro.put("email", medico.getLogin().getEmail());
        novoRegistro.put("crm", medico.getCrm());
        novoRegistro.put("id", medico.getID());

        String filePath = "C:\\Users\\david\\Downloads\\ProjetoPOO\\ProjetoGestao\\ProjetoGestaoHospitalar\\src\\Persistir\\LoginMedico.json";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List<Map<String, Object>> registros;

        // Verifica e corrige o formato do arquivo JSON
        try (FileReader reader = new FileReader(filePath)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);

            if (jsonElement.isJsonArray()) {
                registros = gson.fromJson(jsonElement, new TypeToken<List<Map<String, Object>>>() {
                }.getType());
            } else if (jsonElement.isJsonObject()) {
                // Converte objeto único em uma lista
                registros = new ArrayList<>();
                registros.add(gson.fromJson(jsonElement, new TypeToken<Map<String, Object>>() {
                }.getType()));
            } else {
                // Inicializa como lista vazia
                registros = new ArrayList<>();
            }
        } catch (FileNotFoundException e) {
            // Arquivo não encontrado, inicializa como lista vazia
            registros = new ArrayList<>();
        }

        // Adiciona o novo registro
        registros.add(novoRegistro);

        // Grava a lista atualizada no arquivo
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(registros, writer);
            System.out.println("Dados salvos no arquivo JSON.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados no arquivo JSON.");
        }
    }

}

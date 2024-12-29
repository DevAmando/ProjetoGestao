
package Controller;

import Model.Medico;
import View.TelaCadastroMedicoView;
import com.google.gson.Gson;
import java.awt.TextField;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class LoginController {
       
    public void cadastrarUsuario(TelaCadastroMedicoView view) throws IOException {
    
    String nome = view.getjTextFieldNomeCadastroMedico3().getText().trim();
    String crm = view.getjTextFieldCRMMedico().getText().trim();
    String senha = view.getjTextFieldsenhaMedico().getText().trim();
    String cpf = view.getjTextFieldemailMedico().getText().trim();
    
    Medico medico = new Medico(nome,crm,cpf,senha);
       
    List<Medico> usuarios = new ArrayList <Medico>();
    usuarios.add(medico);
    
    String jsonUser = new Gson().toJson(usuarios);
    FileWriter fileWriter = new FileWriter("C:\\Users\\david\\Downloads\\ProjetoPOO\\ProjetoGestao\\ProjetoGestaoHospitalar\\src\\Persistir\\file.json");
    
    fileWriter.write(jsonUser);
    fileWriter.flush();
    
    }
        
        
}

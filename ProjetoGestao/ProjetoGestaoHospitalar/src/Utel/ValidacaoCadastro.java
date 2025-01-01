package Utel;

public class ValidacaoCadastro {

    public boolean CrmValidacaoTamanho(String Crm) {
        String crm = new String();
        int tamanho = crm.length();

        if (tamanho == 6 && CrmValidacaoNumber(crm)) {
            return true;
        }else
        return false;
    }
    
    public boolean CrmValidacaoNumber(String Crm){
        String crm = new String();
        
        if(!crm.substring(6).matches("[0-9]*")){
            return true;
        }else{
            return false;
        }
        
    }

}


package Model;


public class Administrador extends Login{
   
    private Integer ID;
    private boolean permission;
    
    public Administrador(String email, String senha) {
        super(email, senha);
        this.permission = true;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }
   
   
}

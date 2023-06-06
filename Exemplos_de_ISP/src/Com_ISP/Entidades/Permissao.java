package Com_ISP.Entidades;

public class Permissao {
    public int id;
    public boolean status = false;
    
    public Permissao(int id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}

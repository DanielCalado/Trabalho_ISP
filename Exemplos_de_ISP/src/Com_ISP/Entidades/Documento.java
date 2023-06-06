package Com_ISP.Entidades;

public class Documento {
    public int id;
    public String titulo;
    public String conteudo;

    public Documento(int id, String titulo, String conteudo){
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    

}

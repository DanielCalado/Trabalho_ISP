package Com_ISP;

import Com_ISP.Entidades.Documento;
import Com_ISP.Negocio.Administrador;
import Com_ISP.Negocio.Editor;
import Com_ISP.Negocio.Visualizador;

public class main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        Editor editor = new Editor();
        Visualizador visualizador = new Visualizador();
		Documento documento = new Documento(0, "pagamento", "conta de luz...");
		 
        administrador.adicionarDocumento(documento);
		administrador.visualizarDocumento(0);

        //editor.editarDocumento("Documento B");
        //visualizador.visualizarDocumento("Documento C");
    }
}
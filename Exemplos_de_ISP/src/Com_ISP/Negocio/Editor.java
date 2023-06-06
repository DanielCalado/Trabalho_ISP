package Com_ISP.Negocio;

import java.util.ArrayList;

import Com_ISP.Entidades.Documento;
import Com_ISP.Interfaces.EditorFuncoes;
import Com_ISP.Interfaces.VisualizadorFuncoes;

// Classe para representar um editor
public class Editor implements EditorFuncoes, VisualizadorFuncoes {
    ArrayList<Documento> documentos = null;
    @Override
    public void editarDocumento(Documento documento) {
        System.out.println("Documento editado por um editor: "
         + documento);
    }

    @Override
    public void visualizarDocumento(int documento) {
        System.out.println("Documento visualizado por um editor: "
         + documentos.get(documento).getTitulo());
    }
}

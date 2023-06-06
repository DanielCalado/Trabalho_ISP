package Com_ISP.Negocio;

import java.util.ArrayList;

import Com_ISP.Entidades.Documento;
import Com_ISP.Interfaces.VisualizadorFuncoes;

public class Visualizador implements VisualizadorFuncoes {
    ArrayList<Documento> documentos = null;

    @Override
        public void visualizarDocumento(int documento) {
            System.out.println("Documento visualizado por um visualizador: "
             + documentos.get(documento).getTitulo());
        }
    
    }

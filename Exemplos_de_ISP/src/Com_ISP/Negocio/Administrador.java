package Com_ISP.Negocio;

import java.util.ArrayList;

import Com_ISP.Entidades.Documento;
import Com_ISP.Entidades.Permissao;
import Com_ISP.Entidades.Usuario;
import Com_ISP.Interfaces.AdminFuncoes;
import Com_ISP.Interfaces.EditorFuncoes;
import Com_ISP.Interfaces.VisualizadorFuncoes;

public class Administrador implements AdminFuncoes, EditorFuncoes, VisualizadorFuncoes {
    
    ArrayList<Documento> documentos = new ArrayList<>();
    @Override
    public void adicionarDocumento(Documento documento) {
        documentos.add(documento);
        System.out.println("Documento adicionado por um administrador: ");
    }

    @Override
    public void removerDocumento(Documento documento) {
        documentos.remove(documento);
        System.out.println("Documento removido por um administrador: ");
    }

    @Override
    public void atribuirPermissao(Documento documento, Usuario usuario, Permissao permissao) {
        System.out.println("Permissão atribuída por um administrador - Documento: " + documento
                + ", Usuário: " + usuario + ", Permissão: " + permissao);
    }

    @Override
    public void editarDocumento(Documento documento) {
        documentos.add(documento.id,documento);
        System.out.println("Documento editado por um administrador: ");
    }

    @Override
    public void visualizarDocumento(int documento) {

        System.out.println("ID: "+ documentos.get(documento).getId() +" Titulo: "+ documentos.get(documento).getTitulo());
    }

}

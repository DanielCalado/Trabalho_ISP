package Com_ISP.Interfaces;

import Com_ISP.Entidades.Documento;
import Com_ISP.Entidades.Permissao;
import Com_ISP.Entidades.Usuario;

public interface AdminFuncoes {
    void adicionarDocumento(Documento documento);
    void removerDocumento(Documento documento);
    void atribuirPermissao(Documento documento, Usuario usuario, Permissao permissao);
}
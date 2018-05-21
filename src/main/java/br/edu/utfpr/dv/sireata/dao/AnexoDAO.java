package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.ExcluirDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.LerDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.SalvarDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoBuscarPorIdDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoCarregarObjetoDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoExcluirDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoListarPorAtaDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.anexo.AnexoSalvarDAO;
import br.edu.utfpr.dv.sireata.model.Anexo;
import java.util.List;

public class AnexoDAO extends BasicDAO {

    public AnexoDAO(ExcluirDAO excluir, LerDAO ler, SalvarDAO salvar) {
        this.excluirDAO = excluir;
        this.lerDAO = ler;
        this.salvarDAO = salvar;
    }

    public AnexoDAO(AnexoBuscarPorIdDAO anexoBuscarPorIdDAO, AnexoCarregarObjetoDAO anexoCarregarObjetoDAO, AnexoExcluirDAO anexoExcluirDAO, AnexoListarPorAtaDAO anexoListarPorAtaDAO, AnexoSalvarDAO anexoSalvarDAO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Anexo> listar(int idAta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
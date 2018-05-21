package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.ExcluirDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.SalvarDAO;
import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.List;
import br.edu.utfpr.dv.sireata.dao.algorithms.LerDAO;

public abstract class BasicDAO {
    
    protected SalvarDAO salvarDAO;
    protected ExcluirDAO excluirDAO;
    protected LerDAO lerDAO;
    
    public int salvar(DAOEntity e) throws SQLException {
        return salvarDAO.salvar(e);
    }
    
    public void excluir(int i) throws SQLException {
        excluirDAO.excluir(i);
    }
    
    public List<? extends DAOEntity> listarPorAta(int idAta) throws SQLException {
        return lerDAO.listarPorAta(idAta);
    } 
    
    public DAOEntity buscarPorId(int id) throws SQLException {
        return lerDAO.buscarPorId(id);
    }
    
}
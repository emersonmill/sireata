package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.List;

public interface LerDAO {
    
    public DAOEntity buscarPorId(int id) throws SQLException;
    
    public List<? extends DAOEntity> listarPorAta(int idAta) throws SQLException;

    
}
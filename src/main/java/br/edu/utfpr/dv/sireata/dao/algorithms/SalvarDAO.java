package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;

public interface SalvarDAO {
    
    public int salvar(DAOEntity anexo) throws SQLException;

}
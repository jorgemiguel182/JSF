package br.com.dao.implementacao;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import br.com.framework.implementacao.crud.ImplementacaoCrud;
import br.com.repository.interfaces.RepositoryLogin;

@Repository
public class DaoLogin extends ImplementacaoCrud<Object> implements
		RepositoryLogin {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean autentico(String login, String senha) throws Exception {
		String sql = "select count(1) as autentica from entidade where ent_login = ? and ent_senha = ?";
		SqlRowSet rowSet = super.getJdbcTemplate().queryForRowSet(sql, new Object[]{login,senha});
		return rowSet.next() ? rowSet.getInt("autentica") > 0 : false;
	}

}

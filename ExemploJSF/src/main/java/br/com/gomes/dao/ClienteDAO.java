/**
 * 
 */
package br.com.gomes.dao;

import br.com.gomes.dao.generic.GenericDAO;
import br.com.gomes.domain.Cliente;

/**
 * @author wendel.gomes
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}

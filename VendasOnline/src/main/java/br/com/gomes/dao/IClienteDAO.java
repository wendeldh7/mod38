/**
 * 
 */
package br.com.gomes.dao;

import java.util.List;

import br.com.gomes.dao.generic.IGenericDAO;
import br.com.gomes.domain.Cliente;

/**
 * @author wendel.gomes
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}

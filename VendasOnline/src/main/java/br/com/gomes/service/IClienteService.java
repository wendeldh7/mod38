/**
 * 
 */
package br.com.gomes.service;

import java.util.List;

import br.com.gomes.domain.Cliente;
import br.com.gomes.exceptions.DAOException;
import br.com.gomes.services.generic.IGenericService;

/**
 * @author wendel.gomes
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}

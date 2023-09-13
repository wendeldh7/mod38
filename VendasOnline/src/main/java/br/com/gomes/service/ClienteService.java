/**
 * 
 */
package br.com.gomes.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.gomes.dao.IClienteDAO;
import br.com.gomes.domain.Cliente;
import br.com.gomes.exceptions.DAOException;
import br.com.gomes.exceptions.MaisDeUmRegistroException;
import br.com.gomes.exceptions.TableException;
import br.com.gomes.services.generic.GenericService;

/**
 * @author wendel.gomes
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}

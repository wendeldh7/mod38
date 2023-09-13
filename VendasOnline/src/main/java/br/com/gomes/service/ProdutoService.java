/**
 * 
 */
package br.com.gomes.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.gomes.dao.IProdutoDAO;
import br.com.gomes.domain.Produto;
import br.com.gomes.service.IProdutoService;
import br.com.gomes.services.generic.GenericService;

/**
 * @author wendel.gomes
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}

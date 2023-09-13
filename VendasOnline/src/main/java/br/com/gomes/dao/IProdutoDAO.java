/**
 * 
 */
package br.com.gomes.dao;

import java.util.List;

import br.com.gomes.dao.generic.IGenericDAO;
import br.com.gomes.domain.Produto;

/**
 * @author wendel.gomes
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}

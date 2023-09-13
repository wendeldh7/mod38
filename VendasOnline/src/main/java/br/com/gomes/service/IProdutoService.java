/**
 * 
 */
package br.com.gomes.service;

import java.util.List;

import br.com.gomes.domain.Produto;
import br.com.gomes.services.generic.IGenericService;

/**
 * @author wendel.gomes
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}

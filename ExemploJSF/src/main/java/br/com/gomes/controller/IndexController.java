/**
 * 
 */
package br.com.gomes.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * @author wendel.gomes
 *
 */
@Named
@ViewScoped
public class IndexController implements Serializable {

	private static final long serialVersionUID = -3176307559028924604L;

	public String goToClientPage() {
	    return "/cliente/list.xhtml";
	}
}

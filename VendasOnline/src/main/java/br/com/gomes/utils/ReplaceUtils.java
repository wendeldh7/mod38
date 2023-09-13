/**
 * 
 */
package br.com.gomes.utils;

/**
 * @author wendel.gomes
 *
 */
public class ReplaceUtils {

	public static String replace(String value, String ...patterns) {
		String retorno = value;
		for (String pattern : patterns) {
			retorno = retorno.replace(pattern, "");
		}
		return retorno;
	}
}

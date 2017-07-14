package br.fpl.dev.utils;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Armazena os estados que serão utilizados no select
 * @author Lucas
 *
 */
public class EstadoUtil {
	
	private static List<String> estadoList = asList("Acre", 
													"Alagoas",
													"Amazonas", 
													"Amapá", 
													"Bahia", 
													"Ceará", 
													"Distrito Federal", 
													"Espírito Santo",
													"Goiás", 
													"Maranhão", 
													"Minas Gerais", 
													"Mato Grosso do Sul", 
													"Mato Grosso", 
													"Pará", 
													"Paraíba", 
													"Pernambuco",
													"Piauí", 
													"Paraná", 
													"Rio de Janeiro", 
													"Rio Grande do Norte", 
													"Rondônia", 
													"Roraima",
													"Rio Grande do Sul", 
													"Santa Catarina", 
													"Sergipe", 
													"São Paulo",
													"Tocantins");

	public static List<String> getEstadoList() {
		return estadoList;
	}

}

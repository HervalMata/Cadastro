package br.fpl.dev.utils;

import java.util.List;

import static java.util.Arrays.asList;

public class Estados {
	
	private static List<String> estadoList = asList("Acre",
											 "Alagoas",
											 "Bahia",
											 "Ceará",
											 "Distrito Federal",
											 "Espírito Santo",
											 "Goiás",
											 "Maranhão",
											 "Mato Grosso",
											 "Minas Gerais",
											 "Pará",
											 "Paraíba",
											 "Pernambuco",
											 "Piauí",
											 "Rio de Janeiro",
											 "Rio Grande do Norte",
											 "Rio Grande do Sul",
											 "Rondônia",
											 "Roraima",
											 "Santa Catarina",
											 "São Paulo",
											 "Sergipe",
											 "Tocantins");

	public static List<String> getEstadoList() {
		return estadoList;
	}

}

package br.fpl.dev.utils;

import java.util.List;

import static java.util.Arrays.asList;

public class CidadeUtil {
	
	public static List<String> cidadesPorEstado(String estado){
		
		if (estado.equals("Acre")){
			return getAc();
		}
		
		return null;
	}
	
	
	private static List<String> ac = asList("Acrelândia",
											"Assis Brasil",
											"Brasiléia",
											"Bujari",
											"Capixaba",
											"Cruzeiro do Sul",
											"Epitaciolândia",
											"Feijó",
											"Jordão",
											"Mâncio Lima",
											"Manoel Urbano",
											"Marechal Thaumaturgo",
											"Plácido de Castro",
											"Porto Acre",
											"Porto Walter",
											"Rio Branco",
											"Rodrigues Alves",
											"Santa Rosa do Purus",
											"Sena Madureira",
											"Senador Guiomard",
											"Tarauacá",
											"Xapuri");

	public static List<String> getAc() {
		return ac;
	}

}
			

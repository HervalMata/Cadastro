package cadastro;

import java.util.List;

import br.fpl.dev.beans.Pessoa;
import br.fpl.dev.utils.CidadeUtil;

public class TesteCidades {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setEstado("Acre");
		
			
		List<String> cidades = CidadeUtil.cidadesPorEstado(p1.getEstado());
		
		for (String s : cidades){
			System.out.println(cidades.size());
			System.out.println(s);
		}
		
		for (int i = 0; i < cidades.size(); i++) {

			String c = cidades.get(i);
			
			System.out.println(c);
			
		}
		
	}

}

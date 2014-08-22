package CadProd;

import java.util.List;
import java.util.*;

public class CadastraProd {

	private List<String> produtos;
	
	public CadastraProd() {
		this.produtos = new ArrayList<String>();
	}
	
	public String getProdutos (int produtos) {
		return this.produtos.get(produtos);
	}
	
	public void preenche (Ficha cad, String nome, String cod) {
		this.produtos.add(cad.ficha(nome, cod));
	}
}

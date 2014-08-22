package CadProdTeste;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import CadProd.CadastraProd;
import CadProd.FichaEspecial;
import CadProd.FichaSimples;

public class CadastraProdTeste {

	private CadastraProd cadastro;
	
	@Before
	public void AbreCadastro(){
		this.cadastro = new CadastraProd();
	}
	
	@Test
	public void CadastroSimples() {
		this.cadastro.preenche(new FichaSimples(), "Feijão", "431234");
		assertEquals("Nome: Feijão\nCódigo do Produto: "+431234+"\nTipo de Ficha: Simples", this.cadastro.getProdutos(0));
	
	}
	@Test
	public void CadastroEspecial() {
		this.cadastro.preenche(new FichaEspecial(), "Arroz", "431234");
		assertEquals("Nome: Arroz\nCódigo do Produto: "+431234+"\nTipo de Ficha: Especial", this.cadastro.getProdutos(0));
	}
}

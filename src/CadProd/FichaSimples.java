package CadProd;

public class FichaSimples implements Ficha {

	public String ficha (String nome, String cod) {
		
		String resultado = "";
		resultado = resultado + "Nome: " +nome+ 
							  "\n" + "C�digo do Produto: " 
							  +cod+ "\n" + "Tipo de Ficha: "+ "Simples";
		return resultado;
	}
	
}

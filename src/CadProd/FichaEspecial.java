package CadProd;

public class FichaEspecial implements Ficha {

	public String ficha (String nome, String cod) {
		
		String resultado = "";
		resultado = resultado + "Nome: " +nome+ 
						      "\n" + "C�digo do Produto: " 
							  +cod+ "\n" + "Tipo de Ficha: "+ "Especial";
		return resultado;
	}
		
}
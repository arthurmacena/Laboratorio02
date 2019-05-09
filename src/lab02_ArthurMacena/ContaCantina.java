package lab02_ArthurMacena;

/**
 * Representa uma conta criada para uma pessoa na cantina
 * detem o nome da cantina, quanto gastou, quantas unidades comprou
 * e o quanto pagou.
 * 
 * @author Arthur de Amorim Macena
 */
public class ContaCantina {
	
	/**
	* Nome da loja a ser comprada.
	*/
	private String nome;
	
	/**
	* Situacao como devedor na loja.
	*/
	private int conta;

	/**
	* Quantidade de itens que sao comprados.
	*/
	private int quantidade;

	/**
	* Situacao como pagador na loja.
	*/
	private int debito;
	
	/**
	* Constroi uma loja a partir do seu nome
	* que tem como inicializacao quantidade, debito e
	* conta como 0.
	
	* @param nome e o nome da loja
	*/
	public ContaCantina(String nome)
	{
		this.nome = nome;
		this.quantidade = 0;
		this.debito = 0;
		this.conta = 0;
	}
	
	/**
	 * Cadastra a quantidade de unidades pedidas
	 * e o valor total dessas quantidades.
	  
	 * @param quantidade e a quantidade de unidades pedidas
	 * @param valor e o quanto deu as unidades pedidas
	 */
	public void cadastraLanche(int quantidade, int valor)
	{
		this.quantidade += quantidade;
		this.conta += valor;
	}
	
	/**
	 * Recebe o valor pago até então na loja.
	 * 
	 * @param valor e o quanto o cliente debitou.
	 */
	public void pagaConta (int valor)
	{
		this.debito += valor;
	}
	
	/**
	 * Ocorre a diminuicao do quanto o cara deve na loja
	 * e do quanto ele tem de debito, para saber qual seu saldo.
	 * 
	 * @return o saldo do cliente
	 */
	public int getFaltaPagar()
	{
		int faltaPagar = this.conta - this.debito;
		return  faltaPagar;
	}
	
	/**

	* Retorna a String que representa o quanto foi gasto na cantina
	* A representacao segue o formato "NOME QUANTIDADE_DE_PRODUTOS GASTO. 

	*
	* @return a representacao em string da quantidade de gasto e 
	* de unidades compradas na cantina.
	*/
	public String toString()
	{
		return (this.nome + " " + this.quantidade + " " + this.conta);
	}
}

package lab02_ArthurMacena;

/**
 * Representa uma conta de laboratorio criada para um aluno no qual
 * tem um nome, e um espaco de dados a armazenar.
 * 
 * @author Arthur de Amorim Macena
 */
public class ContaLaboratorio {
	
	/**
	* Nome da conta do laboratorio a ser criada.
	*/
	private String laboratorio;
	
	/**
	 * Espaco da ocupado pela conta criada.
	*/
	private int tamanho;

	/**
	* Tamanho mÃ¡ximo do espaco a ser ocupado pela conta.
	*/
	private int cota;
	
	/**
	* ConstrÃ³i a conta do laboratorio a partir de um nome
	* Toda conta comeÃ§a com tamanho ocupado igual a zero e se nao passado por parametro
	* com cota de no maximo 2000 mbytes.

	* @param laboratorio o nome da conta
	*/
	public ContaLaboratorio (String laboratorio)
	{
		this.laboratorio = laboratorio;
		this.tamanho = 0;
		this.cota = 2000;
	}
	
	/**
	* ConstrÃ³i a conta do laboratorio a partir de um nome e um tamanho mÃ¡ximo em mbytes.
	* Toda conta comeÃ§a com tamanho ocupado igual a zero.

	* @param laboratorio, o nome da conta
	* @param cota, o tamanho mÃ¡ximo da conta
	*/
	public ContaLaboratorio (String laboratorio, int cota)
	{
		this.laboratorio = laboratorio;
		this.tamanho = 0;
		this.cota = cota;
		
	}
	
	/**

	* Aumenta o espaco gasto pelo usuario na conta.
	* 
	* @param tamanho e o tamanho em mbytes consumido pelo usuario.
	*/
	public void consomeEspaco(int tamanho)
	{
		this.tamanho += tamanho;
	}
	
	/**

	* Diminui o espaco gasto pelo usario na conta.
	* 
	* @param tamanho e o tamanho em mbytes excluido pelo usuario.
	*/
	public void liberaEspaco(int tamanho)
	{
		this.tamanho -= tamanho;
	}
	
	/**

	* Retorna o valor em verdadeiro ou falso, se o tamanho ocupado
	* pelo usario e maior ou igual que a cota, se for maior ou igual
	* Verdadeiro, se for menor Falso.

	*
	* @return o booleano representado pela comparacao de tamanho e cota.
	*/
	public boolean atingiuCota()
	{
		if(this.tamanho >= this.cota)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**

	* Retorna a String que representa a conta do laboratorio.
	* A representaÃ§Ã£o segue o formato â€œLABORATORIO TAMANHO/COTAâ€�.

	*
	* @return a representacao em string da conta do laboratorio.
	*/
	public String toString()
	{
		return (this.laboratorio + " " + this.tamanho + "/" + this.cota);
	}
}

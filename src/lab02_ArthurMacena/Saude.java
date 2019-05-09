package lab02_ArthurMacena;

/**
 * Representa uma forma de acompanhar a saude geral dos alunos
 * que tem como base as suas saudes Mentais e Fisicas.
 * 
 * @author Arthur de Amorim Macena
 */

public class Saude {
	
	/**
	* Representa a saude mental do individuo.
	*/
	private String saudeMental;

	/**
	* Representa a saude fisica do individuo.
	*/
	private String saudeFisica;
	
	
	/**
	* Constroi a saude sem necessarios parametros.
	* Toda saude mental e fisica comecam como boa.
	
	*/
	public Saude()
	{
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}
	/**
	 * Altera a saude mental do individuo.
	  
	 * @param saudeMental e a representacao da saudeMental.
	 */
	public void defineSaudeMental(String saudeMental)
	{
		this.saudeMental = saudeMental;
	}
	
	/**
	 * Altera a saude fisica do individuo.
	 
	 * @param saudeFisica e a representacao da saude fisica
	 */
	public void defineSaudeFisica(String saudeFisica)
	{
		this.saudeFisica = saudeFisica;
	}
	
	
	/**
	 * Ocorre as comparacoes para definir o estado de saude
	 * do individuo.
	 * 
	 * @return Boa ou fraca ou ok.
	 */
	public String getStatusGeral()
	{
		if(this.saudeFisica.equals("boa"))
		{
			if (this.saudeMental.equals("boa"))
			{
				return "boa";
			}
			else
			{
				return "ok";
			}
		}
		else
		{
			if (this.saudeMental.equals("boa"))
			{
				return "ok";
			}
			else
			{
				return "fraca";
			}
		}
	}
}

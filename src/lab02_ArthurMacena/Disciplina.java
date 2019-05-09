package lab02_ArthurMacena;

import java.util.Arrays;

/**
 * Representa as informacoes de uma disciplina da universidade de um aluno
 * que detem o nome, o tempo de estudo, suas notas e a media.
 * 
 * @author Arthur de Amorim Macena
 */
public class Disciplina {
	
	/**
	* Nome de identificacao da disciplina do curso.
	*/
	private String nome;

	/**
	* tempo referente ao tempo estudado para a disciplina do curso.
	*/

	private int tempo;

	/**
	 * notas tiradas referentes a disciplina do curso. 
	*/
	private double[] notas = {0,0,0,0};

	/**
	 * media das notas tiradas da disciplina do curso. 
	*/
	private double media;
	
	/**
	* Constroi uma disciplina a partir de seu nome
	* Que comeca com seu tempo de estudo e sua media igual a 0.

	* @param nome e o nome da disciplina do curso
	*/
	public Disciplina (String nome)
	{
		this.nome = nome;
		this.media = 0;
		this.tempo = 0;
	}
	
	/**
	* Aumenta o tempo de estudo para a disciplina.
	* 
	* @param tempo e o tempo gasto para estudo da disciplina
	*/
	public void cadastraHoras(int tempo)
	{
		this.tempo += tempo;
	}
	
	/**
	* Armazena a nota das provas da disciplina, dentro do array.
	* Onde a nota e o numero da prova e passado como parametro.
	* 
	* @param prova e o numero da prova aplicada .
	* @param nota e a nota que ele tirou na prova.
	*/
	public void cadastraNota(int prova, double nota)
	{
		this.notas[prova-1] = nota;
	}
	
	/**
	* Calcula a media das notas da disciplina.
	*/
	public void calculaMedia()
	{
		for (int i = 0; i < 4; i++)
		{
			this.media += this.notas[i];
		}
		this.media /= 4;
	}
	
	

	/**
	
	* Retorna um booleano
	
	*
	* @return a representacao em booleano se acima da media
	* na disciplina.
	*/
	public boolean aprovado()
	{
		double media = 0;
		for (int i = 0; i < 4; i++)
		{
			media += this.notas[i];
		}
		media /= 4;
		if (media >= 7)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**

	* Retorna a String que representa a disciplina a ser estudada
	* A representacao segue o formato "NOME TEMPO_DE_ESTUDO MEDIA [NOTAS]. 

	*
	* @return a representacao em string da situacao da disciplina do curso.
	*/
	public String toString()
	{
		return (this.nome + " " + this.tempo + " " + this.media + " " + Arrays.toString(this.notas) );
	}
}

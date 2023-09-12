package br.edu.inteli.cc;

/**
 * 
 * Responsável por responder se o aluno está aprovado ou não
 *
 */
public class ServicoAprovacao {

	/**
	 * Método: consultar
	 * 
	 * Retorna o resultado da aprovação do aluno de acordo com as seguintes regras:
	 * - Se a porcentagem de presença for menor que 75%, o aluno está REPROVADO, não importa a média parcial obtida.
	 * - Se a porcentagem de presença for maior ou igual a 75%, então a média parcial determinará o resultado. 
	 * Se for menor que 7, então o aluno estará de EXAME; caso contrário, ele estará APROVADO. 
	 * 
	 * @param mediaParcial - média parcial do aluno na disciplina após as avaliações do semestre
	 * @param aulas - quantidade total de aulas da disciplina
	 * @param faltas - quantidade de faltas do aluno na disciplina
	 * @return - resultado da aprovação
	 */
	public ResultadoAprovacao consultar(double mediaParcial, int aulas, int faltas) {
		// TODO: falta completar/corrigir a implementação
		if (mediaParcial <= 7) {
			return ResultadoAprovacao.REPROVADO;
		}
		return ResultadoAprovacao.APROVADO;
	}
	
	/**
	 * Método: consultar
	 * 
	 * Retorna o resultado da aprovação do aluno após ele ter feito o exame:
	 * - Se a porcentagem de presença for menor que 75%, o aluno está REPROVADO, não importam as notas obtidas 
	 * (a princípio, não deveria ter feito o exame).
	 * - Se a porcentagem de presença for maior ou igual a 75%, então ele estará APROVADO se a média aritmética
	 * entre a média parcial e o exame for maior ou igual a 6; caso contrário, ele estará REPROVADO.
	 * 
	 * @param mediaParcial - média parcial do aluno na disciplina após as avaliações do semestre
	 * @param exame - nota obtida pelo aluno no exame da disciplina
	 * @param aulas - quantidade total de aulas da disciplina
	 * @param faltas - quantidade de faltas do aluno na disciplina
	 * @return
	 */
	public ResultadoAprovacao consultar(double mediaParcial, double exame, int aulas, int faltas) {
		// TODO: falta completar/corrigir a implementação
		if ((mediaParcial + exame)/2 <= 6) {
			return ResultadoAprovacao.REPROVADO;
		}
		return ResultadoAprovacao.APROVADO;
	}
	
}

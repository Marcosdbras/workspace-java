import br.util.StringUtils;

public class Aplicacao {
/**
 * Para incluir JAR externo
 * 
 * 1) clique inverso no projeto
 * 2) clique em propriedade
 * 3) clique em java build path
 * 
 * Quando tem o projeto dentro do próprio workspace
 * pode utilizar este caminho, neste caso não é necessário
 * gerar o JAR, porém a referência não fuunciona fora do eclipse
 * 
 * 4) clique na aba project
 * 5) adiciona o projeto 
 * 
 * 
 * 4) Cria pasta /lib dentro do projeto
 * 5) Copia o JAR pra dentro da pasta lib
 * 6) Faz a referencia ao JAR através de 
 *    Faz o passo 2, 3
 * 7) clique na aba libraries
 * 8) ADD JAR : Quando o JAR estiver dentro do projeto
 *    ou ADD EXTERNAL JAR quando o JAR estive fora do projeto
 * 9) Escolha o projeto/ vá atá a pasta lib que criou / e escolha 
 *    o jar que havia copiado pra dentro da pasta   
 *    
 *    
 * @param args
 */
	public static void main(String[] args) {
		
		StringUtils.isEmpty("abc");
		
	}

}

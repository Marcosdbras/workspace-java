import java.util.ArrayList;
import java.util.List;

import br.com.samuelweb.nfe.Certificado;
import br.com.samuelweb.nfe.ConfiguracoesIniciaisNfe;
import br.com.samuelweb.nfe.exception.NfeException;
import br.com.samuelweb.nfe.util.CertificadoUtil;
import br.com.samuelweb.nfe.util.ConstantesUtil;
import br.com.samuelweb.nfe.util.ConstantesUtil.AMBIENTE;
import br.com.samuelweb.nfe.util.Estados;

public class Aplicacao {

	private static int tipoRepositorio;
	private static Estados estado;
	private static String ambiente;
	private static String versao;
	private static String localSchemas;
	private static String localArquivoPfx;
	private static String senhaCertificado;
	
	
	
	public static void main(String[] args) throws NfeException {
		
		
//		List<Estados> estado = new ArrayList<Estados>(); 
//		estado.add(Estados.SP);
		
		//TODO Escolha de informação através de combobox e configuar via switch
		estado = Estados.SP;
		ambiente = ConstantesUtil.AMBIENTE.HOMOLOGACAO;
		versao = ConstantesUtil.VERSAO.V3_10;
		
		localSchemas = "C:\\SRA\\Nfe\\Schemas";
		localArquivoPfx = "c:/certificado/certificado.pfx";
		senhaCertificado = "123456";
		
		switch(tipoRepositorio) {
		case 0:
			//Windows
			iniciaConfiguracoesWindows();
			break;
		
		case 1:
			//Arquivo pfx
			iniciaConfiguracoespfx();
			break;
		
		}
		
	
	}

	public static ConfiguracoesIniciaisNfe iniciaConfiguracoesWindows() throws NfeException {
		// Certificado Windows
		Certificado certificado = CertificadoUtil.listaCertificadosWindows().get(0);

		
		
		return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado, ambiente,
				certificado, localSchemas, versao);
	}
	
	public static ConfiguracoesIniciaisNfe iniciaConfiguracoespfx() throws NfeException {
		// Certificado Arquivo, Parametros: -Caminho Certificado, - Senha
		Certificado certificado = CertificadoUtil.certificadoPfx(localArquivoPfx, senhaCertificado);

		return ConfiguracoesIniciaisNfe.iniciaConfiguracoes(estado , ambiente,
				certificado, localSchemas, versao);
	}
	
	

}

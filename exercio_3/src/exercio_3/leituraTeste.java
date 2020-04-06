package exercio_3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leituraTeste {
	
	void LerArquivo(String nome){ 
	try{
		FileReader leitor = new FileReader(nome);
		BufferedReader ler = new BufferedReader(leitor);
		String linha = ler.readLine();
		System.out.println(linha.substring(0,1));
		ler.close();
		}
	catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
        e.getMessage());
    	}
	}
	public static void main(String[] args) {
		String nome = "/home/gustavo/Desktop/exercicio_3/exercio_3/arquivo_teste";
		leituraTeste leitura = new leituraTeste();
		leitura.LerArquivo(nome);
	}
}


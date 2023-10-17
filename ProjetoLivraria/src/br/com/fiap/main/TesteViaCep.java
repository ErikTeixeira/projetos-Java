package br.com.fiap.main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.beans.Endereco;
import br.com.fiap.services.ViaCepService;

public class TesteViaCep {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		ViaCepService viaCep = new ViaCepService();
		
		String cep = JOptionPane.showInputDialog("Informe o CEP para busca");
		
		Endereco endereco = viaCep.getEndereco(cep);
		
		String logradouro = endereco.getLogradouro();
		String bairro = endereco.getBairro();
		String localidade = endereco.getLocalidade();
		
		System.out.println(cep + "\n" + logradouro + "\n" + bairro + "\n" + localidade);

	}

}

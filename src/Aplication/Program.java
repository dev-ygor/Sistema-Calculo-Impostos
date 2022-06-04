package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuidores;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuidores> lista = new ArrayList<>();
		
		System.out.print("Digite o número de contribuidores: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Contribuidor #" + i + " dados:");
			System.out.print("Pessoa física ou jurídica (F/J)? ");
			char resposta = sc.next().charAt(0);
			
			if (resposta == 'F') {
				System.out.print("NOME: ");
				String nome = sc.next();
				
				System.out.print("RENDA ANUAL: ");
				Double rendaAnual = sc.nextDouble();
				
				System.out.print("GASTOS SAUDE: ");
				Double gastosSaude = sc.nextDouble();
				
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else if (resposta == 'J') {
				System.out.print("NOME: ");
				String nome = sc.next();
				
				System.out.print("RENDA ANUAL: ");
				Double rendaAnual = sc.nextDouble();
				
				System.out.print("QUANTIDADE FUNCIONÁRIOS: ");
				int numFuncionarios = sc.nextInt();
				
				lista.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		
		double totalTaxas = 0;
		for(Contribuidores c : lista) {
			System.out.printf(c.getNome() + ": R$ %.2f%n", c.calculoImposto());
			totalTaxas += c.calculoImposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXAS: R$ %.2f%n", totalTaxas);
		

	}

}

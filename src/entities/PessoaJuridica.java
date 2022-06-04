package entities;

public class PessoaJuridica extends Contribuidores {

	private int numFuncionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double calculoImposto() {
		double total = 0;
		
		if (numFuncionarios > 10) {
			total = (0.14 * rendaAnual);
		}
		else {
			total = (0.16 * rendaAnual);
		}
		
		return total;
	}

}

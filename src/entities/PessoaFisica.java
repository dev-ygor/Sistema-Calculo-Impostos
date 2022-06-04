package entities;

public class PessoaFisica extends Contribuidores {

	private double gastosSaude;
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculoImposto() {
		double total = 0;
		if (rendaAnual < 20000.00) {
			total = (0.15 * rendaAnual);
		}
		else if (rendaAnual >= 20000.00 && gastosSaude > 0) {
			total = (0.25 * rendaAnual) - (0.50 * gastosSaude);
		}
		else {
			total = (0.25 * rendaAnual);
		}
		
		return total;
	}

}

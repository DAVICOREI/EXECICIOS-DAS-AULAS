package Exercicio1;

class PessoaFisica extends Contribuinte {
    private String cpf;

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        double renda = getRendaBruta();
        if (renda <= 1903.98) {
            return 0;
        } else if (renda <= 2826.65) {
            return renda * 0.075 - 142.80;
        } else if (renda <= 3751.05) {
            return renda * 0.15 - 354.80;
        } else if (renda <= 4664.68) {
            return renda * 0.225 - 636.13;
        } else {
            return renda * 0.275 - 869.36;
        }
    }

    @Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", toString()=" + super.toString() + "]";
	}
}
package Exercicio1;

class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return getRendaBruta() * 0.10;
    }

    @Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", toString()=" + super.toString() + "]";
	}
}
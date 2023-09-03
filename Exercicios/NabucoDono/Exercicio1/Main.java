package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Contribuinte[] contribuintes = new Contribuinte[6];
        
        contribuintes[0] = new PessoaFisica("ALOK", 1500, "123.456.789-00");
        contribuintes[1] = new PessoaFisica("Pedro da pedreira", 3000, "987.654.321-00");
        contribuintes[2] = new PessoaFisica("Carlinho do grau", 5000, "456.789.123-00");
        
        contribuintes[3] = new PessoaJuridica("Empresa A", 20000, "12.345.678/0001-00");
        contribuintes[4] = new PessoaJuridica("Empresa B", 100000, "98.765.432/0001-00");
        contribuintes[5] = new PessoaJuridica("Empresa C", 500000, "45.678.912/0001-00");

        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte);
            System.out.println("Imposto a ser pago: R$" + contribuinte.calcularImposto());
            System.out.println();
            
            
        }
    }
}
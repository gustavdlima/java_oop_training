public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 1500, "gstv", "Centro", 31, 8, 1994);
        Conta conta1 = new Conta(1, 2200, "desi", "Praia", 1,4,1999);

//        Conta conta1 = new Conta(1, 300, "desi", "lagoa", "31/08/2022");
//        System.out.println("saldo: ");
//        System.out.println(conta.getSaldo());
//        System.out.println("Deposito de $250");
//        conta.deposito(250);
//        System.out.println("saldo: ");
//        System.out.println(conta.getSaldo());
//        double rendimento = conta.calculaRendimento();
//        System.out.println("Conta rendeu: ");
//        System.out.println(rendimento);
//        System.out.println("saldo: ");
//        System.out.println(conta.getSaldo());
//        System.out.println("Saque de $1000");
//        conta.saque(1000);
//        System.out.println("saldo: ");
//        System.out.println(conta.getSaldo());

        conta.recuperaDadosParaImpressao();
        conta1.recuperaDadosParaImpressao();
    }
}

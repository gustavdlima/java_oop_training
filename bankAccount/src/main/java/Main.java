public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 1500, "gstv", "Centro", "30/08/2022");
        System.out.println("saldo: ");
        System.out.println(conta.getSaldo());
        System.out.println("Deposito de $250");
        conta.deposito(250);
        System.out.println("saldo: ");
        System.out.println(conta.getSaldo());
        double rendimento = conta.calculaRendimento();
        System.out.println("Conta rendeu: ");
        System.out.println(rendimento);
        System.out.println("saldo: ");
        System.out.println(conta.getSaldo());
        System.out.println("Saque de $1000");
        conta.saque(1000);
        System.out.println("saldo: ");
        System.out.println(conta.getSaldo());
    }
}

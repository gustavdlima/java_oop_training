public class Conta {
    int id;
    private double saldo;
    String titular;
    String agencia;
    String dataAbertura;

    public Conta(int id, double saldo, String titular, String agencia, String dataAbertura) {
        this.id = id;
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
    }

    public void saque(double valor) {
        if (this.saldo > valor) {
            this.saldo = this.getSaldo() - valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void deposito(double valor) {
        this.saldo = this.getSaldo() + valor;
    }

    public double calculaRendimento() {
        return (this.saldo * 0.1);
    }

    public int getId() {
        return id;
    }
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }
}

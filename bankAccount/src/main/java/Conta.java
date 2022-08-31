public class Conta {
    private int id;
    private double saldo;
    private String titular;
    private String agencia;
    private Data data;

    public Conta(int id, double saldo, String titular, String agencia, int dia, int mes, int ano) {
        this.id = id;
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
        this.data = new Data(dia, mes, ano);
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

    public void recuperaDadosParaImpressao() {
        System.out.println(this.id);
        System.out.println(this.titular);
        System.out.println(this.saldo);
        System.out.println(this.agencia);
        System.out.println(this.data.getDia() + "/" + this.data.getMes() + "/" + this.data.getAno());
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

}

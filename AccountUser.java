package exercises;

public class AccountUser {
    private int numeroDaConta;
    private String nomeUsuario;
    private double valorADepositar;

    AccountUser(int numeroDaConta, String nomeUsuario) {
        this.numeroDaConta = numeroDaConta;
        this.nomeUsuario = nomeUsuario;

    }
    AccountUser(double valorADepositar) {
        this.valorADepositar = valorADepositar;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public double getValorADepositar() {
        return valorADepositar;
    }

    // valorDoDeposito = valorADepositar
    public double depositar(double valorDoDeposito, char  resultOperaton) {

        double result = valorDoDeposito + getValorADepositar();

        return result;
    }

    public String toString() {
        String result = "Account data: " +
                " Account, " + getNumeroDaConta() + " Holder: " +
                getNomeUsuario() + ", Balance " + getValorADepositar();
        return result;

    }

    public double sacar(double saque) {
        double result = (getValorADepositar() - saque) - 5;
        return result;
    }

}


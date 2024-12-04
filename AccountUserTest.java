package exercises;

import java.util.Scanner;

public class AccountUserTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do titular da conta?");
        String nomeUsuario = sc.next();
        System.out.println("Qual o número da conta?");
        int numeroDaConta = sc.nextInt();
        System.out.println("Deseja adicionar algum valor a conta (N/Y)");
        char resultOperation = sc.next().charAt(0);




        AccountUser account = new AccountUser(numeroDaConta, nomeUsuario );



        if (resultOperation == 'N') {

            System.out.println(account);

        } else if (resultOperation == 'Y') {
            System.out.println("Valor para deposito");
            double valorADepositar = sc.nextDouble();
            AccountUser accountUser = new AccountUser(valorADepositar);
            String result = "Account data: " +
                    " Account, " + numeroDaConta + " Holder: " +
                    nomeUsuario + ", Balance " + accountUser.getValorADepositar();

            System.out.println(result);
        }


        System.out.println("Valor para deposito");
        double valorADepositar = sc.nextDouble();
        AccountUser accountUser = new AccountUser(valorADepositar);


        double resultDepostito = accountUser.depositar(valorADepositar, resultOperation);

        System.out.println("Dados atualizados da conta. ");
        String result = "Account data: " +
                " Account, " + numeroDaConta + " Holder: " +
                nomeUsuario + ", Balance " + resultDepostito;

        System.out.println(result);

        System.out.println("Quanto deseja sacar?");
        double valorAsacar = sc.nextDouble();

        double resultSaque = accountUser.sacar(valorAsacar);
        System.out.println(resultSaque);

    }


}

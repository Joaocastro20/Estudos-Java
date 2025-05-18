public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente("joao","avenida 3");
	    Cliente maria = new Cliente("maria","avenida2");

        Conta conta1 = new Conta(1,200.0,150.0,joao);
        Conta conta2 = new Conta(2,500.0,600.0,maria);


        System.out.println("o limite do joao é: "+conta1.getLimite());
        conta1.sacar(300);
        System.out.println("o saldo do joao é: "+conta1.getSaldo());


    }
}

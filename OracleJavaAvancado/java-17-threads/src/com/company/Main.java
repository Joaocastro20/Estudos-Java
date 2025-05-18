public class Main {
    //testando threads
    public static void main(String[] args) {
	    Testes testes = new Testes();
        Thread t1 = new Thread(testes);
        t1.start();

        TesteII testeII = new TesteII();
        Thread t2 = new Thread(testeII);
        t2.start();
    }
}

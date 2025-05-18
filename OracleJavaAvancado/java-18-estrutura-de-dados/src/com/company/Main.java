public class Main {

    public static void main(String[] args) {
	 Aluno al1 = new Aluno("fafw");
     Aluno al2 = new Aluno("gser");

     Vetor lista = new Vetor();
     lista.adicionar(al1);
     lista.adicionar(al2);

        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.pega(1));
        System.out.println(lista.verificar(al1));
    lista.remove(0);
        System.out.println(lista);
    }


}

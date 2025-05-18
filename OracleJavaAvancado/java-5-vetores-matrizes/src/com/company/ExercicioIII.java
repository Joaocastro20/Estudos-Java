public class ExercicioIII {
    public static void main(String[] args) {
        //dois vetores com um armazenando o quadrado dos itens do outro imprimindo os dois
        int lista[] = {2,4,6,8};
        int quad[] = new int[4];
        for(int i = 0;i<lista.length;i++){
            quad[i] = 2 * lista[i];
        }
        for(int i = 0;i<lista.length;i++){
            System.out.println(quad[i]);
        }
        for(int i = 0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}

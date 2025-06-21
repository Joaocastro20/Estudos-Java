package OracleJava21zo830.Strings;

public class StringBufferTests {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Olá");
        sb.append(" Mundo!"); // O conteúdo de 'sb' é modificado in-place
        System.out.println(sb); // Saída: Olá Mundo!
//        Ao contrário da String onde ("Olá" + " Mundo!") criaria um novo objeto, o StringBuffer modifica o objeto existente.

//        Todos os métodos públicos do StringBuffer são sincronizados. Isso significa que StringBuffer é thread-safe,
//        ou seja, múltiplas threads (processos simultâneos) podem acessar e modificar a mesma instância de StringBuffer
//        com segurança, sem o risco de corrupção de dados ou resultados inconsistentes.
//                Implicação de Performance: A sincronização adiciona uma sobrecarga de desempenho.
//                Em ambientes single-threaded (onde apenas uma thread acessa o objeto), essa sincronização é desnecessária e
//                resulta em uma performance ligeiramente inferior em comparação com StringBuilder.

//        Um StringBuffer tem uma capacidade, que é o número de caracteres que ele pode armazenar sem realocar sua
//        estrutura de dados interna. Se o tamanho da string exceder a capacidade atual, o StringBuffer
//        automaticamente aumenta sua capacidade.

//        Manipulações frequentes de Strings: Quando você precisa realizar muitas operações de modificação
//        (concatenação, inserção, exclusão, substituição) em uma string dentro de um loop ou de forma repetida.
//        Usar String para essas operações criaria muitos objetos intermediários, consumindo mais memória e afetando o desempenho.
//        Ambientes Multi-threaded: Quando a mesma sequência de caracteres precisa ser acessada e modificada por
//        várias threads concorrentes. A sincronização embutida do StringBuffer garante a integridade dos dados.

        StringBuffer frase = new StringBuffer( "Copa do Mundo de Clubes da FIFA: jogos");
        System.out.println(frase.append(1));
        System.out.println(frase.insert(0, 2));
        System.out.println(frase.delete(1, 5));
        System.out.println(frase.deleteCharAt(0));
        System.out.println(frase.replace(0, frase.length(), "Ola mundo novo!"));
        System.out.println(frase.reverse());
        System.out.println(frase.charAt(0));
        System.out.println(frase.toString());
    }
}

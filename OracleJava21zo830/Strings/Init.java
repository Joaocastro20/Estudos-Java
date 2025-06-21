package OracleJava21zo830.Strings;

import java.util.Arrays;

public class Init {
    public static void main(String[] args) {
        String saudacao = "Olá";
        saudacao = saudacao + " Mundo!"; // Um *novo* objeto String é criado para "Olá Mundo!"
        // O objeto original "Olá" permanece na memória (até ser coletado pelo garbage collector, se não houver mais referências)
        System.out.println(saudacao);

        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2); // Isso pode retornar 'true' devido ao String Pool

        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s3 == s4); // Isso sempre retornará 'false'
        System.out.println(s1 == s3); // Isso sempre retornará 'false'

        String a = "Teste";
        String b = new String("Teste");
        System.out.println(a == b);      // false (referências diferentes)
        System.out.println(a.equals(b)); // true (conteúdo igual)

//        length(): Retorna o comprimento da string.
//        charAt(int index): Retorna o caractere no índice especificado.
//        substring(int beginIndex, int endIndex): Retorna uma nova string que é uma sub-sequência desta string.
//        indexOf(String str): Retorna o índice da primeira ocorrência da substring.
//        contains(CharSequence s): Verifica se a string contém a sequência de caracteres especificada.
//        startsWith(String prefix) / endsWith(String suffix): Verifica se a string começa/termina com um prefixo/sufixo.
//        toLowerCase() / toUpperCase(): Converte a string para minúsculas/maiúsculas.
//        trim(): Remove espaços em branco do início e do fim da string.
//        replace(char oldChar, char newChar) / replaceAll(String regex, String replacement): Substitui caracteres/substrings.
//        split(String regex): Divide a string em um array de strings.

        String frase = "Copa do Mundo de Clubes da FIFA: jogos";
        System.out.println(frase.length());
        System.out.println(frase.charAt(3));
        System.out.println(frase.substring(27));
        System.out.println(frase.substring(0, 13));
        System.out.println(frase.indexOf("Copa"));
        System.out.println(frase.indexOf("j"));
        System.out.println(frase.contains("Clubes"));
        System.out.println(frase.startsWith("C"));
        System.out.println(frase.endsWith("s"));
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        System.out.println(frase.trim());
        System.out.println(frase.replace("Copa", "Mundial"));
        System.out.println(Arrays.asList(frase.split("")) );
    }
}

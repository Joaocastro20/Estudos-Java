public class Exercicio {
    public static void main(String[] args) {
        int a[] = {1,0,5,-2,-5,7};
        int soma = a[0]+a[1]+a[5];
        a[4] = 100;
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("soma de alguns vetores");
        System.out.println(soma);
    }
}

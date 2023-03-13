import java.util.Scanner;
public class Main {
    public static Scanner  scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ejercicios Java");
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1(){
        System.out.println("ingresa el numero n de numeros pares");
        int n = scan.nextInt();

        int par = 2;
        for(int i=0; i<n; i++){
            System.out.println(par);
            par+=2;
        }
    }

    public static void ejercicio2(){
        System.out.println("ingresa el numero n de multiplos");
        int n = scan.nextInt();
        System.out.println("ingresa un numero m");
        int m = scan.nextInt();

        int cont = 0;
        int i = 1;
        while (cont<n){
            if (i%m == 0){
               System.out.println(i);
               cont++;
            }
            i++;
        }
    }

    public static void ejercicio3(){
        System.out.println("ingresa un numero n para determinar si es primo");
        int n = scan.nextInt();

        boolean primo = esPrimo(n);

        if(primo){
            System.out.println(n + " es primo");
        }
        else{
            System.out.println(n + " no es primo");
        }

    }
    public static boolean esPrimo(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void ejercicio4(){
        System.out.println("ingresa el numero n de numeros primos");
        int n = scan.nextInt();

        int cont = 0;
        int i = 2;
        while (cont<n){
            if(esPrimo(i)){
                System.out.println(i);
                cont++;
            }
            i++;
        }
    }

    public static void ejercicio5(){
        System.out.println("ingresa el numero n de numeros");
        int n = scan.nextInt();
        System.out.println("ingresa el numero m de digitos");
        int m = scan.nextInt();
        System.out.println("ingresa el digito d");
        int d = scan.nextInt();

        int cont = 0;
        int i = (int) Math.pow(10,m-1);
        while (cont<n){
            if(cumple(i, m, d)){
                System.out.println(i);
                cont++;
            }
            i++;
        }
    }
    public static boolean cumple(int i, int m, int d){
        int nDigitos = 0;
        while(i>0){
            if(i%10 == d) nDigitos++;
            i/=10;
        }
        return (nDigitos>=m) ? true : false;

    }
}
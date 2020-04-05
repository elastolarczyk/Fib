package main;

public class Fibonacci {

    private  int valN;

    public Fibonacci(int valN)
    {
        this.valN = valN;
    }

    public int fibb(int n) {

        if (n == 0 || n == 1)
        {
            return n;
        }

        else if(n < 0)
        {
            throw new IllegalArgumentException("Liczba nie może być mniejsza od zera");
        }
        else
        {
            return fibb(n - 1) + fibb(n - 2);
        }
    }
/*
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int n = scan.nextInt();
        System.out.println("Podałeś liczbe: " + n);

        for(int i = 0; i < n; i++){
            System.out.print(fibb(i) + " ");
        }

 */
}



package ss2_loop.excercise;

import java.util.Scanner;

public class First20Primes {

    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần in ra:");
        numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        while (count < numbers){
            if(isPrime(N)){
                System.out.print(N + " ");
                count++;
            }

            N++;
        }
    }

    private static boolean isPrime(int N) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(N % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

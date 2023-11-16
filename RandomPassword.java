package Technohack;
//Random password generator in Java

//Technohacks Edutech internship task#3
import java.util.*;

class RandomPassword {

    static int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    static char[] characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZp".toCharArray();

    static char[] symbols = "@+_[]?#%&=!".toCharArray();

    public static void main(String[] args) {
        String pass = "";

        pass = setPass();

        System.out.println("Your password is "+pass);
    }

    public static String genRand(int len, int diff) {
        String pass = "";
        int symbolCount = 1, numberCount = 2;
        int alphaCount = 0;
        int alphas = 0, syms = 0, nums = 0;

        switch (diff) {
            case 2:
                symbolCount = 2;
                numberCount = 3;
                break;
            case 3:
                symbolCount = 3;
                numberCount = 4;
                break;
        }
        alphaCount = len - (symbolCount + numberCount);
        Random r = new Random();

        for (int i = 0; i < len; i++) {
            int arr = r.nextInt(3);
            switch (arr) {
                case 0:
                    if (alphas == alphaCount) {
                        i--;
                        break;
                    }

                    pass = pass + characters[r.nextInt(characters.length)];
                    alphas++;
                    break;
                case 1:
                    if (nums == numberCount) {
                        i--;
                        break;
                    }

                    pass = pass + numbers[r.nextInt(numbers.length)];
                    nums++;
                    break;
                case 2:
                    if (syms == symbolCount) {
                        i--;
                        break;
                    }

                    pass = pass + symbols[r.nextInt(symbols.length)];
                    syms++;
                    break;
            }
        }
        return pass;
    }

    public static String setPass() {
        Scanner sc = new Scanner(System.in);
        int length = 8, diff = 1;
        System.out.print("Enter the length of Password: ");
        length = sc.nextInt();
        System.out.print("Enter the difficulty level of Password (1/2/3): ");
        diff = sc.nextInt();
        sc.close();
        return genRand(length, diff);
    }
}

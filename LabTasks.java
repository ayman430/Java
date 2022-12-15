import java.util.Scanner;

public class LabTasks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        stringReplace("aymanandsakr","and","_");
    }


    // (1)method return character from ascii code
    static void ReturnAsciiChar()
    {

        System.out.println("Enter a Ascii Code to get Character =>  ");
        int num = sc.nextInt();
        System.out.println("Character is => " + (char)num);
    }
    /////////////////////////////////////////////////////////////////////////////////////
    //(2)Methods to find Permutation and Combination
    static int Factorial(int num){
        if (num == 1)
            return 1;
        return num * Factorial(num-1);
    }

    static int Permutation(){
        System.out.println("Enter n => ");
        int n = sc.nextInt();
        System.out.println("Enter r => ");
        int r= sc.nextInt();
        System.out.print("nPr is => ");
        return Factorial(n) / Factorial(n-r);

    }
    static int Combination() {
        System.out.println("Enter n => ");
        int n = sc.nextInt();
        System.out.println("Enter r => ");
        int r = sc.nextInt();
        System.out.print("nCr is => ");
        return Factorial(n) / (Factorial(n - r) * Factorial(r));
    }
////////////////////////////////////////////////////////////////////////////////////
// (3) Method for string replace
    static void stringReplace(String s , String target, String replacement){
        System.out.println(s.replace(target, replacement));
    }
//////////////////////////////////////////////////

}

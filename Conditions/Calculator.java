import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        char operator;
        System.out.println("Enter the value of a");
        a = sc.nextInt();

        System.out.println("Enter the value of b");
        b =sc.nextInt();

        System.out.println("Enter operator:");
        operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println(a+b);
        }
        else if(operator == '-'){
            System.out.println(a-b);
        }
        else if(operator == '*'){
            System.out.println(a*b);
        }
        else if(operator == '/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}

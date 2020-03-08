package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// ich übe switch Calculator

        char operator = '+' ;
        int x = 27;
        int y = 9;

        switch(operator){
            case '+':
               System.out.println(x + y);
               break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default:
                System.err.println("Unbekannter Operator " + operator);


        }

    }
}

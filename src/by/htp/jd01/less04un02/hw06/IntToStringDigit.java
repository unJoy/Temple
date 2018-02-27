package by.htp.jd01.less04un02.hw06;

import java.util.Scanner;

public class IntToStringDigit {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char curSymbol;
        String num = "";

        System.out.println("Enter value: ");

        while(!sc.hasNextLine()){
            sc.next();
            System.out.println("It's not a line!");
            System.out.print("Re-enter value: ");
        }
        num = sc.nextLine();

        StringBuffer strBuf = new StringBuffer(num);
        strBuf.reverse();
        num = null;

        for(int i = strBuf.length() - 1; i>=0; i--){
            curSymbol = strBuf.charAt(i);

            switch(i){
                case 4:
                    if(curSymbol != '1'){
                        printTenThousand(curSymbol);
                    } else {
                        i--;
                        curSymbol = strBuf.charAt(i);
                        printThousandWithOne(curSymbol);

                    }
                    break;
                case 3:
                    printThousand(curSymbol);
                    break;
                case 2: //hundreds
                    printHundred(curSymbol);
                    break;
                case 1: //decades
                    if (curSymbol != '1'){
                        printDecade(curSymbol);
                    } else {
                        i--;
                        curSymbol = strBuf.charAt(i);
                        printDecadeWithOne(curSymbol);
                    }
                    break;
                case 0: //ones
                    printOne(curSymbol);
                    break;
                default:
                    System.out.println("This program can't print such numbers.");
                    return;
            }
        }
    }


    private static void printDecade(char i){
        switch(i){
            case '1':
                System.out.print("ten ");
                break;
            case '2':
                System.out.print("twenty ");
                break;
            case '3':
                System.out.print("thirty ");
                break;
            case '4':
                System.out.print("forty ");
                break;
            case '5':
                System.out.print("fifty ");
                break;
            case '6':
                System.out.print("sixty ");
                break;
            case '7':
                System.out.print("seventy ");
                break;
            case '8':
                System.out.print("eighty ");
                break;
            case '9':
                System.out.print("ninety ");
                break;
        }
    }


    private static void printDecadeWithOne(char i){
        switch(i){
            case '0':
                System.out.print("ten ");
                break;
            case '1':
                System.out.print("eleven ");
                break;
            case '2':
                System.out.print("twelve ");
                break;
            case '3':
                System.out.print("thirteen ");
                break;
            case '4':
                System.out.print("fourteen ");
                break;
            case '5':
                System.out.print("fifteen ");
                break;
            case '6':
                System.out.print("sixteen ");
                break;
            case '7':
                System.out.print("seventeen ");
                break;
            case '8':
                System.out.print("eighteen ");
                break;
            case '9':
                System.out.print("nineteen ");
                break;
        }
    }


    private static void printHundred(char i){
        switch(i){
            case '1':
                System.out.print("one hundred ");
                break;
            case '2':
                System.out.print("two hundred ");
                break;
            case '3':
                System.out.print("three hundred ");
                break;
            case '4':
                System.out.print("four hundred ");
                break;
            case '5':
                System.out.print("five hundred ");
                break;
            case '6':
                System.out.print("six hundred ");
                break;
            case '7':
                System.out.print("seven hundred ");
                break;
            case '8':
                System.out.print("eight hundred ");
                break;
            case '9':
                System.out.print("nine hundred ");
                break;
        }
    }


    private static void printOne(char i) {  //prints ones

        switch (i) {
            case '1':
                System.out.print("one ");
                break;
            case '2':
                System.out.print("two ");
                break;
            case '3':
                System.out.print("three ");
                break;
            case '4':
                System.out.print("four ");
                break;
            case '5':
                System.out.print("five ");
                break;
            case '6':
                System.out.print("six ");
                break;
            case '7':
                System.out.print("seven ");
                break;
            case '8':
                System.out.print("eight ");
                break;
            case '9':
                System.out.print("nine ");
                break;
        }
    }


    private static void printTenThousand(char i){
        switch(i){
            case '1':
                System.out.print("ten thousand ");
                break;
            case '2':
                System.out.print("twenty thousand ");
                break;
            case '3':
                System.out.print("thirty thousand ");
                break;
            case '4':
                System.out.print("forty thousand ");
                break;
            case '5':
                System.out.print("fifty thousand ");
                break;
            case '6':
                System.out.print("sixty thousand ");
                break;
            case '7':
                System.out.print("seventy thousand ");
                break;
            case '8':
                System.out.print("eighty thousand ");
                break;
            case '9':
                System.out.print("ninety thousand ");
                break;
        }
    }


    private static void printThousand(char i){
        switch(i){
            case '1':
                System.out.print("one thousand ");
                break;
            case '2':
                System.out.print("two thousand ");
                break;
            case '3':
                System.out.print("three thousand ");
                break;
            case '4':
                System.out.print("four thousand ");
                break;
            case '5':
                System.out.print("five thousand ");
                break;
            case '6':
                System.out.print("six thousand ");
                break;
            case '7':
                System.out.print("seven thousand ");
                break;
            case '8':
                System.out.print("eight thousand ");
                break;
            case '9':
                System.out.print("nine thousand ");
                break;
        }
    }


    private static void printThousandWithOne(char i){
        switch(i){
            case '0':
                System.out.print("ten thousand");
                break;
            case '1':
                System.out.print("eleven thousand");
                break;
            case '2':
                System.out.print("twelve thousand");
                break;
            case '3':
                System.out.print("thirteen thousand");
                break;
            case '4':
                System.out.print("fourteen thousand");
                break;
            case '5':
                System.out.print("fifteen thousand");
                break;
            case '6':
                System.out.print("sixteen thousand");
                break;
            case '7':
                System.out.print("seventeen thousand");
                break;
            case '8':
                System.out.print("eighteen thousand");
                break;
            case '9':
                System.out.print("nineteen thousand");
                break;
        }
    }
}

package Homework2;

public class hw2 {
    public static void main(String[] args) {
        float pi = 3.141592653f;
        double e = 2.7182818284590452;
        System.out.println("pi = " + pi);
        System.out.println("e = " + e);

        String row1 = "\nмоя строка 1";
        String row2 = "\tмоя строка 2";
        //String row3 = "\aмоя строка 3"; Illegal escape character in string literal
        System.out.println(row1);
        System.out.println(row2);
        //System.out.println(row3);

        char h = '\u0048';
        char y = '\u0065';
        char l = '\u006C';
        char o = '\u006F';
        char d = '\u0044';
        char n = '\u006E';
        char i = '\u0079';
        char s = '\u0073';
        char comma = '\u002C';
        char pr = '\u0021';

        System.out.print(h);
        System.out.print(y);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);
        System.out.print(comma);
        System.out.print(" ");
        System.out.print(d);
        System.out.print(y);
        System.out.print(n);
        System.out.print(i);
        System.out.print(s);
        System.out.print(pr);

    }
}

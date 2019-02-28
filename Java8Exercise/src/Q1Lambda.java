
/*
* Q1 Write the following a functional interface and implement it using lambda:
* */


/*(1) First number is greater than second number or not     Parameter (int ,int ) Return boolean*/
@FunctionalInterface
interface GreaterNumber {
    Boolean returnGreater(int a, int b);
}


/*(2) Increment the number by 1 and return incremented value    Parameter (int) Return int*/
@FunctionalInterface
interface Increment {
    int incrementNum(int a);
}

/*(3) Concatination of 2 string      Parameter (String , String ) Return (String)*/

@FunctionalInterface
interface ConcatString {
    String concatMyString(String s1, String s2);
}


/*(4) Convert a string to uppercase and return .   Parameter (String) Return (String)*/
@FunctionalInterface
interface ToUppercaseString {
    String upperString(String s1);
}

public class Q1Lambda {
    public static void main(String[] args) {

        GreaterNumber greaterNumber = (a, b) -> a > b;
        System.out.println("Return true or false on greater number : "+greaterNumber.returnGreater(8, 7));

        Increment increment = (a) -> ++a;
        System.out.println("Return incremented value : "+increment.incrementNum(9));

        ConcatString concatString = (s1, s2) -> s1.concat(s2);
        System.out.println("Concatinated String : "+concatString.concatMyString("Reshma ", "Mohan"));

        ToUppercaseString toUppercaseString = (s1) -> s1.toUpperCase();
        System.out.println("To uppercase : "+toUppercaseString.upperString("reshma"));

    }
}

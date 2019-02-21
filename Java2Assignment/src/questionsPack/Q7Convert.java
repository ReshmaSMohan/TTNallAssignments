package questionsPack;

import java.util.Scanner;

// 7. WAP to convert seconds into days, hours, minutes and seconds.
public class Q7Convert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer seconds;
        System.out.print("Enter the seconds value you want to convert : ");
        seconds=scanner.nextInt();
        convert(seconds);
    }

    public static void convert(Integer seconds){
        Integer days,hours,minutes,seconds1;

        days=seconds/(24*3600);
        seconds=seconds%(24*3600);
        hours=seconds/3600;
        seconds=seconds%3600;
        minutes=seconds/60;
        seconds1=seconds%60;

        System.out.println("Days : "+days+" , Hours : "+hours+" , Minutes : "+minutes+" , Seconds : "+seconds1);
    }

}

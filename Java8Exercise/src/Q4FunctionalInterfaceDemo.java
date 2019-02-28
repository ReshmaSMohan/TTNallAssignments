
/* Implement the functional interfaces from java.util.function using lambdas */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q4FunctionalInterfaceDemo {
    public static void main(String[] args) throws ParseException {

        //Consumer Interface
        Consumer<String> consumer = name -> System.out.println(name.replaceAll("reshma","sreekala"));
        consumer.accept("reshma s mohan");

        //Supplier
        Supplier supplier = () -> new Date();
        System.out.println(supplier.get());


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        //Predicate
        Predicate<Date> predicate = (date) -> date.before(new Date());
        System.out.println("Entered date is before todays date : " + predicate.test(simpleDateFormat.parse("10-10-2018")));

        //Function
        Function<Integer,Integer> function = (a) -> a*2 ;
        System.out.println("Passed to function interface : "+function.apply(10));
    }
}

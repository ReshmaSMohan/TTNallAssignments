import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsQuestion {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,15,3,4,5,6,7,8,9,10);

        /*Collect all the even numbers from an integer list.*/
        System.out.println(list.stream()
                .filter(val->val%2==0)
                .collect(Collectors.toList()));

        /*Sum all the numbers greater than 5 in the integer list.*/
        System.out.println(list.stream()
                .filter(val->val>5)
                .collect(Collectors.summingInt(val->val)));

        /*Find average of the number inside integer list after doubling it*/
        System.out.println(list.stream()
                .map(x->x*2)
                .collect(Collectors.averagingInt(x -> x ))

        );
        System.out.println(list.stream()
                .collect(Collectors.averagingInt(x -> x*2 ))

        );

        /*Find the first even number in the integer list which is greater than 3*/
        System.out.println(list.stream()
                .filter(val -> val>3)
                .filter(val->val%2==0)
                .findFirst()
        );
    }
}

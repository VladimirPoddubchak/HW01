import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzImpl implements FizzBuzz{

    final static int FIZZ_DIVIDER = 3;
    final static int BUZZ_DIVIDER = 5;
    final static int FIZZ_BUZZ_DIVIDER = FIZZ_DIVIDER*BUZZ_DIVIDER;

    final static int MIN_RANGE = 0;
    final static int MAX_RANGE = 100;


    public boolean checkRange(int a, int b){
      return ((a<b)&&(a>=MIN_RANGE)&&(b<=MAX_RANGE));
    }

    public boolean numberInRange(int number){
        return (number>=MIN_RANGE && number<=MAX_RANGE);
    }

    public String numberToFizzBuzz(int number){
        if (number%FIZZ_BUZZ_DIVIDER == 0){
            return "FizzBuzz";
        }
        if (number%BUZZ_DIVIDER == 0){
            return "Buzz";
        }
        if (number%FIZZ_DIVIDER == 0){
            return "Fizz";
        }
        return Integer.toString(number);
    }


    public void print(int from, int to) {
        if (checkRange(from,to)){
           for (int number = from; number<=to; number++) {
               System.out.println(numberToFizzBuzz(number));
           }

        } else{
            System.err.println("Illegal arguments");
        }

    }

    public void printStream(int from, int to) {
        if (checkRange(from,to)){
                IntStream.rangeClosed(from,to)
                    .mapToObj(number -> numberToFizzBuzz(number))
                    .forEach(System.out::println);
        } else{
            System.err.println("Illegal arguments");
        }

    }

    public void printStream(int from, int to, char delimetr) {
        if (checkRange(from,to)){
            IntStream.range(from,to)
                    .mapToObj(number -> numberToFizzBuzz(number))
                    .map(elem -> {
                        return elem + delimetr;
                    })
                    .forEach(System.out::print);
            System.out.println(numberToFizzBuzz(to));
        } else{
            System.err.println("Illegal arguments");
        }

    }




    public String printStreamToString(int from, int to, char delimetr) {
        if (checkRange(from,to)){
            return IntStream.range(from,to)
                    .mapToObj(number -> numberToFizzBuzz(number))
                    .map(elem -> {
                        return elem + delimetr;
                    }).collect(Collectors.joining())
                    .toString()+numberToFizzBuzz(to);
        } else{
            return "Illegal arguments";
        }

    }
}

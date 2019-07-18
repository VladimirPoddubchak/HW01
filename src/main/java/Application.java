public class Application {
    public static void main(String[] args) {
        FizzBuzzImpl changeNumber = new FizzBuzzImpl();
        changeNumber.print(10,30);

        System.out.println("=======================================");
        changeNumber.printStream(10,30);
        System.out.println("=======================================");
        changeNumber.printStream(10,30,',');
        System.out.println("=======================================");
        String result =changeNumber.printStreamToString(10,30,'-');
        System.out.println(result);


    }

}

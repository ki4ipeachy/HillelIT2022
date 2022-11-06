public class Main {
    public static void main(String[] args) {
        getCounter(255.0);
    }

    private static void getCounter(double arg) {
        int counter = 0;
        double tmp = arg;

        if (arg < 50) {
            System.out.println("The number is less than 50");
        } else {
            while (tmp > 50) {
                tmp = tmp / 2;
                counter++;
            }
            System.out.println("It takes" + " " + counter + " " + "iterations to get" + " " +tmp + " " +"by divide" + " " +arg + " " +"by 2");
        }
    }
}
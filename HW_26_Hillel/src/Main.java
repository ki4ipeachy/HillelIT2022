public class Main {
    public static void main(String[] args) {
        int i = payrise(1.5, 2500);
        System.out.print(i);
    }
    public static int payrise( double yearOfExperience, int  salary) {
        int newSalary = salary;

//если проработали от 1 до 3 лет + 10% к зп
        if (yearOfExperience >= 1 && yearOfExperience < 3) {
            newSalary += salary * 0.1;
//если проработали от 3 лет + 20% к зп
        } else if (yearOfExperience >= 3) {
            newSalary += salary * 0.2;
        } else {
            return newSalary = salary;
        }

//если новая зп меньше 4000 -> +1000
        if (newSalary < 4000) {
            newSalary += 1000;
        } else {
// если новая зп = 4000 или больше -> +500
            newSalary += 500;
        }
        return newSalary;
    }
}

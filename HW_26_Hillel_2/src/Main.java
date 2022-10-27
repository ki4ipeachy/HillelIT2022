public class Main {
    public static void main(String[] args) {
        int age=60;
        if(age == 0)
        {
            System.out.println("Неверный возраст");
        }

        else if(age<18)
        {
            System.out.println("ВЫ еще не совершеннолетний");
        }
        else if(age>18)
        {
            System.out.println("ВЫ уже взрослый");
        }
        else
        {
            return;
        }


        int result = 0;

        for(int i=1; i<51; i++) {
            result = result+i;
        }

        System.out.println("Сумма вышла - " + result);

    }
}
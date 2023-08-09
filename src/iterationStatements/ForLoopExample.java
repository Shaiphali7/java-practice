package iterationStatements;

public class ForLoopExample

{

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for(String monthName:months)
        {
            System.out.println(monthName);

        }
        String cars[]={"BMW","Audi","Hundai"};
        for(String carName:cars)
        {
            System.out.println(carName);

        }
    }

}

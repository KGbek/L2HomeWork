public class Person {
    public static void main(String[] args) {

        personT(35, 25);
        personT(50, -5);
        personT(16, 45);
        personT(21, 0);
        System.out.println(generateRandomAge());
    }

    public static void personT(int age, int temperature){
        //This is method return Persons age and temperature

        if (age > 20 && age < 45){
            if (temperature > -20 && temperature < 30){
                System.out.println("Sidewalk1");
            }
        } else if (age < 20 && temperature > 0 && temperature < 28){
            System.out.println("Sidewalk2");
        } else if (age < 45 && temperature > -10 && temperature < 25){
            System.out.printf("Sidewalk3");
        } else {
            System.out.println("Stay at home");
        }
    }

    public static int generateRandomAge(){
        //This method returns random age
        int number;
        number = (int)(Math.random() * 100);
        return number;
    }
}

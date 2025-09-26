public class Main {
    public static void main(String[] args) {
        DogWalkCompany c = new DogWalkCompany();
        DogWalker w = new DogWalker(7, c);

        int hour = 0;
        while (hour < 24) {
            int dogs = Math.random();
            c.changeSchedule(hour, dogs);
        }
    }
}
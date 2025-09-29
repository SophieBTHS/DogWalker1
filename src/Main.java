public class Main {
    public static void main(String[] args) {
        DogWalkCompany c = new DogWalkCompany();
        DogWalker w = new DogWalker(7, c);

        int hour = 0;
        while (hour < 24) {
            int dogs = (int) (Math.random() * 10);
            c.changeSchedule(hour, dogs);
            hour++;

        }
        c.getSchedule();
        System.out.println(w.dogWalkShift(9, 17));
    }
}
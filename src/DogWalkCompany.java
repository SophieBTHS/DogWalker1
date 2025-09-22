public class DogWalkCompany {
    private int[] schedule;

    public DogWalkCompany() {
        schedule = new int[24];
    }

    public void changeSchedule(int hour, int dogs) {
        schedule[hour] += dogs;
    }

    public int numAvailableDogs(int hour) {
        return schedule[hour];
    }

    public void updateDogs(int hour, int numberDogsWalked) {
        schedule[hour] -= numberDogsWalked;
    }
}

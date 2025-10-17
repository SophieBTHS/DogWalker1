public class DogWalker {

    private int maxDogs;

    private DogWalkCompany company;

    public DogWalker(int max, DogWalkCompany comp){
        maxDogs = max;
        company = comp;
    }


    public int walkDogs(int hour){
        int dogs = company.numAvailableDogs(hour);
        if (dogs > maxDogs) dogs = maxDogs;
        company.updateDogs(hour, dogs);
        return dogs;
    }

    public int dogWalkShift(int startHour, int endHour){
        int pay = 0;
        while (endHour > startHour){
            int dogs = walkDogs(startHour);
            pay += dogs * 5;
            if (dogs == maxDogs || (startHour >= 9 && startHour <= 17)){
                pay += 3;
            }
            startHour += 1;
        }
        return pay;
    }
}

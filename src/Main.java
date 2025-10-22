import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File c = new File("Companies.txt");
        DogWalkCompany[] companies = companyRead(c);
        }
    public static DogWalkCompany[] companyRead(File c) throws FileNotFoundException {
        DogWalkCompany[] companies = new DogWalkCompany[1000];
        Scanner s = new Scanner(c);
        int index = 0;
        while(s.hasNextLine()){
            int[] schedule = new int[24];
            for(int i=0;i<24;i++){
                schedule[i] = s.nextInt();
            }
            companies[index] = new DogWalkCompany(schedule);
        }
        return companies;
    }
}
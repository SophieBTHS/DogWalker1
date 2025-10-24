import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File c = new File("Companies.txt");
        File w = new File("Walkers.txt");
        DogWalkCompany[] companies = companyRead(c);
        System.out.println(walkerRead(w, companies));
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
            index++;
        }
        return companies;
    }
    public static int walkerRead(File w, DogWalkCompany[] companies) throws FileNotFoundException{
        int money = 0;
        Scanner s = new Scanner(w);
        while(s.hasNextLine()){
            int max = s.nextInt();
            int comp = s.nextInt();
            int start = s.nextInt();
            int end = s.nextInt();
            DogWalker walker = new DogWalker(max, companies[comp]);
            money += walker.dogWalkShift(start, end);
        }
        return money;
    }
}
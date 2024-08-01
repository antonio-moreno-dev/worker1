import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter department's name ");
        String departamentName = sc.nextLine();

        System.out.print("Enter worker date");
        String workename = sc.nextLine();

        System.out.print("Base salary");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workename,WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departamentName) );


        sc.close();
    }
}

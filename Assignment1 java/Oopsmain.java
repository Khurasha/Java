import java.util.Scanner;
public class Oopsmain {
    public static void main(String[] args) {
        //Scanner
        Scanner detail = new Scanner(System.in);

        //Array
        Oops [] details = new Oops[2];

        Oops d1 = new Oops();
        
        System.out.println("enter the name 1");
        String na = detail.nextLine();
        d1.setName(na);
        
        System.out.println("enter the age 1");
        int ag = detail.nextInt();
        d1.setAge(ag);
        
        System.out.println("enter the date of birth 1");
        int d = detail.nextInt();
        d1.setDOB(d);

        System.out.println("enter the program 1");
        String prog = detail.nextLine();
        d1.setProgram(prog);
        
        System.out.println("enter the college 1");
        String co = detail.nextLine();
        d1.setCollege(co);
        
        Oops d2 = new Oops();
        
        System.out.println("enter the name 2");
        String nam = detail.nextLine();
        d2.setName(nam);
        
        System.out.println("enter the age 2");
        int a = detail.nextInt();
        d2.setAge(a);
        
        System.out.println("enter the date of birth 2");
        int D = detail.nextInt();
        d2.setDOB(D);

        System.out.println("enter the program 2");
        String pr = detail.nextLine();
        d2.setProgram(pr);
        
        System.out.println("enter the college 2");
        String c = detail.nextLine();
        d2.setCollege(c);

        details [0] = d1;
        details [1] = d2;

        for (int i=0 ; i<details.length; i++){
        System.out.println(details[i].getName()+ " " + details[i].getAge()+ " " + details[i].getDOB()+ " " + details[i].getProgram()+ " " + details[i].getCollege()+ " ");
    }}
}

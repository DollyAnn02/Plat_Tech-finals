import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Annual Salary = ");
        double Salary = input.nextFloat();

        double[] te = {0.2, 0.25, 0.30, 0.32, 0.35};
        double[] td = {30000.00, 130000.00, 490000.00, 2410000.00};

        double ad = 0;
        double deduct = 0;
        boolean computation = true;
        while(computation){

            if (Salary <= 400000 && Salary > 250000){
                ad = Salary * te[0];

            } else if (Salary <= 800000 && Salary > 400000){
                deduct = Salary - td[0];
                if (deduct > 400000){
                    ad = (deduct * te[1]) + te[0];
                } else {
                    ad = td[0];
                }

            } else if (Salary <= 2000000 && Salary > 800000){
                deduct = Salary - td[1];
                if (deduct > 800000){
                    ad = (deduct * te[2]) + te[1];
                } else {
                    ad = td[1];
                }

            } else if (Salary <= 8000000 && Salary > 2000000){
                deduct = Salary - td[1];
                if (deduct > 800000){
                    ad = (deduct * te[3]) + te[2];
                } else {
                    ad = td[2];
                }

            } else if (Salary > 8000000){
                deduct = Salary - td[1];
                if (deduct > 2000000){
                    ad = (deduct * te[4]) + te[3];
                } else {
                    ad = td[3];        
                }   
            }
            computation = false;
        }
        double mr = Salary/12;
        System.out.printf("Your Monthly Rate is %.2f \n", mr);

        double dr = mr/22;
        System.out.printf("Your Daily Rate is %.2f \n", dr);

        double hr = dr/8;
        System.out.printf("Your Hourly Rate is %.2f \n", hr);

        System.out.printf("Your Annual Tax Deduction is %.2f \n", ad); 

        double md = ad/12;
        System.out.printf("Your Monthly Tax Deduction is %.2f \n", md);

        double np = mr - md;
        System.out.printf("Your Net Pay is %.2f \n", np);

    }
}

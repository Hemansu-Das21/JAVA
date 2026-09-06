import java.util.Scanner;

' class  UniversitySelection{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GRE percentage: ");
        double gre = sc.nextDouble();

        System.out.print("Enter TOEFL percentage: ");
        double toefl = sc.nextDouble();

        System.out.println("\nChoose University:");
        System.out.println("1. Oxford University");
        System.out.println("2. MIT");
        System.out.print("Enter choice: ");
        int university = sc.nextInt();

        switch (university) {

            case 1:
                // Oxford University
                System.out.println("\nChoose Department:");
                System.out.println("1. Computer Science and Engineering");
                System.out.println("2. Electronics Engineering");
                System.out.println("3. Electrical Engineering");
                System.out.print("Enter choice: ");
                int oxfordDept = sc.nextInt();

                switch (oxfordDept) {

                    case 1:
                        if (gre > 70 && toefl > 70) {
                            System.out.println("Seat allocated in Oxford University - Computer Science and Engineering");
                        } else {
                            System.out.println("Not eligible for this department.");
                        }
                        break;

                    case 2:
                        if (gre > 70 && toefl > 60) {
                            System.out.println("Seat allocated in Oxford University - Electronics Engineering");
                        } else {
                            System.out.println("Not eligible for this department.");
                        }
                        break;

                    case 3:
                        if (gre > 70 && toefl > 50) {
                            System.out.println("Seat allocated in Oxford University - Electrical Engineering");
                        } else {
                            System.out.println("Not eligible for this department.");
                        }
                        break;

                    default:
                        System.out.println("Invalid department choice.");
                }
                break;


            case 2:
                // MIT
                System.out.println("\nChoose Department:");
                System.out.println("1. Computer Science and Engineering");
                System.out.println("2. Chemical Engineering");
                System.out.println("3. Civil Engineering");
                System.out.print("Enter choice: ");
                int mitDept = sc.nextInt();

                switch (mitDept) {

                    case 1:
                        if (gre >= 60 && gre <= 70 && toefl >= 50) {
                            System.out.println("Seat allocated in MIT - Computer Science and Engineering");
                        } else {
                            System.out.println("Not eligible for this department.");
                        }
                        break;

                    case 2:
                        if (gre >= 50 && gre < 60 && toefl >= 50) {
                            System.out.println("Seat allocated in MIT - Chemical Engineering");
                        } else {
                            System.out.println("Not eligible for this department.");
                        }
                        break;

                    case 3:
                        if (gre >= 50 && toefl >= 50) {
                            System.out.println("Seat allocated in MIT - Civil Engineering");
                        } else {
                            System.out.println("Not eligible for this department.");
                        }
                        break;

                    default:
                        System.out.println("Invalid department choice.");
                }
                break;


            default:
                System.out.println("Invalid university choice.");
        }

        sc.close();
    }
}
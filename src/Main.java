import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("1. Residential");
            System.out.println("2. Commercial");
            System.out.println("3. Done");
            System.out.println("Please enter an option from 1-3");

            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    validChoice = true;
                    residential();
                    break;

                case 2:
                    validChoice = true;
                    commercial();
                    break;

                case 3:
                    validChoice = true;
                    System.out.println("Thank you for choosing Acme Lawn Care.");
                    break;

                default:
                    System.out.println("Please enter a number between 1 and 3.");
            }

        }


    }

    public static void residential(){
        Scanner scannerR = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String customerName = scannerR.nextLine();
        System.out.println("Enter Customer Phone Number:");
        String phoneNumber = scannerR.nextLine();
        System.out.println("Enter Customer Address:");
        String customerAddress = scannerR.nextLine();
        System.out.println("Enter Square Footage:");
        String squareFootage = scannerR.nextLine();
        Double footage = Double.parseDouble(squareFootage);
        System.out.println("Are they over the age of 65? Yes or No");
        String seniorQuestion = scannerR.nextLine();
        Boolean isSenior = seniorQuestion.substring(0,1).equalsIgnoreCase("Y");
        Residential customer = new Residential(customerName, phoneNumber, customerAddress, footage, isSenior);
        customer.weeklyCharges();
    }

    public static void commercial(){
        Scanner scannerC = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String customerNameC = scannerC.nextLine();
        System.out.println("Enter Customer Phone Number:");
        String phoneNumberC = scannerC.nextLine();
        System.out.println("Enter Customer Address:");
        String customerAddressC = scannerC.nextLine();
        System.out.println("Enter Square Footage:");
        String squareFootageC = scannerC.nextLine();
        System.out.println("Enter Property Name:");
        String propertyNameC = scannerC.nextLine();
        Double footageC = Double.parseDouble(squareFootageC);
        System.out.println("Do you have multiple properties? Yes or No");
        String multi = scannerC.nextLine();
        Boolean isMulti = multi.substring(0,1).equalsIgnoreCase("Y");
        Commercial customerC = new Commercial(customerNameC, phoneNumberC, customerAddressC, footageC, propertyNameC, isMulti);
        customerC.weeklyCharges();
    }
}



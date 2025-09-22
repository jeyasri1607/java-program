import java.util.Scanner;

class Employee {
    String name, id, address, email, mobile, designation;
    double daPercent, hraPercent, pfPercent, staffClubPercent;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        mobile = sc.nextLine();

        System.out.print("Enter Designation (Programmer / Assistant Professor / Associate Professor / Professor): ");
        designation = sc.nextLine();

        switch (designation.toLowerCase()) {
            case "programmer":
                daPercent = 97;
                hraPercent = 10;
                pfPercent = 12;
                staffClubPercent = 1;
                break;
            case "assistant professor":
                daPercent = 110;
                hraPercent = 20;
                pfPercent = 12;
                staffClubPercent = 5;
                break;
            case "associate professor":
                daPercent = 130;
                hraPercent = 30;
                pfPercent = 12;
                staffClubPercent = 10;
                break;
            case "professor":
                daPercent = 140;
                hraPercent = 40;
                pfPercent = 12;
                staffClubPercent = 15;
                break;
            default:
                System.out.println("Invalid designation. Defaulting to Programmer.");
                designation = "Programmer";
                daPercent = 97;
                hraPercent = 10;
                pfPercent = 12;
                staffClubPercent = 1;
        }
    }

    void showDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Designation: " + designation);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("DA %: " + daPercent);
        System.out.println("HRA %: " + hraPercent);
        System.out.println("PF %: " + pfPercent);
        System.out.println("Staff Club %: " + staffClubPercent);
    }
}

class PaySlip extends Employee {
    double basicPay, da, hra, pf, staffClub, gross, net;

    void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();

        da = basicPay * (daPercent / 100);
        hra = basicPay * (hraPercent / 100);
        pf = basicPay * (pfPercent / 100);
        staffClub = basicPay * (staffClubPercent / 100);

        gross = basicPay + da + hra;
        net = gross - (pf + staffClub);
    }

    void showPaySlip() {
        System.out.println("\n--- Pay Slip ---");
        showDetails();
        System.out.printf("Basic Pay: %.2f\nDA: %.2f\nHRA: %.2f\nPF: %.2f\nStaff Club: %.2f\n", basicPay, da, hra, pf, staffClub);
        System.out.printf("Gross Salary: %.2f\nNet Salary: %.2f\n", gross, net);
    }
}

public class ex3java{
    public static void main(String[] args) {
        PaySlip emp = new PaySlip();
        emp.getDetails();
        emp.calculateSalary();
        emp.showPaySlip();
    }
}


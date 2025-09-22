import java.util.Scanner;
public class ElectricityBill {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int consumerno;
String consumername;
int prevreading;
int currreading;
String connectiontype;
int units;
double billamount=0;
System.out.print("Enter consumer number:");
consumerno=sc.nextInt();
sc.nextLine();
System.out.print("Enter consumer name:");
consumername=sc.nextLine();
System.out.print("Enter previous month reading:");
prevreading=sc.nextInt();
sc.nextLine();
System.out.print("Enter current month reading:");
currreading=sc.nextInt();
sc.nextLine();
System.out.print("Enter connection type(domestic/commercial):");
connectiontype=sc.nextLine();
units=currreading-prevreading;
if(connectiontype.equalsIgnoreCase("domestic"))
{
if(units<=100) {
billamount=units*1;
}
else if(units<=200){
billamount=100*1+(units-100)*2.5;
}
else if(units<=500)
{
billamount=100*1+100*2.5+(units-200)*4;
}
else
{
billamount=100*1+100*2.5+500*4+(units-500)*6;
}}
else if(connectiontype.equalsIgnoreCase("commercial"))
{
if(units<=100) {
billamount=units*2;
}
else if(units<=200)
{
billamount=100*2+(units-100)*4.5;
}
else if(units<=500) {
billamount=100*2+100*4.5+300*6+(units-500)*7;
}

else
{
System.out.println("Invalid connection type:");
}}
System.out.println("\n--ElectricityBill---");
System.out.println("consumer number:"+consumerno);
System.out.println("consumer name:"+consumername);
System.out.println("connection type:"+connectiontype);
System.out.println("previousreading:"+prevreading);
System.out.println("currentreading:"+currreading);
System.out.println("unitsconsumed:"+units);
System.out.print("Total bill amount:Rs."+billamount);
}
}

package ie.atu.encapsulation;

public class Main {
    public static void main(String[] args){
        System.out.println("Public Access Modifier\n");
        Student student = new Student("MARKCEL", 56, 34.7);
        System.out.println("Here is " + student.name + ", and his gpa is " + student.gpa
                                    + " and you can find him by student number of " + student.studentID);

       SecretMessage mess = new SecretMessage();
       mess.printMessage();


       Temperature temp = new Temperature();
       temp.setCelsius(34.6);
       System.out.println("Temperature: " + temp.getCelsius() + " °C");
    }
}

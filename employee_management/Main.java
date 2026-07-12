package employee_management;
import java.util.Scanner;

// 1. คลาส Employee (เก็บสถานะและพฤติกรรมของพนักงาน)
class Employee{
    private String name;
    private int age;
    private double salary;

    // คอนสตรัคเตอร์
    public Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    // เมธอดแสดงข้อมูล (Encapsulation)
    public void displayEmployeeInfo(){
        System.out.println("\n--- ข้อมูลพนักงาน ---");
        System.out.println("ชื่อ : " + name);
        System.out.println("อายุ: " + age + "ปี");
        System.out.println("เงินเดือน : " + salary + "บาท");
    }
}

// 2. คลาส InputHandler (จัดการเรื่องการรับค่าจากผู้ใช้)
class InputHandler {
    private Scanner scanner;
    public InputHandler() {
        // สร้าง Object ของ Scanner เพื่อรับค่าจากคีย์บอร์ด
        scanner = new Scanner(System.in);
    }
    public void inputData() {
        System.out.print("กรุณากรอกชื่อพนักงาน: ");
        String empName = scanner.nextLine(); // รับค่า String
        System.out.print("กรุณากรอกอายุ: ");
        int empAge = scanner.nextInt(); // รับค่า int
        System.out.print("กรุณากรอกเงินเดือน: ");
        double empSalary = scanner.nextDouble(); // รับค่า double
        // นำข้อมูลที่รับมา สร้างเป็น Object ของ Employee
        Employee emp = new Employee(empName, empAge, empSalary);
        // เรียกใช้เมธอดแสดงผล
        emp.displayEmployeeInfo();
    }
    // เมธอดสำหรับปิดการทำงานของ Scanner เมื่อใช้งานเสร็จ
    public void closeScanner() {
        scanner.close(); // ป้องกัน Memory Leak
    }
}

// 3. คลาส Main (จุดเริ่มต้นของโปรแกรม)
public class Main {
    public static void main(String[] args) {
        // สร้าง Object ของ InputHandler เพื่อรับข้อมูล
        InputHandler handler = new InputHandler();

        // สั่งให้รับข้อมูล
        handler.inputData();
        // ปิด Scanner
        handler.closeScanner();
    }
}

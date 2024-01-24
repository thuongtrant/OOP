/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 *
 * @author ttthu
 */
public class Hinh {
    private LocalDate ngayTao;
    
    public Hinh(){
    }
    public String toString(){
        String date = "dd/MM/yyyy";
        return "Ngay tao: " +  ngayTao.format(DateTimeFormatter.ofPattern(date));
    }
    
}
class HinhVuong extends Hinh {
    private double canh;
    public HinhVuong(double canh){
        super();
        this.canh = canh;
    }
    public String toString(){
        return super.toString() + "\nDien tich: " +  dienTich() + "\nChu vi: " + chuVi();
    }
    public double dienTich(){
        return canh * canh;
    }
    public double chuVi(){
        return 4 * canh;
    }
}
class Ellipse extends Hinh{
    protected double a,b;
    public Ellipse(double a, double b){
    super();
    this.a = a;
    this.b = b;
    }
    public double dienTich(){
        return  Math.PI * a * b;
    }
    public double chuVi(){
        return 2 * Math.PI * Math.sqrt((a*a + b*b)/2);
    }
     public String toString(){
        return super.toString() + "\nDien tich: " +  dienTich() + "\nChu vi: " + chuVi();
    }
}
class HinhTron extends Ellipse{

    public HinhTron(double banKinh){
        super(banKinh, banKinh);
    }
       public double dienTich(){
        return a * a * Math.PI;
    }
    public double chuVi(){
        return 2 * a * Math.PI;
    }
}
class testt{

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hinh> danhSachHinh = new ArrayList<>();

        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Chọn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    themHinhVuong(scanner, danhSachHinh);
                    break;
                case 2:
                    themHinhEllipse(scanner, danhSachHinh);
                    break;
                case 3:
                    themHinhTron(scanner, danhSachHinh);
                    break;
                case 4:
                    hienThiKetQua(danhSachHinh);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 4);

        scanner.close();
    }

    private static void hienThiMenu() {
        System.out.println("1. Hình vuông.");
        System.out.println("2. Hình ellipse.");
        System.out.println("3. Hình tròn.");
        System.out.println("4. Thoát.");
    }

    private static void themHinhVuong(Scanner scanner, ArrayList<Hinh> danhSachHinh) {
        System.out.print("Nhập cạnh của hình vuông: ");
        double canh = scanner.nextDouble();
        danhSachHinh.add(new HinhVuong(canh));
    }

    private static void themHinhEllipse(Scanner scanner, ArrayList<Hinh> danhSachHinh) {
        System.out.print("Nhập bán kính trục lớn của hình ellipse: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập bán kính trục bé của hình ellipse: ");
        double b = scanner.nextDouble();
        danhSachHinh.add(new Ellipse(a, b));
    }

    private static void themHinhTron(Scanner scanner, ArrayList<Hinh> danhSachHinh) {
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = scanner.nextDouble();
        danhSachHinh.add(new HinhTron(banKinh));
    }

    private static void hienThiKetQua(ArrayList<Hinh> danhSachHinh) {
        for (Hinh hinh : danhSachHinh) {
            System.out.println(hinh.toString());
        }
    }
}
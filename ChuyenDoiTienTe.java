import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND;
        double USD;
        System.out.println("Nhập số tiền VNĐ: ");
        VND = scanner.nextDouble();
        System.out.println("Nhập só tiền USD: ");
        USD = scanner.nextDouble();
        double total = VND / 23000;
        System.out.println("Số tiền VNĐ là: " + total);
        double total1 = USD * 23000;
        System.out.println("Số tiền USD là: " + total1);
    }
}


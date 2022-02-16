import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();
    public static void main(String[] args) {
        int choice = -1;
        do {
            menu();
            System.out.println("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    quanLyDanhBa.hienThiDanhBa();
                    break;
                case 2:
                    quanLyDanhBa.themDanhBa();
                    break;
                case 3:
                    System.out.print("Mời nhập tên cần cập nhật: ");
                    String name = scanner.nextLine();
                    if (quanLyDanhBa.capNhatDanhBa(name)) {
                        System.out.println("Cập Nhật Thành Công");
                    } else {
                        System.out.println("Thất Bại");
                    }
                    break;
                case 4:
                    System.out.print("Nhập tên muốn xóa: ");
                    String nameDelete = scanner.nextLine();
                    quanLyDanhBa.xoaDanhBa(nameDelete);
                    break;
                case 5:
                    System.out.print("Tìm tên: ");
                    String nameFind = scanner.nextLine();
                    quanLyDanhBa.timKiemDanhBa(nameFind);
                    break;
                case 6:
                    quanLyDanhBa.readFile("danhba.txt");
                    break;
                case 7:
                    quanLyDanhBa.writeToFile("danhba.txt");
                    break;
            }
        } while (choice !=8);
    }

    private static void menu() {
        System.out.println("---Quản Lý Danh Bạ---");
        System.out.println("---Chọn chức năng theo số để tiếp tục---");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập Nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm ");
        System.out.println("6. Đọc từ file");
        System.out.println("7. ghi vào file");
        System.out.println("8. Thoát");
    }
}

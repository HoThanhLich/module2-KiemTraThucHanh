import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyDanhBa {
    Scanner scanner = new Scanner(System.in);
    private static List<DanhBa> danhBaList = new ArrayList<>();

    public QuanLyDanhBa() {
        File file = new File("danhba.txt");
        if (file.exists()) {
            readFile("danhba.txt");
        }
    }

    public void writeToFile(String path) {
        try {
            OutputStream outputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFile(String s) {
        try {
            InputStream inputStream = new FileInputStream("danhba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void hienThiDanhBa() {
        if (danhBaList.size() == 0) {
            System.out.println("---Danh Sách Rỗng---");
        } else {
            for (int i = 0; i < danhBaList.size(); i++) {
                System.out.println(danhBaList.get(i));
            }
        }
    }

    public DanhBa nhapThongTinDanhBa() {
        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập SDT: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập địa chỉ email: ");
        String emailAddress = scanner.nextLine();
        System.out.print("Nhập địa chỉ facebook: ");
        String facebookAddress = scanner.nextLine();
        DanhBa danhBaMoi = new DanhBa(name,phoneNumber,address,emailAddress,facebookAddress);
        return danhBaMoi;
    }

    public void themDanhBa() {
        danhBaList.add(nhapThongTinDanhBa());
    }

    public int timKiemDanhBa(String name) {
        int index = -1;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getName().equals(name.trim())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean capNhatDanhBa(String name) {
        if (timKiemDanhBa(name) == -1) {
            System.out.println("thất bại - không tồn tại tên vừa nhập trong danh bạ");
            return false;
        } else {
            DanhBa danhBaMoi = nhapThongTinDanhBa();
            int index = timKiemDanhBa(name);
            danhBaList.set(index,danhBaMoi);
            return true;
        }
    }

    public void xoaDanhBa(String name){
        if (timKiemDanhBa(name) == -1) {
            System.out.println("Thất bại - Không tồn tại tên vừa nhập: ");
        } else {
            danhBaList.remove(timKiemDanhBa(name));
            System.out.println("Xóa Thành công");
        }
    }
}

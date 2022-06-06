package _compound_exercise2.service.impl;

import _compound_exercise2.exception.NotFoundException;
import _compound_exercise2.models.NhanVien;
import _compound_exercise2.models.NhanVienQuanLy;
import _compound_exercise2.models.NhanVienSanXuat;
import _compound_exercise2.service.Service;
import _compound_exercise2.ultils.ReadAndWriteFile;
import _compound_exercise2.ultils.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ImplService implements Service {
    static List<NhanVien> nhanVienList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addNhanVienQuanLy() {
        readFile();
        nhanVienList.add(new NhanVienQuanLy(getId(), getMaNhanVien(), getHoTen(), getNgaySinh(), getDiaChi(), getLuongCoban(), getHeSoLuong()));
        System.out.println("Thêm thành công");
        writeFile();
    }

    @Override
    public void addNhanVienSanXuat() {
        readFile();
        nhanVienList.add(new NhanVienSanXuat(getId(), getMaNhanVien(), getHoTen(), getNgaySinh(), getDiaChi(), (int) getSoSanPham(), getGiaMoiSanPham()));
        System.out.println("Thêm thành công");
        writeFile();
    }

    @Override
    public void display() {
        readFile();
        for (NhanVien nhanVien : nhanVienList) {
            System.out.println(nhanVien);
        }
    }

    @Override
    public void remove() {
        readFile();
        System.out.println("Nhập id bạn muốn xóa");
        String id = scanner.nextLine();
        for (NhanVien nhanVien : nhanVienList) {
            if (nhanVien.getId().equals(id)) {
                System.out.println("bạn muốn xóa " + nhanVien);
                do {
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            nhanVienList.remove(nhanVien);
                            System.out.println("bạn đã xóa thành công");
                            writeFile();
                            return;
                        case "2":
                            System.out.println("Xóa không thành công");
                            return;
                        default:
                            System.out.println("lựa chọn không hợp lệ vui lòng chọn lại");
                    }
                } while (true);

            }
        }
        try {
            throw new NotFoundException("Id không tồn tại");
        } catch (NotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void find() {
        readFile();
        System.out.println("Nhập từ bạn muốn tìm kiếm");
        String find = scanner.nextLine();
        for (NhanVien nhanVien : nhanVienList) {
            if (nhanVien.getInfor().contains(find)) {
                System.out.println(nhanVien);
            }
        }
    }



    public String getId() {
        int id = 1;
        if (nhanVienList.isEmpty()) {
            return id + "";
        } else {
            for (NhanVien nhanVien : nhanVienList) {
                if (Integer.parseInt(nhanVien.getId()) > id) {
                    id = Integer.parseInt(nhanVien.getId());
                }
            }
        }
        id += 1;
        return id + "";
    }

    public String getMaNhanVien() {
        do {
            System.out.println("Nhập mã nhân viên");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    public String getHoTen() {
        do {
            System.out.println("Nhập tên nhân viên");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    public String getNgaySinh() {
        do {
            System.out.println("Nhập ngày sinh");
            String temp = scanner.nextLine();
            if (Regex.regexDate(temp)) {
                if (Regex.regexBirthDay(temp)) {
                    return temp;
                } else {
                    System.out.println("Ngày sinh phải trên 18 tuổi");
                }
            } else {
                System.out.println("Ngày sinh phải đúng định dạng dd/MM/yyyy");
            }
        } while (true);
    }

    public String getDiaChi() {
        do {
            System.out.println("Nhập địa chỉ");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    public double getLuongCoban() {
        System.out.println("Nhập lương cơ bản");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }

    public double getHeSoLuong() {
        System.out.println("Nhập hệ số lương");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }

    public double getSoSanPham() {
        System.out.println("Nhập số sản phẩm");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }

    public double getGiaMoiSanPham() {
        System.out.println("Nhập giá mỗi sản phẩm");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }

    public void readFile() {
        nhanVienList.clear();
        List<String[]> strings = ReadAndWriteFile.readFile("src\\_compound_exercise2\\data\\ListNhanVien.csv");
        for (String[] line : strings) {
            if (line[7].equals("1")) {
                nhanVienList.add(new NhanVienQuanLy(line[0], line[1], line[2], line[3], line[4], parseDouble(line[5]), parseDouble(line[6])));
            } else {
                nhanVienList.add(new NhanVienSanXuat(line[0], line[1], line[2], line[3], line[4], Integer.parseInt(line[5]), parseDouble(line[6])));
            }
        }
    }

    public void writeFile() {
        ReadAndWriteFile.clearFile("src\\_compound_exercise2\\data\\ListNhanVien.csv");
        for (NhanVien nhanVien : nhanVienList) {
            ReadAndWriteFile.writeFile("src\\_compound_exercise2\\data\\ListNhanVien.csv", nhanVien.getInfor());
        }
    }

}

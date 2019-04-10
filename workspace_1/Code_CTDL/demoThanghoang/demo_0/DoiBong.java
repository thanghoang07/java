package demo_0;


import java.util.Scanner;

public class DoiBong {

    private CauThu[] ds = new CauThu[50];
    private int n = -1;

    public DoiBong() {
    }

    public boolean themCauThu(CauThu cauThu) {
        n++;
        if (n < ds.length) {
            ds[n] = cauThu;
            return true;
        } else {
            System.out.println("Danh sach day!");
        }
        return false;
    }

    public CauThu timCauThu(int soAo) {
        for (int i = 0; i <= n; i++) {
            if (ds[i].getSoAo() == soAo) {
                return ds[i];
            }
        }
        return null;
    }

    public boolean xoaCauThu(int soAo) {
        int pos = findPos(soAo);
        if (pos != -1) {
            for (; pos <= n; pos++) {
                ds[pos] = ds[pos + 1];
            }
        }
        return false;
    }

    public boolean thayCauThu(int ra, CauThu vao) {
        int pos = findPos(ra);
        if(pos != -1) {
            ds[pos] = vao;
            return true;
        }
        return false;
    }

    public int findPos(int soAo) {
        int pos = -1;
        for (int i = 0; i <= n; i++) {
            if (ds[i].getSoAo() == soAo) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public CauThu nhapCauThu() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String strTen = sc.nextLine();
        System.out.print("Nhap so ao: ");
        int iSoAo = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vi tri (hau ve / tien dao / thu mon): ");
        String strViTri = sc.nextLine().trim().toLowerCase();
        if (strViTri.compareTo("hau ve") == 0) {
            return new HauVe(iSoAo, strTen);
        } else if (strViTri.compareTo("tien dao") == 0) {
            return new TienDao(iSoAo, strTen);
        } else if (strViTri.compareTo("thu mon") == 0) {
            return new ThuMon(iSoAo, strTen);
        } else {
            return null;
        }
    }
}

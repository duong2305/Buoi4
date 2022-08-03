package Bai1;

import java.util.Scanner;
public class HinhChuNhat
{
    Scanner sc = new Scanner(System.in);
    private float chieuDai;
    private float chieuRong;

    public void nhap()
    {
        System.out.println("Nhap vao chieu dai");
        chieuDai = sc.nextFloat();

        System.out.println("Nhap vao chieu rong");
        chieuRong = sc.nextFloat();
    }
    public void setChieuDai ( int chieuDai)
    {
        if (chieuDai > 0) {
                this.chieuDai = chieuDai;
        } else
            {
                this.chieuDai = 1;
            }
    }
    public void setChieuRong ( int chieuRong)
    {
        if (chieuRong > 0) {
                this.chieuRong = chieuRong;
        } else
            {
                this.chieuRong = 1;
            }
    }
    public float getChieuDai ()
    {
        return chieuDai;
    }

    public float getChieuRong ()
    {
        return chieuRong;
    }

    public float dienTich()
    {
        float Dt = chieuDai*chieuRong;
        return Dt;
    }

    public float chuVi()
    {
        float Cv = (chieuDai+chieuRong)*2;
        return Cv;
    }
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhata = new HinhChuNhat();
        HinhChuNhat hinhChuNhatb = new HinhChuNhat();
        System.out.println("Hinh chu nhat a ");
        hinhChuNhata.nhap();
        System.out.println("Hinh chu nhat b ");
        hinhChuNhatb.nhap();
        System.out.println("Chieu dai cua hcn a la: " + hinhChuNhata.getChieuDai());
        System.out.println("Chieu rong cua hcn a la: " + hinhChuNhata.getChieuRong());
        System.out.println("Chieu dai cua hcn b la: " + hinhChuNhatb.getChieuDai());
        System.out.println("Chieu rong cua hcn b la: " + hinhChuNhatb.getChieuRong());
        System.out.println("Chu vi cua hinh chu nhat a la: "+ hinhChuNhata.chuVi());
        System.out.println("Chu vi cua hinh chu nhat b la: "+ hinhChuNhatb.chuVi());
        System.out.println("Dien tich cua hinh chu nhat a la: "+ hinhChuNhata.dienTich());
        System.out.println("Dien tich cua hinh chu nhat b la: "+ hinhChuNhatb.dienTich());
        if(hinhChuNhata.dienTich() == hinhChuNhatb.dienTich()) {
            System.out.println("Hai hinh chu nhat co dien tich bang nhau !");
        } else if(hinhChuNhata.dienTich() > hinhChuNhatb.dienTich()){
            System.out.println("HinhChuNhat a co dien tich lon hon !");
        } else {
            System.out.println("HinhChuNhat b co dien tich lon hon !");
        }

    }
}


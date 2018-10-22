/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudiensokhai;

import java.util.Scanner;


public class main {
    public static void main(String[] args){
        DictionaryCommandline a = new DictionaryCommandline();
        a.quanLy.insertFromFile();
        a.quanLy.tuDien.sort();
        Scanner sc = new Scanner(System.in);
        int n;
        String lenh = null;
        System.out.println("nhap lenh t de them tu");
        System.out.println("nhap lenh s de hien thi");
        System.out.println("nhap lenh e de thoat");
        System.out.println("nhap lenh b de hien thi them");
        System.out.println("nhan lenh l de tim kiem");
        System.out.println("nhan lenh r de xoa bo");
        System.out.println("nhan lenh search de tim kiem theo goi y");
        System.out.println("nhan lenh f de sua tu da co");
        System.out.println("nhan lenh a de goi ham dictionaryAdvanced dung cac tinh nang nang cao");
        OUTER:
        while (1>0) {
            lenh =  sc.nextLine();
            switch (lenh) {
                case "e":
                    break OUTER;
                case "s":{
                    a.showAllWords();
                }
                    break;
                case "t":{
                    a.quanLy.insertFromCommandline();
                    a.quanLy.dictionaryExportToFile();
                }
                    break;
                case "b":{
                    a.dictionaryBasic();
                }
                    break;
                case "l":{
                    System.out.println(a.quanLy.dictionaryLookUp());
                }
                    break;
                case "a":{
                    a.dictionaryAdvanced();
                }
                    break;
                case "f":{
                    String tuSua;
                    tuSua = sc.nextLine();
                    a.quanLy.fix(tuSua);
                }
                    break;
                case "r":{
                    String tuTimKiem;
                    tuTimKiem = sc.nextLine();
                    a.quanLy.getTuDien().deleteWord(tuTimKiem);
                }
                case "search":{
                    String tuTimKiem;
                    tuTimKiem = sc.nextLine();
                    a.seacher(tuTimKiem);
                }
                    break;
                default:
                    break;
            }
        }
        
    }
}
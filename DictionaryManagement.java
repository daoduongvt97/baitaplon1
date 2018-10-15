/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudiensokhai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class DictionaryManagement {
    Dictionary tuDien = new Dictionary();

    public Dictionary getTuDien() {
        return tuDien;
    }

    public void setTuDien(Dictionary tuDien) {
        this.tuDien = tuDien;
    }
    
    public void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so luong tu: ");
        String m;
        m = sc.nextLine();
        int n;
        n = Integer.parseInt(m);
        //Word[] tuMoi = new Word[n];
        for (int i = 0 ;i < n; i++){
            Word tuMoi = new Word();
            System.out.println("nhap tieng anh: ");
            String tiengAnh ;
            tiengAnh = sc.nextLine();
            tuMoi.setWord_target(tiengAnh.toLowerCase());
            System.out.println("nhap tieng viet: ");
            String tiengViet;
            tiengViet = sc.nextLine();
            tuMoi.setWord_explain(tiengViet.toLowerCase());
            tuDien.addWord(tuMoi);
        }
        
    }
    //hàm đọc từ file txt
    public void insertFromFile(){

        try{
            File fileDir = new File("dictionaries.txt"); //đọc file có đường dẫn là dirFileDic
            try (BufferedReader in = 
                    new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF-8"))) {
                String line = null;
                while ((line = in.readLine()) != null){ //đọc vào từng dòng đến cuối file
                    String result[] = line.split("\t");//tách các chuỗi cách nhau bởi dấu tab trong đó chuỗi đầu là từ, chuối thứ hai là nghĩa
        tuDien.addWord(result[0],result[1]); //thêm các Word vào mảng động dictionary
                }
                in.close();
            }
        }
        catch (IOException e){
    }
        
    }
    //hàm xuất ra file txt
    public void dictionaryExportToFile(){
        tuDien.sort();
        try{
            FileOutputStream f = new FileOutputStream("dictionaries.txt",false);
            try (PrintWriter wr = new PrintWriter(f)) {
                for(int i = 0; i < tuDien.getSize(); i++){
                    wr.println(tuDien.getWord(i).getWord_target() + "\t" + 
                            tuDien.getWord(i).getWord_explain());
                }
            }
            f.close();
        }
        catch (IOException e){}
    }
    //ham tim kiem tra lai tu 
    public String dictionaryLookUp(){
        String tuKhoa;
        Scanner sc = new Scanner(System.in);
        tuKhoa = sc.nextLine();
        for(int i = 0;i < tuDien.getSize(); i++){
            if(tuDien.getWord(i).getWord_target().equals(tuKhoa))
                return tuDien.giaiNghia(i);
        }
        return "Khong thay!";
    }
    //ham sua tu
    public void fix(String word){
        int i;
         for(i = 0; i < tuDien.getSize(); i++){
            if(tuDien.tuVung.get(i).getWord_target().equals(word)) {
                Scanner sc = new Scanner(System.in);
                String thayDoi;
                System.out.println("nhap vao tu thay doi");
                thayDoi = sc.nextLine();
                tuDien.tuVung.get(i).setWord_explain(thayDoi);
                if(tuDien.tuVung.get(i).getWord_explain().equals(thayDoi)){
                    System.out.println("thay doi thanh cong!");
                }
                break;
            }
        }
        if(i == tuDien.getSize()){
            System.out.println("khong tim thay tu can sua!");
        }
    }
}

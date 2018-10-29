/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary_btl;

import java.io.*;
import java.util.ArrayList;

public class DictionaryManagement{
    Dictionary tuDien = new Dictionary();
    private String dirFileDic; //đường dẫn tới file dữ liệu từ điển
    //constructor khởi tạo đường dẫn tới file dữ liệu của từ điển tương ứng
    public DictionaryManagement(String dir) {
        switch (dir) {
            case "ev":
                this.dirFileDic="file/EV.txt";
                break;
            case "ve":
                this.dirFileDic="file/VE.txt";
                break;
            default:
                break;
        }
    }
    //hàm tìm từ word
    public Word lookUp(String word){
        Word tmp = null;
        if (tuDien.tuVung.isEmpty()) return null;
        else {
            for(int i = 0;i < tuDien.getSize(); i++){
                if(tuDien.getWord(i).getWord_target().equals(word))
                tmp = tuDien.getWord(i);
            }
            return tmp;
        }
    }
    public String deleteWord(String word){
        Word tmp = this.lookUp(word);
        if(tmp != null) {tuDien.tuVung.remove(tmp);
            return "Đã xóa!";
        }
        else return "Không thấy!";
    }
    public String addWord(String word_target, String word_explain, String type){
        Word tmp = this.lookUp(word_target);
        if(tmp != null){
            tmp.setType(type);
            tmp.setWord_target(word_target);
            tmp.setWord_explain(word_explain);
            return "Đã sửa!";
        }
        else {
            tuDien.addWord(word_target, word_explain, type);
            return "Đã thêm!";
        }
    }
    public ArrayList<Word> seacher(String tuKhoa){
        ArrayList<Word> ketQua = new ArrayList<>();
        for (int i = 0; i <tuDien.getSize();i ++){
            if(tuDien.getWord(i).getWord_target().startsWith(tuKhoa)){
                ketQua.add(tuDien.getWord(i));
            }
        }
        if(ketQua.isEmpty()){
            ketQua = this.seacher(tuKhoa.substring(0,tuKhoa.length()-1));
        }
        return ketQua;
    }
    public void insertFromFile() {
        try{
            File fileDir = new File(dirFileDic); //đọc file có đường dẫn là dirFileDic
            try (BufferedReader sc = new BufferedReader(new InputStreamReader(
                    new FileInputStream(fileDir), "UTF-8"))) {
                String line = null;
                while ((line = sc.readLine()) != null){ //đọc vào từng dòng đến cuối file
                    String result[] = line.split(":");//tách các chuỗi cách nhau bởi dấu : trong đó chuỗi đầu là từ, chuối thứ hai là nghĩa, chuỗi thứ 3 là từ loại
                    tuDien.addWord(result[0].trim(),result[1].trim(), result[2].trim()); //thêm vào mảng động
                }
            }
        }
        catch (IOException e){
        }

    }
    public void dictionaryExportToFile(){
        tuDien.sort();// sắp xếp lại danh sach theo alphabe
        try {
            FileOutputStream f= new FileOutputStream(dirFileDic,false);
            try (PrintWriter wr = new PrintWriter(f)) {
                for(int i = 0; i < tuDien.getSize();i++){ //duyệt từ đầu tới cuối danh sách và ghi dữ liệu vào file
                    wr.println(tuDien.getWord(i).getWord_target().toLowerCase()+ " : " + 
                            tuDien.getWord(i).getWord_explain().toLowerCase()+ " : " 
                            + tuDien.getWord(i).getType()); 
                }//khi lưu file chuyển về dạng chữ in thường
            }
        }
        catch (IOException e){
        }
    }
}

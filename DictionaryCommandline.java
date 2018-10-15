/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudiensokhai;

public class DictionaryCommandline {
    DictionaryManagement quanLy = new DictionaryManagement();
    public void showAllWords(){
        int n = quanLy.getTuDien().getSize();
        for(int i = 0;i <n;i ++){
            System.out.println(quanLy.getTuDien().getWord(i).getWord_target() + 
                    "     " + quanLy.getTuDien().getWord(i).getWord_explain());
        }
    }
    public void dictionaryBasic(){
        quanLy.insertFromCommandline();
        this.showAllWords();
    }
    public void dictionaryAdvanced(){
        quanLy.insertFromFile();
        this.showAllWords();
        quanLy.dictionaryLookUp();
    }
    //ham tim kiem goi y
    public void seacher(String tuKhoa){
        //Dictionary ketQua = new Dictionary();
        int length = tuKhoa.length();
        for (int i = 0; i < quanLy.tuDien.getSize();i ++){
            if(quanLy.tuDien.getWord(i).getWord_target().startsWith(tuKhoa)){
                System.out.println(quanLy.tuDien.getWord(i).getWord_target());
            }
        }
        //return ketQua;
    }
}

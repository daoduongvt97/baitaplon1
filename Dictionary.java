/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudiensokhai;


import java.util.ArrayList;
import java.util.Collections;

public class Dictionary{
    ArrayList<Word> tuVung = new ArrayList<>();
    //hàm thêm từ khi truyền tham số là 1 word
    public void addWord(Word word){
        tuVung.add(word);
    }
    //hàm thêm từ khi truyền vào tham số là từ vựng và giải nghĩa
    public void addWord(String word_target, String word_explain){
        Word word = new Word(word_target, word_explain);
        tuVung.add(word);
    }
    public void deleteWord(String tiengAnh){
        for(int i = 0; i < tuVung.size(); i ++){
            if(tuVung.get(i).getWord_target().equals(tiengAnh)){
                tuVung.remove(i);
            }
        }
    }
    // hàm sắp xếp
    public void sort(){
        Collections.sort(tuVung, new soSanh());
    }

    public ArrayList<Word> getTuVung() {
        return tuVung;
    }

    public void setTuVung(ArrayList<Word> tuVung) {
        this.tuVung = tuVung;
    }
    //tim lay tu theo so thu tu
    public Word getWord(int i){
        return tuVung.get(i);
    }
    public String giaiNghia(int i){
        return tuVung.get(i).getWord_target()+"\t"+tuVung.get(i).getWord_explain();
    }
    public int getSize(){
        return tuVung.size();
    }
}

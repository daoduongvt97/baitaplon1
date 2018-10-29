package dictionary_btl;

import java.util.ArrayList;
import java.util.Collections;

public class Dictionary{
    ArrayList<Word> tuVung = new ArrayList<>();
    //phương thức khởi tạo
    public Dictionary(){}
    //hàm thêm Word
    public void addWord(Word word){
        tuVung.add(word);//sử dụng hàm add của thư viện ArrayList
    }
    //hàm thêm từ khi truyền vào tham số là từ vựng và giải nghĩa, từ loại
    public void addWord(String word_target, String word_explain, String type){
        Word word = new Word(word_target, word_explain, type);
        tuVung.add(word);
    }
    //hàm thêm từ khi không biết chính xác từ loại
    public void addWord(String word_target, String word_explain){
        Word word = new Word(word_target, word_explain);
        tuVung.add(word);
    }
    // hàm sắp xếp theo word_target
    public void sort(){
        Collections.sort(tuVung, new soSanh());
    }
    //tim lay tu theo so thu tu
    public Word getWord(int i){
        return tuVung.get(i);
    }
    /*public String giaiNghia(int i){
        return tuVung.get(i).getWord_target()+"\t"+tuVung.get(i).getWord_explain();
    }*/
    public int getSize(){
        return tuVung.size();
    }
        //hàm getter và setter
    public ArrayList<Word> getTuVung() {
        return tuVung;
    }

    public void setTuVung(ArrayList<Word> tuVung) {
        this.tuVung = tuVung;
    }
}
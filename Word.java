/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary_btl;

import java.util.Comparator;

public class Word {
    private String word_target;
    private String word_explain;
    private String type;
    
    public Word(){
        word_target = "";
        word_explain = "";
    }
    public Word(String word_target, String word_explain){
        this.word_explain = word_explain;
        this.word_target = word_target;
        this.type = "";
    }
    public Word(String word_target, String word_explain, String type){
        this.word_explain = word_explain;
        this.word_target = word_target;
        this.type = type;
    }
    //ham getter setter
    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Word{" + "word_target=" + word_target + ", word_explain=" + word_explain + ", type=" + type + '}';
    }
}

class soSanh implements Comparator<Word>{
    @Override
    public int compare(Word o1, Word o2) {
        return o1.getWord_target().compareTo(o2.getWord_target());
    }
}

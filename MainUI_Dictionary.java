package dictionary_btl;

import com.sun.speech.freetts.*;
import java.util.ArrayList;

public class MainUI_Dictionary extends javax.swing.JFrame {

    //tạo hai file từ điển tương ứng anh việt và anh anh
    public static DictionaryManagement EVDic = new DictionaryManagement("ev");
    public static DictionaryManagement VEDic = new DictionaryManagement("ve");
    public static DictionaryManagement Dic;
    public static Word s;
    private static final String VOICENAME="kevin16"; //tên của giọng nói
    public MainUI_Dictionary() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        WordTextField = new javax.swing.JTextField();
        wordType = new javax.swing.JLabel();
        meanType = new javax.swing.JLabel();
        readMean = new javax.swing.JButton();
        meanText = new javax.swing.JLabel();
        changeTypeBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        hint = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dictionary");

        WordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WordTextField.setToolTipText("");
        WordTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        WordTextField.setName(""); // NOI18N
        WordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WordTextFieldActionPerformed(evt);
            }
        });
        WordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WordTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                WordTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                WordTextFieldKeyTyped(evt);
            }
        });

        wordType.setText("Tiếng Anh");

        meanType.setText("Tiếng Việt");

        readMean.setText("Đọc");
        readMean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readMeanActionPerformed(evt);
            }
        });

        meanText.setBackground(new java.awt.Color(153, 255, 0));
        meanText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        meanText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meanText.setToolTipText("+");
        meanText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        changeTypeBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nhozx\\OneDrive\\Documents\\NetBeansProjects\\Dictionary_BTL\\img\\md_5aa100756e695.png")); // NOI18N
        changeTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTypeBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Chỉnh sửa");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        hint.setText("Ý bạn là:");
        hint.setMaximumSize(new java.awt.Dimension(2, 2));
        hint.setMinimumSize(new java.awt.Dimension(2, 2));
        hint.setPreferredSize(new java.awt.Dimension(2, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(wordType, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeTypeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(meanType, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 212, Short.MAX_VALUE)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(WordTextField)
                    .addComponent(meanText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(readMean, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeTypeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(meanType, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(wordType, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EditBtn)))
                .addGap(9, 9, 9)
                .addComponent(WordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readMean)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meanText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        WordTextField.getAccessibleContext().setAccessibleName("");
        hint.getAccessibleContext().setAccessibleDescription("+");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // nếu bấm vào nút đọc thì sẽ đọc lên
    private void readMeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readMeanActionPerformed
        Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(VOICENAME);
        voice.allocate();
        try{
            voice.speak(s.getWord_target());
        }catch(Exception e){
        }        
    }//GEN-LAST:event_readMeanActionPerformed

    private void changeTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTypeBtnActionPerformed
        //Khi bấm nút chuyển đổi loại từ điển thì trỏ đến danh sách tương ứng
        String tmp=wordType.getText();
        wordType.setText(meanType.getText());
        meanType.setText(tmp);
        if(Dic.equals(EVDic)) Dic=VEDic;
        else Dic=EVDic;
    }//GEN-LAST:event_changeTypeBtnActionPerformed

    private void WordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WordTextFieldKeyReleased
        //Khi gõ một kí tự vào thì đồng thời tiến hành tìm nghĩa luôn;
        String timKiem = WordTextField.getText().trim();
        s = Dic.lookUp(timKiem);
        ArrayList<Word> goiY = new ArrayList<>();
        goiY = Dic.seacher(timKiem);
        String tuGoiY = null;
        if(goiY.get(0).equals(s)) {
            if(goiY.size()>1) tuGoiY = goiY.get(1).getWord_target();
        }
        else tuGoiY = goiY.get(0).getWord_target();
        if (s == null) meanText.setText("<html><center><i>Not Found!!!</i>");        
        else meanText.setText("<html><center><i>/ " +s.getType()+" /:</i><br>"
                +s.getWord_explain()+"</center></html>");
        hint.setText(tuGoiY);
    }//GEN-LAST:event_WordTextFieldKeyReleased

    private void WordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WordTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_WordTextFieldKeyPressed

    private void WordTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WordTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_WordTextFieldKeyTyped

    private void WordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WordTextFieldActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        //khi bấm nút chỉnh sửa thì hiện khung chỉnh sửa lên
        EditUI_Dictionary EUI = new EditUI_Dictionary();
        EUI.setVisible(true);
    }//GEN-LAST:event_EditBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        EVDic.insertFromFile(); //đọc dữ liệu cho từ điển anh việt
        VEDic.insertFromFile(); // đọc dữ liệu cho từ điển việt anh;
        Dic=EVDic; //trỏ tới từ điển anh việt;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI_Dictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField WordTextField;
    private javax.swing.JButton changeTypeBtn;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel meanText;
    private javax.swing.JLabel meanType;
    private javax.swing.JButton readMean;
    private javax.swing.JLabel wordType;
    // End of variables declaration//GEN-END:variables
}
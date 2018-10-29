package dictionary_btl;

import static dictionary_btl.MainUI_Dictionary.Dic;
import static dictionary_btl.MainUI_Dictionary.EVDic;
import static dictionary_btl.MainUI_Dictionary.VEDic;
import static dictionary_btl.MainUI_Dictionary.s;
import java.io.PrintStream;
import javax.swing.JOptionPane;

public class EditUI_Dictionary extends javax.swing.JFrame {

    
    public EditUI_Dictionary() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        wordField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        meanField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DeleteField = new javax.swing.JTextField();
        MeanLabel = new javax.swing.JLabel();
        DelBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        typeWord = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TypeOfDic = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Edit Dictionary:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><center>Sửa hoặc<br>Thêm từ</center></html>");

        wordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wordFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wordFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Từ:");

        jLabel4.setText("Nghĩa:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Xóa từ");

        DeleteField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DeleteFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DeleteFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DeleteFieldKeyTyped(evt);
            }
        });

        MeanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        DelBtn.setText("Xóa");
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Loại từ:");

        typeWord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "V", "N", "O", "adj", "adv" }));

        updateBtn.setText("Thêm từ");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("______________________________________________________________________________________");

        TypeOfDic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TypeOfDic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anh-Việt", "Việt-Anh" }));
        TypeOfDic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TypeOfDicItemStateChanged(evt);
            }
        });
        TypeOfDic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeOfDicActionPerformed(evt);
            }
        });

        jButton1.setText("Đóng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TypeOfDic, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meanField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(typeWord, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MeanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeleteField, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(10, 10, 10))))))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(TypeOfDic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(wordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(meanField)
                            .addComponent(typeWord)
                            .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MeanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteFieldKeyPressed
      
    }//GEN-LAST:event_DeleteFieldKeyPressed

    private void DeleteFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteFieldKeyReleased
        //ouMỗi khi gõ từ vào khung xóa thì hiện nghĩa của từ đó ben dưới
        s=Dic.lookUp(DeleteField.getText().trim());
        if (s == null) MeanLabel.setText("<html><center><i>Not Found!!!</i></html>");        
        else MeanLabel.setText("<html><center><i>/ " +s.getType()+" /:</i><br>"+s.getWord_explain()+"</center></html>");        
    }//GEN-LAST:event_DeleteFieldKeyReleased

    private void DeleteFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeleteFieldKeyTyped
    
    }//GEN-LAST:event_DeleteFieldKeyTyped

    private void TypeOfDicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TypeOfDicItemStateChanged
        //Khi chọn loại từ điển thì sẽ trỏ đến danh sách từ điển tương ứng
        if(TypeOfDic.getSelectedItem().toString().equals("Anh-Việt")) Dic=EVDic;
        if(TypeOfDic.getSelectedItem().toString().equals("Việt-Anh")) Dic=VEDic;
    }//GEN-LAST:event_TypeOfDicItemStateChanged

    private void wordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordFieldKeyPressed
       
    }//GEN-LAST:event_wordFieldKeyPressed

    private void wordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordFieldKeyReleased
        //ở khung thêm và sửa khi gõ từ cần thêm hoặc sửa thì sẽ tìm nghĩa
        //nếu không có nghĩa thì là thêm nếu đã có nghĩa thì là sửa
        //sửa tên nút cho tương ứng.
        s=Dic.lookUp(wordField.getText().trim());
        if (s == null){ 
            meanField.setText("");
            updateBtn.setText("Thêm");
        }else{
            meanField.setText(s.getWord_explain());
            updateBtn.setText("Sửa");
            typeWord.setSelectedItem(s.getType());
        }
    }//GEN-LAST:event_wordFieldKeyReleased

    private void wordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordFieldKeyTyped
        
    }//GEN-LAST:event_wordFieldKeyTyped

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        //khi bấm vào nút xóa
        if(s==null) JOptionPane.showMessageDialog(null, "Không tìm thấy từ này!"); //khi từ cần tìm không có thì hiện ra Không tìm thấy
        else
        if(DeleteField.getText().trim().equals(""))JOptionPane.showMessageDialog(null, "Nhập từ cần xóa! "); // nếu chưa nhập từ cần xóa thì hiện ra nhập từ cần xóa
        else{
            //xóa từ đã nhập ở từ điển tương ứng
            JOptionPane.showMessageDialog(null, "Xóa từ "+DeleteField.getText()
                    +" ở từ điển "+TypeOfDic.getSelectedItem().toString());
            Dic.deleteWord(DeleteField.getText()); //xóa từ nhập ở khung xóa
            Dic.dictionaryExportToFile(); //xóa xong tiến hành ghi lại file.
        }
    }//GEN-LAST:event_DelBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //Khi bấm vào nút thêm hoặc sửa thì ta thêm hoặc sửa vào danh sách và ghi lại vào file
        JOptionPane.showMessageDialog(null,Dic.addWord(wordField.getText(), 
                meanField.getText(), typeWord.getSelectedItem().toString()));
        Dic.dictionaryExportToFile();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void TypeOfDicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeOfDicActionPerformed
      
    }//GEN-LAST:event_TypeOfDicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditUI_Dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditUI_Dictionary().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JTextField DeleteField;
    private javax.swing.JLabel MeanLabel;
    private javax.swing.JComboBox<String> TypeOfDic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField meanField;
    private javax.swing.JComboBox<String> typeWord;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField wordField;
    // End of variables declaration//GEN-END:variables
}

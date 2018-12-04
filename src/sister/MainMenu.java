/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sister;

import java.io.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author dhiaa
 */
public class MainMenu extends javax.swing.JFrame {
    public QuizMenu newQuiz;
    public QuizMenu unfinishQuiz;
    public ArrayList<String> topicName=new ArrayList();
    public ArrayList<Note> notes;
    public ArrayList<Question> questions;
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        
        initComponents();
        questions=readQuestions();
        notes=readNote();
        
        topicName.add("Item 1");
        topicName.add("Item 2");
        topicName.add("Item 3");
        topicName.add("Item 4");
        topicName.add("Item 5");
        
        topicList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                    topicSelected();
                }
        });
        DefaultListModel model=new DefaultListModel();
        for(int i=0;i<topicName.size();i++){
            
                model.addElement(topicName.get(i));
            
        }
        topicList.setModel(model);
    }
    
    public void storeUnfinishQuiz(QuizMenu quiz){
        unfinishQuiz=quiz;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        topicList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        topicTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteContent = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        beginQuiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        topicList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        topicList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topicList.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                topicListMouseMoved(evt);
            }
        });
        jScrollPane4.setViewportView(topicList);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        jLabel1.setText("Topic list:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Software Development Life Cycle");

        topicTitle.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        topicTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicTitle.setText("----");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topicTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        noteContent.setEditable(false);
        noteContent.setColumns(20);
        noteContent.setRows(5);
        noteContent.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(noteContent);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        beginQuiz.setText("Start a Quiz!");
        beginQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginQuizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(beginQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(beginQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topicSelected(){
        topicList.getSelectedValue();
        noteContent.setText(topicList.getSelectedIndex()+"");
    }
    
    private void beginQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginQuizActionPerformed
        // TODO add your handling code here:
        
        if(unfinishQuiz!=null){
            System.out.println("!!!");
            Object[] options = {"Continue the unfinished quiz",
                    "Start a new quiz"};
            int comfirm=JOptionPane.showOptionDialog(null, 
                    "You have an unfinished quiz, do you what to continue?", "Save Test?", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            if(comfirm==JOptionPane.YES_OPTION){
                unfinishQuiz.setVisible(true);
                setVisible(false);
            }
            else{
                System.out.println("!!");
                for(int i=0;i<questions.size();i++){
                    System.out.println(questions.get(i).getCurrentSelection());
                }
                unfinishQuiz.dispose();
                newQuiz=new QuizMenu(this,questions);
                newQuiz.setVisible(true);
                setVisible(false);
            }
        }else{
            System.out.println("!");
            for(int i=0;i<questions.size();i++){
                System.out.println(questions.get(i).getCurrentSelection());
            }
            newQuiz=new QuizMenu(this,questions);
            newQuiz.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_beginQuizActionPerformed

    private void topicListMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topicListMouseMoved
        // TODO add your handling code here:
        int index = topicList.locationToIndex(evt.getPoint());
        DefaultListModel model=new DefaultListModel();
        for(int i=0;i<topicName.size();i++){
            if(i==index){
                ((DefaultListModel)topicList.getModel()).set(i, "<html><u>"+topicName.get(i)+"</u></html>");
            }
            else{
                ((DefaultListModel)topicList.getModel()).set(i, topicName.get(i));
            }
        }
    }//GEN-LAST:event_topicListMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    public ArrayList<Note> readNote() {

        try (BufferedReader br = new BufferedReader(new FileReader("src/sister/Notes.txt"))) {
            
            ArrayList<Note> notes = new ArrayList<>();
            
            String value;
            String title;
            int counter = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < counter; i++) {
            
                title = br.readLine();
                value = br.readLine();
                notes.add(new Note(value, title));
            
            }
            
            br.close();
            
            return notes;
            
        }
        
        catch (IOException e) {
        
            System.out.println("Error: " + e.toString());
        
        }
        
        return null;
    
    }

    public ArrayList<Question> readQuestions() {
    
        try (BufferedReader br = new BufferedReader(new FileReader("src/sister/Questions.txt"))) {
            
            ArrayList<Question> questions = new ArrayList<>();
            
            
            
            int counter = Integer.parseInt(br.readLine());
            int correctSelection;
            
            for (int i = 0; i < counter; i++) {
                String[] selections = new String[4];
                String content=br.readLine();
                
                for (int j = 0; j < 4; j++) {
                    char index=(char)(j+65);
                    selections[j] = index+". "+br.readLine();
                    
                }

                correctSelection = Integer.parseInt(br.readLine());
                
                questions.add(new Question(content,selections,correctSelection));
            }
            
            br.close();
            return questions;
            
        }
        
        catch (IOException e) {
        
            System.out.println("Error: " + e.toString());
        
        }
        
        return null;
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beginQuiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea noteContent;
    private javax.swing.JLabel title;
    private javax.swing.JList<String> topicList;
    private javax.swing.JLabel topicTitle;
    // End of variables declaration//GEN-END:variables

}
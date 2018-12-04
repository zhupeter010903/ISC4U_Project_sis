/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sister;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.text.Element;
import javax.swing.text.*;

/**
 *
 * @author zhuxiaoyu
 */
public class QuizSummarize extends javax.swing.JFrame {
    private MainMenu mainMenu;
    private ArrayList<Question> questionData=new ArrayList();
    private static String summarize="";
    /**
     * Creates new form QuizSummarize
     */
    public QuizSummarize() {
        initComponents();
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                exitOption(windowEvent);
                
            }
            
        });
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    public QuizSummarize(MainMenu mainMenu,ArrayList<Question> questionData){
        this();
        this.mainMenu=mainMenu;
        this.questionData=questionData;
        
        giveSummarize();
    }
    
    private void giveSummarize(){
        int score=questionData.size();
        for(int i=0;i<questionData.size();i++){
            if(questionData.get(i).getCurrentSelection()!=questionData.get(i).getCorrectSelection()){
                summarize+="<pre><b>WRONG: </b>";
                score--;
            }
            else{
                summarize+="<pre><b>CORRECT: </b>";
            }
            summarize+=questionData.get(i).getContent();
            
            for(int j=0;j<questionData.get(i).getSelections().length;j++){
                //summarize+="<li>";
                summarize+="<pre>   ";
                if(j==questionData.get(i).getCurrentSelection()&&j==questionData.get(i).getCorrectSelection()){
                    summarize+="<b><font size=+0.5><u>"+questionData.get(i).getSelections()[j]+"(Answer)</u></font></b>";
                }
                else if(j==questionData.get(i).getCurrentSelection()){
                    summarize+="<b>"+questionData.get(i).getSelections()[j]+"</b>";
                }
                
                else if(j==questionData.get(i).getCorrectSelection()){
                    summarize+="<u>"+questionData.get(i).getSelections()[j]+"(Answer)</u>";
                }
                else{
                    summarize+=questionData.get(i).getSelections()[j];
                }
                //summarize+="</li>";
                summarize+="<br/>";
            }
            summarize+="<br/>";
        }
        scoreLabel.setText(score+"/"+questionData.size());
        summarizeEditorPane.setText(summarize);
    }
    
    private void exitOption(java.awt.event.WindowEvent windowEvent){
        this.dispose();
        mainMenu.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        summarizeEditorPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Lucida Bright", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Quiz Summarize:");

        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        scoreLabel.setText("-/-");

        summarizeEditorPane.setEditable(false);
        summarizeEditorPane.setContentType("text/html"); // NOI18N
        summarizeEditorPane.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        summarizeEditorPane.setSize(new java.awt.Dimension(560, 16));
        jScrollPane2.setViewportView(summarizeEditorPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(scoreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JEditorPane summarizeEditorPane;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

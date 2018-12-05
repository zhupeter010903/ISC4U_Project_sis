/*
 * The Main Menu JFrame Window
 *
 * Malcolm Wang, Peter Zhu, Dheyaa AlNajafi
 * December 4, 2018
 * ISC4U Unit 6, Project Management Project
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
    //new QuizMenu
    public QuizMenu unfinishQuiz;
    //unfinished QuizMenu

    public ArrayList<Note> notes;
    //an ArrayList of notes
    public ArrayList<Question> questions;
    //an ArrayList of questions
    public ArrayList<String> topicName = new ArrayList();
    //an ArrayList of titles for each topic in the notes

    /**
     * Creates new form MainMenu default constructor
     */
    public MainMenu() {

        initComponents();

        questions = readQuestions();
        //call the readQuestions() to read questions from the file and store in questions
        notes = readNote();
        //call the readNote() to read notes from the file and store in notes

        for (int i = 0; i < notes.size(); i++) {
            topicName.add(notes.get(i).getTitle());
            //store titles for each topic from the notes in the topicName
        }

        topicList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                //listen for valueChange event in topicList
                topicSelected();
            }
        });

        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < topicName.size(); i++) {
            model.addElement(topicName.get(i));

        }
        topicList.setModel(model);
        //list all the topic titles from the topicName in the topicList

        pack();
        //pack the jFrame
    }

    /**
     * store an unfinished quiz
     *
     * @param quiz = a QuizMenu
     */
    public void storeUnfinishQuiz(QuizMenu quiz) {
        unfinishQuiz = quiz;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        topicTitleLabel = new javax.swing.JLabel();
        textareaPanel = new javax.swing.JPanel();
        textareaScrollPane = new javax.swing.JScrollPane();
        noteContentTextArea = new javax.swing.JTextArea();
        lisAndButtonPanel = new javax.swing.JPanel();
        beginQuizButton = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        topicList = new javax.swing.JList<>();
        topicListNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Development Life Cycle Project");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Software Development Life Cycle");

        topicTitleLabel.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        topicTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicTitleLabel.setText("----");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topicTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        noteContentTextArea.setEditable(false);
        noteContentTextArea.setColumns(20);
        noteContentTextArea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        noteContentTextArea.setLineWrap(true);
        noteContentTextArea.setRows(5);
        noteContentTextArea.setWrapStyleWord(true);
        noteContentTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textareaScrollPane.setViewportView(noteContentTextArea);

        javax.swing.GroupLayout textareaPanelLayout = new javax.swing.GroupLayout(textareaPanel);
        textareaPanel.setLayout(textareaPanelLayout);
        textareaPanelLayout.setHorizontalGroup(
            textareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textareaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textareaScrollPane)
                .addContainerGap())
        );
        textareaPanelLayout.setVerticalGroup(
            textareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textareaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textareaScrollPane)
                .addContainerGap())
        );

        beginQuizButton.setText("Start a Quiz!");
        beginQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginQuizButtonActionPerformed(evt);
            }
        });

        buttonPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        topicList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        topicList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topicList.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                topicListMouseMoved(evt);
            }
        });
        jScrollPane4.setViewportView(topicList);

        topicListNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        topicListNameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 13)); // NOI18N
        topicListNameLabel.setText("Topic list:");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addComponent(topicListNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topicListNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout lisAndButtonPanelLayout = new javax.swing.GroupLayout(lisAndButtonPanel);
        lisAndButtonPanel.setLayout(lisAndButtonPanelLayout);
        lisAndButtonPanelLayout.setHorizontalGroup(
            lisAndButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lisAndButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lisAndButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(beginQuizButton, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lisAndButtonPanelLayout.setVerticalGroup(
            lisAndButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lisAndButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beginQuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lisAndButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textareaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lisAndButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textareaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * set the texts of noteContentTextArea and topicTitleLabel due to the
     * seleceted index og topicList
     */
    private void topicSelected() {
        noteContentTextArea.setText(notes.get(topicList.getSelectedIndex()).getValue());
        topicTitleLabel.setText("--" + notes.get(topicList.getSelectedIndex()).getTitle() + "--");
    }

    /**
     * beginQuizButton clicked action
     *
     * @param evt
     */
    private void beginQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginQuizButtonActionPerformed
        // TODO add your handling code here:

        //check if there is an unfinished quiz
        if (unfinishQuiz != null) {
            //if there is an unfinished quiz

            Object[] options = {"Continue the unfinished quiz", "Start a new quiz"};
            //the option buttons for the confirm message will be "Continue the unfinished quiz", and "Start a new quiz"
            int comfirm = JOptionPane.showOptionDialog(null,
                    "You have an unfinished quiz, do you what to continue?", "Save Test?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            //present the confirm message

            if (comfirm == JOptionPane.YES_OPTION) {
                //if the user choose "Continue the unfinished quiz"

                unfinishQuiz.setVisible(true);
                //popup the unfinished quiz menu window
            } else {
                //if the user choose "Start a new quiz"

                unfinishQuiz.dispose();
                //dispose the unfinished quiz menu
                newQuiz = new QuizMenu(this, questions);
                //create a new QuizMenu JFrame Window with attributes of mainMenu and questionData
                newQuiz.setVisible(true);
                //popup the new quiz menu window
            }
        } else {
            //if there is no unfinished quiz

            newQuiz = new QuizMenu(this, questions);
            //create a new QuizMenu JFrame Window, storing this main menu, and the ArrayList of Questions
            newQuiz.setVisible(true);
            //popup the new quiz menu window
        }
        setVisible(false);
        //set this main menu window invisible
    }//GEN-LAST:event_beginQuizButtonActionPerformed

    /**
     * topicList Mousemoved action add an underline to the title hovered over by
     * the mouse in the topicList
     *
     * @param evt
     */
    private void topicListMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topicListMouseMoved
        // TODO add your handling code here:
        int index = topicList.locationToIndex(evt.getPoint());
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < topicName.size(); i++) {
            if (i == index) {
                ((DefaultListModel) topicList.getModel()).set(i, "<html><u>" + topicName.get(i) + "</u></html>");
            } else {
                ((DefaultListModel) topicList.getModel()).set(i, topicName.get(i));
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

    /**
     * read the notes from the Notes file
     *
     * @return an ArraList of Notes
     */
    public ArrayList<Note> readNote() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(MainMenu.class.getResourceAsStream("Notes.txt")))) {

            ArrayList<Note> notes = new ArrayList<>();
            //instantiate an ArraList of Notes

            String value;
            String title;
            int counter = Integer.parseInt(br.readLine());
            //read the number of notes

            for (int i = 0; i < counter; i++) {

                title = br.readLine();
                //read the title of the topic
                value = br.readLine();
                //read the content of the topic
                notes.add(new Note(value, title));
                //add a the Note with attributes of value and title to the ArrayList notes
            }

            br.close();

            return notes;

        } catch (IOException e) {

            System.out.println("Error: " + e.toString());
            //print the error
        }

        return null;
        //return null at the end
    }

    /**
     * read the notes from the Questions file
     *
     * @return an ArraList of Questions
     */
    public ArrayList<Question> readQuestions() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(MainMenu.class.getResourceAsStream("Questions.txt")))) {

            ArrayList<Question> questions = new ArrayList<>();
            //instantiate an ArraList ofQuestions

            int counter = Integer.parseInt(br.readLine());
            //read the total number of questions

            for (int i = 0; i < counter; i++) {

                String content = (i + 1) + ". " + br.readLine();
                //read the content of each question

                int questionCounter = Integer.parseInt(br.readLine());
                //read the total number of selections of this question

                String[] selections = new String[questionCounter];
                //initiate an Array to store all of the selection contents of length questionCounter
                int correctSelection;

                for (int j = 0; j < questionCounter; j++) {
                    char index = (char) (j + 65);
                    selections[j] = index + ". " + br.readLine();
                    //read the content of each selection
                }

                correctSelection = Integer.parseInt(br.readLine());
                //read the correct selection

                questions.add(new Question(content, selections, correctSelection));
                //add a Question with attributes of content, selections and correctSelection to the ArrayList questions
            }

            br.close();
            return questions;

        } catch (IOException e) {

            System.out.println("Error: " + e.toString());
            //print the error
        }

        return null;
        //return null at the end
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beginQuizButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel lisAndButtonPanel;
    private javax.swing.JTextArea noteContentTextArea;
    private javax.swing.JPanel textareaPanel;
    private javax.swing.JScrollPane textareaScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JList<String> topicList;
    private javax.swing.JLabel topicListNameLabel;
    private javax.swing.JLabel topicTitleLabel;
    // End of variables declaration//GEN-END:variables

}

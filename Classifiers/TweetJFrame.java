/*
 * RUN THIS FILE FOR GUI
 */


package Classifiers;

import org.jfree.ui.RefineryUtilities;

import DataPreprocessing.DataPreprocessingDriver;

/**
 *
 * @author Saurav
 */
public class TweetJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TweetJFrame
     */
    public TweetJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        runSvmButton = new javax.swing.JButton();
        runNbButton = new javax.swing.JButton();
        runRuleButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        resultField = new javax.swing.JTextField();
        showChart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tweet Classifier");

        inputArea.setColumns(20);
        inputArea.setRows(5);
        jScrollPane1.setViewportView(inputArea);

        runSvmButton.setText("SVM");
        runSvmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runSvmButtonActionPerformed(evt);
            }
        });

        runNbButton.setText("Naive");
        runNbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runNbButtonActionPerformed(evt);
            }
        });

        runRuleButton.setText("Rule");
        runRuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	runRuleButtonActionPerformed(evt);
            }
        });
        
        jLabel3.setText("Algorithm");

        jLabel4.setText("Result");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        resultField.setEditable(false);
        resultField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultFieldActionPerformed(evt);
            }
        });

        showChart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        showChart.setText("View Accuracy Chart");
        showChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clearButton)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(runSvmButton)))
                        .addGap(6, 6, 6)
                        .addComponent(runNbButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runRuleButton)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(showChart)
                .addGap(220, 220, 220))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(jLabel3)
                    .addComponent(runSvmButton)
                    .addComponent(runNbButton)
                    .addComponent(runRuleButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addComponent(showChart)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runSvmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runSvmButtonActionPerformed
        // TODO add your handling code here:
        input = inputArea.getText();
        input = DataPreprocessingDriver.cleanString(input);
        if (input.isEmpty()) {
            resultField.setText("Input is empty.");
            return;
        }
        svm.inputString(input);
        svm.makeInstance();
        resultField.setText(svm.predictValue());
    }//GEN-LAST:event_runSvmButtonActionPerformed

    private void resultFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultFieldActionPerformed

    private void runNbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runNbButtonActionPerformed
        // TODO add your handling code here:
        input = inputArea.getText();
        input = DataPreprocessingDriver.cleanString(input);
        if (input.isEmpty()) {
            resultField.setText("Input is empty.");
            return;
        }
        nb.inputString(input);
        nb.makeInstance();
        resultField.setText(nb.predictValue());
    }//GEN-LAST:event_runNbButtonActionPerformed

    private void runRuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runNbButtonActionPerformed
        // TODO add your handling code here:
        input = inputArea.getText();
        input = DataPreprocessingDriver.cleanString(input);
        if (input.isEmpty()) {
            resultField.setText("Input is empty.");
            return;
        }
        
        resultField.setText(rbc.predict(input));
    }
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        inputArea.setText("");
        resultField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void showChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showChartActionPerformed
        // TODO add your handling code here:
        BarChart_AWT chart = new BarChart_AWT("Tweet Classifier Statistics",
                "Accuracy");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }//GEN-LAST:event_showChartActionPerformed

    public static void initialize() {
        nb = new NaiveBayesClassifier();
        nb.loadModel("FeatureExtraction\\nbModel.arff");
        svm = new SVMClassifier();
        svm.loadModel("FeatureExtraction\\svmModel.arff");
        rbc = new RuleBasedClassifier();
        rbc.initialize();
		rbc.makeModel();
		rbc.loadModel();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        initialize();
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
            java.util.logging.Logger.getLogger(TweetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TweetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TweetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TweetJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TweetJFrame().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea inputArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton runNbButton;
    private javax.swing.JButton runRuleButton;
    private javax.swing.JButton runSvmButton;
    private javax.swing.JButton showChart;
    // End of variables declaration//GEN-END:variables
    String input;
    static NaiveBayesClassifier nb = null;
    static SVMClassifier svm = null;
    static RuleBasedClassifier rbc = null;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomial;

import java.util.StringTokenizer;

/**
 *
 * @author jainil
 */



class Term
{

    public float coef;
    public int exp;
    Term sum(Term t2)
    {
        Term t3=new Term();
        t3.coef= coef+t2.coef;
        return t3;
    }
    Term sub(Term t2)
    {
        Term t3=new Term();
        t3.coef= coef-t2.coef;
        return t3;
    }
    Term mul(Term t2)
    {
        Term t3=new Term();
        t3.coef= coef*t2.coef;
        t3.exp= exp+t2.exp;
        return t3;
    }
}
class Polynomial
{

    public int d;
    public Term t[];

    Polynomial(int s)
    {
        d=s;

        t=new Term[d+1];
        for(int i=s;i>=0;i--)
        {
            t[i]=new Term();
            t[i].exp=i;
            t[i].coef=0;
        }
    }
    void getdata(float b[]) {

        for (int i = d; i >= 0; i--) {

            t[i].coef =  b[i];

        }
    }
    String putdata()
    {
        String c="";
        for(int i= d;i>=0;i--)
        {
            c=c+this.t[i].coef+"x^"+ i;

            if(i>0)
            {
                c=c+" + ";
            }
        }
        return c;
    }

    Polynomial sum(Polynomial p2)
    {
        int q;
        if( d>p2.d)
        {
            q= d;
        }
        else
        {
            q=p2.d;
        }
        Polynomial p3=new Polynomial(q);
        if( d>p2.d)
        {
            for(int i=q;i>=q-p2.d-1;i--)
            {
                p3.t[i].coef= t[i].coef;
            }
            for(int i=p2.d;i>=0;i--)
            {
                p3.t[i].coef= t[i].coef+p2.t[i].coef;
            }
        }
        else
        {
            for(int i=q;i>=d;i--)
            {
                p3.t[i].coef=p2.t[i].coef;
            }
            for(int i=d;i>=0;i--)
            {
                p3.t[i].coef= t[i].coef+p2.t[i].coef;
            }
        }
        return p3;
    }

    Polynomial sub(Polynomial p2)
    {
        int q;
        if(d>p2.d)
        {
            q=d;
        }
        else
        {
            q=p2.d;
        }
        Polynomial p3=new Polynomial(q);
        if( d>p2.d)
        {
            for(int i=q;i>=q-p2.d-1;i--)
            {
                p3.t[i].coef= t[i].coef;
            }
            for(int i=p2.d;i>=0;i--)
            {
                p3.t[i].coef= t[i].coef-p2.t[i].coef;
            }
        }
        else
        {
            for(int i=q;i>=d;i--)
            {
                p3.t[i].coef=p2.t[i].coef;
            }
            for(int i=d;i>=0;i--)
            {
                p3.t[i].coef= t[i].coef-p2.t[i].coef;
            }
        }
        return p3;

    }

    Polynomial mul(Polynomial p2)
    {
        int x;
        x= d+p2.d;
        Polynomial p3=new Polynomial(x);
        for(int i= d;i>=0;i--)
        {
            for(int j=p2.d;j>=0;j--)
            {
                p3.t[i+j]=p3.t[i+j].sum( t[i].mul(p2.t[j]));
            }

        }
        return p3;
    }


    Polynomial div(Polynomial p2)
    {
        Polynomial p3=new Polynomial(p2.d-d);
        Polynomial p4=new Polynomial(p2.d-1);
        int i=p2.d;
        for(int j=p2.d-d+1;j>0;j--)
        {
            float f=p2.t[i].coef/t[d].coef;
            p3.t[j-1].coef=f;
            p4.t[j-1].coef=f;
            p2=p2.sub(this.mul(p4));
            p4.t[j-1].coef=0;
            i--;
        }
        return p3;
    }


    Polynomial remainder(Polynomial p2)
    {
        Polynomial p3=new Polynomial(p2.d-d);
        Polynomial p4=new Polynomial(p2.d-1);
        int i=p2.d;
        for(int j=p2.d-d+1;j>0;j--)
        {
            float f=p2.t[i].coef/t[d].coef;
            p3.t[j-1].coef=f;
            p4.t[j-1].coef=f;
            p2=p2.sub(this.mul(p4));
            p4.t[j-1].coef=0;
            i--;
        }
        return p2;
    }
    Polynomial div1(Polynomial p2)
    {
        Polynomial p3=new Polynomial(p2.d-d);
        int i=p2.d;
        for(int j=p2.d-d+1;j>0;j--)
        {
            float f=p2.t[i].coef/t[d].coef;
            p3.t[j-1].coef=f;
            i--;
        }
        return p3;
    }

}



public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Solve Polynomial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("multiplication is:");

        jLabel2.setText("addition is");

        jLabel3.setText("Subtraction is");

        jLabel4.setText("Division is");

        jLabel5.setText("Remainder is");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jTextField2)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane3)
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane5)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(664, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(619, 619, 619))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        String a;
        String b;
        

        a = jTextField1.getText().toString();
        b = jTextField2.getText().toString();
        StringTokenizer tt = new StringTokenizer(a);
        StringTokenizer ttt = new StringTokenizer(b);
        int dd = tt.countTokens();
        int ee = ttt.countTokens();
        float f[] = new float[dd];
        float g[] = new float[ee];
        int i = tt.countTokens()-1;
        while (tt.hasMoreTokens()) {
            f[i] = Float.parseFloat(tt.nextToken());
            i--;
        }
        i = ttt.countTokens()-1;
        while (ttt.hasMoreTokens()) {
            g[i] = Float.parseFloat(ttt.nextToken());
            i--;
        }
        Polynomial p1 = new Polynomial(dd - 1);
        Polynomial p2 = new Polynomial(ee - 1);
        p1.getdata(f);
        p2.getdata(g);
        jTextArea1.setText(p1.mul(p2).putdata());
        jTextArea2.setText(p1.sum(p2).putdata());
        jTextArea3.setText(p1.sub(p2).putdata());
        if(p1.d==0)
        {
            
            jTextArea4.setText(p1.div1(p2).putdata());
            jTextArea5.setText(new Polynomial(p2.d).putdata());
        }
        else if(p2.d==0)
        {
            
            jTextArea4.setText(p2.div1(p1).putdata());
            jTextArea5.setText(new Polynomial(p1.d).putdata());
        }
        else if(p1.d<p2.d)
        {
           
        jTextArea4.setText(p1.div(p2).putdata());
        jTextArea5.setText(p1.remainder(p2).putdata());
        }
        else
        {
           
            jTextArea4.setText(p2.div(p1).putdata());
            jTextArea5.setText(p2.remainder(p1).putdata());
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
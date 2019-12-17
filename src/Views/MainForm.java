/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Conteudo;
import Models.MediaCenter;
import Models.PlayerStatus;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JFileChooser;

/**
 *
 * @author Pedro Gomes
 */
public class MainForm extends javax.swing.JFrame {
    int i = 0;
    /**
     * Creates new form MainMenu
     */
    public MainForm() {
        
        initComponents();
        loadUser();
        new backgroundUpdater(progressBar).execute();
        
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
        utilizadorLabel = new javax.swing.JLabel();
        myContentButton = new javax.swing.JButton();
        downloadButton = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        friendsListButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        artistaLabel = new javax.swing.JLabel();
        albumLabel = new javax.swing.JLabel();
        tempoLabel = new javax.swing.JLabel();
        categoriaLabel = new javax.swing.JLabel();
        musicPannel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        musicNameLabel = new javax.swing.JLabel();
        compositorLabel = new javax.swing.JLabel();
        skipBackButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        skipFwdButton = new javax.swing.JButton();
        soundVolumeButton = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(67, 104, 145));

        utilizadorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        utilizadorLabel.setText("Utilizador:");

        myContentButton.setBackground(new java.awt.Color(67, 104, 145));
        myContentButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myContentButton.setText("Meu Conteudo");
        myContentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        myContentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myContentButtonActionPerformed(evt);
            }
        });

        downloadButton.setBackground(new java.awt.Color(67, 104, 145));
        downloadButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        downloadButton.setText("Download Conteudo");
        downloadButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        uploadButton.setBackground(new java.awt.Color(67, 104, 145));
        uploadButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uploadButton.setText("Upload Conteudo");
        uploadButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        friendsListButton.setBackground(new java.awt.Color(67, 104, 145));
        friendsListButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        friendsListButton.setText("Ver lista de amigos");
        friendsListButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(downloadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(utilizadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myContentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(friendsListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(myContentButton)
                .addGap(34, 34, 34)
                .addComponent(downloadButton)
                .addGap(38, 38, 38)
                .addComponent(uploadButton)
                .addGap(40, 40, 40)
                .addComponent(friendsListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(utilizadorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(67, 104, 145));

        jPanel4.setBackground(new java.awt.Color(54, 82, 114));

        tituloLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tituloLabel.setText("Titulo");

        artistaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        artistaLabel.setText("Artista");

        albumLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        albumLabel.setText("Album");

        tempoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tempoLabel.setText("Tempo");

        categoriaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        categoriaLabel.setText("Categoria");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artistaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoriaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(artistaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(albumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(categoriaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        musicPannel.setBackground(new java.awt.Color(47, 72, 100));

        javax.swing.GroupLayout musicPannelLayout = new javax.swing.GroupLayout(musicPannel);
        musicPannel.setLayout(musicPannelLayout);
        musicPannelLayout.setHorizontalGroup(
            musicPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        musicPannelLayout.setVerticalGroup(
            musicPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musicPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musicPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(133, 136, 139));

        musicNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        musicNameLabel.setText("Nome da Musica");

        compositorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        compositorLabel.setText("Compositor");

        skipBackButton.setBackground(new java.awt.Color(133, 136, 139));
        skipBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/baseline_skip_previous_black_18dp.png"))); // NOI18N
        skipBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipBackButtonActionPerformed(evt);
            }
        });

        stopButton.setBackground(new java.awt.Color(133, 136, 139));
        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/baseline_play_arrow_black_18dp.png"))); // NOI18N
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        skipFwdButton.setBackground(new java.awt.Color(133, 136, 139));
        skipFwdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/baseline_skip_next_black_18dp.png"))); // NOI18N
        skipFwdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipFwdButtonActionPerformed(evt);
            }
        });

        soundVolumeButton.setBackground(new java.awt.Color(133, 136, 139));
        soundVolumeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/baseline_volume_up_black_18dp.png"))); // NOI18N
        soundVolumeButton.setText(" ");

        progressBar.setBackground(new java.awt.Color(230, 230, 230));
        progressBar.setForeground(new java.awt.Color(47, 72, 100));
        progressBar.setToolTipText("");
        progressBar.setValue(50);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(compositorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(musicNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(skipBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(skipFwdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(soundVolumeButton)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(soundVolumeButton)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(musicNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(compositorLabel))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(skipBackButton)
                                .addComponent(stopButton)
                                .addComponent(skipFwdButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myContentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                                                                   

  
    
    public void loadUser(){
        MediaCenter mc = MediaCenter.getInstance();
        String nome = mc.getUser().getNome();
        this.utilizadorLabel.setText("Utilizador: "+nome);
        mc.readANDinit();
        updateMetaData();
    }
    
    
    public void updateMetaData(){
        MediaCenter mc = MediaCenter.getInstance();
        Conteudo tmp = mc.getCurrentContent();
        if(tmp != null) {
            this.musicNameLabel.setText(tmp.getNome());
            this.compositorLabel.setText(tmp.getArtista());
        }
        /*String[] prt = mc.getCurrentMusic();
        if(prt != null){
            this.musicNameLabel.setText(prt[1]);
            this.compositorLabel.setText(prt[0]);
        } */
    }
    
    
    
    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
       MediaCenter mc = MediaCenter.getInstance();
       if(mc.getPlayListSize() == 0)return;
       if(mc.getStatus() != PlayerStatus.PLAYING ){
           mc.play();
           this.stopButton.setIcon(new javax.swing.ImageIcon("src/Icons/baseline_stop_black_18dp.png"));
       
       }else {
           mc.pause();
           this.stopButton.setIcon(new javax.swing.ImageIcon("src/Icons/baseline_play_arrow_black_18dp.png"));
       }
       
       
    }//GEN-LAST:event_stopButtonActionPerformed

    private void skipFwdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipFwdButtonActionPerformed
        MediaCenter mc = MediaCenter.getInstance();
        if(mc.getPlayListSize() == 0)return;
        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/baseline_play_arrow_black_18dp.png")));
        mc.skip_next_song();
        updateMetaData();
        
    }//GEN-LAST:event_skipFwdButtonActionPerformed

    private void skipBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipBackButtonActionPerformed
        MediaCenter mc = MediaCenter.getInstance();
        if(mc.getPlayListSize() == 0)return;
        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/baseline_play_arrow_black_18dp.png")));
        mc.skip_previous_song();
        updateMetaData();
    }//GEN-LAST:event_skipBackButtonActionPerformed

    
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        MediaCenter mc = MediaCenter.getInstance();
        JFileChooser jfc = new JFileChooser();
        if(jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File f = jfc.getSelectedFile();
            
            System.out.println();
            try{    
                Files.move(Paths.get(f.getPath()),Paths.get("Conteudo/" +f.getName())); 
                mc.addFile(new File("Conteudo/"+f.getName()));
                if(mc.getPlayListSize() == 1){
                    this.updateMetaData();
                }
            
            }catch(IOException e){
                System.out.println("ERRO A COPIAR FICHEIRO");
            }
        }
        
     
        
    }//GEN-LAST:event_uploadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel albumLabel;
    private javax.swing.JLabel artistaLabel;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel compositorLabel;
    private javax.swing.JButton downloadButton;
    private javax.swing.JButton friendsListButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel musicNameLabel;
    private javax.swing.JPanel musicPannel;
    private javax.swing.JButton myContentButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton skipBackButton;
    private javax.swing.JButton skipFwdButton;
    private javax.swing.JButton soundVolumeButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel tempoLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel utilizadorLabel;
    // End of variables declaration//GEN-END:variables
}
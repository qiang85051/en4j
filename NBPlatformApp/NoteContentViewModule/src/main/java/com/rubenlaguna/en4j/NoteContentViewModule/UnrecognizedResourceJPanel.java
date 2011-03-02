/*
 *  Copyright (C) 2010 Ruben Laguna <ruben.laguna@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.rubenlaguna.en4j.NoteContentViewModule;

import com.rubenlaguna.en4j.noteinterface.Resource;
import org.apache.commons.io.FilenameUtils;
import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.SwingWorker;
import org.openide.util.Exceptions;

/**
 *
 * @author ecerulm
 */
public class UnrecognizedResourceJPanel extends javax.swing.JPanel {

    private Resource resource = null;

    /** Creates new form UnrecognizedResourceJPanel */
    public UnrecognizedResourceJPanel() {
        initComponents();
    }

    UnrecognizedResourceJPanel(Resource resource) {
        this();
        this.resource = resource;
        if (null != resource) {
            setFilename(resource.getFilename());
            setMime(resource.getMime());
            setFilesize(resource.getDataLength());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filenameJLabel = new javax.swing.JLabel();
        mimeJLabel = new javax.swing.JLabel();
        filesizeJLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel12.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.jLabel12.text")); // NOI18N

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rubenlaguna/en4j/NoteContentViewModule/unknown-icon.png"))); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.jLabel4.text")); // NOI18N

        filenameJLabel.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.filenameJLabel.text")); // NOI18N

        mimeJLabel.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.mimeJLabel.text")); // NOI18N

        filesizeJLabel.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.filesizeJLabel.text")); // NOI18N

        jButton1.setText(org.openide.util.NbBundle.getMessage(UnrecognizedResourceJPanel.class, "UnrecognizedResourceJPanel.jButton1.text")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filesizeJLabel)
                            .addComponent(filenameJLabel)
                            .addComponent(mimeJLabel)))
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(filenameJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mimeJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(filesizeJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        new SwingWorker<Void, Void>() {

            @Override
            protected Void doInBackground() throws Exception {
                try {
                    //get temp dir
                    //save resource to tmp file
                    String extension = FilenameUtils.getExtension(resource.getFilename());
                    File tempFile = File.createTempFile("en4j", "." + extension);
                    tempFile.deleteOnExit();
                    OutputStream os = new BufferedOutputStream(new FileOutputStream(tempFile));
                    InputStream is = resource.getDataAsInputStream();
                    // Transfer bytes from in to out
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = is.read(buf)) > 0) {
                        os.write(buf, 0, len);
                    }
                    is.close();
                    os.close();
                    Desktop dt = Desktop.getDesktop();
                    dt.open(tempFile);
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
                return null;
            }
        }.execute();
        // desktop api to open file

    }//GEN-LAST:event_jButton1MouseReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel filenameJLabel;
    private javax.swing.JLabel filesizeJLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mimeJLabel;
    // End of variables declaration//GEN-END:variables

    void setFilename(String filename) {
        if (filename == null) {
            filenameJLabel.setText("[no name]");
        } else {
            filenameJLabel.setText(filename);
        }
    }

    void setMime(String mime) {
        mimeJLabel.setText(mime);
    }

    void setFilesize(int length) {
        filesizeJLabel.setText(new Integer(length).toString() + " bytes");
    }
}
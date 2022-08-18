/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlrp.ui;

import com.qlrp.dao.QLNVDAO;
import com.qlrp.entity.NHANVIEN;
import com.qlrp.utils.XImage;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HAN-PC
 */
public class SendMail extends javax.swing.JFrame {

    /**
     * Creates new form SentMail
     */
    List<NHANVIEN> listNV = null;
    QLNVDAO qlnvdao = new QLNVDAO();
    File file = new File("");
    String duongdan = file.getAbsolutePath() + "\\src\\Icons\\App\\iconframe.png";
    String linkfile = "";
    String duongdananh = "";

    public SendMail() {
        initComponents();

        this.setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        File f = new File("");
        try {
            String duongdanBanner = "\\src\\main\\resources\\com\\qlrp\\image\\sendmail\\image\\";
            lbl_Image.setIcon(XImage.ResizeImage(lbl_Image.getWidth(), lbl_Image.getHeight(), f.getAbsolutePath() + duongdanBanner + "image-default.jpg"));
        } catch (Exception e) {
        }
        listNV  = qlnvdao.selectAll();
        if(listNV != null){
            fillToListMail(listNV);
        }
        setPlaceHolder(txt_searchMail, "Nhập để tìm mail...");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Gmail = new javax.swing.JTextField();
        txt_Subject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_To = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Message = new javax.swing.JTextArea();
        txt_LinkFile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_ChonFile = new javax.swing.JButton();
        btn_Sending = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        lbl_Image = new javax.swing.JLabel();
        btn_ChonFile1 = new javax.swing.JButton();
        btn_ChonFile2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lst_ListMail = new javax.swing.JList<>();
        btn_ChonAllMail = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_QLNV_Search = new javax.swing.JButton();
        txt_searchMail = new javax.swing.JTextField();

        setTitle("GỬI MAIL");

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("NỘI DUNG:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("ĐẾN:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("TÀI KHOẢN:");

        txt_Gmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_Gmail.setMargin(new java.awt.Insets(2, 10, 2, 6));

        txt_Subject.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_Subject.setMargin(new java.awt.Insets(2, 10, 2, 6));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("TIÊU ĐỀ:");

        txt_To.setColumns(20);
        txt_To.setLineWrap(true);
        txt_To.setRows(5);
        jScrollPane1.setViewportView(txt_To);

        txt_Message.setColumns(20);
        txt_Message.setRows(5);
        jScrollPane2.setViewportView(txt_Message);

        txt_LinkFile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_LinkFile.setMargin(new java.awt.Insets(2, 10, 2, 6));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("ĐƯỜNG DẪN:");

        btn_ChonFile.setText("CHỌN FILE");
        btn_ChonFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ChonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonFileActionPerformed(evt);
            }
        });

        btn_Sending.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Sending.setText("GỬI MAIL");
        btn_Sending.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Sending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SendingActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("MẬT KHẨU:");

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_Password.setMargin(new java.awt.Insets(2, 10, 2, 6));

        lbl_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ImageMouseClicked(evt);
            }
        });

        btn_ChonFile1.setText("CHỌN ẢNH");
        btn_ChonFile1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ChonFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonFile1ActionPerformed(evt);
            }
        });

        btn_ChonFile2.setText("HỦY CHỌN ẢNH");
        btn_ChonFile2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ChonFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonFile2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("CHỌN GMAIL:");

        Lst_ListMail.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Lst_ListMail.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Lst_ListMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lst_ListMailMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Lst_ListMail);

        btn_ChonAllMail.setText("CHỌN TẤT CẢ");
        btn_ChonAllMail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ChonAllMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonAllMailActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_QLNV_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlrp/icon/Employee/loupe.png"))); // NOI18N
        btn_QLNV_Search.setContentAreaFilled(false);
        btn_QLNV_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_QLNV_Search.setFocusPainted(false);
        btn_QLNV_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLNV_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_QLNV_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 50, 50));

        txt_searchMail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_searchMail.setMargin(new java.awt.Insets(2, 6, 2, 50));
        txt_searchMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchMailKeyReleased(evt);
            }
        });
        jPanel1.add(txt_searchMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 232, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Subject)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Password, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_ChonAllMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(txt_Gmail, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(btn_ChonFile1)
                                .addGap(40, 40, 40)
                                .addComponent(btn_ChonFile2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txt_LinkFile, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ChonFile)))))
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(btn_Sending, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btn_ChonAllMail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ChonFile1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ChonFile2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_LinkFile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(btn_ChonFile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(btn_Sending, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillToListMail(List<NHANVIEN> listNV) {
        Lst_ListMail.removeAll();
        DefaultListModel model = new DefaultListModel<>();

        for (NHANVIEN nv : listNV) {
            model.addElement(nv.getEMAIL());
        }
        Lst_ListMail.setModel(model);
    }

    private void setPlaceHolder(JTextField searchText, String text) {
        searchText.setText(text);
        searchText.setForeground(Color.GRAY);
        searchText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchText.getText().equals(text)) {
                    searchText.setText("");
                    searchText.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchText.getText().isEmpty()) {
                    searchText.setForeground(Color.GRAY);
                    searchText.setText(text);
                }
            }
        });
    }

    private void btn_SendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SendingActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
            p.put("mail.smtp.port", 587);

            //-----
            String accountName = txt_Gmail.getText();
            String accountPassword = txt_Password.getText();
            Session s = Session.getInstance(p,
                    new javax.mail.Authenticator() {
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(accountName, accountPassword);
                }
            });
            //--------

            String from = txt_Gmail.getText();
            String to = txt_To.getText();
            String subject = txt_Subject.getText();
            String body = txt_Message.getText();
            MimeMessage message = new MimeMessage(s);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);

            // Phan 1 gom doan tin nhan
            Multipart multipart = new MimeMultipart();
            BodyPart messageBodyPart1 = new MimeBodyPart();
            messageBodyPart1.setText(body);
            multipart.addBodyPart(messageBodyPart1);

            // Duong dan den file cua ban
            if (!linkfile.equals("")) {
                MimeBodyPart messageBodyPart2 = new MimeBodyPart();
                DataSource source1 = new FileDataSource(linkfile);
                messageBodyPart2.setDataHandler(new DataHandler(source1));
                messageBodyPart2.setFileName(linkfile);
                multipart.addBodyPart(messageBodyPart2);
            }

            // phan 3 chua tap tin image
            // Duong dan den file cua ban
            File f = new File("");
            String fileAnhMacDinh = f.getAbsolutePath() + "\\src\\main\\resources\\com\\qlrp\\image\\sendmail\\image\\" + "image-default.jpg";

            if (!duongdananh.equals("") && !duongdananh.equalsIgnoreCase(fileAnhMacDinh)) {
                MimeBodyPart messageBodyPart3 = new MimeBodyPart();
                DataSource source2 = new FileDataSource(duongdananh);
                messageBodyPart3.setDataHandler(new DataHandler(source2));
                messageBodyPart3.setFileName(duongdananh);
                multipart.addBodyPart(messageBodyPart3);
            }
            message.setContent(multipart);

            //-----------
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Mail Đã được gửi thành công!", "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_SendingActionPerformed

    private void btn_ChonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonFileActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser f = new JFileChooser(file.getAbsolutePath() + "\\src\\main\\resources\\com\\qlrp\\image\\sendmail\\file\\");
            f.setDialogTitle("Mở File");
            f.showOpenDialog(null);

            File link = f.getSelectedFile();
            linkfile = link.getAbsolutePath();
            txt_LinkFile.setText(linkfile);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ChonFileActionPerformed

    private void lbl_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ImageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ImageMouseClicked

    private void btn_ChonFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonFile1ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser f = new JFileChooser(file.getAbsolutePath() + "\\src\\main\\resources\\com\\qlrp\\image\\sendmail\\image\\");
            f.setDialogTitle("Mở File");
            f.showOpenDialog(null);

            File fTenAnh = f.getSelectedFile();
            duongdananh = fTenAnh.getAbsolutePath();
            if (duongdananh != null) {
                lbl_Image.setIcon(XImage.ResizeImage(lbl_Image.getWidth(), lbl_Image.getHeight(), String.valueOf(duongdananh)));
                System.out.println(duongdananh);
            } else {
                System.out.println("Bạn chưa chọn ảnh");
            }
        } catch (Exception e) {
            System.out.println("Chưa chọn ảnh");
            System.out.println(duongdananh);
        }
    }//GEN-LAST:event_btn_ChonFile1ActionPerformed

    private void btn_ChonFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonFile2ActionPerformed
        // TODO add your handling code here:
        duongdananh = "";
        File f = new File("");
        try {
            String duongdanBanner = "\\src\\main\\resources\\com\\qlrp\\image\\sendmail\\image\\";
            lbl_Image.setIcon(XImage.ResizeImage(lbl_Image.getWidth(), lbl_Image.getHeight(), f.getAbsolutePath() + duongdanBanner + "image-default.jpg"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_ChonFile2ActionPerformed

    private void btn_ChonAllMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonAllMailActionPerformed
        // TODO add your handling code here:
        QLNVDAO qlnvdao = new QLNVDAO();
        listNV = qlnvdao.selectAll();
        if (listNV != null) {
            txt_To.setText("");
            for (NHANVIEN nhanvien : listNV) {
                if (txt_To.getText().equals("")) {
                    txt_To.setText(nhanvien.getEMAIL());
                } else {
                    String to = txt_To.getText();
                    to += ", " + nhanvien.getEMAIL();
                    txt_To.setText(to);
                }
            }
        }

    }//GEN-LAST:event_btn_ChonAllMailActionPerformed

    private void fillListToDen() {
        if (row != -1) {
            if (txt_To.getText().equals("")) {
                txt_To.setText(listNV.get(row).getEMAIL());
            } else {
                String to = txt_To.getText();
                to += ", " + listNV.get(row).getEMAIL();
                txt_To.setText(to);
            }
        }
    }

    int row = -1;
    private void Lst_ListMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lst_ListMailMouseClicked
        // TODO add your handling code here:
        row = Lst_ListMail.getSelectedIndex();
        fillListToDen();
    }//GEN-LAST:event_Lst_ListMailMouseClicked

    private void txt_searchMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchMailKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_searchMailKeyReleased

    private void btn_QLNV_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLNV_SearchActionPerformed
        // TODO add your handling code here:
        if(!txt_searchMail.getText().equals("")) {
            listNV = qlnvdao.searchEmail(txt_searchMail.getText());
            if(listNV != null) {
                fillToListMail(listNV);
            } else {
                JOptionPane.showMessageDialog(this, "KHÔNG CÓ KẾT QUẢ", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
                listNV = qlnvdao.selectAll();
                if(listNV != null) {
                    fillToListMail(listNV);
                }
            }
        }
    }//GEN-LAST:event_btn_QLNV_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lst_ListMail;
    private javax.swing.JButton btn_ChonAllMail;
    private javax.swing.JButton btn_ChonFile;
    private javax.swing.JButton btn_ChonFile1;
    private javax.swing.JButton btn_ChonFile2;
    private javax.swing.JButton btn_QLNV_Search;
    private javax.swing.JButton btn_Sending;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Image;
    private javax.swing.JTextField txt_Gmail;
    private javax.swing.JTextField txt_LinkFile;
    private javax.swing.JTextArea txt_Message;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Subject;
    private javax.swing.JTextArea txt_To;
    private javax.swing.JTextField txt_searchMail;
    // End of variables declaration//GEN-END:variables
}

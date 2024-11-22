package View;

import Controller.BookController;
import Model.Author;
import Model.Book;
import Model.Book_Category;
import View.Components.Table.TableActionCellEditor;
import View.Components.Table.TableActionCellRender;
import View.Components.Table.TableActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu2Form extends javax.swing.JPanel {

    private BookController bc = new BookController();

    public Menu2Form() {
        initComponents();
        bc.AuthorAndCategoryListShow(comBookAName, comCategory);
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                if (tblBookTable.isEditing()) {
                    tblBookTable.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) tblBookTable.getModel();
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        tblBookTable.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        tblBookTable.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sPnlBookBackground = new javax.swing.JScrollPane();
        tPnlBooks = new View.Components.TabbedPaneCustom.TabbedPaneCustom();
        tPnlBadd = new java.awt.Panel();
        pnlBookBackground = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtpublishYear = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        comBookAName = new javax.swing.JComboBox<>();
        lbl3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();
        comCategory = new javax.swing.JComboBox<>();
        lbl5 = new javax.swing.JLabel();
        txtImagePath = new javax.swing.JTextField();
        btnImgBwser = new View.Components.ButtonCustom.CustomButton();
        btnClearB = new View.Components.ButtonCustom.CustomButton();
        btnSaveB = new View.Components.ButtonCustom.CustomButton();
        pnlCategorybackground = new java.awt.Panel();
        txtICategoryName = new javax.swing.JTextField();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnClearC = new View.Components.ButtonCustom.CustomButton();
        btnSaveC = new View.Components.ButtonCustom.CustomButton();
        pnlAuthorBackground = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        txtAuthorEmail = new javax.swing.JTextField();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        btnSaveA = new View.Components.ButtonCustom.CustomButton();
        btnClearA = new View.Components.ButtonCustom.CustomButton();
        tPnlBupdate = new java.awt.Panel();
        spnlBookBackground = new javax.swing.JScrollPane();
        tblBookTable = new javax.swing.JTable();
        tPnlBdelete = new java.awt.Panel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Books Collection");

        sPnlBookBackground.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tPnlBooks.setBackground(new java.awt.Color(255, 255, 255));
        tPnlBooks.setForeground(new java.awt.Color(255, 255, 255));
        tPnlBooks.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N

        tPnlBadd.setFont(new java.awt.Font("Dubai", 3, 15)); // NOI18N
        tPnlBadd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New Book Add");

        lbl.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl.setForeground(new java.awt.Color(102, 102, 102));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl.setText("Book Title");
        lbl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        txtTitle.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        txtpublishYear.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtpublishYear.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        lbl1.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(102, 102, 102));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl1.setText("Publish Year");
        lbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        lbl2.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(102, 102, 102));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl2.setText("Author Name");
        lbl2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        comBookAName.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        lbl3.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl3.setForeground(new java.awt.Color(102, 102, 102));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl3.setText("Quantity");
        lbl3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        txtQuantity.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        lbl4.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl4.setForeground(new java.awt.Color(102, 102, 102));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl4.setText("Book Category");
        lbl4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        comCategory.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        lbl5.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl5.setForeground(new java.awt.Color(102, 102, 102));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl5.setText("Image");
        lbl5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        txtImagePath.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtImagePath.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        btnImgBwser.setBackground(new java.awt.Color(51, 0, 153));
        btnImgBwser.setForeground(new java.awt.Color(255, 255, 255));
        btnImgBwser.setText("Bowser");
        btnImgBwser.setBorderColor(new java.awt.Color(0, 0, 51));
        btnImgBwser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        btnImgBwser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgBwserActionPerformed(evt);
            }
        });

        btnClearB.setBackground(new java.awt.Color(0, 0, 102));
        btnClearB.setForeground(new java.awt.Color(255, 255, 255));
        btnClearB.setText("Clear");
        btnClearB.setBorderColor(new java.awt.Color(255, 255, 51));
        btnClearB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearBActionPerformed(evt);
            }
        });

        btnSaveB.setBackground(new java.awt.Color(0, 0, 102));
        btnSaveB.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveB.setText("Save");
        btnSaveB.setBorderColor(new java.awt.Color(255, 255, 51));
        btnSaveB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSaveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBookBackgroundLayout = new javax.swing.GroupLayout(pnlBookBackground);
        pnlBookBackground.setLayout(pnlBookBackgroundLayout);
        pnlBookBackgroundLayout.setHorizontalGroup(
            pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(173, 173, 173))
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTitle))
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtpublishYear))
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(comBookAName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtQuantity))
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(comCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookBackgroundLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtImagePath))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBookBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImgBwser, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addComponent(btnClearB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBookBackgroundLayout.setVerticalGroup(
            pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookBackgroundLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpublishYear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(comBookAName))
                .addGap(12, 12, 12)
                .addGroup(pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(comCategory))
                .addGap(12, 12, 12)
                .addGroup(pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImgBwser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(pnlBookBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tPnlBadd.add(pnlBookBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 570, 420));

        txtICategoryName.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtICategoryName.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        lbl6.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl6.setForeground(new java.awt.Color(102, 102, 102));
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl6.setText("Category Name");
        lbl6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        lbl7.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl7.setForeground(new java.awt.Color(102, 102, 102));
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl7.setText("Description");
        lbl7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        txtDescription.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtDescription.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Book Category");

        btnClearC.setBackground(new java.awt.Color(0, 0, 102));
        btnClearC.setForeground(new java.awt.Color(255, 255, 255));
        btnClearC.setText("Clear");
        btnClearC.setBorderColor(new java.awt.Color(255, 255, 51));
        btnClearC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnClearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCActionPerformed(evt);
            }
        });

        btnSaveC.setBackground(new java.awt.Color(0, 0, 102));
        btnSaveC.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveC.setText("Save");
        btnSaveC.setBorderColor(new java.awt.Color(255, 255, 51));
        btnSaveC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSaveC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCategorybackgroundLayout = new javax.swing.GroupLayout(pnlCategorybackground);
        pnlCategorybackground.setLayout(pnlCategorybackgroundLayout);
        pnlCategorybackgroundLayout.setHorizontalGroup(
            pnlCategorybackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategorybackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCategorybackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCategorybackgroundLayout.createSequentialGroup()
                        .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtICategoryName))
                    .addGroup(pnlCategorybackgroundLayout.createSequentialGroup()
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCategorybackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClearC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlCategorybackgroundLayout.setVerticalGroup(
            pnlCategorybackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategorybackgroundLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(pnlCategorybackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtICategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCategorybackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(pnlCategorybackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tPnlBadd.add(pnlCategorybackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 570, 170));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Author");

        txtAuthorEmail.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtAuthorEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        lbl8.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl8.setForeground(new java.awt.Color(102, 102, 102));
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl8.setText("Author Name");
        lbl8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        lbl9.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        lbl9.setForeground(new java.awt.Color(102, 102, 102));
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl9.setText("Email");
        lbl9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));

        txtAuthorName.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtAuthorName.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 0, 0)));

        btnSaveA.setBackground(new java.awt.Color(0, 0, 102));
        btnSaveA.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveA.setText("Save");
        btnSaveA.setBorderColor(new java.awt.Color(255, 255, 51));
        btnSaveA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSaveA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAActionPerformed(evt);
            }
        });

        btnClearA.setBackground(new java.awt.Color(0, 0, 102));
        btnClearA.setForeground(new java.awt.Color(255, 255, 255));
        btnClearA.setText("Clear");
        btnClearA.setBorderColor(new java.awt.Color(255, 255, 51));
        btnClearA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnClearA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAuthorBackgroundLayout = new javax.swing.GroupLayout(pnlAuthorBackground);
        pnlAuthorBackground.setLayout(pnlAuthorBackgroundLayout);
        pnlAuthorBackgroundLayout.setHorizontalGroup(
            pnlAuthorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAuthorBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAuthorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAuthorBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlAuthorBackgroundLayout.createSequentialGroup()
                        .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtAuthorEmail))
                    .addGroup(pnlAuthorBackgroundLayout.createSequentialGroup()
                        .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txtAuthorName))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAuthorBackgroundLayout.createSequentialGroup()
                .addGap(0, 306, Short.MAX_VALUE)
                .addComponent(btnClearA, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveA, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAuthorBackgroundLayout.setVerticalGroup(
            pnlAuthorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAuthorBackgroundLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAuthorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAuthorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAuthorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(pnlAuthorBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tPnlBadd.add(pnlAuthorBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 560, 210));

        tPnlBooks.addTab("Add", tPnlBadd);

        tPnlBupdate.setFont(new java.awt.Font("Dubai", 3, 15)); // NOI18N

        tblBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book Id", "Title", "Author Name", "Category Name", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBookTable.setRowHeight(40);
        tblBookTable.setSelectionBackground(new java.awt.Color(0, 204, 153));
        spnlBookBackground.setViewportView(tblBookTable);

        javax.swing.GroupLayout tPnlBupdateLayout = new javax.swing.GroupLayout(tPnlBupdate);
        tPnlBupdate.setLayout(tPnlBupdateLayout);
        tPnlBupdateLayout.setHorizontalGroup(
            tPnlBupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnlBookBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        tPnlBupdateLayout.setVerticalGroup(
            tPnlBupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnlBookBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );

        tPnlBooks.addTab("Update", tPnlBupdate);

        tPnlBdelete.setFont(new java.awt.Font("Dubai", 3, 15)); // NOI18N

        javax.swing.GroupLayout tPnlBdeleteLayout = new javax.swing.GroupLayout(tPnlBdelete);
        tPnlBdelete.setLayout(tPnlBdeleteLayout);
        tPnlBdeleteLayout.setHorizontalGroup(
            tPnlBdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        tPnlBdeleteLayout.setVerticalGroup(
            tPnlBdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        tPnlBooks.addTab("Delete", tPnlBdelete);

        sPnlBookBackground.setViewportView(tPnlBooks);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sPnlBookBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sPnlBookBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAActionPerformed
        txtAuthorName.setText("");
        txtAuthorEmail.setText("");
    }//GEN-LAST:event_btnClearAActionPerformed

    private void btnClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearBActionPerformed
        txtTitle.setText("");
        txtpublishYear.setText("");
        comBookAName.setSelectedItem("");
        txtQuantity.setText("");
        comCategory.setSelectedItem("");
        txtImagePath.setText("");
    }//GEN-LAST:event_btnClearBActionPerformed

    private void btnClearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCActionPerformed
        txtICategoryName.setText("");
        txtDescription.setText("");
    }//GEN-LAST:event_btnClearCActionPerformed

    private void btnSaveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Confirm Data", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            if (txtICategoryName.equals("") || (comCategory.getSelectedItem()).equals("")) {

            } else {
                Book b1 = new Book(txtTitle.getText().trim(), txtpublishYear.getText().trim(), (String) comBookAName.getSelectedItem(), Integer.parseInt(txtQuantity.getText()), (String) comCategory.getSelectedItem(), txtImagePath.getText().trim());

                bc.add(b1);
            }
//qty int must

        }
    }//GEN-LAST:event_btnSaveBActionPerformed

    public static String findCategoryNumber(String text) {
        // Regular expression to match ACV followed by 4 digits
        String regex = "BC\\d{3}";

        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern in the input text
        Matcher matcher = pattern.matcher(text);

        // If a match is found, return the matched ID
        if (matcher.find()) {
            return matcher.group();
        }

        // Return a message if no ID is found
        return "";
    }

    public static String findAuthorID(String text) {
        // Regular expression to match ACV followed by 4 digits
        String regex = "AU\\d{3}";

        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern in the input text
        Matcher matcher = pattern.matcher(text);

        // If a match is found, return the matched ID
        if (matcher.find()) {
            return matcher.group();
        }

        // Return a message if no ID is found
        return "";
    }

    private void btnSaveCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Confirm Data", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            Book_Category c1 = new Book_Category(txtICategoryName.getText(), txtDescription.getText());
            bc.add(c1, comCategory);

        }
    }//GEN-LAST:event_btnSaveCActionPerformed

    private void btnSaveAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Confirm Data", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            Author a1 = new Author(txtAuthorName.getText(), txtAuthorEmail.getText());
            bc.add(a1, comBookAName);
        }
    }//GEN-LAST:event_btnSaveAActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btnImgBwserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgBwserActionPerformed
        txtImagePath.setText(bc.selectAndCopyImage());
    }//GEN-LAST:event_btnImgBwserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.ButtonCustom.CustomButton btnClearA;
    private View.Components.ButtonCustom.CustomButton btnClearB;
    private View.Components.ButtonCustom.CustomButton btnClearC;
    private View.Components.ButtonCustom.CustomButton btnImgBwser;
    private View.Components.ButtonCustom.CustomButton btnSaveA;
    private View.Components.ButtonCustom.CustomButton btnSaveB;
    private View.Components.ButtonCustom.CustomButton btnSaveC;
    private javax.swing.JComboBox<String> comBookAName;
    private javax.swing.JComboBox<String> comCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private java.awt.Panel pnlAuthorBackground;
    private java.awt.Panel pnlBookBackground;
    private java.awt.Panel pnlCategorybackground;
    private javax.swing.JScrollPane sPnlBookBackground;
    private javax.swing.JScrollPane spnlBookBackground;
    private java.awt.Panel tPnlBadd;
    private java.awt.Panel tPnlBdelete;
    private View.Components.TabbedPaneCustom.TabbedPaneCustom tPnlBooks;
    private java.awt.Panel tPnlBupdate;
    private javax.swing.JTable tblBookTable;
    private javax.swing.JTextField txtAuthorEmail;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtICategoryName;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtpublishYear;
    // End of variables declaration//GEN-END:variables
}

package view;

import com.itextpdf.text.BaseColor;
import model.Order;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import static com.itextpdf.text.PageSize.A5;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import static com.itextpdf.text.pdf.PdfName.I;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.Database;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Invoice extends javax.swing.JFrame {

    public Invoice() {
        initComponents();

        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();

        // Format the date and time using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

        // Set the formatted date and time to the labels
        lblDateVal.setText(dateFormat.format(currentDate));
        lblTimeVal.setText(timeFormat.format(currentDate));

    }

    public void setTotal(String total) {
        txtTotal.setText(total);
    }

    public void setName(String name) {
        txtName.setText(name);
    }

    public void setAddress(String address) {
        txtAddress.setText(address);
    }

    public void setMobile(String mobile) {
        txtTel.setText(mobile);
    }

    private void generatePDF() throws FileNotFoundException, DocumentException, IOException {
        Document document = new Document(A5);
        PdfWriter writer;

        try {

            SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String timestamp = timestampFormat.format(new Date());
            String fileName = "invoice_" + timestamp + ".pdf";
            writer = PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            URL imageFilePath = getClass().getClassLoader().getResource("view/images/userlogo.png");
            Image image = Image.getInstance(imageFilePath);

            image.scaleToFit(80, 80);
            image.setAlignment(Element.ALIGN_CENTER);

            //Add content to the document using Image object.
            document.add(image);

            // Add content to the PDF
            BaseColor redColor = BaseColor.RED;
            Paragraph head = new Paragraph("APPLE I-STORE", new Font(Font.FontFamily.TIMES_ROMAN, 40, Font.BOLD, redColor));
            head.setAlignment(Element.ALIGN_CENTER);
            document.add(head);

            Paragraph header = new Paragraph("Invoice", new Font(Font.FontFamily.TIMES_ROMAN, 30, Font.BOLD));
            header.setAlignment(Element.ALIGN_CENTER);
            document.add(header);

            Paragraph date = new Paragraph("Date: " + lblDateVal.getText(), new Font(Font.FontFamily.TIMES_ROMAN, 14));
            Paragraph time = new Paragraph("Time: " + lblTimeVal.getText(), new Font(Font.FontFamily.TIMES_ROMAN, 14));
            Paragraph name = new Paragraph("Name: " + txtName.getText(), new Font(Font.FontFamily.TIMES_ROMAN, 14));
            Paragraph address = new Paragraph("Address: " + txtAddress.getText(), new Font(Font.FontFamily.TIMES_ROMAN, 14));
            Paragraph mobile = new Paragraph("Mobile No: " + txtTel.getText(), new Font(Font.FontFamily.TIMES_ROMAN, 14));
            Paragraph total = new Paragraph("Total Amount: " + txtTotal.getText(), new Font(Font.FontFamily.TIMES_ROMAN, 14));
            name.setAlignment(Element.ALIGN_LEFT);

            date.setAlignment(Element.ALIGN_RIGHT);
            document.add(date);
            time.setAlignment(Element.ALIGN_RIGHT);
            document.add(time);
            document.add(name);
            document.add(address);
            document.add(mobile);
            document.add(total);

            // Create a table for the invoice items
            PdfPTable table = new PdfPTable(6); // 6 columns for your table
            table.setWidthPercentage(100); // Table should take up the entire width

            // Define the headers for the table
            PdfPCell cell = new PdfPCell(new Phrase("Invoice No"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Category"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Product Name"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Quantity"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Price"));
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Amount"));
            table.addCell(cell);

            // You may need to loop through your table model and add its content to the PDF here
            DefaultTableModel model = (DefaultTableModel) tblInvoice.getModel();
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    // Check if the cell value is null and replace it with an empty string if needed
                    String cellValue = model.getValueAt(row, col) != null ? model.getValueAt(row, col).toString() : "";

                    cell = new PdfPCell(new Phrase(cellValue));
                    table.addCell(cell);
                }
            }
            table.setSpacingBefore(60f);
            document.add(table);

            PdfContentByte canvas = writer.getDirectContent();
            ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("THANK YOU !!!", new Font(Font.FontFamily.TIMES_ROMAN, 30, Font.BOLD)), document.right() - document.left() / 2 - 200, document.bottom() + 30, 0);
            ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, new Phrase("COME AGAIN...", new Font(Font.FontFamily.TIMES_ROMAN, 30, Font.BOLD)), document.right() - document.left() / 2 - 100, document.bottom() + 0, 0);

            document.close();
            writer.close();
        } catch (DocumentException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    // Initialize the count to 0

    public void print(String name, String address, String mobile, int yesCount, Invoice receipt,String id,int qty) throws SQLException {

        Database d1 = new Database();
        d1.printInvoice(tblInvoice, name, address, mobile, yesCount, receipt,id,qty);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDateVal = new javax.swing.JLabel();
        lblTimeVal = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        lblThank = new javax.swing.JLabel();
        lblThank2 = new javax.swing.JLabel();
        lblHead1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHead.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        lblHead.setText("Invoice");

        lblDate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblDate.setText("Date:");

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblTime.setText("Time:");

        lblDateVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblTimeVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblName.setText("Name:");

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblAddress.setText("Address:");

        lblTel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblTel.setText("Mobile No:");

        lblTotal.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblTotal.setText("Total Amount:");

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtTel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tblInvoice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {"Total", null, null, null, null, "0"}
            },
            new String [] {
                "Invoice No", "Category", "Product_Name", "Quantity", "price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInvoice);

        btnPrint.setBackground(new java.awt.Color(0, 0, 0));
        btnPrint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 255, 0));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        lblThank.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        lblThank.setText("THANK YOU !!!");

        lblThank2.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        lblThank2.setText("COME AGAIN...");

        lblHead1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        lblHead1.setText("APPLE I-STORE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/userlogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTel)
                                        .addComponent(lblAddress)
                                        .addComponent(lblName))
                                    .addGap(41, 41, 41))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblTotal)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(lblHead)
                                    .addGap(96, 96, 96)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTime)
                                        .addComponent(lblDate))
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblDateVal, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(lblTimeVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(lblHead1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblThank)
                        .addGap(18, 18, 18)
                        .addComponent(lblThank2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblHead1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lblHead))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDateVal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDate))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTimeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTime)))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblThank)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblThank2)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

        try {
            generatePDF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        PlaceOrder order = new PlaceOrder();
        order.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnPrintActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateVal;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblHead1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblThank;
    private javax.swing.JLabel lblThank2;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeVal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblInvoice;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author nguyenhung
 */
public class VDJTable extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new VDJTable();
    }

    public VDJTable() {
        // TODO code application logic here
        String[] titles = new String[]{"ID", "Tên", "Email", "Phone", "Birthday", "Rollnumber", "Classname"};

        Object[][] listStudent = new Object[][]{
            {1, "Hùng", "hung@gmail.com", "1234567890", "16/06/1995", "123", "C1702G"},
            {2, "Tùng", "tung@gmail.com", "1234567890", "17/07/1995", "456", "C1702G"},
            {3, "Nam", "nam@gmail.com", "1234567890", "18/08/1995", "789", "C1702G"},
            {4, "Đông", "dong@gmail.com", "1234567890", "19/09/1995", "101112", "C1702G"},
            {5, "Danh", "danh@gmail.com", "1234567890", "20/10/1995", "131415", "C1702G"},
            {6, "Hùng", "hung@gmail.com", "1234567890", "16/06/1995", "123", "C1702G"},
            {7, "Tùng", "tung@gmail.com", "1234567890", "17/07/1995", "456", "C1702G"},
            {8, "Nam", "nam@gmail.com", "1234567890", "18/08/1995", "789", "C1702G"},
            {9, "Đông", "dong@gmail.com", "1234567890", "19/09/1995", "101112", "C1702G"},
            {10, "Danh", "danh@gmail.com", "1234567890", "20/10/1995", "131415", "C1702G"},
            {11, "Hùng", "hung@gmail.com", "1234567890", "16/06/1995", "123", "C1702G"},
            {12, "Tùng", "tung@gmail.com", "1234567890", "17/07/1995", "456", "C1702G"},
            {13, "Nam", "nam@gmail.com", "1234567890", "18/08/1995", "789", "C1702G"},
            {14, "Đông", "dong@gmail.com", "1234567890", "19/09/1995", "101112", "C1702G"},
            {15, "Danh", "danh@gmail.com", "1234567890", "20/10/1995", "131415", "C1702G"},
            {16, "Hùng", "hung@gmail.com", "1234567890", "16/06/1995", "123", "C1702G"},
            {17, "Tùng", "tung@gmail.com", "1234567890", "17/07/1995", "456", "C1702G"},
            {18, "Nam", "nam@gmail.com", "1234567890", "18/08/1995", "789", "C1702G"},
            {19, "Đông", "dong@gmail.com", "1234567890", "19/09/1995", "101112", "C1702G"},
            {20, "Danh", "danh@gmail.com", "1234567890", "20/10/1995", "131415", "C1702G"},
            {21, "Hùng", "hung@gmail.com", "1234567890", "16/06/1995", "123", "C1702G"},
            {22, "Tùng", "tung@gmail.com", "1234567890", "17/07/1995", "456", "C1702G"},
            {23, "Nam", "nam@gmail.com", "1234567890", "18/08/1995", "789", "C1702G"},
            {24, "Đông", "dong@gmail.com", "1234567890", "19/09/1995", "101112", "C1702G"},
            {25, "Danh", "danh@gmail.com", "1234567890", "20/10/1995", "131415", "C1702G"},
            {26, "Hùng", "hung@gmail.com", "1234567890", "16/06/1995", "123", "C1702G"},
            {27, "Tùng", "tung@gmail.com", "1234567890", "17/07/1995", "456", "C1702G"},
            {28, "Nam", "nam@gmail.com", "1234567890", "18/08/1995", "789", "C1702G"},
            {29, "Đông", "dong@gmail.com", "1234567890", "19/09/1995", "101112", "C1702G"},
            {30, "Danh", "danh@gmail.com", "1234567890", "20/10/1995", "131415", "C1702G"}
        };

        JTable jtable = new JTable(listStudent, titles);
        jtable.setName("Bảng danh sách sinh viên");
        this.setSize(800, 550);
        this.add(new JScrollPane(jtable));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

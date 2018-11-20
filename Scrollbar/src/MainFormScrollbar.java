/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 100 Mbps (Rigil Makmun)
 */
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFormScrollbar {
    public static void main(String[] args) {
        //Buat JPanel nya
        JPanel panel = new JPanel();
        
        //Buat JLabel nya
        JLabel label1 = new JLabel("Contoh Program Scroll Bar");
        
        //Buat Scrollbar menggunakan JScrollPane dan Tambahkan Panel ke dalam viewport
        //Setel Scrollbar Vertikal dan Horizontal selalu tampil
        JScrollPane scrollBar = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        //Buat JFrame dengan judul ( MainFormScrollbar )
        JFrame frame = new JFrame("MainFormScrollbar");
        
        //Tambahkan Komponen ke JFrame
        panel.add(label1);
        
        //Tambahkan JScrollPane ke JFrame
        frame.add(scrollBar);
        
        //Setel operasi keluar untuk JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Atur Ukuran JFrame
        frame.setSize(400, 400);
        //Jadikan JFrame terlihat. Jadi kita bisa melihatnya
        frame. setVisible(true);
        
        //Jadi, jika ingin menambahkan komponen lain seperti JTextArea, tambahkan saja ke dalam JPanel. Setelah itu tambahkan
        //JPanel ke JScrollPane sebelum menambahkan JScrollPane ke JFrame.
    }
}

package Praktikum.Sesi3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorGUI extends JFrame implements ActionListener {
    private JTextField inputAngka1, inputAngka2, hasilField;
    private JButton tambahBtn, kurangBtn, kaliBtn, bagiBtn;

    public KalkulatorGUI() {
        setTitle("Kalkulator Sederhana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Membuat komponen input
        inputAngka1 = new JTextField();
        inputAngka2 = new JTextField();
        hasilField = new JTextField();
        hasilField.setEditable(false);

        // Membuat tombol operasi
        tambahBtn = new JButton("+");
        kurangBtn = new JButton("-");
        kaliBtn = new JButton("*");
        bagiBtn = new JButton("/");

        // Menambahkan action listener ke tombol
        tambahBtn.addActionListener(this);
        kurangBtn.addActionListener(this);
        kaliBtn.addActionListener(this);
        bagiBtn.addActionListener(this);

        // Menambahkan komponen ke frame
        add(new JLabel("Angka Pertama:"));
        add(inputAngka1);
        add(new JLabel("Angka Kedua:"));
        add(inputAngka2);
        add(new JLabel("Hasil:"));
        add(hasilField);

        // Menambahkan tombol operasi ke frame
        add(tambahBtn);
        add(kurangBtn);
        add(kaliBtn);
        add(bagiBtn);
    }

    // Method untuk menangani event klik tombol
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Mengambil nilai dari input
            double angka1 = Double.parseDouble(inputAngka1.getText());
            double angka2 = Double.parseDouble(inputAngka2.getText());
            double hasil = 0;

            // Melakukan operasi berdasarkan tombol yang diklik
            if (e.getSource() == tambahBtn) {
                hasil = angka1 + angka2;
            } else if (e.getSource() == kurangBtn) {
                hasil = angka1 - angka2;
            } else if (e.getSource() == kaliBtn) {
                hasil = angka1 * angka2;
            } else if (e.getSource() == bagiBtn) {
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    JOptionPane.showMessageDialog(this, "Pembagian dengan nol tidak diizinkan.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Menampilkan hasil ke field hasil
            hasilField.setText(String.format("%.2f", hasil));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Menjalankan kalkulator GUI
        SwingUtilities.invokeLater(() -> {
            KalkulatorGUI kalkulator = new KalkulatorGUI();
            kalkulator.setVisible(true);
        });
    }
}

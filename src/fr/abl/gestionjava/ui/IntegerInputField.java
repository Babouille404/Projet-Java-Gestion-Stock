package fr.abl.gestionjava.ui;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class IntegerInputField {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Saisie d'un entier");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JTextField integerField = new JTextField(10);
            ((AbstractDocument) integerField.getDocument()).setDocumentFilter(new IntegerDocumentFilter());

            frame.add(new JLabel("Entrez un entier :"));
            frame.add(integerField);

            frame.setSize(300, 100);
            frame.setVisible(true);
        });
    }
}

class IntegerDocumentFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (isInteger(string)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (isInteger(text)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean isInteger(String text) {
        return text.matches("-?\\d*");
    }
}

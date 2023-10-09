/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas.proveedorOp;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Bugaso
 */
public class DocumentSizeFilter extends DocumentFilter {
    private int i;
    public DocumentSizeFilter(int i) {
        this.i = i;
    }

     @Override
    public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
        if ((fb.getDocument().getLength() + text.length()) <= i) {
            super.insertString(fb, offset, text, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if ((fb.getDocument().getLength() + text.length() - length) <= i) {
            super.replace(fb, offset, length, text, attrs);
        } 
    }

    
    
}

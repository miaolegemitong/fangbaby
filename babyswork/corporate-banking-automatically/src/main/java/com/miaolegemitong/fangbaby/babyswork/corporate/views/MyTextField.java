package com.miaolegemitong.fangbaby.babyswork.corporate.views;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/16
 * @description
 */
public class MyTextField extends JTextField {
    public MyTextField() {
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                set();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                set();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                set();
            }

            private void set() {
                MyTextField.this.setToolTipText(MyTextField.this.getText());
            }
        });
    }
}

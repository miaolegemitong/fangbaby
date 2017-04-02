package com.miaolegemitong.fangbaby.babyswork.corporate.views;

import com.miaolegemitong.fangbaby.babyswork.corporate.excel.ExcelGenerator;
import com.miaolegemitong.fangbaby.babyswork.corporate.pojo.Administration;
import com.miaolegemitong.fangbaby.babyswork.corporate.pojo.CompanyType;
import com.miaolegemitong.fangbaby.babyswork.corporate.pojo.CorporateClient;
import com.miaolegemitong.fangbaby.babyswork.corporate.pojo.People;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.miaolegemitong.fangbaby.babyswork.corporate.common.CommonConstant.*;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/25
 * @description
 */
public class MainFrame extends JFrame implements ActionListener, ItemListener {
    private JLabel companyInfoLabel = new JLabel("公司信息");

    private JLabel corporationInfoLabel = new JLabel("法人信息");

    private JLabel financeManagerInfoLabel = new JLabel("财务主管信息");

    private JLabel operatorInfoLabel = new JLabel("经办人信息");

    private JLabel companyNameLabel = new JLabel("公司名称");

    private JTextField companyNameText = new JTextField();

    private JLabel companyAccoutLabel = new JLabel("公司账号");

    private JTextField companyAccountText = new JTextField();

    private JLabel bizLicenceLabel = new JLabel("营业执照");

    private JTextField bizLicenceText = new JTextField();

    private JLabel orgCodeLabel = new JLabel("机构代码");

    private JTextField orgCodeText = new JTextField();

    private JLabel bizLicenceValidDateLabel = new JLabel("证有效期");

    private JTextField bizLicenceValidDateText = new JTextField();

    private JLabel administrationLabel = new JLabel("工商管局");

    private JComboBox<String> administrationComboBox = new JComboBox<>();

    private JLabel zhuceAddressLabel = new JLabel("注册地址");

    private JTextField zhuceAddressText = new JTextField();

    private JLabel zhuceAddressPostalCodeLabel = new JLabel("注册邮编");

    private JTextField zhuceAddressPostalCodeText = new JTextField();

    private JLabel bizScopeLabel = new JLabel("经营范围");

    private JTextField bizScopeText = new JTextField();

    private JLabel regCapitalLabel = new JLabel("注册资本");

    private JTextField regCapitalText = new JTextField();

    private JLabel bangongAddressLabel = new JLabel("办公地址");

    private JTextField bangongAddressText = new JTextField();

    private JLabel phoneLabel = new JLabel("公司座机");

    private JTextField phoneText = new JTextField();

    private JLabel typeLabel = new JLabel("公司类型");

    private JComboBox<String> typeComboBox = new JComboBox<>();

    private JLabel foundDateLabel = new JLabel("成立日期");

    private JTextField foundDateText = new JTextField();

    private JLabel financeManagerNameLabel = new JLabel("姓名");

    private JTextField financeManagerNameText = new JTextField();

    private JLabel financeManagerPinyinLabel = new JLabel("拼音");

    private JTextField financeManagerPinyinText = new JTextField();

    private JLabel financeManagerIDLabel = new JLabel("身份证号");

    private JTextField financeManagerIDText = new JTextField();

    private JLabel financeManagerIDValidDateLabel = new JLabel("有效期");

    private JTextField financeManagerIDValidDateText = new JTextField();

    private JLabel financeManagerPhoneLabel = new JLabel("手机号码");

    private JTextField financeManagerPhoneText = new JTextField();

    private JLabel financeManagerEmailLabel = new JLabel("邮箱");

    private JTextField financeManagerEmailText = new JTextField();

    private JLabel corporationNameLabel = new JLabel("姓名");

    private JTextField corporationNameText = new JTextField();

    private JLabel corporationPinyinLabel = new JLabel("拼音");

    private JTextField corporationPinyinText = new JTextField();

    private JLabel corporationIDLabel = new JLabel("身份证号");

    private JTextField corporationIDText = new JTextField();

    private JLabel corporationIDValidDateLabel = new JLabel("有效期");

    private JTextField corporationIDValidDateText = new JTextField();

    private JLabel corporationPhoneLabel = new JLabel("手机号码");

    private JTextField corporationPhoneText = new JTextField();

    private JLabel corporationEmailLabel = new JLabel("邮箱");

    private JTextField corporationEmailText = new JTextField();

    private JLabel operatorNameLabel = new JLabel("姓名");

    private JTextField operatorNameText = new JTextField();

    private JLabel operatorPinyinLabel = new JLabel("拼音");

    private JTextField operatorPinyinText = new JTextField();

    private JLabel operatorIDLabel = new JLabel("身份证号");

    private JTextField operatorIDText = new JTextField();

    private JLabel operatorIDValidDateLabel = new JLabel("有效期");

    private JTextField operatorIDValidDateText = new JTextField();

    private JLabel operatorPhoneLabel = new JLabel("手机号码");

    private JTextField operatorPhoneText = new JTextField();

    private JLabel operatorEmailLabel = new JLabel("邮箱");

    private JTextField operatorEmailText = new JTextField();

    private JButton button = new JButton("导出Excel表");

    public MainFrame() throws HeadlessException {
        this.setTitle("对公客户信息自动生成系统");
//        int width = SCREEN_WIDTH - 2 * SCREEN_EDGE_HORIZONTALLY;
//        int height = SCREEN_HEIGHT - 2 * SCREEN_EDGE_VERTICALLY;
        int width = 720;
        int height = 450;
        this.setBounds(SCREEN_EDGE_HORIZONTALLY, SCREEN_EDGE_VERTICALLY, width, height);
//        this.setBackground(new Color(111, 111, 111));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBorder(null);
        contentPane.setBackground(new Color(125, 145, 128));
        this.setContentPane(contentPane);
        fillPane(contentPane, width - 20, height - 40);
    }

    private void fillPane(JPanel contentPane, int width, int height) {
        companyInfoLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
        companyInfoLabel.setBounds(20, -5, width / 5, height / 10);
        contentPane.add(companyInfoLabel);


        //第一行
        companyNameLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        companyNameLabel.setBounds(20, -5 + (height / 10), width / 14, height / 20);
        contentPane.add(companyNameLabel);

        companyNameText.setBounds(20 + width / 14, -5 + height / 10, width / 6, height / 20);
        contentPane.add(companyNameText);

        companyAccoutLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        companyAccoutLabel.setBounds(20 + 3 * width / 12, -5 + (height / 10), width / 14, height / 20);
        contentPane.add(companyAccoutLabel);

        companyAccountText.setBounds(20 + 9 * width / 28, -5 + height / 10, width / 6, height / 20);
        contentPane.add(companyAccountText);

        bizLicenceLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        bizLicenceLabel.setBounds(20 + width / 2, -5 + (height / 10), width / 14, height / 20);
        contentPane.add(bizLicenceLabel);

        bizLicenceText.setBounds(20 + 4 * width / 7, -5 + height / 10, width / 6, height / 20);
        contentPane.add(bizLicenceText);

        orgCodeLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        orgCodeLabel.setBounds(20 + 3 * width / 4, -5 + height / 10, width / 14, height / 20);
        contentPane.add(orgCodeLabel);

        orgCodeText.setBounds(20 + 23 * width / 28, -5 + height / 10, width / 6, height / 20);
        contentPane.add(orgCodeText);

        //第二行
        bizLicenceValidDateLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        bizLicenceValidDateLabel.setBounds(20, -5 + 3 * height / 20, width / 14, height / 20);
        contentPane.add(bizLicenceValidDateLabel);

        bizLicenceValidDateText.setBounds(20 + width / 14, -5 + 3 * height / 20, width / 6, height / 20);
        bizLicenceValidDateText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                String[] dates = bizLicenceValidDateText.getText().split("-");
                if (dates.length == 2) {
                    foundDateText.setText(dates[0]);
                } else {
                    JOptionPane.showMessageDialog(null, "营业执照有效期输入格式有误！");
//                    bizLicenceValidDateText.grabFocus();
                }
            }
        });
        contentPane.add(bizLicenceValidDateText);

        administrationLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        administrationLabel.setBounds(20 + 3 * width / 12, -5 + 3 * height / 20, width / 14, height / 20);
        contentPane.add(administrationLabel);

        administrationComboBox.setBounds(20 + 9 * width / 28, -5 + 3 * height / 20, 3 * width / 7, height / 20);
        Administration[] administrations = Administration.values();
        String[] ads = new String[administrations.length];
        for (int i = 0; i < administrations.length; i++) {
            ads[i] = administrations[i].getName();
        }
        administrationComboBox.setModel(new DefaultComboBoxModel<>(ads));
        administrationComboBox.addItemListener(this);
        contentPane.add(administrationComboBox);

        zhuceAddressLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        zhuceAddressLabel.setBounds(20 + 3 * width / 4, -5 + 3 * height / 20, width / 14, height / 20);
        contentPane.add(zhuceAddressLabel);

        zhuceAddressText.setBounds(20 + 23 * width / 28, -5 + 3 * height / 20, width / 6, height / 20);
        contentPane.add(zhuceAddressText);

        //第三行
        zhuceAddressPostalCodeLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        zhuceAddressPostalCodeLabel.setBounds(20, -5 + height / 5, width / 14, height / 20);
        contentPane.add(zhuceAddressPostalCodeLabel);

        zhuceAddressPostalCodeText.setBounds(20 + width / 14, -5 + height / 5, width / 6, height / 20);
        zhuceAddressPostalCodeText.setText("100070");
        contentPane.add(zhuceAddressPostalCodeText);

        bizScopeLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        bizScopeLabel.setBounds(20 + 3 * width / 12, -5 + height / 5, width / 14, height / 20);
        contentPane.add(bizScopeLabel);

        bizScopeText.setBounds(20 + 9 * width / 28, -5 + height / 5, width / 6, height / 20);
        contentPane.add(bizScopeText);

        regCapitalLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        regCapitalLabel.setBounds(20 + width / 2, -5 + height / 5, width / 14, height / 20);
        contentPane.add(regCapitalLabel);

        regCapitalText.setBounds(20 + 4 * width / 7, -5 + height / 5, width / 6, height / 20);
        contentPane.add(regCapitalText);

        bangongAddressLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        bangongAddressLabel.setBounds(20 + 3 * width / 4, -5 + height / 5, width / 14, height / 20);
        contentPane.add(bangongAddressLabel);

        bangongAddressText.setBounds(20 + 23 * width / 28, -5 + height / 5, width / 6, height / 20);
        contentPane.add(bangongAddressText);

        //第四行
        phoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        phoneLabel.setBounds(20, -5 + height / 4, width / 14, height / 20);
        contentPane.add(phoneLabel);

        phoneText.setBounds(20 + width / 14, -5 + height / 4, width / 6, height / 20);
        contentPane.add(phoneText);

        typeLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        typeLabel.setBounds(20 + 3 * width / 12, -5 + height / 4, width / 14, height / 20);
        contentPane.add(typeLabel);

        typeComboBox.setBounds(20 + 9 * width / 28, -5 + height / 4, 3 * width / 7, height / 20);
        CompanyType[] types = CompanyType.values();
        String[] ts = new String[types.length];
        for (int i = 0; i < types.length; i++) {
            ts[i] = types[i].getType();
        }
        typeComboBox.setModel(new DefaultComboBoxModel<>(ts));
        contentPane.add(typeComboBox);

        foundDateLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        foundDateLabel.setBounds(20 + 3 * width / 4, -5 + height / 4, width / 14, height / 20);
        contentPane.add(foundDateLabel);

        foundDateText.setBounds(20 + 23 * width / 28, -5 + height / 4, width / 6, height / 20);
        contentPane.add(foundDateText);

        //法人信息
        corporationInfoLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
        corporationInfoLabel.setBounds(20, -5 + 3 * height / 10, width / 5, height / 10);
        contentPane.add(corporationInfoLabel);

        //法人信息第一行
        corporationNameLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        corporationNameLabel.setBounds(20, -5 + 2 * height / 5, width / 14, height / 20);
        contentPane.add(corporationNameLabel);

        corporationNameText.setBounds(20 + width / 14, -5 + 2 * height / 5, width / 6, height / 20);
        contentPane.add(corporationNameText);

        corporationPhoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        corporationPhoneLabel.setBounds(20 + 3 * width / 12, -5 + 2 * height / 5, width / 14, height / 20);
        contentPane.add(corporationPhoneLabel);

        corporationPhoneText.setBounds(20 + 9 * width / 28, -5 + 2 * height / 5, 3 * width / 7, height / 20);
        contentPane.add(corporationPhoneText);

        corporationEmailLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        corporationEmailLabel.setBounds(20 + 3 * width / 4, -5 + 2 * height / 5, width / 14, height / 20);
        contentPane.add(corporationEmailLabel);

        corporationEmailText.setBounds(20 + 23 * width / 28, -5 + 2 * height / 5, width / 6, height / 20);
        contentPane.add(corporationEmailText);

        //法人信息第二行
        corporationPinyinLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        corporationPinyinLabel.setBounds(20, -5 + 9 * height / 20, width / 14, height / 20);
        contentPane.add(corporationPinyinLabel);

        corporationPinyinText.setBounds(20 + width / 14, -5 + 9 * height / 20, width / 6, height / 20);
        contentPane.add(corporationPinyinText);

        corporationIDLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        corporationIDLabel.setBounds(20 + 3 * width / 12, -5 + 9 * height / 20, width / 14, height / 20);
        contentPane.add(corporationIDLabel);

        corporationIDText.setBounds(20 + 9 * width / 28, -5 + 9 * height / 20, 3 * width / 7, height / 20);
        contentPane.add(corporationIDText);

        corporationIDValidDateLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        corporationIDValidDateLabel.setBounds(20 + 3 * width / 4, -5 + 9 * height / 20, width / 14, height / 20);
        contentPane.add(corporationIDValidDateLabel);

        corporationIDValidDateText.setBounds(20 + 23 * width / 28, -5 + 9 * height / 20, width / 6, height / 20);
        contentPane.add(corporationIDValidDateText);

        //财务主管信息
        financeManagerInfoLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
        financeManagerInfoLabel.setBounds(20, -5 + height / 2, width / 5, height / 10);
        contentPane.add(financeManagerInfoLabel);

        //财务主管信息第一行
        financeManagerNameLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        financeManagerNameLabel.setBounds(20, -5 + 3 * height / 5, width / 14, height / 20);
        contentPane.add(financeManagerNameLabel);

        financeManagerNameText.setBounds(20 + width / 14, -5 + 3 * height / 5, width / 6, height / 20);
        contentPane.add(financeManagerNameText);

        financeManagerPhoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        financeManagerPhoneLabel.setBounds(20 + 3 * width / 12, -5 + 3 * height / 5, width / 14, height / 20);
        contentPane.add(financeManagerPhoneLabel);

        financeManagerPhoneText.setBounds(20 + 9 * width / 28, -5 + 3 * height / 5, 3 * width / 7, height / 20);
        contentPane.add(financeManagerPhoneText);

        financeManagerEmailLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        financeManagerEmailLabel.setBounds(20 + 3 * width / 4, -5 + 3 * height / 5, width / 14, height / 20);
        contentPane.add(financeManagerEmailLabel);

        financeManagerEmailText.setBounds(20 + 23 * width / 28, -5 + 3 * height / 5, width / 6, height / 20);
        contentPane.add(financeManagerEmailText);

        //财务主管信息第二行
        financeManagerPinyinLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        financeManagerPinyinLabel.setBounds(20, -5 + 13 * height / 20, width / 14, height / 20);
        contentPane.add(financeManagerPinyinLabel);

        financeManagerPinyinText.setBounds(20 + width / 14, -5 + 13 * height / 20, width / 6, height / 20);
        contentPane.add(financeManagerPinyinText);

        financeManagerIDLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        financeManagerIDLabel.setBounds(20 + 3 * width / 12, -5 + 13 * height / 20, width / 14, height / 20);
        contentPane.add(financeManagerIDLabel);

        financeManagerIDText.setBounds(20 + 9 * width / 28, -5 + 13 * height / 20, 3 * width / 7, height / 20);
        contentPane.add(financeManagerIDText);

        financeManagerIDValidDateLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        financeManagerIDValidDateLabel.setBounds(20 + 3 * width / 4, -5 + 13 * height / 20, width / 14, height / 20);
        contentPane.add(financeManagerIDValidDateLabel);

        financeManagerIDValidDateText.setBounds(20 + 23 * width / 28, -5 + 13 * height / 20, width / 6, height / 20);
        contentPane.add(financeManagerIDValidDateText);

        //经办人信息
        operatorInfoLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
        operatorInfoLabel.setBounds(20, -5 + 7 * height / 10, width / 5, height / 10);
        contentPane.add(operatorInfoLabel);

        //经办人信息第一行
        operatorNameLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        operatorNameLabel.setBounds(20, -5 + 4 * height / 5, width / 14, height / 20);
        contentPane.add(operatorNameLabel);

        operatorNameText.setBounds(20 + width / 14, -5 + 4 * height / 5, width / 6, height / 20);
        contentPane.add(operatorNameText);

        operatorPhoneLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        operatorPhoneLabel.setBounds(20 + 3 * width / 12, -5 + 4 * height / 5, width / 14, height / 20);
        contentPane.add(operatorPhoneLabel);

        operatorPhoneText.setBounds(20 + 9 * width / 28, -5 + 4 * height / 5, 3 * width / 7, height / 20);
        contentPane.add(operatorPhoneText);

        operatorEmailLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        operatorEmailLabel.setBounds(20 + 3 * width / 4, -5 + 4 * height / 5, width / 14, height / 20);
        contentPane.add(operatorEmailLabel);

        operatorEmailText.setBounds(20 + 23 * width / 28, -5 + 4 * height / 5, width / 6, height / 20);
        contentPane.add(operatorEmailText);

        //经办人信息第二行
        operatorPinyinLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        operatorPinyinLabel.setBounds(20, -5 + 17 * height / 20, width / 14, height / 20);
        contentPane.add(operatorPinyinLabel);

        operatorPinyinText.setBounds(20 + width / 14, -5 + 17 * height / 20, width / 6, height / 20);
        contentPane.add(operatorPinyinText);

        operatorIDLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        operatorIDLabel.setBounds(20 + 3 * width / 12, -5 + 17 * height / 20, width / 14, height / 20);
        contentPane.add(operatorIDLabel);

        operatorIDText.setBounds(20 + 9 * width / 28, -5 + 17 * height / 20, 3 * width / 7, height / 20);
        contentPane.add(operatorIDText);

        operatorIDValidDateLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        operatorIDValidDateLabel.setBounds(20 + 3 * width / 4, -5 + 17 * height / 20, width / 14, height / 20);
        contentPane.add(operatorIDValidDateLabel);

        operatorIDValidDateText.setBounds(20 + 23 * width / 28, -5 + 17 * height / 20, width / 6, height / 20);
        contentPane.add(operatorIDValidDateText);

        button.setBounds(5 * width / 12, 9 * height / 10, width / 6, height / 8);
        button.setFont(new Font("微软雅黑", Font.BOLD, 12));
        button.addActionListener(this);
        contentPane.add(button);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        CorporateClient client = new CorporateClient();
        client.setCompanyName(companyNameText.getText().trim());
        client.setCompanyAccount(companyAccountText.getText().trim());
        client.setBizLicence(bizLicenceText.getText().trim());
        client.setOrgCode(orgCodeText.getText().trim());
        client.setBizLicenceValidDate(bizLicenceValidDateText.getText().trim());
        client.setAdministration(Administration.getByName(administrationComboBox.getSelectedItem().toString().trim()));
        client.setZhuceAddress(zhuceAddressText.getText().trim());
        client.setZhucePostalCode(zhuceAddressPostalCodeText.getText().trim());
        client.setBizScope(bizScopeText.getText().trim() + "等");
        client.setRegCapital(regCapitalText.getText().trim() + "万");
        client.setBangongAddress(bangongAddressText.getText().trim());
        client.setPhone(phoneText.getText().trim());
        client.setType(CompanyType.getByType(typeComboBox.getSelectedItem().toString().trim()));
        client.setFoundDate(foundDateText.getText().trim());
        People corporation = new People();
        corporation.setName(corporationNameText.getText().trim());
        corporation.setPhone(corporationPhoneText.getText().trim());
        corporation.setEmail(corporationEmailText.getText().trim());
        corporation.setNamePinyin(corporationPinyinText.getText().trim());
        corporation.setIDValidDate(corporationIDValidDateText.getText().trim());
        corporation.setID(corporationIDText.getText().trim());
        client.setCorporation(corporation);
        if (!"".equals(financeManagerNameText.getText().trim())) {
            People financeManager = new People();
            financeManager.setName(financeManagerNameText.getText().trim());
            financeManager.setPhone(financeManagerPhoneText.getText().trim());
            financeManager.setEmail(financeManagerEmailText.getText().trim());
            financeManager.setNamePinyin(financeManagerPinyinText.getText().trim());
            financeManager.setIDValidDate(financeManagerIDValidDateText.getText().trim());
            financeManager.setID(financeManagerIDText.getText().trim());
            client.setFinanceManager(financeManager);
        }
        People operator = new People();
        operator.setName(operatorNameText.getText().trim());
        operator.setPhone(operatorPhoneText.getText().trim());
        operator.setEmail(operatorEmailText.getText().trim());
        operator.setNamePinyin(operatorPinyinText.getText().trim());
        operator.setIDValidDate(operatorIDValidDateText.getText().trim());
        operator.setID(operatorIDText.getText().trim());
        client.setOperator(operator);
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File home = fsv.getHomeDirectory();
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        if (ExcelGenerator.generateExcelFile(client, home.getPath() + File.separator + date + "_" + client.getCompanyName() + ".xls")) {
            JOptionPane.showMessageDialog(this.getContentPane(), "导出成功！");
        } else {
            JOptionPane.showMessageDialog(this.getContentPane(), "导出失败！");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            Administration administration = Administration.getByName(administrationComboBox.getSelectedItem().toString().trim());
            if (administration != null) {
                zhuceAddressPostalCodeText.setText(administration.getCode());
            }
        }
    }
}

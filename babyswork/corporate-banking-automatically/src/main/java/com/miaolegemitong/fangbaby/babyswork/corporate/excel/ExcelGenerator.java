package com.miaolegemitong.fangbaby.babyswork.corporate.excel;

import com.miaolegemitong.fangbaby.babyswork.corporate.pojo.CorporateClient;
import com.miaolegemitong.fangbaby.babyswork.corporate.pojo.People;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.swing.filechooser.FileSystemView;
import java.io.*;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/25
 * @description
 */
public class ExcelGenerator {
    private static HSSFWorkbook template;

    static {
        try {
            FileSystemView fsv = FileSystemView.getFileSystemView();
            String templatePath = fsv.getHomeDirectory().getPath() + File.separator + "excel-template.xls";
            InputStream stream = new FileInputStream(templatePath);
            template = new HSSFWorkbook(stream);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean generateExcelFile(CorporateClient client, String path) {
        if (template == null || client == null || path == null || "".equals(path)) {
            return false;
        }
        try {
            HSSFSheet sheet1 = template.getSheetAt(0);
            HSSFSheet sheet2 = template.getSheetAt(1);
            HSSFSheet sheet3 = template.getSheetAt(2);
            HSSFSheet sheet4 = template.getSheetAt(3);
            HSSFSheet sheet5 = template.getSheetAt(4);
            HSSFSheet sheet6 = template.getSheetAt(5);
            HSSFSheet sheet7 = template.getSheetAt(6);
            HSSFSheet sheet8 = template.getSheetAt(7);
            HSSFSheet sheet9 = template.getSheetAt(8);
            HSSFSheet sheet10 = template.getSheetAt(9);
            if (client.getCompanyName() != null && !"".equals(client.getCompanyName())) {
                sheet1.getRow(41).getCell(7).setCellValue(client.getCompanyName());
                sheet2.getRow(1).getCell(1).setCellValue(client.getCompanyName());
                sheet2.getRow(6).getCell(2).setCellValue(client.getCompanyName());
                sheet4.getRow(1).getCell(1).setCellValue(client.getCompanyName());
                sheet5.getRow(1).getCell(2).setCellValue(client.getCompanyName());
                sheet6.getRow(2).getCell(1).setCellValue(client.getCompanyName());
                sheet8.getRow(1).getCell(5).setCellValue(client.getCompanyName());
                sheet9.getRow(1).getCell(1).setCellValue(client.getCompanyName());
                sheet10.getRow(1).getCell(1).setCellValue(client.getCompanyName());
                sheet10.getRow(17).getCell(2).setCellValue(client.getCompanyName());
            }
            if (client.getCompanyAccount() != null && !"".equals(client.getCompanyAccount())) {
                sheet1.getRow(42).getCell(1).setCellValue(client.getCompanyAccount());
                sheet2.getRow(7).getCell(2).setCellValue(client.getCompanyAccount());
                sheet6.getRow(4).getCell(6).setCellValue(client.getCompanyAccount());
                sheet9.getRow(1).getCell(6).setCellValue(client.getCompanyAccount());
                sheet10.getRow(18).getCell(2).setCellValue(client.getCompanyAccount());
            }
            if (client.getBizLicence() != null && !"".equals(client.getBizLicence())) {
                sheet4.getRow(14).getCell(4).setCellValue(client.getBizLicence());
                sheet4.getRow(16).getCell(1).setCellValue(client.getBizLicence());
                sheet5.getRow(4).getCell(6).setCellValue(client.getBizLicence());
                sheet5.getRow(5).getCell(2).setCellValue(client.getBizLicence());
                sheet5.getRow(5).getCell(6).setCellValue(client.getBizLicence());
            }
            if (client.getOrgCode() != null && !"".equals(client.getOrgCode())) {
                sheet4.getRow(3).getCell(4).setCellValue(client.getOrgCode());
                sheet5.getRow(6).getCell(6).setCellValue(client.getOrgCode());
            }
            if (client.getBizLicenceValidDate() != null && !"".equals(client.getBizLicenceValidDate())) {
                sheet4.getRow(14).getCell(6).setCellValue(client.getBizLicenceValidDate());
            }
            if (client.getAdministration() != null) {
                sheet5.getRow(3).getCell(2).setCellValue(client.getAdministration().getName());
            }
            if (client.getZhuceAddress() != null && !"".equals(client.getZhuceAddress())) {
                sheet4.getRow(2).getCell(1).setCellValue(client.getZhuceAddress());
                sheet5.getRow(2).getCell(2).setCellValue(client.getZhuceAddress());
                sheet10.getRow(2).getCell(1).setCellValue(client.getZhuceAddress());
            }
            if (client.getZhucePostalCode() != null && !"".equals(client.getZhucePostalCode())) {
                sheet4.getRow(2).getCell(6).setCellValue(client.getZhucePostalCode());
                sheet10.getRow(3).getCell(6).setCellValue(client.getZhucePostalCode());
            }
            if (client.getBizScope() != null && !"".equals(client.getBizScope())) {
                sheet4.getRow(13).getCell(1).setCellValue(client.getBizScope());
            }
            if (client.getRegCapital() != null && !"".equals(client.getRegCapital())) {
                sheet4.getRow(12).getCell(6).setCellValue(client.getRegCapital());
                sheet5.getRow(8).getCell(6).setCellValue(client.getRegCapital());
            }
            if (client.getBangongAddress() != null && !"".equals(client.getBangongAddress())) {
                sheet5.getRow(9).getCell(2).setCellValue(client.getBangongAddress());
            }
            if (client.getPhone() != null && !"".equals(client.getPhone())) {
                sheet4.getRow(1).getCell(6).setCellValue(client.getPhone());
                sheet4.getRow(4).getCell(4).setCellValue(client.getPhone());
                sheet4.getRow(6).getCell(4).setCellValue(client.getPhone());
                sheet4.getRow(8).getCell(4).setCellValue(client.getPhone());
                sheet5.getRow(9).getCell(6).setCellValue(client.getPhone());
            }
            if (client.getType() != null) {
                sheet5.getRow(7).getCell(2).setCellValue(client.getType().getType());
            }
            if (client.getFoundDate() != null && !"".equals(client.getFoundDate())) {
                sheet5.getRow(7).getCell(6).setCellValue(client.getFoundDate());
            }
            if (client.getCorporation() != null) {
                People corporation = client.getCorporation();
                sheet4.getRow(4).getCell(2).setCellValue(corporation.getName());
                sheet4.getRow(4).getCell(5).setCellValue(corporation.getPhone());
                sheet4.getRow(5).getCell(4).setCellValue(corporation.getID());
                sheet4.getRow(5).getCell(6).setCellValue(corporation.getIDValidDate());
                sheet4.getRow(6).getCell(3).setCellValue(corporation.getName());
                sheet4.getRow(6).getCell(5).setCellValue(corporation.getPhone());
                sheet4.getRow(7).getCell(4).setCellValue(corporation.getID());
                sheet4.getRow(7).getCell(6).setCellValue(corporation.getIDValidDate());
                sheet4.getRow(10).getCell(2).setCellValue(corporation.getName());
                sheet4.getRow(11).getCell(2).setCellValue(corporation.getID());
                sheet4.getRow(11).getCell(6).setCellValue(corporation.getIDValidDate());
                sheet5.getRow(11).getCell(2).setCellValue(corporation.getName());
                sheet5.getRow(11).getCell(6).setCellValue(corporation.getID());
                sheet6.getRow(2).getCell(8).setCellValue(corporation.getName());
                sheet6.getRow(3).getCell(3).setCellValue(corporation.getID());
                sheet6.getRow(3).getCell(7).setCellValue(corporation.getIDValidDate());
                sheet6.getRow(5).getCell(1).setCellValue(corporation.getName());
                sheet6.getRow(6).getCell(0).setCellValue("        " + corporation.getID());
                sheet6.getRow(6).getCell(4).setCellValue(corporation.getIDValidDate());
                sheet6.getRow(6).getCell(7).setCellValue(corporation.getPhone());
                sheet6.getRow(25).getCell(2).setCellValue(corporation.getName());
                sheet6.getRow(26).getCell(2).setCellValue(corporation.getID());
                sheet6.getRow(26).getCell(6).setCellValue(corporation.getIDValidDate());
                sheet10.getRow(3).getCell(3).setCellValue(corporation.getName());
                if (client.getFinanceManager() != null) {
                    corporation = client.getFinanceManager();
                }
                HSSFRow row = sheet3.getRow(36);
                row.getCell(1).setCellValue(corporation.getName());
                row.getCell(2).setCellValue(corporation.getNamePinyin());
                row.getCell(4).setCellValue(corporation.getID());
                row.getCell(6).setCellValue(corporation.getPhone());
                row.getCell(7).setCellValue(corporation.getEmail());
                sheet7.getRow(1).getCell(2).setCellValue(corporation.getName());
                sheet7.getRow(2).getCell(2).setCellValue(corporation.getID());
                sheet7.getRow(2).getCell(5).setCellValue(corporation.getIDValidDate());
                sheet7.getRow(3).getCell(2).setCellValue(corporation.getPhone());
                sheet7.getRow(3).getCell(5).setCellValue(corporation.getEmail());
            }
            if (client.getOperator() != null) {
                People operator = client.getOperator();
                HSSFRow row = sheet3.getRow(37);
                row.getCell(1).setCellValue(operator.getName());
                row.getCell(2).setCellValue(operator.getNamePinyin());
                row.getCell(4).setCellValue(operator.getID());
                row.getCell(6).setCellValue(operator.getPhone());
                row.getCell(7).setCellValue(operator.getEmail());
                sheet4.getRow(8).getCell(3).setCellValue(operator.getName());
                sheet4.getRow(8).getCell(5).setCellValue(operator.getPhone());
                sheet4.getRow(9).getCell(4).setCellValue(operator.getID());
                sheet4.getRow(9).getCell(6).setCellValue(operator.getIDValidDate());
                sheet7.getRow(5).getCell(2).setCellValue(operator.getName());
                sheet7.getRow(6).getCell(2).setCellValue(operator.getID());
                sheet7.getRow(6).getCell(5).setCellValue(operator.getIDValidDate());
                sheet7.getRow(7).getCell(2).setCellValue(operator.getPhone());
                sheet7.getRow(7).getCell(5).setCellValue(operator.getEmail());
                sheet10.getRow(4).getCell(2).setCellValue(operator.getName());
                sheet10.getRow(4).getCell(6).setCellValue(operator.getPhone());
            }
            OutputStream stream = new FileOutputStream(path);
            template.write(stream);
            stream.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        generateExcelFile(null, "/Users/milton/template.xls");
    }
}

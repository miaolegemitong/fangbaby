package com.miaolegemitong.fangbaby.babyswork.corporate.pojo;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/25
 * @description
 */
public class CorporateClient {
    //公司名称
    private String companyName;

    //公司账号
    private String companyAccount;

    //法人
    private People corporation;

    //经办人
    private People operator;

    //财务经理
    private People financeManager;

    //公司座机
    private String phone;

    //注册地址
    private String zhuceAddress;

    //办公地址
    private String bangongAddress;

    //注册地邮编
    private String zhucePostalCode;

    //组织机构代码
    private String orgCode;

    //经营范围
    private String bizScope;

    //注册资本
    private String regCapital;

    //营业执照
    private String bizLicence;

    //营业执照有效日期
    private String bizLicenceValidDate;

    //工商行政管理局
    private Administration administration;

    //公司类型
    private CompanyType type;

    //成立日期
    private String foundDate;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAccount() {
        return companyAccount;
    }

    public void setCompanyAccount(String companyAccount) {
        this.companyAccount = companyAccount;
    }

    public People getCorporation() {
        return corporation;
    }

    public void setCorporation(People corporation) {
        this.corporation = corporation;
    }

    public People getFinanceManager() {
        return financeManager;
    }

    public void setFinanceManager(People financeManager) {
        this.financeManager = financeManager;
    }

    public People getOperator() {
        return operator;
    }

    public void setOperator(People operator) {
        this.operator = operator;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZhuceAddress() {
        return zhuceAddress;
    }

    public void setZhuceAddress(String zhuceAddress) {
        this.zhuceAddress = zhuceAddress;
    }

    public String getBangongAddress() {
        return bangongAddress;
    }

    public void setBangongAddress(String bangongAddress) {
        this.bangongAddress = bangongAddress;
    }

    public String getZhucePostalCode() {
        return zhucePostalCode;
    }

    public void setZhucePostalCode(String zhucePostalCode) {
        this.zhucePostalCode = zhucePostalCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getBizScope() {
        return bizScope;
    }

    public void setBizScope(String bizScope) {
        this.bizScope = bizScope;
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    public String getBizLicence() {
        return bizLicence;
    }

    public void setBizLicence(String bizLicence) {
        this.bizLicence = bizLicence;
    }

    public String getBizLicenceValidDate() {
        return bizLicenceValidDate;
    }

    public void setBizLicenceValidDate(String bizLicenceValidDate) {
        this.bizLicenceValidDate = bizLicenceValidDate;
    }

    public Administration getAdministration() {
        return administration;
    }

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }

    public CompanyType getType() {
        return type;
    }

    public void setType(CompanyType type) {
        this.type = type;
    }

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }
}

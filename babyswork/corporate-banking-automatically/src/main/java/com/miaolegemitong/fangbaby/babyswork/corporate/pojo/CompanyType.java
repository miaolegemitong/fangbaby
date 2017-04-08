package com.miaolegemitong.fangbaby.babyswork.corporate.pojo;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/25
 * @description
 */
public enum CompanyType {
    DUZI("有限责任公司（自然人独资）"),
    TOUZI("有限责任公司（自然人投资或控股）"),
    FARENDUZI("有限责任公司（法人独资）"),
    HEHUO("有限合伙企业"),
    GETI("个体"),
    OTHER("自定义");

    private String type;

    private CompanyType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static CompanyType getByType(String type) {
        CompanyType[] types = CompanyType.values();
        for (CompanyType t : types) {
            if (type.equals(t.getType())) {
                return t;
            }
        }
        return null;
    }
}

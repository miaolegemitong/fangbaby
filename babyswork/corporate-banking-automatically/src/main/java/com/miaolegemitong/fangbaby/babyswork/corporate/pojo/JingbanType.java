package com.miaolegemitong.fangbaby.babyswork.corporate.pojo;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/5
 * @description
 */
public enum JingbanType {
    FAREN("法人"),
    JINGBAN("经办人"),
    CAIGUAN("财务主管");

    private String name;

    public String getName() {
        return name;
    }

    JingbanType(String name) {
        this.name = name;
    }

    public static JingbanType getByName(String name) {
        JingbanType[] types = JingbanType.values();
        for (JingbanType t : types) {
            if (name.equals(t.getName())) {
                return t;
            }
        }
        return null;
    }
}

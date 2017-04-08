package com.miaolegemitong.fangbaby.babyswork.corporate.pojo;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/5
 * @description
 */
public enum DepositorType {
    QIYEFAREN("企业法人"),
    FEIFARENQIYE("非法人企业"),
    GETIGONGSHANGHU("有字号的个体工商户"),
    USERDEFINE("自定义");

    private String name;

    public String getName() {
        return name;
    }

    DepositorType(String name) {
        this.name = name;
    }

    public static DepositorType getByName(String name) {
        DepositorType[] types = DepositorType.values();
        for (DepositorType t : types) {
            if (name.equals(t.getName())) {
                return t;
            }
        }
        return null;
    }
}

package com.miaolegemitong.fangbaby.babyswork.corporate.pojo;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/25
 * @description
 */
public enum Administration {
    FENTAI("北京市工商行政管理局丰台分局", "100070"),
    DAXING("北京市工商行政管理局大兴分局", "102600"),
    FANGSHAN("北京市工商行政管理局房山分局", "102488"),
    HUAIROU("北京市工商行政管理局怀柔分局", "101400"),
    SHIJINGSHAN("北京市工商行政管理局石景山分局", "100043"),
    SHUNYI("北京市工商行政管理局顺义分局", "101300"),
    XICHENG("北京市工商行政管理局西城分局", "100032"),
    DONGCHENG("北京市工商行政管理局东城分局", "100010"),
    HAIDIAN("北京市工商行政管理局海淀分局", "100089"),
    CHAOYANG("北京市工商行政管理局朝阳分局", "100020"),
    TONGZHOU("北京市工商行政管理局通州分局", "101149"),
    CHANGPING("北京市工商行政管理局昌平分局", "102200"),
    MENTOUGOU("北京市工商行政管理局门头沟分局", "102300"),
    PINGGU("北京市工商行政管理局平谷分局", "101200"),
    YANQING("北京市工商行政管理局延庆分局", "102100"),
    MIYUN("北京市工商行政管理局密云分局", "101500"),
    OTHER("其他", "100070");

    private String name;

    private String code;

    private Administration(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public static Administration getByName(String name) {
        Administration[] administrations = Administration.values();
        for (Administration administration : administrations) {
            if (name.equals(administration.getName())) {
                return administration;
            }
        }
        return null;
    }
}

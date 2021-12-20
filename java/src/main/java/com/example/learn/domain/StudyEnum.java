package com.example.learn.domain;

import java.util.Arrays;

public enum StudyEnum {

    // 游戏展示位置
    FIRST("00", "测试1", 1,"uvValue"),
    PLAY("01", "测试2", 8,"uvValue"),
    EXPLOSION("02", "测试3", 4,"ecpm"),
    NEWBIE("03", "测试4", 5,"ecpm"),
    MOST("04", "测试5", 5,"ecpm"),
    THREE("05", "测试6", 5,"ecpm"),

    ;


    private final String moduleType;
    private final String desc;
    private final int showCount;
    private final String compareMethod;

    public static StudyEnum getGameModuleTypeByCode(String moduleType) {
        return Arrays.stream(values()).filter(t -> t.getModuleType().equals(moduleType)).findFirst().orElse(null);
    }

    private StudyEnum(String moduleType, String desc, int showCount, String compareMethod) {
        this.moduleType = moduleType;
        this.desc = desc;
        this.showCount = showCount;
        this.compareMethod = compareMethod;
    }

    public String getModuleType() {
        return moduleType;
    }

    public String getDesc() {
        return desc;
    }

    public int getShowCount() {
        return showCount;
    }

    public String getCompareMethod() {
        return compareMethod;
    }

    public static void main(String[] args) {
        for(StudyEnum studyEnum:StudyEnum.values()){
            System.out.println(studyEnum);
        }
    }
}

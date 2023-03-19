package com.test0318;

public class StudentSys {
    private String id;
    private String operate;

    public StudentSys() {
    }

    public StudentSys(String id, String operate) {
        this.id = id;
        this.operate = operate;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return operate
     */
    public String getOperate() {
        return operate;
    }

    /**
     * 设置
     * @param operate
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String toString() {
        return "StudentSys{id = " + id + ", operate = " + operate + "}";
    }
}

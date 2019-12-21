package com.huaxu.core.basic.aop.log;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: AopBean</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/05 17:15</p>
 * <p>创建用户：huaxu</p>
 */
public class AopBean {

    private String name;
    private String nickname;

    public AopBean(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
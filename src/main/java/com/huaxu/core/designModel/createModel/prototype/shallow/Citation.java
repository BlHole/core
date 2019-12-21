package com.huaxu.core.designModel.createModel.prototype.shallow;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Citation</p>
 * <p>创建日期: 2019/06/07 23:16</p>
 * <p>创建用户：huaxu</p>
 */
public class Citation implements Cloneable{

    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void display(){
        System.out.println("name="+name + " info="+info + " college="+college);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return super.clone();
    }
}
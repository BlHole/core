package com.huaxu.core.diy.killIfElse.Interface;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/05 20:22
 */
public class MyColor {

    private Color color;

    public MyColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void printColor(){
        this.color.printMyColor();
    }
}
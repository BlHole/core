package com.huaxu.core.basic.lambda.model;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/06 13:16
 */
public class Apple {

    private String id;
    private String color;
    private String weight;
    private String origin;

    public Apple(String id, String color, String weight, String origin) {
        this.id = id;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
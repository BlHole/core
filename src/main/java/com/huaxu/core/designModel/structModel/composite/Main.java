package com.huaxu.core.designModel.structModel.composite;

import com.huaxu.core.designModel.structModel.composite.impl.Bags;
import com.huaxu.core.designModel.structModel.composite.impl.Goods;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 组合模式</p>
 * <p>创建日期: 2019/06/10 23:19</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        Bags BigBag,mediumBag,smallRedBag,smallWhiteBag;
        Goods sp;
        BigBag=new Bags("大袋子");
        mediumBag=new Bags("中袋子");
        smallRedBag=new Bags("红色小袋子");
        smallWhiteBag=new Bags("白色小袋子");
        sp=new Goods("婺源特产",2,7.9f);
        smallRedBag.add(sp);
        sp=new Goods("婺源地图",1,9.9f);
        smallRedBag.add(sp);
        sp=new Goods("韶关香菇",2,68);
        smallWhiteBag.add(sp);
        sp=new Goods("韶关红茶",3,180);
        smallWhiteBag.add(sp);
        sp=new Goods("景德镇瓷器",1,380);
        mediumBag.add(sp);
        mediumBag.add(smallRedBag);
        sp=new Goods("李宁牌运动鞋",1,198);
        BigBag.add(sp);
        BigBag.add(smallWhiteBag);
        BigBag.add(mediumBag);
        System.out.println("您选购的商品有：");
        BigBag.show();
        System.out.println("要支付的总价是："+BigBag.calculation()+"元");
    }
}
package com.huaxu.core.diy.tomcat.core;

import com.huaxu.core.diy.tomcat.util.XmlUtils;
import org.dom4j.Element;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class Tomcat {


    public static final HashMap<String, Object> SERVLET_MAPPING = new HashMap<>();

    public static final HashMap<String, Object> SERVLET = new HashMap<>();



    public static void init() {
        InputStream io = null;
        try {
            System.out.println("加载配置文件开始");
            //读取配置文件
            XmlUtils xml = new XmlUtils(XmlUtils.class.getResource("/")+"web.xml");
            //将所有的类都存储到容器中
            List<Element> list = xml.getNodes("servlet");
            for (Element element : list) {
                SERVLET.put(element.element("servlet-name").getText(),
                        Class.forName(element.element("servlet-class").getText()).newInstance());
            }
            //映射关系创建
            List<Element> list2 = xml.getNodes("servlet-mapping");
            for (Element element : list2) {
                SERVLET_MAPPING.put(element.element("url-pattern").getText(),
                        element.element("servlet-name").getText());
            }
            System.out.println("加载配置文件结束");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (io != null) {
                try {
                    io.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
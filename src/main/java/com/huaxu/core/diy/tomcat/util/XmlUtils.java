package com.huaxu.core.diy.tomcat.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XmlUtils {
    /**
     * 定义解析器和文档对象
     */
    public SAXReader saxReader;
    public Document document;

    public XmlUtils(String path) {
        //获取解析器
        saxReader = new SAXReader();
        try {
            //获取文档对象
            document = saxReader.read(path);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取节点下的所有节点
     *
     * @param name
     * @return
     */
    public List<Element> getNodes(String name) {
        Element root = document.getRootElement();
        return root.elements(name);
    }
}

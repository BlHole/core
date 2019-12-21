package com.huaxu.core.diy.webSocket.model;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/25 10:36</p>
 * <p>author：huaxu</p>
 */
public class BarrageMessage implements Serializable {

    private static final long serialVersionUID = 8164917449041151208L;
    private static final String DEFAULT_IMAGES = "http://static.clewm.net/cli/images/beautify/logo/icon1.png";
    private String content;
    private String headImgUrl;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public BarrageMessage() {
    }

    public BarrageMessage(String content) {
        this.content = content;
        this.headImgUrl = DEFAULT_IMAGES;
    }

    public BarrageMessage(String content, String headImgUrl) {
        this.content = content;
        this.headImgUrl = StringUtils.isEmpty(headImgUrl) ? DEFAULT_IMAGES : headImgUrl;
    }

    @Override
    public String toString() {
        return "BarrageMessage{" +
                "content='" + content + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +
                '}';
    }
}
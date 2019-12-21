package com.huaxu.core.basic.json.gson;

import com.google.gson.*;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/30 00:41
 */
public class GsonTest {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Stu stu = new Stu();
        stu.setNo(89);
        stu.setName("huaxu");
        stu.setValue("JKs");
        String s = gson.toJson(stu);
        System.out.println(s);
    }

    private static void testLog() {
        JsonObject js = new JsonObject();
        js.addProperty("name", "huaxu");
        js.addProperty("value", "Charles");
        System.out.println(new Gson().toJson(js));
    }


    public static class Stu {
        private String name;
        private String value;
        private int no;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        @Override
        public String toString() {
            return "Stu{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    ", no=" + no +
                    '}';
        }
    }
}
package com.huaxu.core.diy.dynamicGenerateClass;


/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/17 18:14</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        String code = "public class HelloWorld {\n" +
                "    public static void main(String []args) {\n" +
                "\t\tfor(int i=0; i < 5; i++){\n" +
                "\t\t\t       System.out.println(\"Hello World!\");\n" +
                "\t\t}\n" +
                "    }\n" +
                "}";
        CustomStringJavaCompiler compiler = new CustomStringJavaCompiler(code);
        boolean res = compiler.compiler();
        if (res) {
            System.out.println("编译成功");
            System.out.println("compilerTakeTime：" + compiler.getCompilerTakeTime());
            try {
                compiler.runMainMethod();
                System.out.println("runTakeTime：" + compiler.getRunTakeTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(compiler.getRunResult());
            System.out.println("诊断信息：" + compiler.getCompilerMessage());
        } else {
            System.out.println("编译失败");
            System.out.println(compiler.getCompilerMessage());
        }
    }
}
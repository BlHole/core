package com.huaxu.core.diy.notNull;

public class Client {

    public void test(DependencyBase dependencyBase){
        Factory.get(dependencyBase).Operation();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.test(null);
        client.test(new Dependency());
    }
}
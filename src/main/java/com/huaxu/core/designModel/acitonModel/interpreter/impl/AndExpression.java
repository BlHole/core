package com.huaxu.core.designModel.acitonModel.interpreter.impl;

import com.huaxu.core.designModel.acitonModel.interpreter.inter.Expression;

public class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city,Expression person) {
        this.city = city;
        this.person = person;
    }

    public boolean interpret(String info) {
        String s[]=info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
package org.gyula.ejb.server;

import jakarta.annotation.Resource;
import jakarta.ejb.SessionContext;
import jakarta.ejb.Stateless;

@Stateless(name = "FirstBean")
public class BeanIntroImplementation implements BeanIntroInterface {

    @Resource
    private SessionContext context;

    @Override
    public String getMessage() {
        return "Welcome, kid, to the world of EJB!";
    }
}

package org.gyula.ejb.server;

import javax.ejb.Remote;

@Remote
public interface BeanIntroInterface {
    String getMessage();
}

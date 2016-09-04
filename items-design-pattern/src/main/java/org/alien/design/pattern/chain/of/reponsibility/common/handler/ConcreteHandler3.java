package org.alien.design.pattern.chain.of.reponsibility.common.handler;

import org.alien.design.pattern.chain.of.reponsibility.common.buz.Level;
import org.alien.design.pattern.chain.of.reponsibility.common.buz.Request;
import org.alien.design.pattern.chain.of.reponsibility.common.buz.Response;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class ConcreteHandler3 extends Handler {
    @Override
    protected Response echo(Request request) {
        System.out.println("ConcreteHandler3.echo");
        return null;
    }

    @Override
    protected Level getHandlerLevel() {
        return null;
    }
}

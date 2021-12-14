package com.benson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class LOG_CFG {

    private static final Logger LOG = LoggerFactory.getLogger(LOG_CFG.class);

    public static void main(String[] args) {

        //log4j2切换配置的方式
        LoggerContext ctx = (LoggerContext)LogManager.getContext();
        LOG.error("switching log4j config file : {}", "src/main/resources/log4j2.xml");
        ctx.setConfigLocation(                                                               new File("src/main/resources/log4j2-v2.xml").toURI());
        //ctx.setConfigLocation(new File("/Users/sefarious/workspace/github.com/zxpbenson/log4j-poc-demo/src/main/resources/log4j2-v2.xml").toURI());
        //ctx.reconfigure();
        LOG.error("switching log4j config file done");
    }
}

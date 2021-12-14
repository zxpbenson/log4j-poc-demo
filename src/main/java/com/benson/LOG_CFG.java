package com.benson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class LOG_CFG {

    private static Logger LOG = LoggerFactory.getLogger(LOG_CFG.class);

    public static void main(String[] args) {

        //log4j2切换配置的方式
        //LoggerContext ctx = (LoggerContext) LogManager.getContext(true);
        LOG.error("switching log4j config file : {}", "src/main/resources/log4j2.xml");
        //ctx.setConfigLocation(new File("src/main/resources/log4j2-v2.xml").toURI());
        //ctx.reconfigure();//这个没用
        Configurator.reconfigure(new File("src/main/resources/log4j2-v2.xml").toURI());//这个ok
        LOG.error("switching log4j config file done");
    }
}

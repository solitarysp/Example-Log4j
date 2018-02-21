package com.thanh.services;/*
  By Chi Can Em  21-02-2018
 */

import org.apache.log4j.Logger;

public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }
}

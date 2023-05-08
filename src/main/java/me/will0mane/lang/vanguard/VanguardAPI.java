package me.will0mane.lang.vanguard;

import java.util.logging.Logger;

public class VanguardAPI {

    private static final Logger logger = Logger.getLogger("Vanguard");

    public static void main(String[] args) {
        logger.info("Vanguard API is working well!");
    }

    public static Logger getLogger(){
        return logger;
    }
}
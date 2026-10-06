package org.ayush.bank.bankingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class BankingApiApplication {

    public static void main(String[] args) {
        // PgJDBC sends the JVM default timezone during startup. Use PostgreSQL's
        // canonical name because some JDKs report the legacy "Asia/Calcutta" alias.
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
        SpringApplication.run(BankingApiApplication.class, args);
    }

}

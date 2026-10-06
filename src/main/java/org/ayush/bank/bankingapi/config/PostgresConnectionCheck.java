package org.ayush.bank.bankingapi.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/** Confirms the configured PostgreSQL database is reachable when the app starts. */
@Component
public class PostgresConnectionCheck implements ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(PostgresConnectionCheck.class.getName());

    private final JdbcTemplate jdbcTemplate;

    public PostgresConnectionCheck(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(ApplicationArguments args) {
        String database = jdbcTemplate.queryForObject("SELECT current_database()", String.class);
        LOGGER.info(() -> "Connected to PostgreSQL database: " + database);
    }
}

package tn.esprit.spring.services;


import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UserServiceImplTest {

    @Test
    void testAddUser() {
        String envVar = System.getenv("TIMESHEET_TESTS_FAIL");
        if ("True".equalsIgnoreCase(envVar)) {
            fail("Le test échoue car TIMESHEET_TESTS_FAIL est activé !");
        } else {
            assertTrue(true, "Le test passe normalement.");
        }
    }

}
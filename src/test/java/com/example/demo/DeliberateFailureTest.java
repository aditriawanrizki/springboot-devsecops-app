package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

class DeliberateFailureTest {

    @Test
    void intentionalFailure() {
        fail("INTENTIONAL FAILURE - DevSecOps pipeline test");
    }
}
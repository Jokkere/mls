package com.mlsystem.imggus.controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    public List<TestClass> getTestClass() {
        return List.of(
                new TestClass("Test", 1L)
        );
    }
}

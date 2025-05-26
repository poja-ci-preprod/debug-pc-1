package com.example.demo.handler.model;

import com.example.demo.PojaGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;

@PojaGenerated
public record ErrorModel(@JsonProperty("message") String message) {}

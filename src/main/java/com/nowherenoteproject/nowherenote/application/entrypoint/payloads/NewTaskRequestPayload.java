package com.nowherenoteproject.nowherenote.application.entrypoint.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record NewTaskRequestPayload (
            @JsonProperty("name") String name,
            @JsonProperty("content") String content,
            @JsonProperty("createdOn") Instant createdOn
        ){}

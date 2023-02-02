package com.nowherenoteproject.nowherenote.domain.entity;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.UUID;

@Component
public class Task {

    private UUID uuid;
    private String name;
    private Instant createdOn;
    private String content;

    public String getName() {
        return name;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public String getContent() {
        return content;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package com.nowherenoteproject.nowherenote.domain.entity;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Board {
    private Task tasks;

    public Set<Task> getTasks() {
        return Set.of(tasks);
    }
}

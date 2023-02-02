package com.nowherenoteproject.nowherenote.domain.usecase;

import com.nowherenoteproject.nowherenote.domain.entity.Task;
import com.nowherenoteproject.nowherenote.domain.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class WriteNewTaskUseCase {
    private TaskRepository repository;
    public WriteNewTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public void write(Task task){
        task.setUuid(UUID.randomUUID());
        task.setCreatedOn(Instant.now());

        repository.saveTask(task);
    }
}

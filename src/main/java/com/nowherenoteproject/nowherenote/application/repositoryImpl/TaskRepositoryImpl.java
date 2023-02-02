package com.nowherenoteproject.nowherenote.application.repositoryImpl;

import com.nowherenoteproject.nowherenote.domain.entity.Task;
import com.nowherenoteproject.nowherenote.domain.repository.TaskRepository;

import java.util.Set;
import java.util.UUID;

public class TaskRepositoryImpl implements TaskRepository{

    @Override
    public Set<Task> findAllTasks() {
        return null;
    }

    @Override
    public Task findTaskByID(UUID uuid) {
        return null;
    }

    @Override
    public void removeTask(UUID uuid) {

    }

    @Override
    public void saveTask(Task taskToSave) {

    }
}

package com.nowherenoteproject.nowherenote.domain.repository;

import java.util.Set;
import java.util.UUID;
import com.nowherenoteproject.nowherenote.domain.entity.Task;

public interface TaskRepository {
    Set <Task> findAllTasks();
    Task findTaskByID(UUID uuid);
    void removeTask(UUID uuid);
    void saveTask(Task taskToSave);

}

package com.nowherenoteproject.nowherenote.application.entrypoint.converter;

import com.nowherenoteproject.nowherenote.application.entrypoint.payloads.NewTaskRequestPayload;
import com.nowherenoteproject.nowherenote.domain.entity.Task;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class TaskPayloadToTaskEntityConverter implements Converter<NewTaskRequestPayload, Task> {

    @Override
    public Task convert(NewTaskRequestPayload source) {
        Task newTask = new Task();

        newTask.setName(source.name());
        newTask.setContent(source.content());

        return newTask;
    }
}

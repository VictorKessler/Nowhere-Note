package com.nowherenoteproject.nowherenote.application.entrypoint.http;

import com.nowherenoteproject.nowherenote.application.entrypoint.payloads.NewTaskRequestPayload;
import com.nowherenoteproject.nowherenote.domain.entity.Task;
import com.nowherenoteproject.nowherenote.domain.usecase.WriteNewTaskUseCase;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TasksController {
    private WriteNewTaskUseCase writeNewTaskUseCase;
    private ConversionService conversionService;

    public TasksController(WriteNewTaskUseCase writeNewTaskUseCase, ConversionService conversionService) {
        this.writeNewTaskUseCase = writeNewTaskUseCase;
        this.conversionService = conversionService;
    }

    @PostMapping("/new-task")
    public ResponseEntity<Task> newTask(@RequestBody final NewTaskRequestPayload body){

        Task newTask = conversionService.convert(body, Task.class);

        writeNewTaskUseCase.write(newTask);

        return new ResponseEntity<>(HttpStatusCode.valueOf(202));
    }
}

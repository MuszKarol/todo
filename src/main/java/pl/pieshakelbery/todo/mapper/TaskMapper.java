package pl.pieshakelbery.todo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Repository;
import pl.pieshakelbery.todo.dto.TaskDTO;
import pl.pieshakelbery.todo.entity.Task;

import java.util.List;


@Repository
@Mapper(componentModel = "spring")
public interface TaskMapper {

    @Mappings({
            @Mapping(target = "id", source = "task.id"),
            @Mapping(target = "title", source = "task.title"),
            @Mapping(target = "description", source = "task.description")
    })
    TaskDTO taskToTaskDTO(Task task);


    @Mappings({
            @Mapping(target = "id", source = "taskDTO.id"),
            @Mapping(target = "title", source = "taskDTO.title"),
            @Mapping(target = "description", source = "taskDTO.description")
    })
    Task taskDtoToTask(TaskDTO taskDTO);

    List<TaskDTO> taskListToTaskDtoList(List<Task> tasks);
}

package mangoAtlas.Controller;

import mangoAtlas.Model.Task;
import mangoAtlas.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String home(){
        return "Welcome to HomePage";
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Task add(@RequestBody Task task){
       return taskService.addTask(task);
    }

    @GetMapping("/allTask")
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

    @GetMapping("/getById/{taskId}")
    public Task getTaskById(@PathVariable String taskId){
        return taskService.getTaskById(taskId);
    }

    @GetMapping("/getBySeverity")
    public List<Task> getTaskBySeverity(@RequestParam String severity){
        return taskService.getTaskBySeverity(severity);
    }

    @GetMapping("/getByAssignee")
    public List<Task> getTaskByAssignee(@RequestParam String assignee){
        return taskService.getTaskByAssignee(assignee);
    }

    @PutMapping("/update")
    public Task UpdateTask(@RequestBody Task task){
        return taskService.updatedTask(task);
    }

    @DeleteMapping("/delete")
    public String deleteTask(@RequestParam String taskId){
        return taskService.deleteTaskById(taskId);
    }
}

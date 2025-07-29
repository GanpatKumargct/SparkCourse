package mangoAtlas.Service;

import mangoAtlas.Model.Task;
import mangoAtlas.Repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepository;

    //CRUD

    //Add the data
    public Task addTask(Task task){
        Task save = taskRepository.save(task);
        return save;
    }

    //get all task
    public List<Task> getAllTask(){
        List<Task> all = taskRepository.findAll();
        return all;
    }

    //get Task By id
    public Task getTaskById(String taskId){
        return taskRepository.findById(taskId).get();
    }

    public List<Task> getTaskBySeverity(int severity){
        return taskRepository.findBySeverity(severity);
    }

    public List<Task> getTaskByAssignee(String assignee){
        List<Task> byAssignee = taskRepository.findByAssignee(assignee);
        return byAssignee;
    }

    public Task updatedTask(Task taskRequest){
        Task existingTask = taskRepository.findById(taskRequest.getTaskId()).get();

        existingTask.setAssignee(taskRequest.getAssignee());
        existingTask.setDescription(taskRequest.getDescription());
        existingTask.setSeverity(taskRequest.getSeverity());
        existingTask.setStoryPoint(taskRequest.getStoryPoint());

        return taskRepository.save(existingTask);
    }

    public String deleteTaskById(String TaskId){
        taskRepository.deleteById(TaskId);
       return "Deleted Successfully";
    }
}

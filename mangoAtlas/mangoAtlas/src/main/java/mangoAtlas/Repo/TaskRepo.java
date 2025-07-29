package mangoAtlas.Repo;

import mangoAtlas.Model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends MongoRepository<Task, String> {
    List<Task> findBySeverity(int severity);

    @Query("{ assignee:?0 }")
    List<Task> findByAssignee(String assignee);
}

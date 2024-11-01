package backend.stageproject.Repository;

import backend.stageproject.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByOperationId(UUID operationId);

    Task findTopByCodeStartingWithOrderByCodeDesc(String baseCode);

}
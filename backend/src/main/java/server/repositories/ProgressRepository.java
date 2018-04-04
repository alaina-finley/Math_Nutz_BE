package server.repositories;

import server.models.Progress;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Integer> {
  @Query(name = "findByProgress", value = "select * from progress p where p.id = :id", nativeQuery = true)
  Progress findByProgressId(@Param("id") Integer id);

  @Query(value = "delete from progress p where p.id = :id", nativeQuery = true)
  Progress deleteByProgressId(@Param("id") Integer id);
}

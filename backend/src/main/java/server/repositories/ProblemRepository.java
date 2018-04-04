package server.repositories;

import server.models.Problem;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer> {
  @Query(value = "select * from problem p where p.id = :id", nativeQuery = true)
  Problem findByProblemId(@Param("id") Integer id);
  // Problem findById(Integer id);
  @Query(value = "delete from problem p where p.id = :id", nativeQuery = true)
  Problem deleteByProblemId(@Param("id") Integer id);
}

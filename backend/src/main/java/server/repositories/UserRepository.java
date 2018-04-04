package server.repositories;

import server.models.User;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  @Query(value = "select * from island_user u where u.id = :id", nativeQuery = true)
  User findByUserId(@Param("id") Integer id);
  // Problem findById(Integer id);
  @Query(value = "delete from island_user u where u.id = :id", nativeQuery = true)
  User deleteByUserId(@Param("id") Integer id);
}

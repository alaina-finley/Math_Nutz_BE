package server.repositories;

import server.models.Coins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;

@Repository
public interface CoinsRepository extends JpaRepository<Coins, Integer> {
  @Query(name = "findByCoins", value = "select * from coins p where p.id = :id", nativeQuery = true)
  Coins findByCoinsId(@Param("id") Integer id);

  @Query(value = "delete from coins p where p.id = :id", nativeQuery = true)
  Coins deleteByCoinsId(@Param("id") Integer id);
}

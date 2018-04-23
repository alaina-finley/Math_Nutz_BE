package server.repositories;

import server.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
  @Query(name = "findByStore", value = "select * from store p where p.id = :id", nativeQuery = true)
  Store findByStoreId(@Param("id") Integer id);

  @Query(value = "delete from store p where p.id = :id", nativeQuery = true)
  Store deleteByStoreId(@Param("id") Integer id);
}

package hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Person, String> {
}
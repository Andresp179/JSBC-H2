package exceptions.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import exceptions.models.user;

public interface UserRepository extends JpaRepository<user, Long>{

}

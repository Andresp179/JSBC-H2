package Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackerrank.sample.dto.StringResponse;

@Repository
public interface StringResponseRepository extends JpaRepository<StringResponse,String>{

}

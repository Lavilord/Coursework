package lviv.iot.repository;

import lviv.iot.models.BmpData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BmpDataRepository extends JpaRepository<BmpData,Integer> {
}

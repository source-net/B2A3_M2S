package B2A3_M2S.mes.repository;

import B2A3_M2S.mes.entity.BOM;
import com.querydsl.core.BooleanBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BOMRepository extends JpaRepository<BOM, Long> , QuerydslPredicateExecutor<BOM> {

    List<BOM> findAll();


}

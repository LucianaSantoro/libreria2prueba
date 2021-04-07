package ar.com.ada.second.tpfinalsantoro.library.model.repository;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.UserHasLoanId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHasLoanIdRepository extends JpaRepository<UserHasLoanId, Long> {
}

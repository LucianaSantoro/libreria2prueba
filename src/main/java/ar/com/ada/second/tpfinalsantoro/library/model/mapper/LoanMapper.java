package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Loan;
import org.mapstruct.factory.Mappers;

public interface LoanMapper extends DataMapper<LoanMapper, Loan>{

    LoanMapper MAPPER = Mappers.getMapper(LoanMapper.class);

}

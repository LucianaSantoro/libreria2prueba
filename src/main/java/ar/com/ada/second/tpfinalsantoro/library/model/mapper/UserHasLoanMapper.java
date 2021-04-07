package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.UserHasLoan;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserHasLoanMapper {

    UserHasLoanMapper MAPPER = Mappers.getMapper(UserHasLoanMapper.class);

}

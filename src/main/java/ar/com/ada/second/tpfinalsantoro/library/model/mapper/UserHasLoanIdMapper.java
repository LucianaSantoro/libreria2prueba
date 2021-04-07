package ar.com.ada.second.tpfinalsantoro.library.model.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserHasLoanIdMapper {

    UserHasLoanIdMapper MAPPER = Mappers.getMapper(UserHasLoanIdMapper.class);
}

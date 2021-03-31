package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.dto.UserDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends DataMapper <UserDTO, User>{

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

}

package ar.com.ada.second.tpfinalsantoro.library.model.mapper;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.User;
import org.mapstruct.factory.Mappers;

public interface UserMapper extends DataMapper <UserMapper, User>{

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

}

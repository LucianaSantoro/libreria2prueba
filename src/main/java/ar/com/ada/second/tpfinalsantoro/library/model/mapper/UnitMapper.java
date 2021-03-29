package ar.com.ada.second.tpfinalsantoro.library.model.mapper;


import ar.com.ada.second.tpfinalsantoro.library.model.dto.UnitDTO;
import ar.com.ada.second.tpfinalsantoro.library.model.entity.Unit;
import org.mapstruct.factory.Mappers;

public interface UnitMapper extends DataMapper <UnitDTO, Unit> {

    UnitMapper MAPPER = Mappers.getMapper(UnitMapper.class);

}

package com.karumien.hris.openapi.mapper;

import javax.annotation.Nonnull;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.karumien.hris.openapi.model.hris.CustomRequest;
import com.karumien.hris.openapi.model.hris.CustomResponse;


/**
 * @author Ondrej Havelka
 */
@Mapper
public interface ReplacerMapper {

    ReplacerMapper REPLACER_MAPPER = Mappers.getMapper(ReplacerMapper.class);

    @Mapping(source = "personal.custom.field1620721757321", target = "personal.custom.citizenship")
    @Mapping(source = "personal.custom.field1620656620397", target = "personal.custom.birthSurname")
    @Mapping(source = "personal.custom.field1620656651374", target = "personal.custom.countryOfBirth")
    @Mapping(source = "personal.custom.field1620656641418", target = "personal.custom.cityOfBirth")
    @Mapping(source = "personal.custom.field1620656719091", target = "personal.custom.birthNumber")
    CustomResponse customRequestToCustomResponse(@Nonnull CustomRequest customRequest);

}

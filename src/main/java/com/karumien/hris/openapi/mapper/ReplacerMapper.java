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

    @Mapping(source = "personal.custom.field1620721757321", target = "personal.citizenship")
    @Mapping(source = "personal.custom.field1620656620397", target = "personal.birthSurname")
    @Mapping(source = "personal.custom.field1620656651374", target = "personal.countryOfBirth")
    @Mapping(source = "personal.custom.field1620656641418", target = "personal.cityOfBirth")
    @Mapping(source = "personal.custom.field1620656719091", target = "personal.birthNumber")
    @Mapping(source = "work.customColumns.column1620832556726", target = "work.businessUnitId")
    @Mapping(source = "work.customColumns.column1620832454233", target = "work.note")
    @Mapping(source = "work.customColumns.column1621859812592", target = "work.reason")
    @Mapping(source = "work.customColumns.column1620832033458", target = "work.budgetId")
    @Mapping(source = "work.customColumns.column1620832653579", target = "work.profitAndCostCenterId")
    @Mapping(source = "work.customColumns.column1620832080748", target = "work.legalEntity")
    @Mapping(source = "work.customColumns.column1621536524514", target = "work.costCenterCost")
    @Mapping(source = "work.customColumns.column1622629726113", target = "work.adRole")
    @Mapping(source = "work.customColumns.column1620847674358", target = "work.dottedLineManager")
    @Mapping(source = "work.customColumns.column1620847694365", target = "work.hrBusinessPartner")
    @Mapping(source = "work.customColumns.column1620832362165", target = "work.businessUnitOrFunction")
    @Mapping(source = "work.customColumns.column1620847706988", target = "work.hrGeneralist")
    @Mapping(source = "work.customColumns.column1620843628717", target = "work.customSecondLevelManager")
    @Mapping(source = "work.customColumns.column1620847723325", target = "work.payrollSpecialist")
    @Mapping(source = "about.custom.field1620723273420", target = "about.favoriteSnack")
    CustomResponse customRequestToCustomResponse(@Nonnull CustomRequest customRequest);

}

/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.dao;

import java.util.List;

import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal2;
import org.smartdatahub.liq.entity.original.CodeOutstandingType;
import org.smartdatahub.liq.enums.CodeOutstandingTypeFields;
import org.springframework.stereotype.Component;

@Component
public class CodeOutstandingTypeDAO extends AbstractJpaDAO<CodeOutstandingType, IdClassFamGlobal2> {

  public CodeOutstandingTypeDAO() {
    super(CodeOutstandingType.class, IdClassFamGlobal2.class);
  }

  public List<CodeOutstandingType> getOutstandingTypesByColumnValue(
      CodeOutstandingTypeFields column, List<String> values, int offset, int maxResults) {
    return super.getByFieldsWithValue(
        column.getFieldName(),
        column.getLength(),
        values,
        column.isChar(),
        null,
        -1,
        null,
        false,
        offset,
        maxResults);
  }

  public List<CodeOutstandingType> getOutstandingTypesByColumnValue(
      CodeOutstandingTypeFields column1,
      List<String> values1,
      CodeOutstandingTypeFields column2,
      List<String> values2,
      int offset,
      int maxResults) {
    return super.getByFieldsWithValue(
        column1.getFieldName(),
        column1.getLength(),
        values1,
        column1.isChar(),
        column2.getFieldName(),
        column2.getLength(),
        values2,
        column2.isChar(),
        offset,
        maxResults);
  }
}

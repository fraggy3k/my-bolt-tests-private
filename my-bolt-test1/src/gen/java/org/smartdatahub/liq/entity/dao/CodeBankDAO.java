/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.dao;

import java.util.List;

import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal2;
import org.smartdatahub.liq.entity.original.CodeBank;
import org.smartdatahub.liq.enums.CodeBankFields;
import org.springframework.stereotype.Component;

@Component
public class CodeBankDAO extends AbstractJpaDAO<CodeBank, IdClassFamGlobal2> {

  public CodeBankDAO() {
    super(CodeBank.class, IdClassFamGlobal2.class);
  }

  public List<CodeBank> getBanksByColumnValue(
      CodeBankFields column, List<String> values, int offset, int maxResults) {
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

  public List<CodeBank> getBanksByColumnValue(
      CodeBankFields column1,
      List<String> values1,
      CodeBankFields column2,
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

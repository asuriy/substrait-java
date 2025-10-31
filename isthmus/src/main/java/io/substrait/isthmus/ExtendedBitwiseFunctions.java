package io.substrait.isthmus;

import org.apache.calcite.sql.SqlBasicFunction;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlFunctionCategory;
import org.apache.calcite.sql.type.OperandTypes;
import org.apache.calcite.sql.type.ReturnTypes;
import org.apache.calcite.sql.type.SqlTypeFamily;

public class ExtendedBitwiseFunctions {

  public static final SqlFunction SHIFT_LEFT =
      SqlBasicFunction.create(
          "SHIFT_LEFT",
          ReturnTypes.ARG0,
          OperandTypes.family(SqlTypeFamily.INTEGER, SqlTypeFamily.INTEGER),
          SqlFunctionCategory.NUMERIC);

  public static final SqlFunction SHIFT_RIGHT =
      SqlBasicFunction.create(
          "SHIFT_RIGHT",
          ReturnTypes.ARG0,
          OperandTypes.family(SqlTypeFamily.INTEGER, SqlTypeFamily.INTEGER),
          SqlFunctionCategory.NUMERIC);

  public static final SqlFunction SHIFT_RIGHT_UNSIGNED =
      SqlBasicFunction.create(
          "SHIFT_RIGHT_UNSIGNED",
          ReturnTypes.ARG0,
          OperandTypes.family(SqlTypeFamily.INTEGER, SqlTypeFamily.INTEGER),
          SqlFunctionCategory.NUMERIC);
}

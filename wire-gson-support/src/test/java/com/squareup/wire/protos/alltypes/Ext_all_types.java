/**
 * Code generated by Wire protobuf compiler, do not edit.
 * Source file: ../wire-runtime/src/test/proto/all_types.proto
 */
package com.squareup.wire.protos.alltypes;

import com.squareup.wire.ByteString;
import com.squareup.wire.Extension;
import java.util.List;

import static com.squareup.wire.Message.Datatype;
import static com.squareup.wire.Message.Label;

public final class Ext_all_types {

  private Ext_all_types() {
  }

  public static final Extension<AllTypes, Integer> ext_opt_int32 = Extension.getExtension("squareup.protos.alltypes.ext_opt_int32", AllTypes.class, 1001, Datatype.INT32, Label.OPTIONAL);
  public static final Extension<AllTypes, Integer> ext_opt_uint32 = Extension.getExtension("squareup.protos.alltypes.ext_opt_uint32", AllTypes.class, 1002, Datatype.UINT32, Label.OPTIONAL);
  public static final Extension<AllTypes, Integer> ext_opt_sint32 = Extension.getExtension("squareup.protos.alltypes.ext_opt_sint32", AllTypes.class, 1003, Datatype.SINT32, Label.OPTIONAL);
  public static final Extension<AllTypes, Integer> ext_opt_fixed32 = Extension.getExtension("squareup.protos.alltypes.ext_opt_fixed32", AllTypes.class, 1004, Datatype.FIXED32, Label.OPTIONAL);
  public static final Extension<AllTypes, Integer> ext_opt_sfixed32 = Extension.getExtension("squareup.protos.alltypes.ext_opt_fixed32", AllTypes.class, 1005, Datatype.SFIXED32, Label.OPTIONAL);
  public static final Extension<AllTypes, Long> ext_opt_int64 = Extension.getExtension("squareup.protos.alltypes.ext_opt_int64", AllTypes.class, 1006, Datatype.INT64, Label.OPTIONAL);
  public static final Extension<AllTypes, Long> ext_opt_uint64 = Extension.getExtension("squareup.protos.alltypes.ext_opt_uint64", AllTypes.class, 1007, Datatype.UINT64, Label.OPTIONAL);
  public static final Extension<AllTypes, Long> ext_opt_sint64 = Extension.getExtension("squareup.protos.alltypes.ext_opt_sint64", AllTypes.class, 1008, Datatype.SINT64, Label.OPTIONAL);
  public static final Extension<AllTypes, Long> ext_opt_fixed64 = Extension.getExtension("squareup.protos.alltypes.ext_opt_fixed64", AllTypes.class, 1009, Datatype.FIXED64, Label.OPTIONAL);
  public static final Extension<AllTypes, Long> ext_opt_sfixed64 = Extension.getExtension("squareup.protos.alltypes.ext_opt_fixed64", AllTypes.class, 1010, Datatype.SFIXED64, Label.OPTIONAL);
  public static final Extension<AllTypes, Boolean> ext_opt_bool = Extension.getExtension("squareup.protos.alltypes.ext_opt_bool", AllTypes.class, 1011, Datatype.BOOL, Label.OPTIONAL);
  public static final Extension<AllTypes, Float> ext_opt_float = Extension.getExtension("squareup.protos.alltypes.ext_opt_float", AllTypes.class, 1012, Datatype.FLOAT, Label.OPTIONAL);
  public static final Extension<AllTypes, Double> ext_opt_double = Extension.getExtension("squareup.protos.alltypes.ext_opt_double", AllTypes.class, 1013, Datatype.DOUBLE, Label.OPTIONAL);
  public static final Extension<AllTypes, String> ext_opt_string = Extension.getExtension("squareup.protos.alltypes.ext_opt_string", AllTypes.class, 1014, Datatype.STRING, Label.OPTIONAL);
  public static final Extension<AllTypes, ByteString> ext_opt_bytes = Extension.getExtension("squareup.protos.alltypes.ext_opt_bytes", AllTypes.class, 1015, Datatype.BYTES, Label.OPTIONAL);
  public static final Extension<AllTypes, AllTypes.NestedEnum> ext_opt_nested_enum = Extension.getEnumExtension("squareup.protos.alltypes.ext_opt_nested_enum", AllTypes.class, 1016, Label.OPTIONAL, AllTypes.NestedEnum.class);
  public static final Extension<AllTypes, AllTypes.NestedMessage> ext_opt_nested_message = Extension.getMessageExtension("squareup.protos.alltypes.ext_opt_nested_message", AllTypes.class, 1017, Label.OPTIONAL, AllTypes.NestedMessage.class);
  public static final Extension<AllTypes, List<Integer>> ext_rep_int32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_int32", AllTypes.class, 1101, Datatype.INT32, false);
  public static final Extension<AllTypes, List<Integer>> ext_rep_uint32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_uint32", AllTypes.class, 1102, Datatype.UINT32, false);
  public static final Extension<AllTypes, List<Integer>> ext_rep_sint32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_sint32", AllTypes.class, 1103, Datatype.SINT32, false);
  public static final Extension<AllTypes, List<Integer>> ext_rep_fixed32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_fixed32", AllTypes.class, 1104, Datatype.FIXED32, false);
  public static final Extension<AllTypes, List<Integer>> ext_rep_sfixed32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_sfixed32", AllTypes.class, 1105, Datatype.SFIXED32, false);
  public static final Extension<AllTypes, List<Long>> ext_rep_int64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_int64", AllTypes.class, 1106, Datatype.INT64, false);
  public static final Extension<AllTypes, List<Long>> ext_rep_uint64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_uint64", AllTypes.class, 1107, Datatype.UINT64, false);
  public static final Extension<AllTypes, List<Long>> ext_rep_sint64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_sint64", AllTypes.class, 1108, Datatype.SINT64, false);
  public static final Extension<AllTypes, List<Long>> ext_rep_fixed64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_fixed64", AllTypes.class, 1109, Datatype.FIXED64, false);
  public static final Extension<AllTypes, List<Long>> ext_rep_sfixed64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_sfixed64", AllTypes.class, 1110, Datatype.SFIXED64, false);
  public static final Extension<AllTypes, List<Boolean>> ext_rep_bool = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_bool", AllTypes.class, 1111, Datatype.BOOL, false);
  public static final Extension<AllTypes, List<Float>> ext_rep_float = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_float", AllTypes.class, 1112, Datatype.FLOAT, false);
  public static final Extension<AllTypes, List<Double>> ext_rep_double = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_double", AllTypes.class, 1113, Datatype.DOUBLE, false);
  public static final Extension<AllTypes, List<String>> ext_rep_string = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_string", AllTypes.class, 1114, Datatype.STRING, false);
  public static final Extension<AllTypes, List<ByteString>> ext_rep_bytes = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_rep_bytes", AllTypes.class, 1115, Datatype.BYTES, false);
  public static final Extension<AllTypes, List<AllTypes.NestedEnum>> ext_rep_nested_enum = Extension.getRepeatedEnumExtension("squareup.protos.alltypes.ext_rep_nested_enum", AllTypes.class, 1116, false, AllTypes.NestedEnum.class);
  public static final Extension<AllTypes, List<AllTypes.NestedMessage>> ext_rep_nested_message = Extension.getRepeatedMessageExtension("squareup.protos.alltypes.ext_rep_nested_message", AllTypes.class, 1117, AllTypes.NestedMessage.class);
  public static final Extension<AllTypes, List<Integer>> ext_pack_int32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_int32", AllTypes.class, 1201, Datatype.INT32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_uint32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_uint32", AllTypes.class, 1202, Datatype.UINT32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_sint32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_sint32", AllTypes.class, 1203, Datatype.SINT32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_fixed32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_fixed32", AllTypes.class, 1204, Datatype.FIXED32, true);
  public static final Extension<AllTypes, List<Integer>> ext_pack_sfixed32 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_sfixed32", AllTypes.class, 1205, Datatype.SFIXED32, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_int64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_int64", AllTypes.class, 1206, Datatype.INT64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_uint64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_uint64", AllTypes.class, 1207, Datatype.UINT64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_sint64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_sint64", AllTypes.class, 1208, Datatype.SINT64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_fixed64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_fixed64", AllTypes.class, 1209, Datatype.FIXED64, true);
  public static final Extension<AllTypes, List<Long>> ext_pack_sfixed64 = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_sfixed64", AllTypes.class, 1210, Datatype.SFIXED64, true);
  public static final Extension<AllTypes, List<Boolean>> ext_pack_bool = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_bool", AllTypes.class, 1211, Datatype.BOOL, true);
  public static final Extension<AllTypes, List<Float>> ext_pack_float = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_float", AllTypes.class, 1212, Datatype.FLOAT, true);
  public static final Extension<AllTypes, List<Double>> ext_pack_double = Extension.getRepeatedExtension("squareup.protos.alltypes.ext_pack_double", AllTypes.class, 1213, Datatype.DOUBLE, true);
  public static final Extension<AllTypes, List<AllTypes.NestedEnum>> ext_pack_nested_enum = Extension.getRepeatedEnumExtension("squareup.protos.alltypes.ext_pack_nested_enum", AllTypes.class, 1216, true, AllTypes.NestedEnum.class);
}

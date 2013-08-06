/**
 * Code generated by Wire protobuf compiler, do not edit.
 * Source file: ../wire-runtime/src/test/proto/simple_message.proto
 */
package com.squareup.wire.protos.simple;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import com.squareup.wire.protos.foreign.ForeignEnum;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.DOUBLE;
import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class SimpleMessage extends Message {

  public static final Integer DEFAULT_OPTIONAL_INT32 = 123;
  public static final NestedMessage DEFAULT_OPTIONAL_NESTED_MSG = getDefaultInstance(NestedMessage.class);
  public static final ExternalMessage DEFAULT_OPTIONAL_EXTERNAL_MSG = getDefaultInstance(ExternalMessage.class);
  public static final NestedEnum DEFAULT_DEFAULT_NESTED_ENUM = NestedEnum.BAZ;
  public static final Integer DEFAULT_REQUIRED_INT32 = 456;
  public static final List<Double> DEFAULT_REPEATED_DOUBLE = Collections.emptyList();
  public static final ForeignEnum DEFAULT_DEFAULT_FOREIGN_ENUM = com.squareup.wire.protos.foreign.ForeignEnum.BAX;
  public static final ForeignEnum DEFAULT_NO_DEFAULT_FOREIGN_ENUM = com.squareup.wire.protos.foreign.ForeignEnum.BAV;
  public static final String DEFAULT_PACKAGE = "";

  /**
   * An optional int32
   */
  @ProtoField(
    tag = 1,
    type = INT32
  )
  public final Integer optional_int32;

  /**
   * An optional NestedMessage
   */
  @ProtoField(
    tag = 2
  )
  public final NestedMessage optional_nested_msg;

  /**
   * An optional ExternalMessage
   */
  @ProtoField(
    tag = 3
  )
  public final ExternalMessage optional_external_msg;

  @ProtoField(
    tag = 4,
    type = ENUM
  )
  public final NestedEnum default_nested_enum;

  /**
   * A required int32
   */
  @ProtoField(
    tag = 5,
    type = INT32,
    label = REQUIRED
  )
  public final Integer required_int32;

  /**
   * A repeated double
   */
  @ProtoField(
    tag = 6,
    type = DOUBLE,
    label = REPEATED
  )
  public final List<Double> repeated_double;

  /**
   * enum from another package with an explicit default
   */
  @ProtoField(
    tag = 7,
    type = ENUM
  )
  public final ForeignEnum default_foreign_enum;

  /**
   * enum from another package without an explicit default
   */
  @ProtoField(
    tag = 8,
    type = ENUM
  )
  public final ForeignEnum no_default_foreign_enum;

  /**
   * field with the same name as a Java keyword
   */
  @ProtoField(
    tag = 9,
    type = STRING
  )
  public final String _package;

  private SimpleMessage(Builder builder) {
    super(builder);
    this.optional_int32 = builder.optional_int32;
    this.optional_nested_msg = builder.optional_nested_msg;
    this.optional_external_msg = builder.optional_external_msg;
    this.default_nested_enum = builder.default_nested_enum;
    this.required_int32 = builder.required_int32;
    this.repeated_double = unmodifiableCopyOf(builder.repeated_double);
    this.default_foreign_enum = builder.default_foreign_enum;
    this.no_default_foreign_enum = builder.no_default_foreign_enum;
    this._package = builder._package;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof SimpleMessage)) return false;
    SimpleMessage o = (SimpleMessage) other;
    if (!equals(optional_int32, o.optional_int32)) return false;
    if (!equals(optional_nested_msg, o.optional_nested_msg)) return false;
    if (!equals(optional_external_msg, o.optional_external_msg)) return false;
    if (!equals(default_nested_enum, o.default_nested_enum)) return false;
    if (!equals(required_int32, o.required_int32)) return false;
    if (!equals(repeated_double, o.repeated_double)) return false;
    if (!equals(default_foreign_enum, o.default_foreign_enum)) return false;
    if (!equals(no_default_foreign_enum, o.no_default_foreign_enum)) return false;
    if (!equals(_package, o._package)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = optional_int32 != null ? optional_int32.hashCode() : 0;
      result = result * 37 + (optional_nested_msg != null ? optional_nested_msg.hashCode() : 0);
      result = result * 37 + (optional_external_msg != null ? optional_external_msg.hashCode() : 0);
      result = result * 37 + (default_nested_enum != null ? default_nested_enum.hashCode() : 0);
      result = result * 37 + (required_int32 != null ? required_int32.hashCode() : 0);
      result = result * 37 + (repeated_double != null ? repeated_double.hashCode() : 0);
      result = result * 37 + (default_foreign_enum != null ? default_foreign_enum.hashCode() : 0);
      result = result * 37 + (no_default_foreign_enum != null ? no_default_foreign_enum.hashCode() : 0);
      result = result * 37 + (_package != null ? _package.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<SimpleMessage> {

    public Integer optional_int32;
    public NestedMessage optional_nested_msg;
    public ExternalMessage optional_external_msg;
    public NestedEnum default_nested_enum;
    public Integer required_int32;
    public List<Double> repeated_double;
    public ForeignEnum default_foreign_enum;
    public ForeignEnum no_default_foreign_enum;
    public String _package;

    public Builder() {
    }

    public Builder(SimpleMessage message) {
      super(message);
      if (message == null) return;
      this.optional_int32 = message.optional_int32;
      this.optional_nested_msg = message.optional_nested_msg;
      this.optional_external_msg = message.optional_external_msg;
      this.default_nested_enum = message.default_nested_enum;
      this.required_int32 = message.required_int32;
      this.repeated_double = copyOf(message.repeated_double);
      this.default_foreign_enum = message.default_foreign_enum;
      this.no_default_foreign_enum = message.no_default_foreign_enum;
      this._package = message._package;
    }

    public Builder optional_int32(Integer optional_int32) {
      this.optional_int32 = optional_int32;
      return this;
    }

    public Builder optional_nested_msg(NestedMessage optional_nested_msg) {
      this.optional_nested_msg = optional_nested_msg;
      return this;
    }

    public Builder optional_external_msg(ExternalMessage optional_external_msg) {
      this.optional_external_msg = optional_external_msg;
      return this;
    }

    public Builder default_nested_enum(NestedEnum default_nested_enum) {
      this.default_nested_enum = default_nested_enum;
      return this;
    }

    public Builder required_int32(Integer required_int32) {
      this.required_int32 = required_int32;
      return this;
    }

    public Builder repeated_double(List<Double> repeated_double) {
      this.repeated_double = repeated_double;
      return this;
    }

    public Builder default_foreign_enum(ForeignEnum default_foreign_enum) {
      this.default_foreign_enum = default_foreign_enum;
      return this;
    }

    public Builder no_default_foreign_enum(ForeignEnum no_default_foreign_enum) {
      this.no_default_foreign_enum = no_default_foreign_enum;
      return this;
    }

    public Builder _package(String _package) {
      this._package = _package;
      return this;
    }

    @Override
    public SimpleMessage build() {
      checkRequiredFields();
      return new SimpleMessage(this);
    }
  }

  public static final class NestedMessage extends Message {

    public static final Integer DEFAULT_BB = 0;

    /**
     * An optional int32
     */
    @ProtoField(
      tag = 1,
      type = INT32
    )
    public final Integer bb;

    private NestedMessage(Builder builder) {
      super(builder);
      this.bb = builder.bb;
    }

    @Override
    public boolean equals(Object other) {
      if (!(other instanceof NestedMessage)) return false;
      return equals(bb, ((NestedMessage) other).bb);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = bb != null ? bb.hashCode() : 0);
    }

    public static final class Builder extends Message.Builder<NestedMessage> {

      public Integer bb;

      public Builder() {
      }

      public Builder(NestedMessage message) {
        super(message);
        if (message == null) return;
        this.bb = message.bb;
      }

      public Builder bb(Integer bb) {
        this.bb = bb;
        return this;
      }

      @Override
      public NestedMessage build() {
        return new NestedMessage(this);
      }
    }
  }

  public enum NestedEnum {
    @ProtoEnum(1)
    FOO,
    @ProtoEnum(2)
    BAR,
    @ProtoEnum(3)
    BAZ,
  }
}

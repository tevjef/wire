// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 431:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import okio.ByteString;

/**
 * A message representing a option the parser does not recognize. This only
 * appears in options protos created by the compiler::Parser class.
 * DescriptorPool resolves these when building Descriptor objects. Therefore,
 * options protos in descriptor objects (e.g. returned by Descriptor::options(),
 * or produced by Descriptor::CopyTo()) will never have UninterpretedOptions
 * in them.
 */
public final class UninterpretedOption extends Message<UninterpretedOption> {
  public static final ProtoAdapter<UninterpretedOption> ADAPTER = ProtoAdapter.newMessageAdapter(UninterpretedOption.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_IDENTIFIER_VALUE = "";

  public static final Long DEFAULT_POSITIVE_INT_VALUE = 0L;

  public static final Long DEFAULT_NEGATIVE_INT_VALUE = 0L;

  public static final Double DEFAULT_DOUBLE_VALUE = 0.0d;

  public static final ByteString DEFAULT_STRING_VALUE = ByteString.EMPTY;

  public static final String DEFAULT_AGGREGATE_VALUE = "";

  @WireField(
      tag = 2,
      adapter = "com.google.protobuf.UninterpretedOption$NamePart#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<NamePart> name;

  /**
   * The value of the uninterpreted option, in whatever type the tokenizer
   * identified it as during parsing. Exactly one of these should be set.
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String identifier_value;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  public final Long positive_int_value;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long negative_int_value;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  public final Double double_value;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString string_value;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String aggregate_value;

  public UninterpretedOption(List<NamePart> name, String identifier_value, Long positive_int_value, Long negative_int_value, Double double_value, ByteString string_value, String aggregate_value) {
    this(name, identifier_value, positive_int_value, negative_int_value, double_value, string_value, aggregate_value, TagMap.EMPTY);
  }

  public UninterpretedOption(List<NamePart> name, String identifier_value, Long positive_int_value, Long negative_int_value, Double double_value, ByteString string_value, String aggregate_value, TagMap tagMap) {
    super(tagMap);
    this.name = immutableCopyOf(name);
    this.identifier_value = identifier_value;
    this.positive_int_value = positive_int_value;
    this.negative_int_value = negative_int_value;
    this.double_value = double_value;
    this.string_value = string_value;
    this.aggregate_value = aggregate_value;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UninterpretedOption)) return false;
    UninterpretedOption o = (UninterpretedOption) other;
    return equals(tagMap(), o.tagMap())
        && equals(name, o.name)
        && equals(identifier_value, o.identifier_value)
        && equals(positive_int_value, o.positive_int_value)
        && equals(negative_int_value, o.negative_int_value)
        && equals(double_value, o.double_value)
        && equals(string_value, o.string_value)
        && equals(aggregate_value, o.aggregate_value);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 1);
      result = result * 37 + (identifier_value != null ? identifier_value.hashCode() : 0);
      result = result * 37 + (positive_int_value != null ? positive_int_value.hashCode() : 0);
      result = result * 37 + (negative_int_value != null ? negative_int_value.hashCode() : 0);
      result = result * 37 + (double_value != null ? double_value.hashCode() : 0);
      result = result * 37 + (string_value != null ? string_value.hashCode() : 0);
      result = result * 37 + (aggregate_value != null ? aggregate_value.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<UninterpretedOption, Builder> {
    public List<NamePart> name;

    public String identifier_value;

    public Long positive_int_value;

    public Long negative_int_value;

    public Double double_value;

    public ByteString string_value;

    public String aggregate_value;

    public Builder() {
      name = newMutableList();
    }

    public Builder(UninterpretedOption message) {
      super(message);
      if (message == null) return;
      this.name = copyOf(message.name);
      this.identifier_value = message.identifier_value;
      this.positive_int_value = message.positive_int_value;
      this.negative_int_value = message.negative_int_value;
      this.double_value = message.double_value;
      this.string_value = message.string_value;
      this.aggregate_value = message.aggregate_value;
    }

    public Builder name(List<NamePart> name) {
      checkElementsNotNull(name);
      this.name = name;
      return this;
    }

    /**
     * The value of the uninterpreted option, in whatever type the tokenizer
     * identified it as during parsing. Exactly one of these should be set.
     */
    public Builder identifier_value(String identifier_value) {
      this.identifier_value = identifier_value;
      return this;
    }

    public Builder positive_int_value(Long positive_int_value) {
      this.positive_int_value = positive_int_value;
      return this;
    }

    public Builder negative_int_value(Long negative_int_value) {
      this.negative_int_value = negative_int_value;
      return this;
    }

    public Builder double_value(Double double_value) {
      this.double_value = double_value;
      return this;
    }

    public Builder string_value(ByteString string_value) {
      this.string_value = string_value;
      return this;
    }

    public Builder aggregate_value(String aggregate_value) {
      this.aggregate_value = aggregate_value;
      return this;
    }

    @Override
    public UninterpretedOption build() {
      return new UninterpretedOption(name, identifier_value, positive_int_value, negative_int_value, double_value, string_value, aggregate_value, buildTagMap());
    }
  }

  /**
   * The name of the uninterpreted option.  Each string represents a segment in
   * a dot-separated name.  is_extension is true iff a segment represents an
   * extension (denoted with parentheses in options specs in .proto files).
   * E.g.,{ ["foo", false], ["bar.baz", true], ["qux", false] } represents
   * "foo.(bar.baz).qux".
   */
  public static final class NamePart extends Message<NamePart> {
    public static final ProtoAdapter<NamePart> ADAPTER = ProtoAdapter.newMessageAdapter(NamePart.class);

    private static final long serialVersionUID = 0L;

    public static final String DEFAULT_NAME_PART = "";

    public static final Boolean DEFAULT_IS_EXTENSION = false;

    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#STRING",
        label = WireField.Label.REQUIRED
    )
    public final String name_part;

    @WireField(
        tag = 2,
        adapter = "com.squareup.wire.ProtoAdapter#BOOL",
        label = WireField.Label.REQUIRED
    )
    public final Boolean is_extension;

    public NamePart(String name_part, Boolean is_extension) {
      this(name_part, is_extension, TagMap.EMPTY);
    }

    public NamePart(String name_part, Boolean is_extension, TagMap tagMap) {
      super(tagMap);
      this.name_part = name_part;
      this.is_extension = is_extension;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof NamePart)) return false;
      NamePart o = (NamePart) other;
      return equals(tagMap(), o.tagMap())
          && equals(name_part, o.name_part)
          && equals(is_extension, o.is_extension);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      if (result == 0) {
        result = tagMap().hashCode();
        result = result * 37 + (name_part != null ? name_part.hashCode() : 0);
        result = result * 37 + (is_extension != null ? is_extension.hashCode() : 0);
        hashCode = result;
      }
      return result;
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<NamePart, Builder> {
      public String name_part;

      public Boolean is_extension;

      public Builder() {
      }

      public Builder(NamePart message) {
        super(message);
        if (message == null) return;
        this.name_part = message.name_part;
        this.is_extension = message.is_extension;
      }

      public Builder name_part(String name_part) {
        this.name_part = name_part;
        return this;
      }

      public Builder is_extension(Boolean is_extension) {
        this.is_extension = is_extension;
        return this;
      }

      @Override
      public NamePart build() {
        if (name_part == null
            || is_extension == null) {
          throw missingRequiredFields(name_part, "name_part",
              is_extension, "is_extension");
        }
        return new NamePart(name_part, is_extension, buildTagMap());
      }
    }
  }
}

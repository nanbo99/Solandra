/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package lucandra.serializers.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Term Information..
 */
public class ThriftTerm implements org.apache.thrift.TBase<ThriftTerm, ThriftTerm._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftTerm");

  private static final org.apache.thrift.protocol.TField FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("field", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_BINARY_FIELD_DESC = new org.apache.thrift.protocol.TField("is_binary", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField LONG_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("longVal", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField INT_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("intVal", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField DOUBLE_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleVal", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField FLOAT_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("floatVal", org.apache.thrift.protocol.TType.DOUBLE, (short)7);

  public String field;
  public ByteBuffer text;
  public boolean is_binary;
  public long longVal;
  public int intVal;
  public double doubleVal;
  public double floatVal;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD((short)1, "field"),
    TEXT((short)2, "text"),
    IS_BINARY((short)3, "is_binary"),
    LONG_VAL((short)4, "longVal"),
    INT_VAL((short)5, "intVal"),
    DOUBLE_VAL((short)6, "doubleVal"),
    FLOAT_VAL((short)7, "floatVal");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FIELD
          return FIELD;
        case 2: // TEXT
          return TEXT;
        case 3: // IS_BINARY
          return IS_BINARY;
        case 4: // LONG_VAL
          return LONG_VAL;
        case 5: // INT_VAL
          return INT_VAL;
        case 6: // DOUBLE_VAL
          return DOUBLE_VAL;
        case 7: // FLOAT_VAL
          return FLOAT_VAL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IS_BINARY_ISSET_ID = 0;
  private static final int __LONGVAL_ISSET_ID = 1;
  private static final int __INTVAL_ISSET_ID = 2;
  private static final int __DOUBLEVAL_ISSET_ID = 3;
  private static final int __FLOATVAL_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD, new org.apache.thrift.meta_data.FieldMetaData("field", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.IS_BINARY, new org.apache.thrift.meta_data.FieldMetaData("is_binary", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.LONG_VAL, new org.apache.thrift.meta_data.FieldMetaData("longVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INT_VAL, new org.apache.thrift.meta_data.FieldMetaData("intVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DOUBLE_VAL, new org.apache.thrift.meta_data.FieldMetaData("doubleVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.FLOAT_VAL, new org.apache.thrift.meta_data.FieldMetaData("floatVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftTerm.class, metaDataMap);
  }

  public ThriftTerm() {
  }

  public ThriftTerm(
    String field)
  {
    this();
    this.field = field;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftTerm(ThriftTerm other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetField()) {
      this.field = other.field;
    }
    if (other.isSetText()) {
      this.text = org.apache.thrift.TBaseHelper.copyBinary(other.text);
;
    }
    this.is_binary = other.is_binary;
    this.longVal = other.longVal;
    this.intVal = other.intVal;
    this.doubleVal = other.doubleVal;
    this.floatVal = other.floatVal;
  }

  public ThriftTerm deepCopy() {
    return new ThriftTerm(this);
  }

  @Override
  public void clear() {
    this.field = null;
    this.text = null;
    setIs_binaryIsSet(false);
    this.is_binary = false;
    setLongValIsSet(false);
    this.longVal = 0;
    setIntValIsSet(false);
    this.intVal = 0;
    setDoubleValIsSet(false);
    this.doubleVal = 0.0;
    setFloatValIsSet(false);
    this.floatVal = 0.0;
  }

  public String getField() {
    return this.field;
  }

  public ThriftTerm setField(String field) {
    this.field = field;
    return this;
  }

  public void unsetField() {
    this.field = null;
  }

  /** Returns true if field field is set (has been assigned a value) and false otherwise */
  public boolean isSetField() {
    return this.field != null;
  }

  public void setFieldIsSet(boolean value) {
    if (!value) {
      this.field = null;
    }
  }

  public byte[] getText() {
    setText(org.apache.thrift.TBaseHelper.rightSize(text));
    return text == null ? null : text.array();
  }

  public ByteBuffer bufferForText() {
    return text;
  }

  public ThriftTerm setText(byte[] text) {
    setText(text == null ? (ByteBuffer)null : ByteBuffer.wrap(text));
    return this;
  }

  public ThriftTerm setText(ByteBuffer text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public boolean isIs_binary() {
    return this.is_binary;
  }

  public ThriftTerm setIs_binary(boolean is_binary) {
    this.is_binary = is_binary;
    setIs_binaryIsSet(true);
    return this;
  }

  public void unsetIs_binary() {
    __isset_bit_vector.clear(__IS_BINARY_ISSET_ID);
  }

  /** Returns true if field is_binary is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_binary() {
    return __isset_bit_vector.get(__IS_BINARY_ISSET_ID);
  }

  public void setIs_binaryIsSet(boolean value) {
    __isset_bit_vector.set(__IS_BINARY_ISSET_ID, value);
  }

  public long getLongVal() {
    return this.longVal;
  }

  public ThriftTerm setLongVal(long longVal) {
    this.longVal = longVal;
    setLongValIsSet(true);
    return this;
  }

  public void unsetLongVal() {
    __isset_bit_vector.clear(__LONGVAL_ISSET_ID);
  }

  /** Returns true if field longVal is set (has been assigned a value) and false otherwise */
  public boolean isSetLongVal() {
    return __isset_bit_vector.get(__LONGVAL_ISSET_ID);
  }

  public void setLongValIsSet(boolean value) {
    __isset_bit_vector.set(__LONGVAL_ISSET_ID, value);
  }

  public int getIntVal() {
    return this.intVal;
  }

  public ThriftTerm setIntVal(int intVal) {
    this.intVal = intVal;
    setIntValIsSet(true);
    return this;
  }

  public void unsetIntVal() {
    __isset_bit_vector.clear(__INTVAL_ISSET_ID);
  }

  /** Returns true if field intVal is set (has been assigned a value) and false otherwise */
  public boolean isSetIntVal() {
    return __isset_bit_vector.get(__INTVAL_ISSET_ID);
  }

  public void setIntValIsSet(boolean value) {
    __isset_bit_vector.set(__INTVAL_ISSET_ID, value);
  }

  public double getDoubleVal() {
    return this.doubleVal;
  }

  public ThriftTerm setDoubleVal(double doubleVal) {
    this.doubleVal = doubleVal;
    setDoubleValIsSet(true);
    return this;
  }

  public void unsetDoubleVal() {
    __isset_bit_vector.clear(__DOUBLEVAL_ISSET_ID);
  }

  /** Returns true if field doubleVal is set (has been assigned a value) and false otherwise */
  public boolean isSetDoubleVal() {
    return __isset_bit_vector.get(__DOUBLEVAL_ISSET_ID);
  }

  public void setDoubleValIsSet(boolean value) {
    __isset_bit_vector.set(__DOUBLEVAL_ISSET_ID, value);
  }

  public double getFloatVal() {
    return this.floatVal;
  }

  public ThriftTerm setFloatVal(double floatVal) {
    this.floatVal = floatVal;
    setFloatValIsSet(true);
    return this;
  }

  public void unsetFloatVal() {
    __isset_bit_vector.clear(__FLOATVAL_ISSET_ID);
  }

  /** Returns true if field floatVal is set (has been assigned a value) and false otherwise */
  public boolean isSetFloatVal() {
    return __isset_bit_vector.get(__FLOATVAL_ISSET_ID);
  }

  public void setFloatValIsSet(boolean value) {
    __isset_bit_vector.set(__FLOATVAL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FIELD:
      if (value == null) {
        unsetField();
      } else {
        setField((String)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((ByteBuffer)value);
      }
      break;

    case IS_BINARY:
      if (value == null) {
        unsetIs_binary();
      } else {
        setIs_binary((Boolean)value);
      }
      break;

    case LONG_VAL:
      if (value == null) {
        unsetLongVal();
      } else {
        setLongVal((Long)value);
      }
      break;

    case INT_VAL:
      if (value == null) {
        unsetIntVal();
      } else {
        setIntVal((Integer)value);
      }
      break;

    case DOUBLE_VAL:
      if (value == null) {
        unsetDoubleVal();
      } else {
        setDoubleVal((Double)value);
      }
      break;

    case FLOAT_VAL:
      if (value == null) {
        unsetFloatVal();
      } else {
        setFloatVal((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD:
      return getField();

    case TEXT:
      return getText();

    case IS_BINARY:
      return new Boolean(isIs_binary());

    case LONG_VAL:
      return new Long(getLongVal());

    case INT_VAL:
      return new Integer(getIntVal());

    case DOUBLE_VAL:
      return new Double(getDoubleVal());

    case FLOAT_VAL:
      return new Double(getFloatVal());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FIELD:
      return isSetField();
    case TEXT:
      return isSetText();
    case IS_BINARY:
      return isSetIs_binary();
    case LONG_VAL:
      return isSetLongVal();
    case INT_VAL:
      return isSetIntVal();
    case DOUBLE_VAL:
      return isSetDoubleVal();
    case FLOAT_VAL:
      return isSetFloatVal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftTerm)
      return this.equals((ThriftTerm)that);
    return false;
  }

  public boolean equals(ThriftTerm that) {
    if (that == null)
      return false;

    boolean this_present_field = true && this.isSetField();
    boolean that_present_field = true && that.isSetField();
    if (this_present_field || that_present_field) {
      if (!(this_present_field && that_present_field))
        return false;
      if (!this.field.equals(that.field))
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    boolean this_present_is_binary = true && this.isSetIs_binary();
    boolean that_present_is_binary = true && that.isSetIs_binary();
    if (this_present_is_binary || that_present_is_binary) {
      if (!(this_present_is_binary && that_present_is_binary))
        return false;
      if (this.is_binary != that.is_binary)
        return false;
    }

    boolean this_present_longVal = true && this.isSetLongVal();
    boolean that_present_longVal = true && that.isSetLongVal();
    if (this_present_longVal || that_present_longVal) {
      if (!(this_present_longVal && that_present_longVal))
        return false;
      if (this.longVal != that.longVal)
        return false;
    }

    boolean this_present_intVal = true && this.isSetIntVal();
    boolean that_present_intVal = true && that.isSetIntVal();
    if (this_present_intVal || that_present_intVal) {
      if (!(this_present_intVal && that_present_intVal))
        return false;
      if (this.intVal != that.intVal)
        return false;
    }

    boolean this_present_doubleVal = true && this.isSetDoubleVal();
    boolean that_present_doubleVal = true && that.isSetDoubleVal();
    if (this_present_doubleVal || that_present_doubleVal) {
      if (!(this_present_doubleVal && that_present_doubleVal))
        return false;
      if (this.doubleVal != that.doubleVal)
        return false;
    }

    boolean this_present_floatVal = true && this.isSetFloatVal();
    boolean that_present_floatVal = true && that.isSetFloatVal();
    if (this_present_floatVal || that_present_floatVal) {
      if (!(this_present_floatVal && that_present_floatVal))
        return false;
      if (this.floatVal != that.floatVal)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_field = true && (isSetField());
    builder.append(present_field);
    if (present_field)
      builder.append(field);

    boolean present_text = true && (isSetText());
    builder.append(present_text);
    if (present_text)
      builder.append(text);

    boolean present_is_binary = true && (isSetIs_binary());
    builder.append(present_is_binary);
    if (present_is_binary)
      builder.append(is_binary);

    boolean present_longVal = true && (isSetLongVal());
    builder.append(present_longVal);
    if (present_longVal)
      builder.append(longVal);

    boolean present_intVal = true && (isSetIntVal());
    builder.append(present_intVal);
    if (present_intVal)
      builder.append(intVal);

    boolean present_doubleVal = true && (isSetDoubleVal());
    builder.append(present_doubleVal);
    if (present_doubleVal)
      builder.append(doubleVal);

    boolean present_floatVal = true && (isSetFloatVal());
    builder.append(present_floatVal);
    if (present_floatVal)
      builder.append(floatVal);

    return builder.toHashCode();
  }

  public int compareTo(ThriftTerm other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftTerm typedOther = (ThriftTerm)other;

    lastComparison = Boolean.valueOf(isSetField()).compareTo(typedOther.isSetField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.field, typedOther.field);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetText()).compareTo(typedOther.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, typedOther.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_binary()).compareTo(typedOther.isSetIs_binary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_binary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_binary, typedOther.is_binary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLongVal()).compareTo(typedOther.isSetLongVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longVal, typedOther.longVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIntVal()).compareTo(typedOther.isSetIntVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intVal, typedOther.intVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDoubleVal()).compareTo(typedOther.isSetDoubleVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDoubleVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.doubleVal, typedOther.doubleVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFloatVal()).compareTo(typedOther.isSetFloatVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFloatVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.floatVal, typedOther.floatVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FIELD
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.field = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TEXT
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.text = iprot.readBinary();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // IS_BINARY
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.is_binary = iprot.readBool();
            setIs_binaryIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LONG_VAL
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.longVal = iprot.readI64();
            setLongValIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // INT_VAL
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.intVal = iprot.readI32();
            setIntValIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DOUBLE_VAL
          if (field.type == org.apache.thrift.protocol.TType.DOUBLE) {
            this.doubleVal = iprot.readDouble();
            setDoubleValIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // FLOAT_VAL
          if (field.type == org.apache.thrift.protocol.TType.DOUBLE) {
            this.floatVal = iprot.readDouble();
            setFloatValIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.field != null) {
      oprot.writeFieldBegin(FIELD_FIELD_DESC);
      oprot.writeString(this.field);
      oprot.writeFieldEnd();
    }
    if (this.text != null) {
      if (isSetText()) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeBinary(this.text);
        oprot.writeFieldEnd();
      }
    }
    if (isSetIs_binary()) {
      oprot.writeFieldBegin(IS_BINARY_FIELD_DESC);
      oprot.writeBool(this.is_binary);
      oprot.writeFieldEnd();
    }
    if (isSetLongVal()) {
      oprot.writeFieldBegin(LONG_VAL_FIELD_DESC);
      oprot.writeI64(this.longVal);
      oprot.writeFieldEnd();
    }
    if (isSetIntVal()) {
      oprot.writeFieldBegin(INT_VAL_FIELD_DESC);
      oprot.writeI32(this.intVal);
      oprot.writeFieldEnd();
    }
    if (isSetDoubleVal()) {
      oprot.writeFieldBegin(DOUBLE_VAL_FIELD_DESC);
      oprot.writeDouble(this.doubleVal);
      oprot.writeFieldEnd();
    }
    if (isSetFloatVal()) {
      oprot.writeFieldBegin(FLOAT_VAL_FIELD_DESC);
      oprot.writeDouble(this.floatVal);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftTerm(");
    boolean first = true;

    sb.append("field:");
    if (this.field == null) {
      sb.append("null");
    } else {
      sb.append(this.field);
    }
    first = false;
    if (isSetText()) {
      if (!first) sb.append(", ");
      sb.append("text:");
      if (this.text == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.text, sb);
      }
      first = false;
    }
    if (isSetIs_binary()) {
      if (!first) sb.append(", ");
      sb.append("is_binary:");
      sb.append(this.is_binary);
      first = false;
    }
    if (isSetLongVal()) {
      if (!first) sb.append(", ");
      sb.append("longVal:");
      sb.append(this.longVal);
      first = false;
    }
    if (isSetIntVal()) {
      if (!first) sb.append(", ");
      sb.append("intVal:");
      sb.append(this.intVal);
      first = false;
    }
    if (isSetDoubleVal()) {
      if (!first) sb.append(", ");
      sb.append("doubleVal:");
      sb.append(this.doubleVal);
      first = false;
    }
    if (isSetFloatVal()) {
      if (!first) sb.append(", ");
      sb.append("floatVal:");
      sb.append(this.floatVal);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (field == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'field' was not present! Struct: " + toString());
    }
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterMonsterDetail.proto

package emu.grasscutter.net.proto;

public final class FungusFighterMonsterDetailOuterClass {
  private FungusFighterMonsterDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterMonsterDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterMonsterDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 fungus_id = 5;</code>
     * @return The fungusId.
     */
    int getFungusId();

    /**
     * <code>bool is_alive = 12;</code>
     * @return The isAlive.
     */
    boolean getIsAlive();

    /**
     * <code>float cur_hp_percentage = 8;</code>
     * @return The curHpPercentage.
     */
    float getCurHpPercentage();
  }
  /**
   * <pre>
   * Name: MEEKLHEGAKK
   * </pre>
   *
   * Protobuf type {@code FungusFighterMonsterDetail}
   */
  public static final class FungusFighterMonsterDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterMonsterDetail)
      FungusFighterMonsterDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterMonsterDetail.newBuilder() to construct.
    private FungusFighterMonsterDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterMonsterDetail() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterMonsterDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterMonsterDetail(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              fungusId_ = input.readUInt32();
              break;
            }
            case 69: {

              curHpPercentage_ = input.readFloat();
              break;
            }
            case 96: {

              isAlive_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.class, emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.Builder.class);
    }

    public static final int FUNGUS_ID_FIELD_NUMBER = 5;
    private int fungusId_;
    /**
     * <code>uint32 fungus_id = 5;</code>
     * @return The fungusId.
     */
    @java.lang.Override
    public int getFungusId() {
      return fungusId_;
    }

    public static final int IS_ALIVE_FIELD_NUMBER = 12;
    private boolean isAlive_;
    /**
     * <code>bool is_alive = 12;</code>
     * @return The isAlive.
     */
    @java.lang.Override
    public boolean getIsAlive() {
      return isAlive_;
    }

    public static final int CUR_HP_PERCENTAGE_FIELD_NUMBER = 8;
    private float curHpPercentage_;
    /**
     * <code>float cur_hp_percentage = 8;</code>
     * @return The curHpPercentage.
     */
    @java.lang.Override
    public float getCurHpPercentage() {
      return curHpPercentage_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (fungusId_ != 0) {
        output.writeUInt32(5, fungusId_);
      }
      if (curHpPercentage_ != 0F) {
        output.writeFloat(8, curHpPercentage_);
      }
      if (isAlive_ != false) {
        output.writeBool(12, isAlive_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fungusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, fungusId_);
      }
      if (curHpPercentage_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(8, curHpPercentage_);
      }
      if (isAlive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isAlive_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail other = (emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail) obj;

      if (getFungusId()
          != other.getFungusId()) return false;
      if (getIsAlive()
          != other.getIsAlive()) return false;
      if (java.lang.Float.floatToIntBits(getCurHpPercentage())
          != java.lang.Float.floatToIntBits(
              other.getCurHpPercentage())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FUNGUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFungusId();
      hash = (37 * hash) + IS_ALIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAlive());
      hash = (37 * hash) + CUR_HP_PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurHpPercentage());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: MEEKLHEGAKK
     * </pre>
     *
     * Protobuf type {@code FungusFighterMonsterDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterMonsterDetail)
        emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.class, emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fungusId_ = 0;

        isAlive_ = false;

        curHpPercentage_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail build() {
        emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail buildPartial() {
        emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail result = new emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail(this);
        result.fungusId_ = fungusId_;
        result.isAlive_ = isAlive_;
        result.curHpPercentage_ = curHpPercentage_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail) {
          return mergeFrom((emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail other) {
        if (other == emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.getDefaultInstance()) return this;
        if (other.getFungusId() != 0) {
          setFungusId(other.getFungusId());
        }
        if (other.getIsAlive() != false) {
          setIsAlive(other.getIsAlive());
        }
        if (other.getCurHpPercentage() != 0F) {
          setCurHpPercentage(other.getCurHpPercentage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fungusId_ ;
      /**
       * <code>uint32 fungus_id = 5;</code>
       * @return The fungusId.
       */
      @java.lang.Override
      public int getFungusId() {
        return fungusId_;
      }
      /**
       * <code>uint32 fungus_id = 5;</code>
       * @param value The fungusId to set.
       * @return This builder for chaining.
       */
      public Builder setFungusId(int value) {
        
        fungusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fungus_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusId() {
        
        fungusId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAlive_ ;
      /**
       * <code>bool is_alive = 12;</code>
       * @return The isAlive.
       */
      @java.lang.Override
      public boolean getIsAlive() {
        return isAlive_;
      }
      /**
       * <code>bool is_alive = 12;</code>
       * @param value The isAlive to set.
       * @return This builder for chaining.
       */
      public Builder setIsAlive(boolean value) {
        
        isAlive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_alive = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAlive() {
        
        isAlive_ = false;
        onChanged();
        return this;
      }

      private float curHpPercentage_ ;
      /**
       * <code>float cur_hp_percentage = 8;</code>
       * @return The curHpPercentage.
       */
      @java.lang.Override
      public float getCurHpPercentage() {
        return curHpPercentage_;
      }
      /**
       * <code>float cur_hp_percentage = 8;</code>
       * @param value The curHpPercentage to set.
       * @return This builder for chaining.
       */
      public Builder setCurHpPercentage(float value) {
        
        curHpPercentage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cur_hp_percentage = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurHpPercentage() {
        
        curHpPercentage_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FungusFighterMonsterDetail)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterMonsterDetail)
    private static final emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail();
    }

    public static emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterMonsterDetail>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterMonsterDetail>() {
      @java.lang.Override
      public FungusFighterMonsterDetail parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterMonsterDetail(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterMonsterDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterMonsterDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterMonsterDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterMonsterDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n FungusFighterMonsterDetail.proto\"\\\n\032Fu" +
      "ngusFighterMonsterDetail\022\021\n\tfungus_id\030\005 " +
      "\001(\r\022\020\n\010is_alive\030\014 \001(\010\022\031\n\021cur_hp_percenta" +
      "ge\030\010 \001(\002B!\n\031emu.grasscutter.net.protoZ\004/" +
      "genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterMonsterDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterMonsterDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterMonsterDetail_descriptor,
        new java.lang.String[] { "FungusId", "IsAlive", "CurHpPercentage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeeMonsterReq.proto

package emu.grasscutter.net.proto;

public final class SeeMonsterReqOuterClass {
  private SeeMonsterReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeeMonsterReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeeMonsterReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 monster_id = 9;</code>
     * @return The monsterId.
     */
    int getMonsterId();
  }
  /**
   * <pre>
   * CmdId: 221
   * Name: FBJNIGOFFBL
   * </pre>
   *
   * Protobuf type {@code SeeMonsterReq}
   */
  public static final class SeeMonsterReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeeMonsterReq)
      SeeMonsterReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeeMonsterReq.newBuilder() to construct.
    private SeeMonsterReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeeMonsterReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeeMonsterReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SeeMonsterReq(
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
            case 72: {

              monsterId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SeeMonsterReqOuterClass.internal_static_SeeMonsterReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SeeMonsterReqOuterClass.internal_static_SeeMonsterReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq.class, emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq.Builder.class);
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 9;
    private int monsterId_;
    /**
     * <code>uint32 monster_id = 9;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
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
      if (monsterId_ != 0) {
        output.writeUInt32(9, monsterId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, monsterId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq other = (emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq) obj;

      if (getMonsterId()
          != other.getMonsterId()) return false;
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
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq prototype) {
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
     * CmdId: 221
     * Name: FBJNIGOFFBL
     * </pre>
     *
     * Protobuf type {@code SeeMonsterReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeeMonsterReq)
        emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeeMonsterReqOuterClass.internal_static_SeeMonsterReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SeeMonsterReqOuterClass.internal_static_SeeMonsterReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq.class, emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq.newBuilder()
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
        monsterId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SeeMonsterReqOuterClass.internal_static_SeeMonsterReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq build() {
        emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq buildPartial() {
        emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq result = new emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq(this);
        result.monsterId_ = monsterId_;
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
        if (other instanceof emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq) {
          return mergeFrom((emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq other) {
        if (other == emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq.getDefaultInstance()) return this;
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
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
        emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 9;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 9;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {
        
        monsterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        
        monsterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SeeMonsterReq)
    }

    // @@protoc_insertion_point(class_scope:SeeMonsterReq)
    private static final emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq();
    }

    public static emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeeMonsterReq>
        PARSER = new com.google.protobuf.AbstractParser<SeeMonsterReq>() {
      @java.lang.Override
      public SeeMonsterReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SeeMonsterReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SeeMonsterReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeeMonsterReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SeeMonsterReqOuterClass.SeeMonsterReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeeMonsterReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeeMonsterReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SeeMonsterReq.proto\"#\n\rSeeMonsterReq\022\022" +
      "\n\nmonster_id\030\t \001(\rB!\n\031emu.grasscutter.ne" +
      "t.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeeMonsterReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeeMonsterReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeeMonsterReq_descriptor,
        new java.lang.String[] { "MonsterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

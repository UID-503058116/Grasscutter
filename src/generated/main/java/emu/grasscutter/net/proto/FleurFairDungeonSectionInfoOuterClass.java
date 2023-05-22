// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairDungeonSectionInfo.proto

package emu.grasscutter.net.proto;

public final class FleurFairDungeonSectionInfoOuterClass {
  private FleurFairDungeonSectionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairDungeonSectionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairDungeonSectionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 open_time = 6;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_open = 9;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 section_id = 11;</code>
     * @return The sectionId.
     */
    int getSectionId();
  }
  /**
   * <pre>
   * Name: PKBOCMLKJDJ
   * </pre>
   *
   * Protobuf type {@code FleurFairDungeonSectionInfo}
   */
  public static final class FleurFairDungeonSectionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairDungeonSectionInfo)
      FleurFairDungeonSectionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairDungeonSectionInfo.newBuilder() to construct.
    private FleurFairDungeonSectionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairDungeonSectionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairDungeonSectionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairDungeonSectionInfo(
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
            case 48: {

              openTime_ = input.readUInt32();
              break;
            }
            case 72: {

              isOpen_ = input.readBool();
              break;
            }
            case 88: {

              sectionId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.internal_static_FleurFairDungeonSectionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.internal_static_FleurFairDungeonSectionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo.class, emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo.Builder.class);
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 6;
    private int openTime_;
    /**
     * <code>uint32 open_time = 6;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 9;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 9;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int SECTION_ID_FIELD_NUMBER = 11;
    private int sectionId_;
    /**
     * <code>uint32 section_id = 11;</code>
     * @return The sectionId.
     */
    @java.lang.Override
    public int getSectionId() {
      return sectionId_;
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
      if (openTime_ != 0) {
        output.writeUInt32(6, openTime_);
      }
      if (isOpen_ != false) {
        output.writeBool(9, isOpen_);
      }
      if (sectionId_ != 0) {
        output.writeUInt32(11, sectionId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, openTime_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isOpen_);
      }
      if (sectionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sectionId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo other = (emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo) obj;

      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getSectionId()
          != other.getSectionId()) return false;
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
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + SECTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSectionId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo prototype) {
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
     * Name: PKBOCMLKJDJ
     * </pre>
     *
     * Protobuf type {@code FleurFairDungeonSectionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairDungeonSectionInfo)
        emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.internal_static_FleurFairDungeonSectionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.internal_static_FleurFairDungeonSectionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo.class, emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo.newBuilder()
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
        openTime_ = 0;

        isOpen_ = false;

        sectionId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.internal_static_FleurFairDungeonSectionInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo build() {
        emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo buildPartial() {
        emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo result = new emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo(this);
        result.openTime_ = openTime_;
        result.isOpen_ = isOpen_;
        result.sectionId_ = sectionId_;
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
        if (other instanceof emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo other) {
        if (other == emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo.getDefaultInstance()) return this;
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getSectionId() != 0) {
          setSectionId(other.getSectionId());
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
        emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 6;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 6;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 9;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 9;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int sectionId_ ;
      /**
       * <code>uint32 section_id = 11;</code>
       * @return The sectionId.
       */
      @java.lang.Override
      public int getSectionId() {
        return sectionId_;
      }
      /**
       * <code>uint32 section_id = 11;</code>
       * @param value The sectionId to set.
       * @return This builder for chaining.
       */
      public Builder setSectionId(int value) {
        
        sectionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 section_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSectionId() {
        
        sectionId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FleurFairDungeonSectionInfo)
    }

    // @@protoc_insertion_point(class_scope:FleurFairDungeonSectionInfo)
    private static final emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo();
    }

    public static emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairDungeonSectionInfo>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairDungeonSectionInfo>() {
      @java.lang.Override
      public FleurFairDungeonSectionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairDungeonSectionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairDungeonSectionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairDungeonSectionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairDungeonSectionInfoOuterClass.FleurFairDungeonSectionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairDungeonSectionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairDungeonSectionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FleurFairDungeonSectionInfo.proto\"U\n\033F" +
      "leurFairDungeonSectionInfo\022\021\n\topen_time\030" +
      "\006 \001(\r\022\017\n\007is_open\030\t \001(\010\022\022\n\nsection_id\030\013 \001" +
      "(\rB!\n\031emu.grasscutter.net.protoZ\004/genb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairDungeonSectionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairDungeonSectionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairDungeonSectionInfo_descriptor,
        new java.lang.String[] { "OpenTime", "IsOpen", "SectionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

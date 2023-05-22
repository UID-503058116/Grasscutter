// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneTimeNotify.proto

package emu.grasscutter.net.proto;

public final class SceneTimeNotifyOuterClass {
  private SceneTimeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneTimeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneTimeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 6;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>bool is_paused = 15;</code>
     * @return The isPaused.
     */
    boolean getIsPaused();

    /**
     * <code>uint64 scene_time = 1;</code>
     * @return The sceneTime.
     */
    long getSceneTime();
  }
  /**
   * <pre>
   * CmdId: 217
   * Name: MLHGMKJPGMM
   * </pre>
   *
   * Protobuf type {@code SceneTimeNotify}
   */
  public static final class SceneTimeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneTimeNotify)
      SceneTimeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneTimeNotify.newBuilder() to construct.
    private SceneTimeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneTimeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneTimeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneTimeNotify(
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
            case 8: {

              sceneTime_ = input.readUInt64();
              break;
            }
            case 48: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 120: {

              isPaused_ = input.readBool();
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
      return emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.class, emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 6;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 6;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int IS_PAUSED_FIELD_NUMBER = 15;
    private boolean isPaused_;
    /**
     * <code>bool is_paused = 15;</code>
     * @return The isPaused.
     */
    @java.lang.Override
    public boolean getIsPaused() {
      return isPaused_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 1;
    private long sceneTime_;
    /**
     * <code>uint64 scene_time = 1;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public long getSceneTime() {
      return sceneTime_;
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
      if (sceneTime_ != 0L) {
        output.writeUInt64(1, sceneTime_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(6, sceneId_);
      }
      if (isPaused_ != false) {
        output.writeBool(15, isPaused_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, sceneTime_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sceneId_);
      }
      if (isPaused_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isPaused_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify other = (emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getIsPaused()
          != other.getIsPaused()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + IS_PAUSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPaused());
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSceneTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify prototype) {
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
     * CmdId: 217
     * Name: MLHGMKJPGMM
     * </pre>
     *
     * Protobuf type {@code SceneTimeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneTimeNotify)
        emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.class, emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.newBuilder()
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
        sceneId_ = 0;

        isPaused_ = false;

        sceneTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify build() {
        emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify buildPartial() {
        emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify result = new emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify(this);
        result.sceneId_ = sceneId_;
        result.isPaused_ = isPaused_;
        result.sceneTime_ = sceneTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify other) {
        if (other == emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getIsPaused() != false) {
          setIsPaused(other.getIsPaused());
        }
        if (other.getSceneTime() != 0L) {
          setSceneTime(other.getSceneTime());
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
        emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 6;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 6;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private boolean isPaused_ ;
      /**
       * <code>bool is_paused = 15;</code>
       * @return The isPaused.
       */
      @java.lang.Override
      public boolean getIsPaused() {
        return isPaused_;
      }
      /**
       * <code>bool is_paused = 15;</code>
       * @param value The isPaused to set.
       * @return This builder for chaining.
       */
      public Builder setIsPaused(boolean value) {
        
        isPaused_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_paused = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPaused() {
        
        isPaused_ = false;
        onChanged();
        return this;
      }

      private long sceneTime_ ;
      /**
       * <code>uint64 scene_time = 1;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public long getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint64 scene_time = 1;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(long value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 scene_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SceneTimeNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneTimeNotify)
    private static final emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify();
    }

    public static emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneTimeNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneTimeNotify>() {
      @java.lang.Override
      public SceneTimeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneTimeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneTimeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneTimeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneTimeNotifyOuterClass.SceneTimeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneTimeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneTimeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SceneTimeNotify.proto\"J\n\017SceneTimeNoti" +
      "fy\022\020\n\010scene_id\030\006 \001(\r\022\021\n\tis_paused\030\017 \001(\010\022" +
      "\022\n\nscene_time\030\001 \001(\004B!\n\031emu.grasscutter.n" +
      "et.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneTimeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneTimeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneTimeNotify_descriptor,
        new java.lang.String[] { "SceneId", "IsPaused", "SceneTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

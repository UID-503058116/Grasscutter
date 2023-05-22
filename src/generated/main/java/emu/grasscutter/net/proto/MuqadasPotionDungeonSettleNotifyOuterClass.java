// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MuqadasPotionDungeonSettleNotify.proto

package emu.grasscutter.net.proto;

public final class MuqadasPotionDungeonSettleNotifyOuterClass {
  private MuqadasPotionDungeonSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MuqadasPotionDungeonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MuqadasPotionDungeonSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 capture_weakness_count = 11;</code>
     * @return The captureWeaknessCount.
     */
    int getCaptureWeaknessCount();

    /**
     * <code>bool is_new_record = 2;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 final_score = 10;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>bool is_success = 9;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * CmdId: 20024
   * Name: JGLJENGADON
   * </pre>
   *
   * Protobuf type {@code MuqadasPotionDungeonSettleNotify}
   */
  public static final class MuqadasPotionDungeonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MuqadasPotionDungeonSettleNotify)
      MuqadasPotionDungeonSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MuqadasPotionDungeonSettleNotify.newBuilder() to construct.
    private MuqadasPotionDungeonSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MuqadasPotionDungeonSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MuqadasPotionDungeonSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MuqadasPotionDungeonSettleNotify(
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
            case 16: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 72: {

              isSuccess_ = input.readBool();
              break;
            }
            case 80: {

              finalScore_ = input.readUInt32();
              break;
            }
            case 88: {

              captureWeaknessCount_ = input.readUInt32();
              break;
            }
            case 112: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.class, emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.Builder.class);
    }

    public static final int CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER = 11;
    private int captureWeaknessCount_;
    /**
     * <code>uint32 capture_weakness_count = 11;</code>
     * @return The captureWeaknessCount.
     */
    @java.lang.Override
    public int getCaptureWeaknessCount() {
      return captureWeaknessCount_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 2;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 2;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 10;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 10;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 9;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 9;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 14;
    private int levelId_;
    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (isNewRecord_ != false) {
        output.writeBool(2, isNewRecord_);
      }
      if (isSuccess_ != false) {
        output.writeBool(9, isSuccess_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(10, finalScore_);
      }
      if (captureWeaknessCount_ != 0) {
        output.writeUInt32(11, captureWeaknessCount_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(14, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isNewRecord_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isSuccess_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, finalScore_);
      }
      if (captureWeaknessCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, captureWeaknessCount_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify other = (emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify) obj;

      if (getCaptureWeaknessCount()
          != other.getCaptureWeaknessCount()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureWeaknessCount();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify prototype) {
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
     * CmdId: 20024
     * Name: JGLJENGADON
     * </pre>
     *
     * Protobuf type {@code MuqadasPotionDungeonSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MuqadasPotionDungeonSettleNotify)
        emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.class, emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.newBuilder()
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
        captureWeaknessCount_ = 0;

        isNewRecord_ = false;

        finalScore_ = 0;

        isSuccess_ = false;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify build() {
        emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify buildPartial() {
        emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify result = new emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify(this);
        result.captureWeaknessCount_ = captureWeaknessCount_;
        result.isNewRecord_ = isNewRecord_;
        result.finalScore_ = finalScore_;
        result.isSuccess_ = isSuccess_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify other) {
        if (other == emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify.getDefaultInstance()) return this;
        if (other.getCaptureWeaknessCount() != 0) {
          setCaptureWeaknessCount(other.getCaptureWeaknessCount());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int captureWeaknessCount_ ;
      /**
       * <code>uint32 capture_weakness_count = 11;</code>
       * @return The captureWeaknessCount.
       */
      @java.lang.Override
      public int getCaptureWeaknessCount() {
        return captureWeaknessCount_;
      }
      /**
       * <code>uint32 capture_weakness_count = 11;</code>
       * @param value The captureWeaknessCount to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureWeaknessCount(int value) {
        
        captureWeaknessCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 capture_weakness_count = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureWeaknessCount() {
        
        captureWeaknessCount_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 2;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 2;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 10;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 10;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 9;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 9;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 14;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MuqadasPotionDungeonSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:MuqadasPotionDungeonSettleNotify)
    private static final emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify();
    }

    public static emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MuqadasPotionDungeonSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<MuqadasPotionDungeonSettleNotify>() {
      @java.lang.Override
      public MuqadasPotionDungeonSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MuqadasPotionDungeonSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MuqadasPotionDungeonSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MuqadasPotionDungeonSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MuqadasPotionDungeonSettleNotifyOuterClass.MuqadasPotionDungeonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MuqadasPotionDungeonSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&MuqadasPotionDungeonSettleNotify.proto" +
      "\"\224\001\n MuqadasPotionDungeonSettleNotify\022\036\n" +
      "\026capture_weakness_count\030\013 \001(\r\022\025\n\ris_new_" +
      "record\030\002 \001(\010\022\023\n\013final_score\030\n \001(\r\022\022\n\nis_" +
      "success\030\t \001(\010\022\020\n\010level_id\030\016 \001(\rB!\n\031emu.g" +
      "rasscutter.net.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MuqadasPotionDungeonSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MuqadasPotionDungeonSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MuqadasPotionDungeonSettleNotify_descriptor,
        new java.lang.String[] { "CaptureWeaknessCount", "IsNewRecord", "FinalScore", "IsSuccess", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

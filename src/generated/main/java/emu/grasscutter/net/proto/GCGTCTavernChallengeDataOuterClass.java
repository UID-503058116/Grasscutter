// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCTavernChallengeData.proto

package emu.grasscutter.net.proto;

public final class GCGTCTavernChallengeDataOuterClass {
  private GCGTCTavernChallengeDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCTavernChallengeDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCTavernChallengeData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 character_id = 2;</code>
     * @return The characterId.
     */
    int getCharacterId();

    /**
     * <code>repeated uint32 unlock_level_id_list = 13;</code>
     * @return A list containing the unlockLevelIdList.
     */
    java.util.List<java.lang.Integer> getUnlockLevelIdListList();
    /**
     * <code>repeated uint32 unlock_level_id_list = 13;</code>
     * @return The count of unlockLevelIdList.
     */
    int getUnlockLevelIdListCount();
    /**
     * <code>repeated uint32 unlock_level_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The unlockLevelIdList at the given index.
     */
    int getUnlockLevelIdList(int index);
  }
  /**
   * <pre>
   * Name: NBGPGDKIFEN
   * </pre>
   *
   * Protobuf type {@code GCGTCTavernChallengeData}
   */
  public static final class GCGTCTavernChallengeData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCTavernChallengeData)
      GCGTCTavernChallengeDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCTavernChallengeData.newBuilder() to construct.
    private GCGTCTavernChallengeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCTavernChallengeData() {
      unlockLevelIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCTavernChallengeData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGTCTavernChallengeData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              characterId_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unlockLevelIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unlockLevelIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unlockLevelIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unlockLevelIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unlockLevelIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.internal_static_GCGTCTavernChallengeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.internal_static_GCGTCTavernChallengeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.class, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder.class);
    }

    public static final int CHARACTER_ID_FIELD_NUMBER = 2;
    private int characterId_;
    /**
     * <code>uint32 character_id = 2;</code>
     * @return The characterId.
     */
    @java.lang.Override
    public int getCharacterId() {
      return characterId_;
    }

    public static final int UNLOCK_LEVEL_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList unlockLevelIdList_;
    /**
     * <code>repeated uint32 unlock_level_id_list = 13;</code>
     * @return A list containing the unlockLevelIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnlockLevelIdListList() {
      return unlockLevelIdList_;
    }
    /**
     * <code>repeated uint32 unlock_level_id_list = 13;</code>
     * @return The count of unlockLevelIdList.
     */
    public int getUnlockLevelIdListCount() {
      return unlockLevelIdList_.size();
    }
    /**
     * <code>repeated uint32 unlock_level_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The unlockLevelIdList at the given index.
     */
    public int getUnlockLevelIdList(int index) {
      return unlockLevelIdList_.getInt(index);
    }
    private int unlockLevelIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (characterId_ != 0) {
        output.writeUInt32(2, characterId_);
      }
      if (getUnlockLevelIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(unlockLevelIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < unlockLevelIdList_.size(); i++) {
        output.writeUInt32NoTag(unlockLevelIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (characterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, characterId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unlockLevelIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unlockLevelIdList_.getInt(i));
        }
        size += dataSize;
        if (!getUnlockLevelIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unlockLevelIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData other = (emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData) obj;

      if (getCharacterId()
          != other.getCharacterId()) return false;
      if (!getUnlockLevelIdListList()
          .equals(other.getUnlockLevelIdListList())) return false;
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
      hash = (37 * hash) + CHARACTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCharacterId();
      if (getUnlockLevelIdListCount() > 0) {
        hash = (37 * hash) + UNLOCK_LEVEL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUnlockLevelIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData prototype) {
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
     * Name: NBGPGDKIFEN
     * </pre>
     *
     * Protobuf type {@code GCGTCTavernChallengeData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCTavernChallengeData)
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.internal_static_GCGTCTavernChallengeData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.internal_static_GCGTCTavernChallengeData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.class, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.newBuilder()
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
        characterId_ = 0;

        unlockLevelIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.internal_static_GCGTCTavernChallengeData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData build() {
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData buildPartial() {
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData result = new emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData(this);
        int from_bitField0_ = bitField0_;
        result.characterId_ = characterId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unlockLevelIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unlockLevelIdList_ = unlockLevelIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData) {
          return mergeFrom((emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData other) {
        if (other == emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance()) return this;
        if (other.getCharacterId() != 0) {
          setCharacterId(other.getCharacterId());
        }
        if (!other.unlockLevelIdList_.isEmpty()) {
          if (unlockLevelIdList_.isEmpty()) {
            unlockLevelIdList_ = other.unlockLevelIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnlockLevelIdListIsMutable();
            unlockLevelIdList_.addAll(other.unlockLevelIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int characterId_ ;
      /**
       * <code>uint32 character_id = 2;</code>
       * @return The characterId.
       */
      @java.lang.Override
      public int getCharacterId() {
        return characterId_;
      }
      /**
       * <code>uint32 character_id = 2;</code>
       * @param value The characterId to set.
       * @return This builder for chaining.
       */
      public Builder setCharacterId(int value) {
        
        characterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 character_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCharacterId() {
        
        characterId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unlockLevelIdList_ = emptyIntList();
      private void ensureUnlockLevelIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unlockLevelIdList_ = mutableCopy(unlockLevelIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 unlock_level_id_list = 13;</code>
       * @return A list containing the unlockLevelIdList.
       */
      public java.util.List<java.lang.Integer>
          getUnlockLevelIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unlockLevelIdList_) : unlockLevelIdList_;
      }
      /**
       * <code>repeated uint32 unlock_level_id_list = 13;</code>
       * @return The count of unlockLevelIdList.
       */
      public int getUnlockLevelIdListCount() {
        return unlockLevelIdList_.size();
      }
      /**
       * <code>repeated uint32 unlock_level_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The unlockLevelIdList at the given index.
       */
      public int getUnlockLevelIdList(int index) {
        return unlockLevelIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 unlock_level_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The unlockLevelIdList to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockLevelIdList(
          int index, int value) {
        ensureUnlockLevelIdListIsMutable();
        unlockLevelIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlock_level_id_list = 13;</code>
       * @param value The unlockLevelIdList to add.
       * @return This builder for chaining.
       */
      public Builder addUnlockLevelIdList(int value) {
        ensureUnlockLevelIdListIsMutable();
        unlockLevelIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlock_level_id_list = 13;</code>
       * @param values The unlockLevelIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnlockLevelIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnlockLevelIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unlockLevelIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlock_level_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockLevelIdList() {
        unlockLevelIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GCGTCTavernChallengeData)
    }

    // @@protoc_insertion_point(class_scope:GCGTCTavernChallengeData)
    private static final emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData();
    }

    public static emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCTavernChallengeData>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCTavernChallengeData>() {
      @java.lang.Override
      public GCGTCTavernChallengeData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGTCTavernChallengeData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGTCTavernChallengeData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCTavernChallengeData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCTavernChallengeData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCTavernChallengeData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GCGTCTavernChallengeData.proto\"N\n\030GCGT" +
      "CTavernChallengeData\022\024\n\014character_id\030\002 \001" +
      "(\r\022\034\n\024unlock_level_id_list\030\r \003(\rB!\n\031emu." +
      "grasscutter.net.protoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGTCTavernChallengeData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCTavernChallengeData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCTavernChallengeData_descriptor,
        new java.lang.String[] { "CharacterId", "UnlockLevelIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

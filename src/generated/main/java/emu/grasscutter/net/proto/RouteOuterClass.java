// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Route.proto

package emu.grasscutter.net.proto;

public final class RouteOuterClass {
  private RouteOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RouteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Route)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint> 
        getRoutePointsList();
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint getRoutePoints(int index);
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    int getRoutePointsCount();
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
        getRoutePointsOrBuilderList();
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(
        int index);

    /**
     * <code>uint32 route_type = 2;</code>
     * @return The routeType.
     */
    int getRouteType();
  }
  /**
   * <pre>
   * Name: CBIFHKIFHEE
   * </pre>
   *
   * Protobuf type {@code Route}
   */
  public static final class Route extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Route)
      RouteOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Route.newBuilder() to construct.
    private Route(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Route() {
      routePoints_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Route();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Route(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                routePoints_ = new java.util.ArrayList<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint>();
                mutable_bitField0_ |= 0x00000001;
              }
              routePoints_.add(
                  input.readMessage(emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.parser(), extensionRegistry));
              break;
            }
            case 16: {

              routeType_ = input.readUInt32();
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
          routePoints_ = java.util.Collections.unmodifiableList(routePoints_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RouteOuterClass.internal_static_Route_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RouteOuterClass.internal_static_Route_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RouteOuterClass.Route.class, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder.class);
    }

    public static final int ROUTE_POINTS_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint> routePoints_;
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint> getRoutePointsList() {
      return routePoints_;
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
        getRoutePointsOrBuilderList() {
      return routePoints_;
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public int getRoutePointsCount() {
      return routePoints_.size();
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint getRoutePoints(int index) {
      return routePoints_.get(index);
    }
    /**
     * <code>repeated .RoutePoint route_points = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(
        int index) {
      return routePoints_.get(index);
    }

    public static final int ROUTE_TYPE_FIELD_NUMBER = 2;
    private int routeType_;
    /**
     * <code>uint32 route_type = 2;</code>
     * @return The routeType.
     */
    @java.lang.Override
    public int getRouteType() {
      return routeType_;
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
      for (int i = 0; i < routePoints_.size(); i++) {
        output.writeMessage(1, routePoints_.get(i));
      }
      if (routeType_ != 0) {
        output.writeUInt32(2, routeType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < routePoints_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, routePoints_.get(i));
      }
      if (routeType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, routeType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RouteOuterClass.Route)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RouteOuterClass.Route other = (emu.grasscutter.net.proto.RouteOuterClass.Route) obj;

      if (!getRoutePointsList()
          .equals(other.getRoutePointsList())) return false;
      if (getRouteType()
          != other.getRouteType()) return false;
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
      if (getRoutePointsCount() > 0) {
        hash = (37 * hash) + ROUTE_POINTS_FIELD_NUMBER;
        hash = (53 * hash) + getRoutePointsList().hashCode();
      }
      hash = (37 * hash) + ROUTE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRouteType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RouteOuterClass.Route parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RouteOuterClass.Route prototype) {
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
     * Name: CBIFHKIFHEE
     * </pre>
     *
     * Protobuf type {@code Route}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Route)
        emu.grasscutter.net.proto.RouteOuterClass.RouteOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RouteOuterClass.internal_static_Route_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RouteOuterClass.internal_static_Route_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RouteOuterClass.Route.class, emu.grasscutter.net.proto.RouteOuterClass.Route.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RouteOuterClass.Route.newBuilder()
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
          getRoutePointsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (routePointsBuilder_ == null) {
          routePoints_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          routePointsBuilder_.clear();
        }
        routeType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RouteOuterClass.internal_static_Route_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RouteOuterClass.Route getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RouteOuterClass.Route build() {
        emu.grasscutter.net.proto.RouteOuterClass.Route result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RouteOuterClass.Route buildPartial() {
        emu.grasscutter.net.proto.RouteOuterClass.Route result = new emu.grasscutter.net.proto.RouteOuterClass.Route(this);
        int from_bitField0_ = bitField0_;
        if (routePointsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            routePoints_ = java.util.Collections.unmodifiableList(routePoints_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.routePoints_ = routePoints_;
        } else {
          result.routePoints_ = routePointsBuilder_.build();
        }
        result.routeType_ = routeType_;
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
        if (other instanceof emu.grasscutter.net.proto.RouteOuterClass.Route) {
          return mergeFrom((emu.grasscutter.net.proto.RouteOuterClass.Route)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RouteOuterClass.Route other) {
        if (other == emu.grasscutter.net.proto.RouteOuterClass.Route.getDefaultInstance()) return this;
        if (routePointsBuilder_ == null) {
          if (!other.routePoints_.isEmpty()) {
            if (routePoints_.isEmpty()) {
              routePoints_ = other.routePoints_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRoutePointsIsMutable();
              routePoints_.addAll(other.routePoints_);
            }
            onChanged();
          }
        } else {
          if (!other.routePoints_.isEmpty()) {
            if (routePointsBuilder_.isEmpty()) {
              routePointsBuilder_.dispose();
              routePointsBuilder_ = null;
              routePoints_ = other.routePoints_;
              bitField0_ = (bitField0_ & ~0x00000001);
              routePointsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRoutePointsFieldBuilder() : null;
            } else {
              routePointsBuilder_.addAllMessages(other.routePoints_);
            }
          }
        }
        if (other.getRouteType() != 0) {
          setRouteType(other.getRouteType());
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
        emu.grasscutter.net.proto.RouteOuterClass.Route parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RouteOuterClass.Route) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint> routePoints_ =
        java.util.Collections.emptyList();
      private void ensureRoutePointsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          routePoints_ = new java.util.ArrayList<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint>(routePoints_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder> routePointsBuilder_;

      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint> getRoutePointsList() {
        if (routePointsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(routePoints_);
        } else {
          return routePointsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public int getRoutePointsCount() {
        if (routePointsBuilder_ == null) {
          return routePoints_.size();
        } else {
          return routePointsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint getRoutePoints(int index) {
        if (routePointsBuilder_ == null) {
          return routePoints_.get(index);
        } else {
          return routePointsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder setRoutePoints(
          int index, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint value) {
        if (routePointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutePointsIsMutable();
          routePoints_.set(index, value);
          onChanged();
        } else {
          routePointsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder setRoutePoints(
          int index, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder builderForValue) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.set(index, builderForValue.build());
          onChanged();
        } else {
          routePointsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint value) {
        if (routePointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutePointsIsMutable();
          routePoints_.add(value);
          onChanged();
        } else {
          routePointsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(
          int index, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint value) {
        if (routePointsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutePointsIsMutable();
          routePoints_.add(index, value);
          onChanged();
        } else {
          routePointsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(
          emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder builderForValue) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.add(builderForValue.build());
          onChanged();
        } else {
          routePointsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addRoutePoints(
          int index, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder builderForValue) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.add(index, builderForValue.build());
          onChanged();
        } else {
          routePointsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder addAllRoutePoints(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint> values) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, routePoints_);
          onChanged();
        } else {
          routePointsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder clearRoutePoints() {
        if (routePointsBuilder_ == null) {
          routePoints_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          routePointsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public Builder removeRoutePoints(int index) {
        if (routePointsBuilder_ == null) {
          ensureRoutePointsIsMutable();
          routePoints_.remove(index);
          onChanged();
        } else {
          routePointsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder getRoutePointsBuilder(
          int index) {
        return getRoutePointsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder getRoutePointsOrBuilder(
          int index) {
        if (routePointsBuilder_ == null) {
          return routePoints_.get(index);  } else {
          return routePointsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
           getRoutePointsOrBuilderList() {
        if (routePointsBuilder_ != null) {
          return routePointsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(routePoints_);
        }
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder addRoutePointsBuilder() {
        return getRoutePointsFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder addRoutePointsBuilder(
          int index) {
        return getRoutePointsFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.getDefaultInstance());
      }
      /**
       * <code>repeated .RoutePoint route_points = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder> 
           getRoutePointsBuilderList() {
        return getRoutePointsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder> 
          getRoutePointsFieldBuilder() {
        if (routePointsBuilder_ == null) {
          routePointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePoint.Builder, emu.grasscutter.net.proto.RoutePointOuterClass.RoutePointOrBuilder>(
                  routePoints_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          routePoints_ = null;
        }
        return routePointsBuilder_;
      }

      private int routeType_ ;
      /**
       * <code>uint32 route_type = 2;</code>
       * @return The routeType.
       */
      @java.lang.Override
      public int getRouteType() {
        return routeType_;
      }
      /**
       * <code>uint32 route_type = 2;</code>
       * @param value The routeType to set.
       * @return This builder for chaining.
       */
      public Builder setRouteType(int value) {
        
        routeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 route_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRouteType() {
        
        routeType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Route)
    }

    // @@protoc_insertion_point(class_scope:Route)
    private static final emu.grasscutter.net.proto.RouteOuterClass.Route DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RouteOuterClass.Route();
    }

    public static emu.grasscutter.net.proto.RouteOuterClass.Route getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Route>
        PARSER = new com.google.protobuf.AbstractParser<Route>() {
      @java.lang.Override
      public Route parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Route(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Route> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Route> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RouteOuterClass.Route getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Route_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Route_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Route.proto\032\020RoutePoint.proto\">\n\005Route" +
      "\022!\n\014route_points\030\001 \003(\0132\013.RoutePoint\022\022\n\nr" +
      "oute_type\030\002 \001(\rB!\n\031emu.grasscutter.net.p" +
      "rotoZ\004/genb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RoutePointOuterClass.getDescriptor(),
        });
    internal_static_Route_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Route_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Route_descriptor,
        new java.lang.String[] { "RoutePoints", "RouteType", });
    emu.grasscutter.net.proto.RoutePointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

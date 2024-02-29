// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.subjectmapping;

/**
 * Protobuf type {@code subjectmapping.UpdateSubjectSetRequest}
 */
public final class UpdateSubjectSetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:subjectmapping.UpdateSubjectSetRequest)
    UpdateSubjectSetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSubjectSetRequest.newBuilder() to construct.
  private UpdateSubjectSetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSubjectSetRequest() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSubjectSetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_UpdateSubjectSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_UpdateSubjectSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest.class, io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_SET_FIELD_NUMBER = 2;
  private io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate subjectSet_;
  /**
   * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
   * @return Whether the subjectSet field is set.
   */
  @java.lang.Override
  public boolean hasSubjectSet() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
   * @return The subjectSet.
   */
  @java.lang.Override
  public io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate getSubjectSet() {
    return subjectSet_ == null ? io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.getDefaultInstance() : subjectSet_;
  }
  /**
   * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public io.opentdf.platform.subjectmapping.SubjectSetCreateUpdateOrBuilder getSubjectSetOrBuilder() {
    return subjectSet_ == null ? io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.getDefaultInstance() : subjectSet_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSubjectSet());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSubjectSet());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest)) {
      return super.equals(obj);
    }
    io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest other = (io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasSubjectSet() != other.hasSubjectSet()) return false;
    if (hasSubjectSet()) {
      if (!getSubjectSet()
          .equals(other.getSubjectSet())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasSubjectSet()) {
      hash = (37 * hash) + SUBJECT_SET_FIELD_NUMBER;
      hash = (53 * hash) + getSubjectSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest parseFrom(
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
  public static Builder newBuilder(io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest prototype) {
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
   * Protobuf type {@code subjectmapping.UpdateSubjectSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:subjectmapping.UpdateSubjectSetRequest)
      io.opentdf.platform.subjectmapping.UpdateSubjectSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_UpdateSubjectSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_UpdateSubjectSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest.class, io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest.Builder.class);
    }

    // Construct using io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest.newBuilder()
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
        getSubjectSetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      subjectSet_ = null;
      if (subjectSetBuilder_ != null) {
        subjectSetBuilder_.dispose();
        subjectSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_UpdateSubjectSetRequest_descriptor;
    }

    @java.lang.Override
    public io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest getDefaultInstanceForType() {
      return io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest build() {
      io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest buildPartial() {
      io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest result = new io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subjectSet_ = subjectSetBuilder_ == null
            ? subjectSet_
            : subjectSetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest) {
        return mergeFrom((io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest other) {
      if (other == io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSubjectSet()) {
        mergeSubjectSet(other.getSubjectSet());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSubjectSetFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate subjectSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate, io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.Builder, io.opentdf.platform.subjectmapping.SubjectSetCreateUpdateOrBuilder> subjectSetBuilder_;
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     * @return Whether the subjectSet field is set.
     */
    public boolean hasSubjectSet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     * @return The subjectSet.
     */
    public io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate getSubjectSet() {
      if (subjectSetBuilder_ == null) {
        return subjectSet_ == null ? io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.getDefaultInstance() : subjectSet_;
      } else {
        return subjectSetBuilder_.getMessage();
      }
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSubjectSet(io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate value) {
      if (subjectSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subjectSet_ = value;
      } else {
        subjectSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSubjectSet(
        io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.Builder builderForValue) {
      if (subjectSetBuilder_ == null) {
        subjectSet_ = builderForValue.build();
      } else {
        subjectSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeSubjectSet(io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate value) {
      if (subjectSetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          subjectSet_ != null &&
          subjectSet_ != io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.getDefaultInstance()) {
          getSubjectSetBuilder().mergeFrom(value);
        } else {
          subjectSet_ = value;
        }
      } else {
        subjectSetBuilder_.mergeFrom(value);
      }
      if (subjectSet_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearSubjectSet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      subjectSet_ = null;
      if (subjectSetBuilder_ != null) {
        subjectSetBuilder_.dispose();
        subjectSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     */
    public io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.Builder getSubjectSetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSubjectSetFieldBuilder().getBuilder();
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     */
    public io.opentdf.platform.subjectmapping.SubjectSetCreateUpdateOrBuilder getSubjectSetOrBuilder() {
      if (subjectSetBuilder_ != null) {
        return subjectSetBuilder_.getMessageOrBuilder();
      } else {
        return subjectSet_ == null ?
            io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.getDefaultInstance() : subjectSet_;
      }
    }
    /**
     * <code>.subjectmapping.SubjectSetCreateUpdate subject_set = 2 [json_name = "subjectSet", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate, io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.Builder, io.opentdf.platform.subjectmapping.SubjectSetCreateUpdateOrBuilder> 
        getSubjectSetFieldBuilder() {
      if (subjectSetBuilder_ == null) {
        subjectSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate, io.opentdf.platform.subjectmapping.SubjectSetCreateUpdate.Builder, io.opentdf.platform.subjectmapping.SubjectSetCreateUpdateOrBuilder>(
                getSubjectSet(),
                getParentForChildren(),
                isClean());
        subjectSet_ = null;
      }
      return subjectSetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:subjectmapping.UpdateSubjectSetRequest)
  }

  // @@protoc_insertion_point(class_scope:subjectmapping.UpdateSubjectSetRequest)
  private static final io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest();
  }

  public static io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSubjectSetRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSubjectSetRequest>() {
    @java.lang.Override
    public UpdateSubjectSetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateSubjectSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSubjectSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentdf.platform.subjectmapping.UpdateSubjectSetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


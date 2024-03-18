// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.subjectmapping;

/**
 * Protobuf type {@code policy.subjectmapping.SubjectConditionSetCreate}
 */
public final class SubjectConditionSetCreate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:policy.subjectmapping.SubjectConditionSetCreate)
    SubjectConditionSetCreateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubjectConditionSetCreate.newBuilder() to construct.
  private SubjectConditionSetCreate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubjectConditionSetCreate() {
    subjectSets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubjectConditionSetCreate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_SubjectConditionSetCreate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_SubjectConditionSetCreate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate.class, io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate.Builder.class);
  }

  private int bitField0_;
  public static final int SUBJECT_SETS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.opentdf.platform.policy.SubjectSet> subjectSets_;
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<io.opentdf.platform.policy.SubjectSet> getSubjectSetsList() {
    return subjectSets_;
  }
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.opentdf.platform.policy.SubjectSetOrBuilder> 
      getSubjectSetsOrBuilderList() {
    return subjectSets_;
  }
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public int getSubjectSetsCount() {
    return subjectSets_.size();
  }
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public io.opentdf.platform.policy.SubjectSet getSubjectSets(int index) {
    return subjectSets_.get(index);
  }
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public io.opentdf.platform.policy.SubjectSetOrBuilder getSubjectSetsOrBuilder(
      int index) {
    return subjectSets_.get(index);
  }

  public static final int METADATA_FIELD_NUMBER = 100;
  private io.opentdf.platform.common.MetadataMutable metadata_;
  /**
   * <pre>
   * Optional
   * Common metadata
   * </pre>
   *
   * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Optional
   * Common metadata
   * </pre>
   *
   * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public io.opentdf.platform.common.MetadataMutable getMetadata() {
    return metadata_ == null ? io.opentdf.platform.common.MetadataMutable.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Optional
   * Common metadata
   * </pre>
   *
   * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public io.opentdf.platform.common.MetadataMutableOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? io.opentdf.platform.common.MetadataMutable.getDefaultInstance() : metadata_;
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
    for (int i = 0; i < subjectSets_.size(); i++) {
      output.writeMessage(1, subjectSets_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(100, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subjectSets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subjectSets_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(100, getMetadata());
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
    if (!(obj instanceof io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate)) {
      return super.equals(obj);
    }
    io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate other = (io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate) obj;

    if (!getSubjectSetsList()
        .equals(other.getSubjectSetsList())) return false;
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (getSubjectSetsCount() > 0) {
      hash = (37 * hash) + SUBJECT_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getSubjectSetsList().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate parseFrom(
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
  public static Builder newBuilder(io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate prototype) {
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
   * Protobuf type {@code policy.subjectmapping.SubjectConditionSetCreate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:policy.subjectmapping.SubjectConditionSetCreate)
      io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_SubjectConditionSetCreate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_SubjectConditionSetCreate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate.class, io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate.Builder.class);
    }

    // Construct using io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate.newBuilder()
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
        getSubjectSetsFieldBuilder();
        getMetadataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (subjectSetsBuilder_ == null) {
        subjectSets_ = java.util.Collections.emptyList();
      } else {
        subjectSets_ = null;
        subjectSetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_SubjectConditionSetCreate_descriptor;
    }

    @java.lang.Override
    public io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate getDefaultInstanceForType() {
      return io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate build() {
      io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate buildPartial() {
      io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate result = new io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate result) {
      if (subjectSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subjectSets_ = java.util.Collections.unmodifiableList(subjectSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subjectSets_ = subjectSets_;
      } else {
        result.subjectSets_ = subjectSetsBuilder_.build();
      }
    }

    private void buildPartial0(io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
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
      if (other instanceof io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate) {
        return mergeFrom((io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate other) {
      if (other == io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate.getDefaultInstance()) return this;
      if (subjectSetsBuilder_ == null) {
        if (!other.subjectSets_.isEmpty()) {
          if (subjectSets_.isEmpty()) {
            subjectSets_ = other.subjectSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubjectSetsIsMutable();
            subjectSets_.addAll(other.subjectSets_);
          }
          onChanged();
        }
      } else {
        if (!other.subjectSets_.isEmpty()) {
          if (subjectSetsBuilder_.isEmpty()) {
            subjectSetsBuilder_.dispose();
            subjectSetsBuilder_ = null;
            subjectSets_ = other.subjectSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subjectSetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubjectSetsFieldBuilder() : null;
          } else {
            subjectSetsBuilder_.addAllMessages(other.subjectSets_);
          }
        }
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
              io.opentdf.platform.policy.SubjectSet m =
                  input.readMessage(
                      io.opentdf.platform.policy.SubjectSet.parser(),
                      extensionRegistry);
              if (subjectSetsBuilder_ == null) {
                ensureSubjectSetsIsMutable();
                subjectSets_.add(m);
              } else {
                subjectSetsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 802: {
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 802
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

    private java.util.List<io.opentdf.platform.policy.SubjectSet> subjectSets_ =
      java.util.Collections.emptyList();
    private void ensureSubjectSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subjectSets_ = new java.util.ArrayList<io.opentdf.platform.policy.SubjectSet>(subjectSets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentdf.platform.policy.SubjectSet, io.opentdf.platform.policy.SubjectSet.Builder, io.opentdf.platform.policy.SubjectSetOrBuilder> subjectSetsBuilder_;

    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<io.opentdf.platform.policy.SubjectSet> getSubjectSetsList() {
      if (subjectSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subjectSets_);
      } else {
        return subjectSetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public int getSubjectSetsCount() {
      if (subjectSetsBuilder_ == null) {
        return subjectSets_.size();
      } else {
        return subjectSetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public io.opentdf.platform.policy.SubjectSet getSubjectSets(int index) {
      if (subjectSetsBuilder_ == null) {
        return subjectSets_.get(index);
      } else {
        return subjectSetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSubjectSets(
        int index, io.opentdf.platform.policy.SubjectSet value) {
      if (subjectSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectSetsIsMutable();
        subjectSets_.set(index, value);
        onChanged();
      } else {
        subjectSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder setSubjectSets(
        int index, io.opentdf.platform.policy.SubjectSet.Builder builderForValue) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        subjectSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder addSubjectSets(io.opentdf.platform.policy.SubjectSet value) {
      if (subjectSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectSetsIsMutable();
        subjectSets_.add(value);
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder addSubjectSets(
        int index, io.opentdf.platform.policy.SubjectSet value) {
      if (subjectSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectSetsIsMutable();
        subjectSets_.add(index, value);
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder addSubjectSets(
        io.opentdf.platform.policy.SubjectSet.Builder builderForValue) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.add(builderForValue.build());
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder addSubjectSets(
        int index, io.opentdf.platform.policy.SubjectSet.Builder builderForValue) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder addAllSubjectSets(
        java.lang.Iterable<? extends io.opentdf.platform.policy.SubjectSet> values) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subjectSets_);
        onChanged();
      } else {
        subjectSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearSubjectSets() {
      if (subjectSetsBuilder_ == null) {
        subjectSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subjectSetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeSubjectSets(int index) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.remove(index);
        onChanged();
      } else {
        subjectSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public io.opentdf.platform.policy.SubjectSet.Builder getSubjectSetsBuilder(
        int index) {
      return getSubjectSetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public io.opentdf.platform.policy.SubjectSetOrBuilder getSubjectSetsOrBuilder(
        int index) {
      if (subjectSetsBuilder_ == null) {
        return subjectSets_.get(index);  } else {
        return subjectSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<? extends io.opentdf.platform.policy.SubjectSetOrBuilder> 
         getSubjectSetsOrBuilderList() {
      if (subjectSetsBuilder_ != null) {
        return subjectSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subjectSets_);
      }
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public io.opentdf.platform.policy.SubjectSet.Builder addSubjectSetsBuilder() {
      return getSubjectSetsFieldBuilder().addBuilder(
          io.opentdf.platform.policy.SubjectSet.getDefaultInstance());
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public io.opentdf.platform.policy.SubjectSet.Builder addSubjectSetsBuilder(
        int index) {
      return getSubjectSetsFieldBuilder().addBuilder(
          index, io.opentdf.platform.policy.SubjectSet.getDefaultInstance());
    }
    /**
     * <pre>
     * Required
     * </pre>
     *
     * <code>repeated .policy.SubjectSet subject_sets = 1 [json_name = "subjectSets", (.buf.validate.field) = { ... }</code>
     */
    public java.util.List<io.opentdf.platform.policy.SubjectSet.Builder> 
         getSubjectSetsBuilderList() {
      return getSubjectSetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentdf.platform.policy.SubjectSet, io.opentdf.platform.policy.SubjectSet.Builder, io.opentdf.platform.policy.SubjectSetOrBuilder> 
        getSubjectSetsFieldBuilder() {
      if (subjectSetsBuilder_ == null) {
        subjectSetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.opentdf.platform.policy.SubjectSet, io.opentdf.platform.policy.SubjectSet.Builder, io.opentdf.platform.policy.SubjectSetOrBuilder>(
                subjectSets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subjectSets_ = null;
      }
      return subjectSetsBuilder_;
    }

    private io.opentdf.platform.common.MetadataMutable metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opentdf.platform.common.MetadataMutable, io.opentdf.platform.common.MetadataMutable.Builder, io.opentdf.platform.common.MetadataMutableOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    public io.opentdf.platform.common.MetadataMutable getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? io.opentdf.platform.common.MetadataMutable.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(io.opentdf.platform.common.MetadataMutable value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        io.opentdf.platform.common.MetadataMutable.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(io.opentdf.platform.common.MetadataMutable value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadata_ != null &&
          metadata_ != io.opentdf.platform.common.MetadataMutable.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      if (metadata_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     */
    public io.opentdf.platform.common.MetadataMutable.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     */
    public io.opentdf.platform.common.MetadataMutableOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            io.opentdf.platform.common.MetadataMutable.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * Optional
     * Common metadata
     * </pre>
     *
     * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opentdf.platform.common.MetadataMutable, io.opentdf.platform.common.MetadataMutable.Builder, io.opentdf.platform.common.MetadataMutableOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opentdf.platform.common.MetadataMutable, io.opentdf.platform.common.MetadataMutable.Builder, io.opentdf.platform.common.MetadataMutableOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:policy.subjectmapping.SubjectConditionSetCreate)
  }

  // @@protoc_insertion_point(class_scope:policy.subjectmapping.SubjectConditionSetCreate)
  private static final io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate();
  }

  public static io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubjectConditionSetCreate>
      PARSER = new com.google.protobuf.AbstractParser<SubjectConditionSetCreate>() {
    @java.lang.Override
    public SubjectConditionSetCreate parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubjectConditionSetCreate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubjectConditionSetCreate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentdf.platform.policy.subjectmapping.SubjectConditionSetCreate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


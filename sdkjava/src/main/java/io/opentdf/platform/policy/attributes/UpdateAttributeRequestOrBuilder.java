// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.attributes;

public interface UpdateAttributeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.attributes.UpdateAttributeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Required
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.buf.validate.field) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  io.opentdf.platform.common.MetadataMutable getMetadata();
  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>.common.MetadataMutable metadata = 100 [json_name = "metadata"];</code>
   */
  io.opentdf.platform.common.MetadataMutableOrBuilder getMetadataOrBuilder();

  /**
   * <code>.common.MetadataUpdateEnum metadata_update_behavior = 101 [json_name = "metadataUpdateBehavior"];</code>
   * @return The enum numeric value on the wire for metadataUpdateBehavior.
   */
  int getMetadataUpdateBehaviorValue();
  /**
   * <code>.common.MetadataUpdateEnum metadata_update_behavior = 101 [json_name = "metadataUpdateBehavior"];</code>
   * @return The metadataUpdateBehavior.
   */
  io.opentdf.platform.common.MetadataUpdateEnum getMetadataUpdateBehavior();
}

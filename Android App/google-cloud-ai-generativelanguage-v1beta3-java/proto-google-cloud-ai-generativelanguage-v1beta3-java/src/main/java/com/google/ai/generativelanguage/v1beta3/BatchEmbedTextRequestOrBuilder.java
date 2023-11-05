// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/text_service.proto

package com.google.ai.generativelanguage.v1beta3;

public interface BatchEmbedTextRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.BatchEmbedTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the `Model` to use for generating the embedding.
   * Examples:
   *  models/embedding-gecko-001
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Required. The name of the `Model` to use for generating the embedding.
   * Examples:
   *  models/embedding-gecko-001
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Required. The free-form input texts that the model will turn into an
   * embedding.  The current limit is 100 texts, over which an error will be
   * thrown.
   * </pre>
   *
   * <code>repeated string texts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the texts.
   */
  java.util.List<java.lang.String>
      getTextsList();
  /**
   * <pre>
   * Required. The free-form input texts that the model will turn into an
   * embedding.  The current limit is 100 texts, over which an error will be
   * thrown.
   * </pre>
   *
   * <code>repeated string texts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of texts.
   */
  int getTextsCount();
  /**
   * <pre>
   * Required. The free-form input texts that the model will turn into an
   * embedding.  The current limit is 100 texts, over which an error will be
   * thrown.
   * </pre>
   *
   * <code>repeated string texts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The texts at the given index.
   */
  java.lang.String getTexts(int index);
  /**
   * <pre>
   * Required. The free-form input texts that the model will turn into an
   * embedding.  The current limit is 100 texts, over which an error will be
   * thrown.
   * </pre>
   *
   * <code>repeated string texts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the texts at the given index.
   */
  com.google.protobuf.ByteString
      getTextsBytes(int index);
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/text_service.proto

package com.google.ai.generativelanguage.v1beta3;

public interface EmbeddingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.Embedding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The embedding values.
   * </pre>
   *
   * <code>repeated float value = 1;</code>
   * @return A list containing the value.
   */
  java.util.List<java.lang.Float> getValueList();
  /**
   * <pre>
   * The embedding values.
   * </pre>
   *
   * <code>repeated float value = 1;</code>
   * @return The count of value.
   */
  int getValueCount();
  /**
   * <pre>
   * The embedding values.
   * </pre>
   *
   * <code>repeated float value = 1;</code>
   * @param index The index of the element to return.
   * @return The value at the given index.
   */
  float getValue(int index);
}
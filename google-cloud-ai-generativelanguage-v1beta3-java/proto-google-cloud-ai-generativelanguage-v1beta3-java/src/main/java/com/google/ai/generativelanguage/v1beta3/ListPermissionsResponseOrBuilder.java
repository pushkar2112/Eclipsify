// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/permission_service.proto

package com.google.ai.generativelanguage.v1beta3;

public interface ListPermissionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta3.ListPermissionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned permissions.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Permission permissions = 1;</code>
   */
  java.util.List<com.google.ai.generativelanguage.v1beta3.Permission> 
      getPermissionsList();
  /**
   * <pre>
   * Returned permissions.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Permission permissions = 1;</code>
   */
  com.google.ai.generativelanguage.v1beta3.Permission getPermissions(int index);
  /**
   * <pre>
   * Returned permissions.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Permission permissions = 1;</code>
   */
  int getPermissionsCount();
  /**
   * <pre>
   * Returned permissions.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Permission permissions = 1;</code>
   */
  java.util.List<? extends com.google.ai.generativelanguage.v1beta3.PermissionOrBuilder> 
      getPermissionsOrBuilderList();
  /**
   * <pre>
   * Returned permissions.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.Permission permissions = 1;</code>
   */
  com.google.ai.generativelanguage.v1beta3.PermissionOrBuilder getPermissionsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   *
   * If this field is omitted, there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   *
   * If this field is omitted, there are no more pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}

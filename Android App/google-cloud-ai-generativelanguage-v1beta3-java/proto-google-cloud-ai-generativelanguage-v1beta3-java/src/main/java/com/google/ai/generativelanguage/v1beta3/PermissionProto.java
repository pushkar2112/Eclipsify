// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/permission.proto

package com.google.ai.generativelanguage.v1beta3;

public final class PermissionProto {
  private PermissionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ai_generativelanguage_v1beta3_Permission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ai_generativelanguage_v1beta3_Permission_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ai/generativelanguage/v1beta3/p" +
      "ermission.proto\022$google.ai.generativelan" +
      "guage.v1beta3\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\260\004\n\nPe" +
      "rmission\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022^\n\014grantee_" +
      "type\030\002 \001(\0162<.google.ai.generativelanguag" +
      "e.v1beta3.Permission.GranteeTypeB\005\342A\002\002\005H" +
      "\000\210\001\001\022!\n\remail_address\030\003 \001(\tB\005\342A\002\001\005H\001\210\001\001\022" +
      "N\n\004role\030\004 \001(\01625.google.ai.generativelang" +
      "uage.v1beta3.Permission.RoleB\004\342A\001\002H\002\210\001\001\"" +
      "N\n\013GranteeType\022\034\n\030GRANTEE_TYPE_UNSPECIFI" +
      "ED\020\000\022\010\n\004USER\020\001\022\t\n\005GROUP\020\002\022\014\n\010EVERYONE\020\003\"" +
      "?\n\004Role\022\024\n\020ROLE_UNSPECIFIED\020\000\022\t\n\005OWNER\020\001" +
      "\022\n\n\006WRITER\020\002\022\n\n\006READER\020\003:~\352A{\n,generativ" +
      "elanguage.googleapis.com/Permission\0222tun" +
      "edModels/{tuned_model}/permissions/{perm" +
      "ission}*\013permissions2\npermissionB\017\n\r_gra" +
      "ntee_typeB\020\n\016_email_addressB\007\n\005_roleB\235\001\n" +
      "(com.google.ai.generativelanguage.v1beta" +
      "3B\017PermissionProtoP\001Z^cloud.google.com/g" +
      "o/ai/generativelanguage/apiv1beta3/gener" +
      "ativelanguagepb;generativelanguagepbb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ai_generativelanguage_v1beta3_Permission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ai_generativelanguage_v1beta3_Permission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ai_generativelanguage_v1beta3_Permission_descriptor,
        new java.lang.String[] { "Name", "GranteeType", "EmailAddress", "Role", "GranteeType", "EmailAddress", "Role", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
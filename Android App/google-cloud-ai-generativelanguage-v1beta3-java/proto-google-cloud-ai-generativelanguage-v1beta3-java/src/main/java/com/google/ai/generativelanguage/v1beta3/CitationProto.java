// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/citation.proto

package com.google.ai.generativelanguage.v1beta3;

public final class CitationProto {
  private CitationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ai_generativelanguage_v1beta3_CitationSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ai_generativelanguage_v1beta3_CitationSource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ai/generativelanguage/v1beta3/c" +
      "itation.proto\022$google.ai.generativelangu" +
      "age.v1beta3\032\037google/api/field_behavior.p" +
      "roto\"b\n\020CitationMetadata\022N\n\020citation_sou" +
      "rces\030\001 \003(\01324.google.ai.generativelanguag" +
      "e.v1beta3.CitationSource\"\264\001\n\016CitationSou" +
      "rce\022\036\n\013start_index\030\001 \001(\005B\004\342A\001\001H\000\210\001\001\022\034\n\te" +
      "nd_index\030\002 \001(\005B\004\342A\001\001H\001\210\001\001\022\026\n\003uri\030\003 \001(\tB\004" +
      "\342A\001\001H\002\210\001\001\022\032\n\007license\030\004 \001(\tB\004\342A\001\001H\003\210\001\001B\016\n" +
      "\014_start_indexB\014\n\n_end_indexB\006\n\004_uriB\n\n\010_" +
      "licenseB\233\001\n(com.google.ai.generativelang" +
      "uage.v1beta3B\rCitationProtoP\001Z^cloud.goo" +
      "gle.com/go/ai/generativelanguage/apiv1be" +
      "ta3/generativelanguagepb;generativelangu" +
      "agepbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_descriptor,
        new java.lang.String[] { "CitationSources", });
    internal_static_google_ai_generativelanguage_v1beta3_CitationSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ai_generativelanguage_v1beta3_CitationSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ai_generativelanguage_v1beta3_CitationSource_descriptor,
        new java.lang.String[] { "StartIndex", "EndIndex", "Uri", "License", "StartIndex", "EndIndex", "Uri", "License", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conversor/conversor.proto

package com.proto.conversor;

public final class Conversor {
  private Conversor() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_conversor_APIRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_conversor_APIRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_conversor_APIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_conversor_APIResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031conversor/conversor.proto\022\tconversor\"\031" +
      "\n\nAPIRequest\022\013\n\003mao\030\001 \001(\t\"\037\n\013APIResponse" +
      "\022\020\n\010response\030\001 \001(\t2D\n\nAPIservice\0226\n\005matc" +
      "h\022\025.conversor.APIRequest\032\026.conversor.API" +
      "ResponseB\027\n\023com.proto.conversorP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_conversor_APIRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_conversor_APIRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_conversor_APIRequest_descriptor,
        new java.lang.String[] { "Mao", });
    internal_static_conversor_APIResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_conversor_APIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_conversor_APIResponse_descriptor,
        new java.lang.String[] { "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
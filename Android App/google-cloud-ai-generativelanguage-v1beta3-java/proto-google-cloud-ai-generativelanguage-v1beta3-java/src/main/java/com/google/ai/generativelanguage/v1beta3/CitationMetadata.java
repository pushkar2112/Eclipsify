// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta3/citation.proto

package com.google.ai.generativelanguage.v1beta3;

/**
 * <pre>
 * A collection of source attributions for a piece of content.
 * </pre>
 *
 * Protobuf type {@code google.ai.generativelanguage.v1beta3.CitationMetadata}
 */
public final class CitationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ai.generativelanguage.v1beta3.CitationMetadata)
    CitationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CitationMetadata.newBuilder() to construct.
  private CitationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CitationMetadata() {
    citationSources_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CitationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ai.generativelanguage.v1beta3.CitationProto.internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ai.generativelanguage.v1beta3.CitationProto.internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ai.generativelanguage.v1beta3.CitationMetadata.class, com.google.ai.generativelanguage.v1beta3.CitationMetadata.Builder.class);
  }

  public static final int CITATION_SOURCES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ai.generativelanguage.v1beta3.CitationSource> citationSources_;
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ai.generativelanguage.v1beta3.CitationSource> getCitationSourcesList() {
    return citationSources_;
  }
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder> 
      getCitationSourcesOrBuilderList() {
    return citationSources_;
  }
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  @java.lang.Override
  public int getCitationSourcesCount() {
    return citationSources_.size();
  }
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.CitationSource getCitationSources(int index) {
    return citationSources_.get(index);
  }
  /**
   * <pre>
   * Citations to sources for a specific response.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
   */
  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder getCitationSourcesOrBuilder(
      int index) {
    return citationSources_.get(index);
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
    for (int i = 0; i < citationSources_.size(); i++) {
      output.writeMessage(1, citationSources_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < citationSources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, citationSources_.get(i));
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
    if (!(obj instanceof com.google.ai.generativelanguage.v1beta3.CitationMetadata)) {
      return super.equals(obj);
    }
    com.google.ai.generativelanguage.v1beta3.CitationMetadata other = (com.google.ai.generativelanguage.v1beta3.CitationMetadata) obj;

    if (!getCitationSourcesList()
        .equals(other.getCitationSourcesList())) return false;
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
    if (getCitationSourcesCount() > 0) {
      hash = (37 * hash) + CITATION_SOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getCitationSourcesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.ai.generativelanguage.v1beta3.CitationMetadata prototype) {
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
   * A collection of source attributions for a piece of content.
   * </pre>
   *
   * Protobuf type {@code google.ai.generativelanguage.v1beta3.CitationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ai.generativelanguage.v1beta3.CitationMetadata)
      com.google.ai.generativelanguage.v1beta3.CitationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ai.generativelanguage.v1beta3.CitationProto.internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ai.generativelanguage.v1beta3.CitationProto.internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ai.generativelanguage.v1beta3.CitationMetadata.class, com.google.ai.generativelanguage.v1beta3.CitationMetadata.Builder.class);
    }

    // Construct using com.google.ai.generativelanguage.v1beta3.CitationMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (citationSourcesBuilder_ == null) {
        citationSources_ = java.util.Collections.emptyList();
      } else {
        citationSources_ = null;
        citationSourcesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ai.generativelanguage.v1beta3.CitationProto.internal_static_google_ai_generativelanguage_v1beta3_CitationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.CitationMetadata getDefaultInstanceForType() {
      return com.google.ai.generativelanguage.v1beta3.CitationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.CitationMetadata build() {
      com.google.ai.generativelanguage.v1beta3.CitationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ai.generativelanguage.v1beta3.CitationMetadata buildPartial() {
      com.google.ai.generativelanguage.v1beta3.CitationMetadata result = new com.google.ai.generativelanguage.v1beta3.CitationMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ai.generativelanguage.v1beta3.CitationMetadata result) {
      if (citationSourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          citationSources_ = java.util.Collections.unmodifiableList(citationSources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.citationSources_ = citationSources_;
      } else {
        result.citationSources_ = citationSourcesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ai.generativelanguage.v1beta3.CitationMetadata result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ai.generativelanguage.v1beta3.CitationMetadata) {
        return mergeFrom((com.google.ai.generativelanguage.v1beta3.CitationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ai.generativelanguage.v1beta3.CitationMetadata other) {
      if (other == com.google.ai.generativelanguage.v1beta3.CitationMetadata.getDefaultInstance()) return this;
      if (citationSourcesBuilder_ == null) {
        if (!other.citationSources_.isEmpty()) {
          if (citationSources_.isEmpty()) {
            citationSources_ = other.citationSources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCitationSourcesIsMutable();
            citationSources_.addAll(other.citationSources_);
          }
          onChanged();
        }
      } else {
        if (!other.citationSources_.isEmpty()) {
          if (citationSourcesBuilder_.isEmpty()) {
            citationSourcesBuilder_.dispose();
            citationSourcesBuilder_ = null;
            citationSources_ = other.citationSources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            citationSourcesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCitationSourcesFieldBuilder() : null;
          } else {
            citationSourcesBuilder_.addAllMessages(other.citationSources_);
          }
        }
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
              com.google.ai.generativelanguage.v1beta3.CitationSource m =
                  input.readMessage(
                      com.google.ai.generativelanguage.v1beta3.CitationSource.parser(),
                      extensionRegistry);
              if (citationSourcesBuilder_ == null) {
                ensureCitationSourcesIsMutable();
                citationSources_.add(m);
              } else {
                citationSourcesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ai.generativelanguage.v1beta3.CitationSource> citationSources_ =
      java.util.Collections.emptyList();
    private void ensureCitationSourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        citationSources_ = new java.util.ArrayList<com.google.ai.generativelanguage.v1beta3.CitationSource>(citationSources_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ai.generativelanguage.v1beta3.CitationSource, com.google.ai.generativelanguage.v1beta3.CitationSource.Builder, com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder> citationSourcesBuilder_;

    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public java.util.List<com.google.ai.generativelanguage.v1beta3.CitationSource> getCitationSourcesList() {
      if (citationSourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(citationSources_);
      } else {
        return citationSourcesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public int getCitationSourcesCount() {
      if (citationSourcesBuilder_ == null) {
        return citationSources_.size();
      } else {
        return citationSourcesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public com.google.ai.generativelanguage.v1beta3.CitationSource getCitationSources(int index) {
      if (citationSourcesBuilder_ == null) {
        return citationSources_.get(index);
      } else {
        return citationSourcesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder setCitationSources(
        int index, com.google.ai.generativelanguage.v1beta3.CitationSource value) {
      if (citationSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCitationSourcesIsMutable();
        citationSources_.set(index, value);
        onChanged();
      } else {
        citationSourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder setCitationSources(
        int index, com.google.ai.generativelanguage.v1beta3.CitationSource.Builder builderForValue) {
      if (citationSourcesBuilder_ == null) {
        ensureCitationSourcesIsMutable();
        citationSources_.set(index, builderForValue.build());
        onChanged();
      } else {
        citationSourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder addCitationSources(com.google.ai.generativelanguage.v1beta3.CitationSource value) {
      if (citationSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCitationSourcesIsMutable();
        citationSources_.add(value);
        onChanged();
      } else {
        citationSourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder addCitationSources(
        int index, com.google.ai.generativelanguage.v1beta3.CitationSource value) {
      if (citationSourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCitationSourcesIsMutable();
        citationSources_.add(index, value);
        onChanged();
      } else {
        citationSourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder addCitationSources(
        com.google.ai.generativelanguage.v1beta3.CitationSource.Builder builderForValue) {
      if (citationSourcesBuilder_ == null) {
        ensureCitationSourcesIsMutable();
        citationSources_.add(builderForValue.build());
        onChanged();
      } else {
        citationSourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder addCitationSources(
        int index, com.google.ai.generativelanguage.v1beta3.CitationSource.Builder builderForValue) {
      if (citationSourcesBuilder_ == null) {
        ensureCitationSourcesIsMutable();
        citationSources_.add(index, builderForValue.build());
        onChanged();
      } else {
        citationSourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder addAllCitationSources(
        java.lang.Iterable<? extends com.google.ai.generativelanguage.v1beta3.CitationSource> values) {
      if (citationSourcesBuilder_ == null) {
        ensureCitationSourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, citationSources_);
        onChanged();
      } else {
        citationSourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder clearCitationSources() {
      if (citationSourcesBuilder_ == null) {
        citationSources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        citationSourcesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public Builder removeCitationSources(int index) {
      if (citationSourcesBuilder_ == null) {
        ensureCitationSourcesIsMutable();
        citationSources_.remove(index);
        onChanged();
      } else {
        citationSourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public com.google.ai.generativelanguage.v1beta3.CitationSource.Builder getCitationSourcesBuilder(
        int index) {
      return getCitationSourcesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder getCitationSourcesOrBuilder(
        int index) {
      if (citationSourcesBuilder_ == null) {
        return citationSources_.get(index);  } else {
        return citationSourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public java.util.List<? extends com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder> 
         getCitationSourcesOrBuilderList() {
      if (citationSourcesBuilder_ != null) {
        return citationSourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(citationSources_);
      }
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public com.google.ai.generativelanguage.v1beta3.CitationSource.Builder addCitationSourcesBuilder() {
      return getCitationSourcesFieldBuilder().addBuilder(
          com.google.ai.generativelanguage.v1beta3.CitationSource.getDefaultInstance());
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public com.google.ai.generativelanguage.v1beta3.CitationSource.Builder addCitationSourcesBuilder(
        int index) {
      return getCitationSourcesFieldBuilder().addBuilder(
          index, com.google.ai.generativelanguage.v1beta3.CitationSource.getDefaultInstance());
    }
    /**
     * <pre>
     * Citations to sources for a specific response.
     * </pre>
     *
     * <code>repeated .google.ai.generativelanguage.v1beta3.CitationSource citation_sources = 1;</code>
     */
    public java.util.List<com.google.ai.generativelanguage.v1beta3.CitationSource.Builder> 
         getCitationSourcesBuilderList() {
      return getCitationSourcesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ai.generativelanguage.v1beta3.CitationSource, com.google.ai.generativelanguage.v1beta3.CitationSource.Builder, com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder> 
        getCitationSourcesFieldBuilder() {
      if (citationSourcesBuilder_ == null) {
        citationSourcesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ai.generativelanguage.v1beta3.CitationSource, com.google.ai.generativelanguage.v1beta3.CitationSource.Builder, com.google.ai.generativelanguage.v1beta3.CitationSourceOrBuilder>(
                citationSources_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        citationSources_ = null;
      }
      return citationSourcesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ai.generativelanguage.v1beta3.CitationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.ai.generativelanguage.v1beta3.CitationMetadata)
  private static final com.google.ai.generativelanguage.v1beta3.CitationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ai.generativelanguage.v1beta3.CitationMetadata();
  }

  public static com.google.ai.generativelanguage.v1beta3.CitationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CitationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<CitationMetadata>() {
    @java.lang.Override
    public CitationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<CitationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CitationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ai.generativelanguage.v1beta3.CitationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


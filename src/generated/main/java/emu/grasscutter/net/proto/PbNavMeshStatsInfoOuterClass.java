// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PbNavMeshStatsInfo.proto

package emu.grasscutter.net.proto;

public final class PbNavMeshStatsInfoOuterClass {
  private PbNavMeshStatsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PbNavMeshStatsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PbNavMeshStatsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 HDAAEDFOOOI = 5;</code>
     * @return The hDAAEDFOOOI.
     */
    int getHDAAEDFOOOI();

    /**
     * <code>int32 ECNPOEJHPCI = 10;</code>
     * @return The eCNPOEJHPCI.
     */
    int getECNPOEJHPCI();

    /**
     * <code>int32 FJGDCFHBCLI = 3;</code>
     * @return The fJGDCFHBCLI.
     */
    int getFJGDCFHBCLI();

    /**
     * <code>int32 GNLELCLHHDK = 14;</code>
     * @return The gNLELCLHHDK.
     */
    int getGNLELCLHHDK();
  }
  /**
   * <pre>
   * Obf: MOELDGBGLLB
   * </pre>
   *
   * Protobuf type {@code PbNavMeshStatsInfo}
   */
  public static final class PbNavMeshStatsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PbNavMeshStatsInfo)
      PbNavMeshStatsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PbNavMeshStatsInfo.newBuilder() to construct.
    private PbNavMeshStatsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PbNavMeshStatsInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PbNavMeshStatsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PbNavMeshStatsInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              fJGDCFHBCLI_ = input.readInt32();
              break;
            }
            case 40: {

              hDAAEDFOOOI_ = input.readInt32();
              break;
            }
            case 80: {

              eCNPOEJHPCI_ = input.readInt32();
              break;
            }
            case 112: {

              gNLELCLHHDK_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.class, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder.class);
    }

    public static final int HDAAEDFOOOI_FIELD_NUMBER = 5;
    private int hDAAEDFOOOI_;
    /**
     * <code>int32 HDAAEDFOOOI = 5;</code>
     * @return The hDAAEDFOOOI.
     */
    @java.lang.Override
    public int getHDAAEDFOOOI() {
      return hDAAEDFOOOI_;
    }

    public static final int ECNPOEJHPCI_FIELD_NUMBER = 10;
    private int eCNPOEJHPCI_;
    /**
     * <code>int32 ECNPOEJHPCI = 10;</code>
     * @return The eCNPOEJHPCI.
     */
    @java.lang.Override
    public int getECNPOEJHPCI() {
      return eCNPOEJHPCI_;
    }

    public static final int FJGDCFHBCLI_FIELD_NUMBER = 3;
    private int fJGDCFHBCLI_;
    /**
     * <code>int32 FJGDCFHBCLI = 3;</code>
     * @return The fJGDCFHBCLI.
     */
    @java.lang.Override
    public int getFJGDCFHBCLI() {
      return fJGDCFHBCLI_;
    }

    public static final int GNLELCLHHDK_FIELD_NUMBER = 14;
    private int gNLELCLHHDK_;
    /**
     * <code>int32 GNLELCLHHDK = 14;</code>
     * @return The gNLELCLHHDK.
     */
    @java.lang.Override
    public int getGNLELCLHHDK() {
      return gNLELCLHHDK_;
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
      if (fJGDCFHBCLI_ != 0) {
        output.writeInt32(3, fJGDCFHBCLI_);
      }
      if (hDAAEDFOOOI_ != 0) {
        output.writeInt32(5, hDAAEDFOOOI_);
      }
      if (eCNPOEJHPCI_ != 0) {
        output.writeInt32(10, eCNPOEJHPCI_);
      }
      if (gNLELCLHHDK_ != 0) {
        output.writeInt32(14, gNLELCLHHDK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fJGDCFHBCLI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, fJGDCFHBCLI_);
      }
      if (hDAAEDFOOOI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, hDAAEDFOOOI_);
      }
      if (eCNPOEJHPCI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, eCNPOEJHPCI_);
      }
      if (gNLELCLHHDK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, gNLELCLHHDK_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo other = (emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo) obj;

      if (getHDAAEDFOOOI()
          != other.getHDAAEDFOOOI()) return false;
      if (getECNPOEJHPCI()
          != other.getECNPOEJHPCI()) return false;
      if (getFJGDCFHBCLI()
          != other.getFJGDCFHBCLI()) return false;
      if (getGNLELCLHHDK()
          != other.getGNLELCLHHDK()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HDAAEDFOOOI_FIELD_NUMBER;
      hash = (53 * hash) + getHDAAEDFOOOI();
      hash = (37 * hash) + ECNPOEJHPCI_FIELD_NUMBER;
      hash = (53 * hash) + getECNPOEJHPCI();
      hash = (37 * hash) + FJGDCFHBCLI_FIELD_NUMBER;
      hash = (53 * hash) + getFJGDCFHBCLI();
      hash = (37 * hash) + GNLELCLHHDK_FIELD_NUMBER;
      hash = (53 * hash) + getGNLELCLHHDK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo prototype) {
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
     * Obf: MOELDGBGLLB
     * </pre>
     *
     * Protobuf type {@code PbNavMeshStatsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PbNavMeshStatsInfo)
        emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.class, emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hDAAEDFOOOI_ = 0;

        eCNPOEJHPCI_ = 0;

        fJGDCFHBCLI_ = 0;

        gNLELCLHHDK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.internal_static_PbNavMeshStatsInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo build() {
        emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo buildPartial() {
        emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo result = new emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo(this);
        result.hDAAEDFOOOI_ = hDAAEDFOOOI_;
        result.eCNPOEJHPCI_ = eCNPOEJHPCI_;
        result.fJGDCFHBCLI_ = fJGDCFHBCLI_;
        result.gNLELCLHHDK_ = gNLELCLHHDK_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo) {
          return mergeFrom((emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo other) {
        if (other == emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo.getDefaultInstance()) return this;
        if (other.getHDAAEDFOOOI() != 0) {
          setHDAAEDFOOOI(other.getHDAAEDFOOOI());
        }
        if (other.getECNPOEJHPCI() != 0) {
          setECNPOEJHPCI(other.getECNPOEJHPCI());
        }
        if (other.getFJGDCFHBCLI() != 0) {
          setFJGDCFHBCLI(other.getFJGDCFHBCLI());
        }
        if (other.getGNLELCLHHDK() != 0) {
          setGNLELCLHHDK(other.getGNLELCLHHDK());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int hDAAEDFOOOI_ ;
      /**
       * <code>int32 HDAAEDFOOOI = 5;</code>
       * @return The hDAAEDFOOOI.
       */
      @java.lang.Override
      public int getHDAAEDFOOOI() {
        return hDAAEDFOOOI_;
      }
      /**
       * <code>int32 HDAAEDFOOOI = 5;</code>
       * @param value The hDAAEDFOOOI to set.
       * @return This builder for chaining.
       */
      public Builder setHDAAEDFOOOI(int value) {
        
        hDAAEDFOOOI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 HDAAEDFOOOI = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearHDAAEDFOOOI() {
        
        hDAAEDFOOOI_ = 0;
        onChanged();
        return this;
      }

      private int eCNPOEJHPCI_ ;
      /**
       * <code>int32 ECNPOEJHPCI = 10;</code>
       * @return The eCNPOEJHPCI.
       */
      @java.lang.Override
      public int getECNPOEJHPCI() {
        return eCNPOEJHPCI_;
      }
      /**
       * <code>int32 ECNPOEJHPCI = 10;</code>
       * @param value The eCNPOEJHPCI to set.
       * @return This builder for chaining.
       */
      public Builder setECNPOEJHPCI(int value) {
        
        eCNPOEJHPCI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 ECNPOEJHPCI = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearECNPOEJHPCI() {
        
        eCNPOEJHPCI_ = 0;
        onChanged();
        return this;
      }

      private int fJGDCFHBCLI_ ;
      /**
       * <code>int32 FJGDCFHBCLI = 3;</code>
       * @return The fJGDCFHBCLI.
       */
      @java.lang.Override
      public int getFJGDCFHBCLI() {
        return fJGDCFHBCLI_;
      }
      /**
       * <code>int32 FJGDCFHBCLI = 3;</code>
       * @param value The fJGDCFHBCLI to set.
       * @return This builder for chaining.
       */
      public Builder setFJGDCFHBCLI(int value) {
        
        fJGDCFHBCLI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 FJGDCFHBCLI = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFJGDCFHBCLI() {
        
        fJGDCFHBCLI_ = 0;
        onChanged();
        return this;
      }

      private int gNLELCLHHDK_ ;
      /**
       * <code>int32 GNLELCLHHDK = 14;</code>
       * @return The gNLELCLHHDK.
       */
      @java.lang.Override
      public int getGNLELCLHHDK() {
        return gNLELCLHHDK_;
      }
      /**
       * <code>int32 GNLELCLHHDK = 14;</code>
       * @param value The gNLELCLHHDK to set.
       * @return This builder for chaining.
       */
      public Builder setGNLELCLHHDK(int value) {
        
        gNLELCLHHDK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 GNLELCLHHDK = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGNLELCLHHDK() {
        
        gNLELCLHHDK_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:PbNavMeshStatsInfo)
    }

    // @@protoc_insertion_point(class_scope:PbNavMeshStatsInfo)
    private static final emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo();
    }

    public static emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PbNavMeshStatsInfo>
        PARSER = new com.google.protobuf.AbstractParser<PbNavMeshStatsInfo>() {
      @java.lang.Override
      public PbNavMeshStatsInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PbNavMeshStatsInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PbNavMeshStatsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PbNavMeshStatsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PbNavMeshStatsInfoOuterClass.PbNavMeshStatsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PbNavMeshStatsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PbNavMeshStatsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PbNavMeshStatsInfo.proto\"h\n\022PbNavMeshS" +
      "tatsInfo\022\023\n\013HDAAEDFOOOI\030\005 \001(\005\022\023\n\013ECNPOEJ" +
      "HPCI\030\n \001(\005\022\023\n\013FJGDCFHBCLI\030\003 \001(\005\022\023\n\013GNLEL" +
      "CLHHDK\030\016 \001(\005B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PbNavMeshStatsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PbNavMeshStatsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PbNavMeshStatsInfo_descriptor,
        new java.lang.String[] { "HDAAEDFOOOI", "ECNPOEJHPCI", "FJGDCFHBCLI", "GNLELCLHHDK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
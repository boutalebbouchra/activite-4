package net.bouchra.customerdataservice.stub;

public final class CustomerServiceOuterClass {
  private CustomerServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAllCustomersRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAllCustomersRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code GetAllCustomersRequest}
   */
  public  static final class GetAllCustomersRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAllCustomersRequest)
      GetAllCustomersRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAllCustomersRequest.newBuilder() to construct.
    private GetAllCustomersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAllCustomersRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAllCustomersRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAllCustomersRequest(
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
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetAllCustomersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetAllCustomersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest prototype) {
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
     * Protobuf type {@code GetAllCustomersRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAllCustomersRequest)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetAllCustomersRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetAllCustomersRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetAllCustomersRequest_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest(this);
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest.getDefaultInstance()) return this;
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:GetAllCustomersRequest)
    }

    // @@protoc_insertion_point(class_scope:GetAllCustomersRequest)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAllCustomersRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetAllCustomersRequest>() {
      @java.lang.Override
      public GetAllCustomersRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAllCustomersRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetAllCustomersRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAllCustomersRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetCustomersResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetCustomersResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    java.util.List<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer> 
        getCustomersList();
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomers(int index);
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    int getCustomersCount();
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    java.util.List<? extends net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> 
        getCustomersOrBuilderList();
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GetCustomersResponse}
   */
  public  static final class GetCustomersResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetCustomersResponse)
      GetCustomersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetCustomersResponse.newBuilder() to construct.
    private GetCustomersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetCustomersResponse() {
      customers_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetCustomersResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetCustomersResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                customers_ = new java.util.ArrayList<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer>();
                mutable_bitField0_ |= 0x00000001;
              }
              customers_.add(
                  input.readMessage(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          customers_ = java.util.Collections.unmodifiableList(customers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse.Builder.class);
    }

    public static final int CUSTOMERS_FIELD_NUMBER = 1;
    private java.util.List<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer> customers_;
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    public java.util.List<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer> getCustomersList() {
      return customers_;
    }
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    public java.util.List<? extends net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> 
        getCustomersOrBuilderList() {
      return customers_;
    }
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    public int getCustomersCount() {
      return customers_.size();
    }
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomers(int index) {
      return customers_.get(index);
    }
    /**
     * <code>repeated .Customer customers = 1;</code>
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomersOrBuilder(
        int index) {
      return customers_.get(index);
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
      for (int i = 0; i < customers_.size(); i++) {
        output.writeMessage(1, customers_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < customers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, customers_.get(i));
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
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse) obj;

      if (!getCustomersList()
          .equals(other.getCustomersList())) return false;
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
      if (getCustomersCount() > 0) {
        hash = (37 * hash) + CUSTOMERS_FIELD_NUMBER;
        hash = (53 * hash) + getCustomersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse prototype) {
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
     * Protobuf type {@code GetCustomersResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetCustomersResponse)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse.newBuilder()
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
          getCustomersFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (customersBuilder_ == null) {
          customers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          customersBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersResponse_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse(this);
        int from_bitField0_ = bitField0_;
        if (customersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            customers_ = java.util.Collections.unmodifiableList(customers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.customers_ = customers_;
        } else {
          result.customers_ = customersBuilder_.build();
        }
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse.getDefaultInstance()) return this;
        if (customersBuilder_ == null) {
          if (!other.customers_.isEmpty()) {
            if (customers_.isEmpty()) {
              customers_ = other.customers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCustomersIsMutable();
              customers_.addAll(other.customers_);
            }
            onChanged();
          }
        } else {
          if (!other.customers_.isEmpty()) {
            if (customersBuilder_.isEmpty()) {
              customersBuilder_.dispose();
              customersBuilder_ = null;
              customers_ = other.customers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              customersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCustomersFieldBuilder() : null;
            } else {
              customersBuilder_.addAllMessages(other.customers_);
            }
          }
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer> customers_ =
        java.util.Collections.emptyList();
      private void ensureCustomersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          customers_ = new java.util.ArrayList<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer>(customers_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> customersBuilder_;

      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public java.util.List<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer> getCustomersList() {
        if (customersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(customers_);
        } else {
          return customersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public int getCustomersCount() {
        if (customersBuilder_ == null) {
          return customers_.size();
        } else {
          return customersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomers(int index) {
        if (customersBuilder_ == null) {
          return customers_.get(index);
        } else {
          return customersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder setCustomers(
          int index, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer value) {
        if (customersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCustomersIsMutable();
          customers_.set(index, value);
          onChanged();
        } else {
          customersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder setCustomers(
          int index, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder builderForValue) {
        if (customersBuilder_ == null) {
          ensureCustomersIsMutable();
          customers_.set(index, builderForValue.build());
          onChanged();
        } else {
          customersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder addCustomers(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer value) {
        if (customersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCustomersIsMutable();
          customers_.add(value);
          onChanged();
        } else {
          customersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder addCustomers(
          int index, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer value) {
        if (customersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCustomersIsMutable();
          customers_.add(index, value);
          onChanged();
        } else {
          customersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder addCustomers(
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder builderForValue) {
        if (customersBuilder_ == null) {
          ensureCustomersIsMutable();
          customers_.add(builderForValue.build());
          onChanged();
        } else {
          customersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder addCustomers(
          int index, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder builderForValue) {
        if (customersBuilder_ == null) {
          ensureCustomersIsMutable();
          customers_.add(index, builderForValue.build());
          onChanged();
        } else {
          customersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder addAllCustomers(
          java.lang.Iterable<? extends net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer> values) {
        if (customersBuilder_ == null) {
          ensureCustomersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, customers_);
          onChanged();
        } else {
          customersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder clearCustomers() {
        if (customersBuilder_ == null) {
          customers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          customersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public Builder removeCustomers(int index) {
        if (customersBuilder_ == null) {
          ensureCustomersIsMutable();
          customers_.remove(index);
          onChanged();
        } else {
          customersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder getCustomersBuilder(
          int index) {
        return getCustomersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomersOrBuilder(
          int index) {
        if (customersBuilder_ == null) {
          return customers_.get(index);  } else {
          return customersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public java.util.List<? extends net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> 
           getCustomersOrBuilderList() {
        if (customersBuilder_ != null) {
          return customersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(customers_);
        }
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder addCustomersBuilder() {
        return getCustomersFieldBuilder().addBuilder(
            net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance());
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder addCustomersBuilder(
          int index) {
        return getCustomersFieldBuilder().addBuilder(
            index, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance());
      }
      /**
       * <code>repeated .Customer customers = 1;</code>
       */
      public java.util.List<net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder> 
           getCustomersBuilderList() {
        return getCustomersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> 
          getCustomersFieldBuilder() {
        if (customersBuilder_ == null) {
          customersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder>(
                  customers_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          customers_ = null;
        }
        return customersBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetCustomersResponse)
    }

    // @@protoc_insertion_point(class_scope:GetCustomersResponse)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetCustomersResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetCustomersResponse>() {
      @java.lang.Override
      public GetCustomersResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCustomersResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetCustomersResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetCustomersResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CustomerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Customer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string email = 3;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>string email = 3;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();
  }
  /**
   * Protobuf type {@code Customer}
   */
  public  static final class Customer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Customer)
      CustomerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Customer.newBuilder() to construct.
    private Customer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Customer() {
      name_ = "";
      email_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Customer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Customer(
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
            case 8: {

              id_ = input.readInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              email_ = s;
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
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_Customer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_Customer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    private volatile java.lang.Object email_;
    /**
     * <code>string email = 3;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }
    /**
     * <code>string email = 3;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (id_ != 0L) {
        output.writeInt64(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (!getEmailBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (!getEmailBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
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
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer) obj;

      if (getId()
          != other.getId()) return false;
      if (!getName()
          .equals(other.getName())) return false;
      if (!getEmail()
          .equals(other.getEmail())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer prototype) {
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
     * Protobuf type {@code Customer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Customer)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_Customer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_Customer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.newBuilder()
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
        id_ = 0L;

        name_ = "";

        email_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_Customer_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer(this);
        result.id_ = id_;
        result.name_ = name_;
        result.email_ = email_;
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          onChanged();
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long id_ ;
      /**
       * <code>int64 id = 1;</code>
       * @return The id.
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>int64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>string email = 3;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        email_ = value;
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


      // @@protoc_insertion_point(builder_scope:Customer)
    }

    // @@protoc_insertion_point(class_scope:Customer)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Customer>
        PARSER = new com.google.protobuf.AbstractParser<Customer>() {
      @java.lang.Override
      public Customer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Customer(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Customer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Customer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetCustomersByIdRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetCustomersByIdRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 customerId = 1;</code>
     * @return The customerId.
     */
    long getCustomerId();
  }
  /**
   * Protobuf type {@code GetCustomersByIdRequest}
   */
  public  static final class GetCustomersByIdRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetCustomersByIdRequest)
      GetCustomersByIdRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetCustomersByIdRequest.newBuilder() to construct.
    private GetCustomersByIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetCustomersByIdRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetCustomersByIdRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetCustomersByIdRequest(
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
            case 8: {

              customerId_ = input.readInt64();
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
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest.Builder.class);
    }

    public static final int CUSTOMERID_FIELD_NUMBER = 1;
    private long customerId_;
    /**
     * <code>int64 customerId = 1;</code>
     * @return The customerId.
     */
    public long getCustomerId() {
      return customerId_;
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
      if (customerId_ != 0L) {
        output.writeInt64(1, customerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (customerId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, customerId_);
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
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest) obj;

      if (getCustomerId()
          != other.getCustomerId()) return false;
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
      hash = (37 * hash) + CUSTOMERID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCustomerId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest prototype) {
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
     * Protobuf type {@code GetCustomersByIdRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetCustomersByIdRequest)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest.newBuilder()
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
        customerId_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdRequest_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest(this);
        result.customerId_ = customerId_;
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest.getDefaultInstance()) return this;
        if (other.getCustomerId() != 0L) {
          setCustomerId(other.getCustomerId());
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long customerId_ ;
      /**
       * <code>int64 customerId = 1;</code>
       * @return The customerId.
       */
      public long getCustomerId() {
        return customerId_;
      }
      /**
       * <code>int64 customerId = 1;</code>
       * @param value The customerId to set.
       * @return This builder for chaining.
       */
      public Builder setCustomerId(long value) {
        
        customerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 customerId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCustomerId() {
        
        customerId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:GetCustomersByIdRequest)
    }

    // @@protoc_insertion_point(class_scope:GetCustomersByIdRequest)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetCustomersByIdRequest>
        PARSER = new com.google.protobuf.AbstractParser<GetCustomersByIdRequest>() {
      @java.lang.Override
      public GetCustomersByIdRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCustomersByIdRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetCustomersByIdRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetCustomersByIdRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetCustomersByIdResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetCustomersByIdResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Customer customer = 1;</code>
     * @return Whether the customer field is set.
     */
    boolean hasCustomer();
    /**
     * <code>.Customer customer = 1;</code>
     * @return The customer.
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomer();
    /**
     * <code>.Customer customer = 1;</code>
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomerOrBuilder();
  }
  /**
   * Protobuf type {@code GetCustomersByIdResponse}
   */
  public  static final class GetCustomersByIdResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetCustomersByIdResponse)
      GetCustomersByIdResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetCustomersByIdResponse.newBuilder() to construct.
    private GetCustomersByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetCustomersByIdResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetCustomersByIdResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetCustomersByIdResponse(
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
            case 10: {
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder subBuilder = null;
              if (customer_ != null) {
                subBuilder = customer_.toBuilder();
              }
              customer_ = input.readMessage(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(customer_);
                customer_ = subBuilder.buildPartial();
              }

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
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse.Builder.class);
    }

    public static final int CUSTOMER_FIELD_NUMBER = 1;
    private net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer customer_;
    /**
     * <code>.Customer customer = 1;</code>
     * @return Whether the customer field is set.
     */
    public boolean hasCustomer() {
      return customer_ != null;
    }
    /**
     * <code>.Customer customer = 1;</code>
     * @return The customer.
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomer() {
      return customer_ == null ? net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance() : customer_;
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomerOrBuilder() {
      return getCustomer();
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
      if (customer_ != null) {
        output.writeMessage(1, getCustomer());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (customer_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCustomer());
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
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse) obj;

      if (hasCustomer() != other.hasCustomer()) return false;
      if (hasCustomer()) {
        if (!getCustomer()
            .equals(other.getCustomer())) return false;
      }
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
      if (hasCustomer()) {
        hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
        hash = (53 * hash) + getCustomer().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse prototype) {
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
     * Protobuf type {@code GetCustomersByIdResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetCustomersByIdResponse)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse.newBuilder()
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
        if (customerBuilder_ == null) {
          customer_ = null;
        } else {
          customer_ = null;
          customerBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_GetCustomersByIdResponse_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse(this);
        if (customerBuilder_ == null) {
          result.customer_ = customer_;
        } else {
          result.customer_ = customerBuilder_.build();
        }
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse.getDefaultInstance()) return this;
        if (other.hasCustomer()) {
          mergeCustomer(other.getCustomer());
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer customer_;
      private com.google.protobuf.SingleFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> customerBuilder_;
      /**
       * <code>.Customer customer = 1;</code>
       * @return Whether the customer field is set.
       */
      public boolean hasCustomer() {
        return customerBuilder_ != null || customer_ != null;
      }
      /**
       * <code>.Customer customer = 1;</code>
       * @return The customer.
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomer() {
        if (customerBuilder_ == null) {
          return customer_ == null ? net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance() : customer_;
        } else {
          return customerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder setCustomer(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer value) {
        if (customerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          customer_ = value;
          onChanged();
        } else {
          customerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder setCustomer(
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder builderForValue) {
        if (customerBuilder_ == null) {
          customer_ = builderForValue.build();
          onChanged();
        } else {
          customerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder mergeCustomer(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer value) {
        if (customerBuilder_ == null) {
          if (customer_ != null) {
            customer_ =
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.newBuilder(customer_).mergeFrom(value).buildPartial();
          } else {
            customer_ = value;
          }
          onChanged();
        } else {
          customerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder clearCustomer() {
        if (customerBuilder_ == null) {
          customer_ = null;
          onChanged();
        } else {
          customer_ = null;
          customerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder getCustomerBuilder() {
        
        onChanged();
        return getCustomerFieldBuilder().getBuilder();
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomerOrBuilder() {
        if (customerBuilder_ != null) {
          return customerBuilder_.getMessageOrBuilder();
        } else {
          return customer_ == null ?
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance() : customer_;
        }
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> 
          getCustomerFieldBuilder() {
        if (customerBuilder_ == null) {
          customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder>(
                  getCustomer(),
                  getParentForChildren(),
                  isClean());
          customer_ = null;
        }
        return customerBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetCustomersByIdResponse)
    }

    // @@protoc_insertion_point(class_scope:GetCustomersByIdResponse)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetCustomersByIdResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetCustomersByIdResponse>() {
      @java.lang.Override
      public GetCustomersByIdResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCustomersByIdResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetCustomersByIdResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetCustomersByIdResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.GetCustomersByIdResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SaveCustomerRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SaveCustomerRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CustomerRequest customer = 1;</code>
     * @return Whether the customer field is set.
     */
    boolean hasCustomer();
    /**
     * <code>.CustomerRequest customer = 1;</code>
     * @return The customer.
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest getCustomer();
    /**
     * <code>.CustomerRequest customer = 1;</code>
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequestOrBuilder getCustomerOrBuilder();
  }
  /**
   * Protobuf type {@code SaveCustomerRequest}
   */
  public  static final class SaveCustomerRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SaveCustomerRequest)
      SaveCustomerRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SaveCustomerRequest.newBuilder() to construct.
    private SaveCustomerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SaveCustomerRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SaveCustomerRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SaveCustomerRequest(
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
            case 10: {
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder subBuilder = null;
              if (customer_ != null) {
                subBuilder = customer_.toBuilder();
              }
              customer_ = input.readMessage(net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(customer_);
                customer_ = subBuilder.buildPartial();
              }

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
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest.Builder.class);
    }

    public static final int CUSTOMER_FIELD_NUMBER = 1;
    private net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest customer_;
    /**
     * <code>.CustomerRequest customer = 1;</code>
     * @return Whether the customer field is set.
     */
    public boolean hasCustomer() {
      return customer_ != null;
    }
    /**
     * <code>.CustomerRequest customer = 1;</code>
     * @return The customer.
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest getCustomer() {
      return customer_ == null ? net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.getDefaultInstance() : customer_;
    }
    /**
     * <code>.CustomerRequest customer = 1;</code>
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequestOrBuilder getCustomerOrBuilder() {
      return getCustomer();
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
      if (customer_ != null) {
        output.writeMessage(1, getCustomer());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (customer_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCustomer());
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
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest) obj;

      if (hasCustomer() != other.hasCustomer()) return false;
      if (hasCustomer()) {
        if (!getCustomer()
            .equals(other.getCustomer())) return false;
      }
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
      if (hasCustomer()) {
        hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
        hash = (53 * hash) + getCustomer().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest prototype) {
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
     * Protobuf type {@code SaveCustomerRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SaveCustomerRequest)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest.newBuilder()
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
        if (customerBuilder_ == null) {
          customer_ = null;
        } else {
          customer_ = null;
          customerBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerRequest_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest(this);
        if (customerBuilder_ == null) {
          result.customer_ = customer_;
        } else {
          result.customer_ = customerBuilder_.build();
        }
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest.getDefaultInstance()) return this;
        if (other.hasCustomer()) {
          mergeCustomer(other.getCustomer());
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest customer_;
      private com.google.protobuf.SingleFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequestOrBuilder> customerBuilder_;
      /**
       * <code>.CustomerRequest customer = 1;</code>
       * @return Whether the customer field is set.
       */
      public boolean hasCustomer() {
        return customerBuilder_ != null || customer_ != null;
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       * @return The customer.
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest getCustomer() {
        if (customerBuilder_ == null) {
          return customer_ == null ? net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.getDefaultInstance() : customer_;
        } else {
          return customerBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       */
      public Builder setCustomer(net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest value) {
        if (customerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          customer_ = value;
          onChanged();
        } else {
          customerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       */
      public Builder setCustomer(
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder builderForValue) {
        if (customerBuilder_ == null) {
          customer_ = builderForValue.build();
          onChanged();
        } else {
          customerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       */
      public Builder mergeCustomer(net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest value) {
        if (customerBuilder_ == null) {
          if (customer_ != null) {
            customer_ =
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.newBuilder(customer_).mergeFrom(value).buildPartial();
          } else {
            customer_ = value;
          }
          onChanged();
        } else {
          customerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       */
      public Builder clearCustomer() {
        if (customerBuilder_ == null) {
          customer_ = null;
          onChanged();
        } else {
          customer_ = null;
          customerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder getCustomerBuilder() {
        
        onChanged();
        return getCustomerFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequestOrBuilder getCustomerOrBuilder() {
        if (customerBuilder_ != null) {
          return customerBuilder_.getMessageOrBuilder();
        } else {
          return customer_ == null ?
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.getDefaultInstance() : customer_;
        }
      }
      /**
       * <code>.CustomerRequest customer = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequestOrBuilder> 
          getCustomerFieldBuilder() {
        if (customerBuilder_ == null) {
          customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequestOrBuilder>(
                  getCustomer(),
                  getParentForChildren(),
                  isClean());
          customer_ = null;
        }
        return customerBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SaveCustomerRequest)
    }

    // @@protoc_insertion_point(class_scope:SaveCustomerRequest)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SaveCustomerRequest>
        PARSER = new com.google.protobuf.AbstractParser<SaveCustomerRequest>() {
      @java.lang.Override
      public SaveCustomerRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SaveCustomerRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SaveCustomerRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SaveCustomerRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SaveCustomerResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SaveCustomerResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Customer customer = 1;</code>
     * @return Whether the customer field is set.
     */
    boolean hasCustomer();
    /**
     * <code>.Customer customer = 1;</code>
     * @return The customer.
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomer();
    /**
     * <code>.Customer customer = 1;</code>
     */
    net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomerOrBuilder();
  }
  /**
   * Protobuf type {@code SaveCustomerResponse}
   */
  public  static final class SaveCustomerResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SaveCustomerResponse)
      SaveCustomerResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SaveCustomerResponse.newBuilder() to construct.
    private SaveCustomerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SaveCustomerResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SaveCustomerResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SaveCustomerResponse(
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
            case 10: {
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder subBuilder = null;
              if (customer_ != null) {
                subBuilder = customer_.toBuilder();
              }
              customer_ = input.readMessage(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(customer_);
                customer_ = subBuilder.buildPartial();
              }

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
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse.Builder.class);
    }

    public static final int CUSTOMER_FIELD_NUMBER = 1;
    private net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer customer_;
    /**
     * <code>.Customer customer = 1;</code>
     * @return Whether the customer field is set.
     */
    public boolean hasCustomer() {
      return customer_ != null;
    }
    /**
     * <code>.Customer customer = 1;</code>
     * @return The customer.
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomer() {
      return customer_ == null ? net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance() : customer_;
    }
    /**
     * <code>.Customer customer = 1;</code>
     */
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomerOrBuilder() {
      return getCustomer();
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
      if (customer_ != null) {
        output.writeMessage(1, getCustomer());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (customer_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCustomer());
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
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse) obj;

      if (hasCustomer() != other.hasCustomer()) return false;
      if (hasCustomer()) {
        if (!getCustomer()
            .equals(other.getCustomer())) return false;
      }
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
      if (hasCustomer()) {
        hash = (37 * hash) + CUSTOMER_FIELD_NUMBER;
        hash = (53 * hash) + getCustomer().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse prototype) {
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
     * Protobuf type {@code SaveCustomerResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SaveCustomerResponse)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse.newBuilder()
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
        if (customerBuilder_ == null) {
          customer_ = null;
        } else {
          customer_ = null;
          customerBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_SaveCustomerResponse_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse(this);
        if (customerBuilder_ == null) {
          result.customer_ = customer_;
        } else {
          result.customer_ = customerBuilder_.build();
        }
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse.getDefaultInstance()) return this;
        if (other.hasCustomer()) {
          mergeCustomer(other.getCustomer());
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer customer_;
      private com.google.protobuf.SingleFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> customerBuilder_;
      /**
       * <code>.Customer customer = 1;</code>
       * @return Whether the customer field is set.
       */
      public boolean hasCustomer() {
        return customerBuilder_ != null || customer_ != null;
      }
      /**
       * <code>.Customer customer = 1;</code>
       * @return The customer.
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer getCustomer() {
        if (customerBuilder_ == null) {
          return customer_ == null ? net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance() : customer_;
        } else {
          return customerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder setCustomer(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer value) {
        if (customerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          customer_ = value;
          onChanged();
        } else {
          customerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder setCustomer(
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder builderForValue) {
        if (customerBuilder_ == null) {
          customer_ = builderForValue.build();
          onChanged();
        } else {
          customerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder mergeCustomer(net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer value) {
        if (customerBuilder_ == null) {
          if (customer_ != null) {
            customer_ =
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.newBuilder(customer_).mergeFrom(value).buildPartial();
          } else {
            customer_ = value;
          }
          onChanged();
        } else {
          customerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public Builder clearCustomer() {
        if (customerBuilder_ == null) {
          customer_ = null;
          onChanged();
        } else {
          customer_ = null;
          customerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder getCustomerBuilder() {
        
        onChanged();
        return getCustomerFieldBuilder().getBuilder();
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder getCustomerOrBuilder() {
        if (customerBuilder_ != null) {
          return customerBuilder_.getMessageOrBuilder();
        } else {
          return customer_ == null ?
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.getDefaultInstance() : customer_;
        }
      }
      /**
       * <code>.Customer customer = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder> 
          getCustomerFieldBuilder() {
        if (customerBuilder_ == null) {
          customerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer, net.fred.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerOrBuilder>(
                  getCustomer(),
                  getParentForChildren(),
                  isClean());
          customer_ = null;
        }
        return customerBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SaveCustomerResponse)
    }

    // @@protoc_insertion_point(class_scope:SaveCustomerResponse)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SaveCustomerResponse>
        PARSER = new com.google.protobuf.AbstractParser<SaveCustomerResponse>() {
      @java.lang.Override
      public SaveCustomerResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SaveCustomerResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SaveCustomerResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SaveCustomerResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.SaveCustomerResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CustomerRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomerRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string email = 2;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>string email = 2;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();
  }
  /**
   * Protobuf type {@code CustomerRequest}
   */
  public  static final class CustomerRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomerRequest)
      CustomerRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomerRequest.newBuilder() to construct.
    private CustomerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomerRequest() {
      name_ = "";
      email_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomerRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CustomerRequest(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              email_ = s;
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
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_CustomerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_CustomerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAIL_FIELD_NUMBER = 2;
    private volatile java.lang.Object email_;
    /**
     * <code>string email = 2;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }
    /**
     * <code>string email = 2;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getEmailBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, email_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getEmailBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, email_);
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
      if (!(obj instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest)) {
        return super.equals(obj);
      }
      net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest other = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getEmail()
          .equals(other.getEmail())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parseFrom(
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
    public static Builder newBuilder(net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest prototype) {
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
     * Protobuf type {@code CustomerRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomerRequest)
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_CustomerRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_CustomerRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.class, net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.Builder.class);
      }

      // Construct using net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.newBuilder()
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
        name_ = "";

        email_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.internal_static_CustomerRequest_descriptor;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest getDefaultInstanceForType() {
        return net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.getDefaultInstance();
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest build() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest buildPartial() {
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest result = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest(this);
        result.name_ = name_;
        result.email_ = email_;
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
        if (other instanceof net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest) {
          return mergeFrom((net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest other) {
        if (other == net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          onChanged();
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
        net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>string email = 2;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string email = 2;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string email = 2;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string email = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>string email = 2;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        email_ = value;
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


      // @@protoc_insertion_point(builder_scope:CustomerRequest)
    }

    // @@protoc_insertion_point(class_scope:CustomerRequest)
    private static final net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest();
    }

    public static net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomerRequest>
        PARSER = new com.google.protobuf.AbstractParser<CustomerRequest>() {
      @java.lang.Override
      public CustomerRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomerRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CustomerRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomerRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.fred.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllCustomersRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllCustomersRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCustomersResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCustomersResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Customer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Customer_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCustomersByIdRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCustomersByIdRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCustomersByIdResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCustomersByIdResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCustomerRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCustomerRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCustomerResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCustomerResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomerRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomerRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CustomerService.proto\"\030\n\026GetAllCustome" +
      "rsRequest\"4\n\024GetCustomersResponse\022\034\n\tcus" +
      "tomers\030\001 \003(\0132\t.Customer\"3\n\010Customer\022\n\n\002i" +
      "d\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\r\n\005email\030\003 \001(\t\"-\n\027" +
      "GetCustomersByIdRequest\022\022\n\ncustomerId\030\001 " +
      "\001(\003\"7\n\030GetCustomersByIdResponse\022\033\n\010custo" +
      "mer\030\001 \001(\0132\t.Customer\"9\n\023SaveCustomerRequ" +
      "est\022\"\n\010customer\030\001 \001(\0132\020.CustomerRequest\"" +
      "3\n\024SaveCustomerResponse\022\033\n\010customer\030\001 \001(" +
      "\0132\t.Customer\".\n\017CustomerRequest\022\014\n\004name\030" +
      "\001 \001(\t\022\r\n\005email\030\002 \001(\t2\331\001\n\017CustomerService" +
      "\022A\n\017GetAllCustomers\022\027.GetAllCustomersReq" +
      "uest\032\025.GetCustomersResponse\022F\n\017GetCustom" +
      "erById\022\030.GetCustomersByIdRequest\032\031.GetCu" +
      "stomersByIdResponse\022;\n\014SaveCustomer\022\024.Sa" +
      "veCustomerRequest\032\025.SaveCustomerResponse" +
      "B#\n!net.fred.customerdataservice.stubb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAllCustomersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAllCustomersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllCustomersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetCustomersResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetCustomersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCustomersResponse_descriptor,
        new java.lang.String[] { "Customers", });
    internal_static_Customer_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Customer_descriptor,
        new java.lang.String[] { "Id", "Name", "Email", });
    internal_static_GetCustomersByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetCustomersByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCustomersByIdRequest_descriptor,
        new java.lang.String[] { "CustomerId", });
    internal_static_GetCustomersByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetCustomersByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCustomersByIdResponse_descriptor,
        new java.lang.String[] { "Customer", });
    internal_static_SaveCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SaveCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCustomerRequest_descriptor,
        new java.lang.String[] { "Customer", });
    internal_static_SaveCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SaveCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCustomerResponse_descriptor,
        new java.lang.String[] { "Customer", });
    internal_static_CustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomerRequest_descriptor,
        new java.lang.String[] { "Name", "Email", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

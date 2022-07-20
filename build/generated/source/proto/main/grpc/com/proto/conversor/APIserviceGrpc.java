package com.proto.conversor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *service para conversão
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: conversor/conversor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class APIserviceGrpc {

  private APIserviceGrpc() {}

  public static final String SERVICE_NAME = "conversor.APIservice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.conversor.APIRequest,
      com.proto.conversor.APIResponse> getMatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "match",
      requestType = com.proto.conversor.APIRequest.class,
      responseType = com.proto.conversor.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.conversor.APIRequest,
      com.proto.conversor.APIResponse> getMatchMethod() {
    io.grpc.MethodDescriptor<com.proto.conversor.APIRequest, com.proto.conversor.APIResponse> getMatchMethod;
    if ((getMatchMethod = APIserviceGrpc.getMatchMethod) == null) {
      synchronized (APIserviceGrpc.class) {
        if ((getMatchMethod = APIserviceGrpc.getMatchMethod) == null) {
          APIserviceGrpc.getMatchMethod = getMatchMethod =
              io.grpc.MethodDescriptor.<com.proto.conversor.APIRequest, com.proto.conversor.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "match"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.conversor.APIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.conversor.APIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new APIserviceMethodDescriptorSupplier("match"))
              .build();
        }
      }
    }
    return getMatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static APIserviceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<APIserviceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<APIserviceStub>() {
        @java.lang.Override
        public APIserviceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new APIserviceStub(channel, callOptions);
        }
      };
    return APIserviceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static APIserviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<APIserviceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<APIserviceBlockingStub>() {
        @java.lang.Override
        public APIserviceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new APIserviceBlockingStub(channel, callOptions);
        }
      };
    return APIserviceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static APIserviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<APIserviceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<APIserviceFutureStub>() {
        @java.lang.Override
        public APIserviceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new APIserviceFutureStub(channel, callOptions);
        }
      };
    return APIserviceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *service para conversão
   * </pre>
   */
  public static abstract class APIserviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void match(com.proto.conversor.APIRequest request,
        io.grpc.stub.StreamObserver<com.proto.conversor.APIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMatchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMatchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.conversor.APIRequest,
                com.proto.conversor.APIResponse>(
                  this, METHODID_MATCH)))
          .build();
    }
  }

  /**
   * <pre>
   *service para conversão
   * </pre>
   */
  public static final class APIserviceStub extends io.grpc.stub.AbstractAsyncStub<APIserviceStub> {
    private APIserviceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIserviceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new APIserviceStub(channel, callOptions);
    }

    /**
     */
    public void match(com.proto.conversor.APIRequest request,
        io.grpc.stub.StreamObserver<com.proto.conversor.APIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service para conversão
   * </pre>
   */
  public static final class APIserviceBlockingStub extends io.grpc.stub.AbstractBlockingStub<APIserviceBlockingStub> {
    private APIserviceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIserviceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new APIserviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.conversor.APIResponse match(com.proto.conversor.APIRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service para conversão
   * </pre>
   */
  public static final class APIserviceFutureStub extends io.grpc.stub.AbstractFutureStub<APIserviceFutureStub> {
    private APIserviceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected APIserviceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new APIserviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.conversor.APIResponse> match(
        com.proto.conversor.APIRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MATCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final APIserviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(APIserviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MATCH:
          serviceImpl.match((com.proto.conversor.APIRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.conversor.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class APIserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    APIserviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.conversor.Conversor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("APIservice");
    }
  }

  private static final class APIserviceFileDescriptorSupplier
      extends APIserviceBaseDescriptorSupplier {
    APIserviceFileDescriptorSupplier() {}
  }

  private static final class APIserviceMethodDescriptorSupplier
      extends APIserviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    APIserviceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (APIserviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new APIserviceFileDescriptorSupplier())
              .addMethod(getMatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}

# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import command_pb2 as command__pb2


class CommandServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.call = channel.unary_unary(
        '/com.webank.eggroll.core.command.CommandService/call',
        request_serializer=command__pb2.CommandRequest.SerializeToString,
        response_deserializer=command__pb2.CommandResponse.FromString,
        )


class CommandServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def call(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_CommandServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'call': grpc.unary_unary_rpc_method_handler(
          servicer.call,
          request_deserializer=command__pb2.CommandRequest.FromString,
          response_serializer=command__pb2.CommandResponse.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'com.webank.eggroll.core.command.CommandService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))

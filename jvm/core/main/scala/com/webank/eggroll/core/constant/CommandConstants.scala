/*
 * Copyright (c) 2019 - now, Eggroll Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.webank.eggroll.core.constant

import com.webank.eggroll.core.command.CommandURI
import com.webank.eggroll.core.util.CommandUtils

object MetadataCommands {
  val prefix = "v1/cluster-manager/metadata"

  val getServerNode = "getServerNode"
  val getServerNodeServiceName = CommandUtils.toServiceName(prefix, getServerNode)
  val GET_SERVER_NODE = new CommandURI(getServerNodeServiceName)

  val getServerNodes = "getServerNodes"
  val getServerNodesServiceName = CommandUtils.toServiceName(prefix, getServerNodes)
  val GET_SERVER_NODES = new CommandURI(getServerNodesServiceName)

  val getOrCreateServerNode = "getOrCreateServerNode"
  val getOrCreateServerNodeServiceName = CommandUtils.toServiceName(prefix, getOrCreateServerNode)
  val GET_OR_CREATE_SERVER_NODE = new CommandURI(getOrCreateServerNodeServiceName)

  val createOrUpdateServerNode = "createOrUpdateServerNode"
  val createOrUpdateServerNodeServiceName = CommandUtils.toServiceName(prefix, createOrUpdateServerNode)
  val CREATE_OR_UPDATE_SERVER_NODE = new CommandURI(createOrUpdateServerNodeServiceName)

  val getStore = "getStore"
  val getStoreServiceName = CommandUtils.toServiceName(prefix, getStore)
  val GET_STORE = new CommandURI(getStoreServiceName)

  val getOrCreateStore = "getOrCreateStore"
  val getOrCreateStoreServiceName = CommandUtils.toServiceName(prefix, getOrCreateStore)
  val GET_OR_CREATE_STORE = new CommandURI(getOrCreateStoreServiceName)

  val deleteStore = "deleteStore"
  val deleteStoreServiceName = CommandUtils.toServiceName(prefix, deleteStore)
  val DELETE_STORE = new CommandURI(deleteStoreServiceName)

  val getStoreFromNamespace = "getStoreFromNamespace"
  val getStoreFromNamespaceServiceName = CommandUtils.toServiceName(prefix, getStoreFromNamespace)
  val GET_STORE_FROM_NAMESPACE = new CommandURI(getStoreFromNamespaceServiceName)
}
object ManagerCommands{
  var  prefix = "v1/cluster-manager/manager"
  var  nodeHeartbeat =  new CommandURI(prefix = prefix,name = "nodeHeartbeat")
  var  registerResource = new  CommandURI(prefix = prefix,name = "registerResource")

}

object SessionCommands {
  val prefix = "v1/cluster-manager/session"

  val getOrCreateSession = new CommandURI(prefix = prefix, name = "getOrCreateSession")
  val getSession = new CommandURI(prefix = prefix, name = "getSession")
  val registerSession = new CommandURI(prefix = prefix, name = "registerSession")
  val getSessionServerNodes = new CommandURI(prefix = prefix, name = "getSessionServerNodes")
  val getSessionRolls = new CommandURI(prefix = prefix, name = "getSessionRolls")
  val getSessionEggs = new CommandURI(prefix = prefix, name = "getSessionEggs")
  val heartbeat = new CommandURI(prefix = prefix, name = "heartbeat")
  val stopSession = new CommandURI(prefix = prefix, name = "stopSession")
  val killSession = new CommandURI(prefix = prefix, name = "killSession")
  val killAllSessions = new CommandURI(prefix = prefix, name = "killAllSessions")
}

object ResouceCommands {
  val prefix = "v1/node-manager/resouce"
  var  resourceAllocation = new  CommandURI(prefix= prefix, name = "allocateResource")
  var  queryNodeResource =  new  CommandURI(prefix= prefix ,name = "queryNodeResource")
  var  checkNodeProcess =  new CommandURI(prefix= prefix,name = "checkNodeProcess")

}

object JobCommands {
  val prefix = "v1/cluster-manager/job"
  val submitJob = new CommandURI(prefix = prefix, name = "submitJob")
  val queryJobStatus = new CommandURI(prefix = prefix, name = "queryJobStatus")
  val queryJob = new CommandURI(prefix = prefix, name = "queryJob")
  val stopJob = new CommandURI(prefix = prefix, name = "stopJob")
  val killJob = new CommandURI(prefix = prefix, name = "killJob")
  val downloadJob = new CommandURI(prefix = prefix, name = "downloadJob")
}

object RendezvousStoreCommands {
  val prefix = "v1/cluster-manager/job/rendezvous"
  val set = new CommandURI(prefix = prefix, name = "set")
  val get = new CommandURI(prefix = prefix, name = "get")
  val add = new CommandURI(prefix = prefix, name = "add")
  val destroy = new CommandURI(prefix = prefix, name = "destroy")
}

object NodeManagerCommands {
  val prefix = "v1/node-manager/processor"

  val heartbeat = new CommandURI(prefix = prefix, name = "heartbeat")
  val startContainers = new CommandURI(prefix = prefix, name = "startContainers")
  val stopContainers = new CommandURI(prefix = prefix, name = "stopContainers")
  val killContainers = new CommandURI(prefix = prefix, name = "killContainers")
}

object ContainerCommands {
  val prefix = "v1/node-manager/container"

  val startJobContainers = new CommandURI(prefix = prefix, name = "startJobContainers")
  val stopJobContainers = new CommandURI(prefix = prefix, name = "stopJobContainers")
  val killJobContainers = new CommandURI(prefix = prefix, name = "killJobContainers")

  val downloadContainers = new CommandURI(prefix = prefix, name = "downloadContainers")

}

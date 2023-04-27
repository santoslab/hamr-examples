package isolette

import org.sireum._
import art._

// This file was auto-generated.  Do not edit

object SharedMemory_Ext {
  def create(id: Z): Z = halt("stub")
  def get(id: Z): Z = halt("stub")
  def send(appId: Z, portId: Z, d: DataContent): Unit = halt("stub")
  def sendAsync(appId: Z, portId: Z, d: DataContent): B = halt("stub")
  def receive(portId: Z, out: MBox2[Art.PortId, DataContent]): Unit = halt("stub")
  def receiveAsync(portId: Z, out: MBox2[Art.PortId, Option[DataContent]]): Unit = halt("stub")
  def remove(id: Z): Unit = halt("stub")
}
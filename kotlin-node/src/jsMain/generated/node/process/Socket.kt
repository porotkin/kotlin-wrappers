// Generated by Karakum - do not modify it manually!


package node.process

import node.ReadWriteStream


sealed external interface Socket : ReadWriteStream {
    var isTTY: Boolean?
}

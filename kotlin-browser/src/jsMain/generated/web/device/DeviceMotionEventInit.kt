// Automatically generated - do not modify!

package web.device

import kotlinx.js.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface DeviceMotionEventInit :
    EventInit {
    val acceleration: DeviceMotionEventAccelerationInit?
    val accelerationIncludingGravity: DeviceMotionEventAccelerationInit?
    val interval: Double?
    val rotationRate: DeviceMotionEventRotationRateInit?
}

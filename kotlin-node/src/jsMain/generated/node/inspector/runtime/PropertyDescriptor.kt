// Generated by Karakum - do not modify it manually!

package node.inspector.runtime

/**
 * Object property descriptor.
 */
sealed external interface PropertyDescriptor {
    /**
     * Property name or symbol description.
     */
    var name: String

    /**
     * The value associated with the property.
     */
    var value: RemoteObject?

    /**
     * True if the value associated with the property may be changed (data descriptors only).
     */
    var writable: Boolean?

    /**
     * A function which serves as a getter for the property, or <code>undefined</code> if there is no getter (accessor descriptors only).
     */
    var get: RemoteObject?

    /**
     * A function which serves as a setter for the property, or <code>undefined</code> if there is no setter (accessor descriptors only).
     */
    var set: RemoteObject?

    /**
     * True if the type of this property descriptor may be changed and if the property may be deleted from the corresponding object.
     */
    var configurable: Boolean

    /**
     * True if this property shows up during enumeration of the properties on the corresponding object.
     */
    var enumerable: Boolean

    /**
     * True if the result was thrown during the evaluation.
     */
    var wasThrown: Boolean?

    /**
     * True if the property is owned for the object.
     */
    var isOwn: Boolean?

    /**
     * Property symbol object, if the property is of the <code>symbol</code> type.
     */
    var symbol: RemoteObject?
}

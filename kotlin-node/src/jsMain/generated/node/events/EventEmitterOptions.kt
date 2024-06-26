// Generated by Karakum - do not modify it manually!

package node.events

// NOTE: This class is in the docs but is **not actually exported** by Node.
// If https://github.com/nodejs/node/issues/39903 gets resolved and Node
// actually starts exporting the class, uncomment below.
// import { EventListener, EventListenerObject } from '__dom-events';
// &#47;** The NodeEventTarget is a Node.js-specific extension to EventTarget that emulates a subset of the EventEmitter API. */
// interface NodeEventTarget extends EventTarget {
//     &#47;**
//      * Node.js-specific extension to the `EventTarget` class that emulates the equivalent `EventEmitter` API.
//      * The only difference between `addListener()` and `addEventListener()` is that addListener() will return a reference to the EventTarget.
//      */
//     addListener(type: string, listener: EventListener | EventListenerObject, options?: { once: boolean }): this;
//     &#47;** Node.js-specific extension to the `EventTarget` class that returns an array of event `type` names for which event listeners are registered. */
//     eventNames(): string[];
//     &#47;** Node.js-specific extension to the `EventTarget` class that returns the number of event listeners registered for the `type`. */
//     listenerCount(type: string): number;
//     &#47;** Node.js-specific alias for `eventTarget.removeListener()`. */
//     off(type: string, listener: EventListener | EventListenerObject): this;
//     &#47;** Node.js-specific alias for `eventTarget.addListener()`. */
//     on(type: string, listener: EventListener | EventListenerObject, options?: { once: boolean }): this;
//     &#47;** Node.js-specific extension to the `EventTarget` class that adds a `once` listener for the given event `type`. This is equivalent to calling `on` with the `once` option set to `true`. */
//     once(type: string, listener: EventListener | EventListenerObject): this;
//     &#47;**
//      * Node.js-specific extension to the `EventTarget` class.
//      * If `type` is specified, removes all registered listeners for `type`,
//      * otherwise removes all registered listeners.
//      */
//     removeAllListeners(type: string): this;
//     &#47;**
//      * Node.js-specific extension to the `EventTarget` class that removes the listener for the given `type`.
//      * The only difference between `removeListener()` and `removeEventListener()` is that `removeListener()` will return a reference to the `EventTarget`.
//      */
//     removeListener(type: string, listener: EventListener | EventListenerObject): this;
// }
sealed external interface EventEmitterOptions {
    /**
     * Enables automatic capturing of promise rejection.
     */
    var captureRejections: Boolean?
}

// Generated by Karakum - do not modify it manually!

@file:JsModule("node:v8")

package node.v8

/**
 * Returns an integer representing a version tag derived from the V8 version,
 * command-line flags, and detected CPU features. This is useful for determining
 * whether a `vm.Script` `cachedData` buffer is compatible with this instance
 * of V8.
 *
 * ```js
 * console.log(v8.cachedDataVersionTag()); // 3947234607
 * // The value returned by v8.cachedDataVersionTag() is derived from the V8
 * // version, command-line flags, and detected CPU features. Test that the value
 * // does indeed update when flags are toggled.
 * v8.setFlagsFromString('--allow_natives_syntax');
 * console.log(v8.cachedDataVersionTag()); // 183726201
 * ```
 * @since v8.0.0
 */
external fun cachedDataVersionTag(): Double

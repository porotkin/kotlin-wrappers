// Generated by Karakum - do not modify it manually!

package node.dns


suspend fun resolveTxt(hostname: String): js.array.ReadonlyArray<js.array.ReadonlyArray<String>> =
    resolveTxtAsync(
        hostname
    ).await()

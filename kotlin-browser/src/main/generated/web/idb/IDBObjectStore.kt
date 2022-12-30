// Automatically generated - do not modify!

package web.idb

import js.core.ReadonlyArray
import js.core.Void
import web.dom.DOMStringList

sealed external class IDBObjectStore {
    /** Returns true if the store has a key generator, and false otherwise. */
    val autoIncrement: Boolean

    /** Returns a list of the names of indexes in the store. */
    val indexNames: DOMStringList

    /** Returns the key path of the store, or null if none. */
    val keyPath: Any /* string | string[] */

    /** Returns the name of the store. */
    var name: String

    /** Returns the associated transaction. */
    val transaction: IDBTransaction

    /**
     * Adds or updates a record in store with the given value and key.
     *
     * If the store uses in-line keys and key is specified a "DataError" DOMException will be thrown.
     *
     * If put() is used, any existing record with the key will be replaced. If add() is used, and if a record with the key already exists the request will fail, with request's error set to a "ConstraintError" DOMException.
     *
     * If successful, request's result will be the record's key.
     */
    fun add(
        value: Any?,
        key: IDBValidKey = definedExternally,
    ): IDBRequest<IDBValidKey>

    /**
     * Deletes all records in store.
     *
     * If successful, request's result will be undefined.
     */
    fun clear(): IDBRequest<Void>

    /**
     * Retrieves the number of records matching the given key or key range in query.
     *
     * If successful, request's result will be the count.
     */
    fun count(query: IDBValidKey = definedExternally): IDBRequest<Int>
    fun count(query: IDBKeyRange): IDBRequest<Int>

    /**
     * Creates a new index in store with the given name, keyPath and options and returns a new IDBIndex. If the keyPath and options define constraints that cannot be satisfied with the data already in store the upgrade transaction will abort with a "ConstraintError" DOMException.
     *
     * Throws an "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    fun createIndex(
        name: String,
        keyPath: String,
        options: IDBIndexParameters = definedExternally,
    ): IDBIndex

    fun createIndex(
        name: String,
        keyPath: ReadonlyArray<String>,
        options: IDBIndexParameters = definedExternally,
    ): IDBIndex

    /**
     * Deletes records in store with the given key or in the given key range in query.
     *
     * If successful, request's result will be undefined.
     */
    fun delete(query: IDBValidKey): IDBRequest<Void>
    fun delete(query: IDBKeyRange): IDBRequest<Void>

    /**
     * Deletes the index in store with the given name.
     *
     * Throws an "InvalidStateError" DOMException if not called within an upgrade transaction.
     */
    fun deleteIndex(name: String)

    /**
     * Retrieves the value of the first record matching the given key or key range in query.
     *
     * If successful, request's result will be the value, or undefined if there was no matching record.
     */
    fun get(query: IDBValidKey): IDBRequest<*>
    fun get(query: IDBKeyRange): IDBRequest<*>

    /**
     * Retrieves the values of the records matching the given key or key range in query (up to count if given).
     *
     * If successful, request's result will be an Array of the values.
     */
    fun getAll(
        query: IDBValidKey? = definedExternally,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    fun getAll(
        query: IDBKeyRange?,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<*>>

    /**
     * Retrieves the keys of records matching the given key or key range in query (up to count if given).
     *
     * If successful, request's result will be an Array of the keys.
     */
    fun getAllKeys(
        query: IDBValidKey? = definedExternally,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    fun getAllKeys(
        query: IDBKeyRange?,
        count: Number = definedExternally,
    ): IDBRequest<ReadonlyArray<IDBValidKey>>

    /**
     * Retrieves the key of the first record matching the given key or key range in query.
     *
     * If successful, request's result will be the key, or undefined if there was no matching record.
     */
    fun getKey(query: IDBValidKey): IDBRequest<IDBValidKey?>
    fun getKey(query: IDBKeyRange): IDBRequest<IDBValidKey?>
    fun index(name: String): IDBIndex

    /**
     * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in store are matched.
     *
     * If successful, request's result will be an IDBCursorWithValue pointing at the first matching record, or null if there were no matching records.
     */
    fun openCursor(
        query: IDBValidKey? = definedExternally,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursorWithValue?>

    fun openCursor(
        query: IDBKeyRange?,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursorWithValue?>

    /**
     * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in store are matched.
     *
     * If successful, request's result will be an IDBCursor pointing at the first matching record, or null if there were no matching records.
     */
    fun openKeyCursor(
        query: IDBValidKey? = definedExternally,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursor?>

    fun openKeyCursor(
        query: IDBKeyRange?,
        direction: IDBCursorDirection = definedExternally,
    ): IDBRequest<IDBCursor?>

    /**
     * Adds or updates a record in store with the given value and key.
     *
     * If the store uses in-line keys and key is specified a "DataError" DOMException will be thrown.
     *
     * If put() is used, any existing record with the key will be replaced. If add() is used, and if a record with the key already exists the request will fail, with request's error set to a "ConstraintError" DOMException.
     *
     * If successful, request's result will be the record's key.
     */
    fun put(
        value: Any?,
        key: IDBValidKey = definedExternally,
    ): IDBRequest<IDBValidKey>
}

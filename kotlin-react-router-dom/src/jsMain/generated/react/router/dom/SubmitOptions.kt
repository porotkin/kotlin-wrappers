// Generated by Karakum - do not modify it manually!

package react.router.dom

import remix.run.router.FormEncType
import remix.run.router.HTMLFormMethod
import remix.run.router.RelativeRoutingType

sealed external interface SubmitOptions {
    /**
     * The HTTP method used to submit the form. Overrides `<form method>`.
     * Defaults to "GET".
     */
    var method: HTMLFormMethod?

    /**
     * The action URL path used to submit the form. Overrides `<form action>`.
     * Defaults to the path of the current route.
     */
    var action: String?

    /**
     * The encoding used to submit the form. Overrides `<form encType>`.
     * Defaults to "application/x-www-form-urlencoded".
     */
    var encType: FormEncType?

    /**
     * Indicate a specific fetcherKey to use when using navigate=false
     */
    var fetcherKey: String?

    /**
     * navigate=false will use a fetcher instead of a navigation
     */
    var navigate: Boolean?

    /**
     * Set `true` to replace the current entry in the browser's history stack
     * instead of creating a new one (i.e. stay on "the same page"). Defaults
     * to `false`.
     */
    var replace: Boolean?

    /**
     * State object to add to the history stack entry for this navigation
     */
    var state: Any?

    /**
     * Determines whether the form action is relative to the route hierarchy or
     * the pathname.  Use this if you want to opt out of navigating the route
     * hierarchy and want to instead route based on /-delimited URL segments
     */
    var relative: RelativeRoutingType?

    /**
     * In browser-based environments, prevent resetting scroll after this
     * navigation when using the <ScrollRestoration> component
     */
    var preventScrollReset: Boolean?

    /**
     * Enable flushSync for this navigation's state updates
     */
    var unstable_flushSync: Boolean?

    /**
     * Enable view transitions on this submission navigation
     */
    var unstable_viewTransition: Boolean?
}

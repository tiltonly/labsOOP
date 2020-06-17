package container

import react.*
import react.redux.rConnect
import component.*
import data.*
import hoc.withDisplayName

val appContainer =
    rConnect<State, RProps, AppProps>(
        { state, _ ->
            Rules = state.Rules
            Formula = state.Formula
        },
        {
            pure = false  // side effect of React Route
        }
    )(
        withDisplayName(
            "MyApp",
            fApp()
        )
            .unsafeCast<RClass<AppProps>>()
    )

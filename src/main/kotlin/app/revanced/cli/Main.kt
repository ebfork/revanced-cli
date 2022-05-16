package app.revanced.clis

import picocli.CommandLine

internal fun main(args: Array<String>) {
    CommandLine(MainCommand).execute(*args)
}
package app.revanced.cli-simple

import picocli-simple.CommandLine

internal fun main(args: Array<String>) {
    CommandLine(MainCommand).execute(*args)
}
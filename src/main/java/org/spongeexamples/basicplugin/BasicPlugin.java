package org.spongeexamples.basicplugin;

import org.spongepowered.api.plugin.Plugin;

/**
 * The main class of the plugin BasicPlugin
 */
@Plugin(id = "spongeexamples.basicplugin",  // The id that will be used internally. It is also used for the config name.
                                            // Should be unique for each plugin on the server to prevent conflicts.
        name = "BasicPlugin",               // The human readable name of the plugin. Used for descriptions and such
        version = "1.0",                    // The version of the plugin.
        dependencies = "")                  // The dependencies of the plugin. See the @Plugin javdocs to see how it is used
public class BasicPlugin {

    // With just that many lines of code you have a working plugin,
    // although it doesn't do anything.
}

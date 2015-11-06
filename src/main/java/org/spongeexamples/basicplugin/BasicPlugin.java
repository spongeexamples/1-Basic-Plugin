/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 KingGoesGaming, SpongePowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.spongeexamples.basicplugin;

import org.spongepowered.api.plugin.Plugin;

/**
 * The main class of the plugin BasicPlugin
 */
/*
 * Where in Bukkit you would describe plugin description in a plugin.yml file,
 * in sponge the @Plugin annotation is used.
 */
@Plugin(id = "spongeexamples.basicplugin",      // The id that will be used internally.
                                                // It is also used for the config name, if only using single configuration filegit .
                                                // Should be unique for each plugin on the server to prevent conflicts.
        name = "BasicPlugin",                   // The human readable name of the plugin. Used for descriptions and such
        version = "1.0",                        // The version of the plugin.
        dependencies = "")                      // The dependencies of the plugin. See the @Plugin javdocs to see how it is used
public class BasicPlugin {

    // With just that many lines of code you have a working plugin,
    // although it doesn't do anything.
}

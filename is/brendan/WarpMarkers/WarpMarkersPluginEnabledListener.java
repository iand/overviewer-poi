/*
MapMarkers Minecraft Bukkit plugin for showing Essentials warps 
and warp events on maps generated by Minecraft Overviewer.
Copyright (C) 2011 Brendan Johan Lee 
Email: brendan (at) vanntett.net

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
MA  02110-1301, USA.
*/

package is.brendan.WarpMarkers;

import java.util.logging.*;
import org.bukkit.event.server.ServerListener;
import org.bukkit.event.server.PluginEnableEvent;

/**
 * Handle events when a plugin is enabled. If the plugin is a 
 * supported plugin, enable listing for it's events
 * @author Brendan Johan Lee - deadcyclo@vanntett.net
 */

public class WarpMarkersPluginEnabledListener extends ServerListener {
    private final WarpMarkers plugin;

    public WarpMarkersPluginEnabledListener(WarpMarkers instance) {
        plugin = instance;
    }
	
    public void onPluginEnable(PluginEnableEvent  event) {
	if (event.getPlugin().getDescription().getMain().contains("com.earth2me.essentials")) plugin.enableEssentialsListening();
    }
}




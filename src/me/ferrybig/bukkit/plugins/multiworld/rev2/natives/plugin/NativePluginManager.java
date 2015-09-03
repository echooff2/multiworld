/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.ferrybig.bukkit.plugins.multiworld.rev2.natives.plugin;

import java.util.Collection;
import me.ferrybig.bukkit.plugins.multiworld.rev2.natives.events.NativeListener;

/**
 *
 * @author Fernando
 */
public interface NativePluginManager {
    public void registerEvents(NativeListener listener);
    
    public Collection<? extends NativePlugin> getInstalledPlugin();
}

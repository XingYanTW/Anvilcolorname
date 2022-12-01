package me.xingyan.anvilcolorname;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Anvilcolorname extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onchangename(PrepareAnvilEvent event){
        ItemMeta itemmeta = Objects.requireNonNull(event.getResult()).getItemMeta();
        assert itemmeta != null;
        itemmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemmeta.getDisplayName()));
        event.getResult().setItemMeta(itemmeta);
    }

}

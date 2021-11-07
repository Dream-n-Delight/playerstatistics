package com.devflask.statisticslib.plugin.commands;

import com.devflask.statisticslib.plugin.Plugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public record ReloadCommand(Plugin plugin) implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        commandSender.sendMessage(plugin.getConfigManager().PREFIX + "Reloading config.yml...");
        plugin.getConfigManager().reloadConfig();
        return true;
    }
}

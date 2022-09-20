package me.adpanel.adminpanel;

import net.luckperms.api.model.group.Group;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminPanel extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("rankset")) {
            if(sender.isOp()) {
            if (args.length == 2) {

                String grName = null;
                String grPriority = null;
                if (args[1].equalsIgnoreCase("owner")) {
                    grName = "&4[ OWNER ]";
                    grPriority = "0";

                }
                if (args[1].equalsIgnoreCase("mod")) {
                    grName = "&2[ MOD ]";
                    grPriority = "1";
                }
                if (args[1].equalsIgnoreCase("yt")) {
                    grName = "&c[ &fYT &c]";
                    grPriority = "2";
                }
                if (args[1].equalsIgnoreCase("dev")) {
                    grName = "&5[ DEV ]";
                    grPriority = "3";
                }
                if (args[1].equalsIgnoreCase("support")) {
                    grName = "&e&l[ SUPPORT ]";
                    grPriority = "4";
                }

                if (args[1].equalsIgnoreCase("creep")) {
                    grName = "&b&l[ CREEP ]";
                    grPriority = "5";
                }

                if (args[1].equalsIgnoreCase("mvp")) {
                    grName = "&b[ MVP ]";
                    grPriority = "6";
                }

                if (args[1].equalsIgnoreCase("vip")) {
                    grName = "&e[ VIP ]";
                    grPriority = "7";
                }


//rankset flag_Fan group

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent unset default");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent set " + args[1]);
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp reloadconfig");


            }
            }
        }

        if (cmd.getName().equalsIgnoreCase("rankchange")) {
            if (sender.isOp()) {
                if (args.length == 3) {
                    String grName = null;
                    String grPriority = null;
                    if (args[1].equalsIgnoreCase("owner")) {
                        grName = "&4[ OWNER ]";
                        grPriority = "0";

                    }
                    if (args[1].equalsIgnoreCase("mod")) {
                        grName = "&2[ MOD ]";
                        grPriority = "1";
                    }
                    if (args[1].equalsIgnoreCase("yt")) {
                        grName = "&c[ &fYT &c]";
                        grPriority = "2";
                    }
                    if (args[1].equalsIgnoreCase("dev")) {
                        grName = "&5[ DEV ]";
                        grPriority = "3";
                    }
                    if (args[1].equalsIgnoreCase("support")) {
                        grName = "&e&l[ SUPPORT ]";
                        grPriority = "4";
                    }

                    if (args[1].equalsIgnoreCase("creep")) {
                        grName = "&b&l[ CREEP ]";
                        grPriority = "5";
                    }

                    if (args[1].equalsIgnoreCase("mvp")) {
                        grName = "&b[ MVP ]";
                        grPriority = "6";
                    }

                    if (args[1].equalsIgnoreCase("vip")) {
                        grName = "&e[ VIP ]";
                        grPriority = "7";
                    }


//rankset flag_Fan creep owner -> creep그룹을 owner 그룹으로ㅓ 면경


                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent unset " + args[1]);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent set " + args[2]);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp reloadconfig");


                }
            }
        }


        if (cmd.getName().equalsIgnoreCase("rankunset")) {
            if(sender.isOp()) {
                if (args.length == 2) {
                    String grName = null;
                    String grPriority = null;
                    if (args[1].equalsIgnoreCase("owner")) {
                        grName = "&4[ OWNER ]";
                        grPriority = "0";

                    }
                    if (args[1].equalsIgnoreCase("mod")) {
                        grName = "&2[ MOD ]";
                        grPriority = "1";
                    }
                    if (args[1].equalsIgnoreCase("yt")) {
                        grName = "&c[ &fYT &c]";
                        grPriority = "2";
                    }
                    if (args[1].equalsIgnoreCase("dev")) {
                        grName = "&5[ DEV ]";
                        grPriority = "3";
                    }
                    if (args[1].equalsIgnoreCase("support")) {
                        grName = "&e&l[ SUPPORT ]";
                        grPriority = "4";
                    }

                    if (args[1].equalsIgnoreCase("creep")) {
                        grName = "&b&l[ CREEP ]";
                        grPriority = "5";
                    }

                    if (args[1].equalsIgnoreCase("mvp")) {
                        grName = "&b[ MVP ]";
                        grPriority = "6";
                    }

                    if (args[1].equalsIgnoreCase("vip")) {
                        grName = "&e[ VIP ]";
                        grPriority = "7";
                    }


//rankunset flag_Fan group


                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent unset " + args[1]);
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + args[0] + " parent set default");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp reloadconfig");


                }
            }
        }


        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

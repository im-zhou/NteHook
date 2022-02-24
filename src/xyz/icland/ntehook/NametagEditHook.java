package xyz.icland.ntehook;

import com.nametagedit.plugin.NametagEdit;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class NametagEditHook extends PlaceholderExpansion {

    public boolean canRegister() {
        return Bukkit.getPluginManager().getPlugin("Nametagedit") != null;
    }

    public String getAuthor() {
        return "sky_xc";
    }

    public String getIdentifier() {
        return "nte";
    }

    public String getVersion() {
        return "1.3";
    }

    public String onPlaceholderRequest(Player p, String s) {
        if (s.equals("prefix")) {
            return NametagEdit.getApi().getNametag(p).getPrefix();
        } else if (s.equals("suffix")) {
            return NametagEdit.getApi().getNametag(p).getSuffix();
        } else {
            return null;
        }
    }
}

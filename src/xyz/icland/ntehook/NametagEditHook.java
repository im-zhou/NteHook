package xyz.icland.ntehook;

import com.nametagedit.plugin.NametagEdit;
import com.nametagedit.plugin.api.data.Nametag;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class NametagEditHook extends PlaceholderExpansion {
	
  public boolean canRegister() {
    return Bukkit.getPluginManager().getPlugin(getPlugin()) != null;
  }
  
  public String getAuthor() {
    return "sky_xc";
  }
  
  public String getIdentifier() {
    return "nte";
  }
  
  public String getPlugin() {
    return "NametagEdit";
  }
  
  public String getVersion() {
    return "1.2";
  }
  
  public String onPlaceholderRequest(Player p, String identifier) 
  {
    if (identifier.equals("prefix")) { 
    	return getprefix(p);
    	}
    if (identifier.equals("suffix")) { 
    	return getsuffix(p);
    	}
    
    return "ERROR";
  }
  
  private String getprefix(Player player) {
	Nametag temp = NametagEdit.getApi().getNametag(player);
    String name = temp.getPrefix();
    return name;
  }
  
  private String getsuffix(Player player) {
	Nametag temp2 = NametagEdit.getApi().getNametag(player);
    String name2 = temp2.getSuffix();
    return name2;
  }
  
}
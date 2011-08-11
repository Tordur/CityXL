package me.tordur.plugins.cityxl;
import org.bukkit.util.config.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

public class Cityxl extends JavaPlugin {
    public void onDisable() {
        // TODO: Place any custom disable code here.
        System.out.println(this + " is now disabled!");
    }

    public void onEnable() {
            Townconfig = getConfiguration(); //Sets the public config to the /plugins/PluginFolder/config.yml
          //configString = config.getString("String", "This is a String!"); //Gets the string, and if none found sets it to This is a String!
          //configBoolean = config.getBoolean("Boolean", true); //Gets the boolean, if none found sets it to true
          //configInt = config.getInt("Integer", 0); //Gets the integer, if none found sets it to 0
            townPlotSize = Townconfig.getInt("TownPlotSize", 10);
            townRoadSize = Townconfig.getInt("TownRoadSize", 3);
            townUseEco = Townconfig.getBoolean("Use Economy", true);
            Townconfig.save(); //Save the config!
        
        System.out.println(this + " is now enabled!");
    }
    public Configuration Townconfig;
  //public Boolean configBoolean;
  //public String configString;
  //public Integer configInt;
    public Integer townPlotSize;
    public Integer townRoadSize;
    public Boolean townUseEco;

    public class BlockSizes{
        public void CityBlockSize(){
           Integer PlotSize = townPlotSize;
           Integer RoadSize = townRoadSize;
        }
    }

}

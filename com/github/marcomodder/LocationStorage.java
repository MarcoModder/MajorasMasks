package com.github.marcomodder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LocationStorage {
	
	private final List<Location> PROTECTED_LocationS = new ArrayList();
	  
	  public void add(Location s)
	  {
	    if (!this.PROTECTED_LocationS.contains(s)) {
	      this.PROTECTED_LocationS.add(s);
	    }
	  }
	  
	  public void remove(Location s)
	  {
	    this.PROTECTED_LocationS.remove(s);
	  }
	  
	  public void saveLocations()
	    throws IOException
	  {
	    File file = new File(Main.getSignDataFolder() + File.separator + "Locations.flat");
	    if (this.PROTECTED_LocationS.isEmpty()) {
	      return;
	    }
	    FileWriter fstream = new FileWriter(file);
	    BufferedWriter out = new BufferedWriter(fstream);
	    for (Location Location : this.PROTECTED_LocationS)
	    {
	      out.write("[Location Data]");
	      out.newLine();
	      out.write("WorldLoc:" + Location.getWorld().getName());
	      out.newLine();
	      out.write("XLoc:" + Location.getBlockX());
	      out.newLine();
	      out.write("YLoc:" + Location.getBlockY());
	      out.newLine();
	      out.write("ZLoc:" + Location.getBlockZ());
	      out.newLine();
	    }
	    out.close();
	  }
	  
	  public void loadHolo()
	    throws IOException
	  {
	    File file = new File(Main.getSignDataFolder() + File.separator + "Locations.flat");
	    if (!file.exists()) {
	      return;
	    }
	    FileReader fstream = new FileReader(file);
	    BufferedReader reader = new BufferedReader(fstream);
	    String line = "";
	    while ((line = reader.readLine()) != null) {
	      if (line.startsWith("[Location Data]"))
	      {
	        String world = reader.readLine().split(":")[1];
	        int x = Integer.parseInt(reader.readLine().split(":")[1]);
	        int y = Integer.parseInt(reader.readLine().split(":")[1]);
	        int z = Integer.parseInt(reader.readLine().split(":")[1]);
	        Location loc = new Location(Bukkit.getWorld(world),x,y,z);
	        add(loc);
			Main.locMap.add(loc);
			Main.getDungeonStorage().add(loc);
	      }
	    }
	    reader.close();
	  }
	  
	  
	  public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
		    for (Entry<T, E> entry : map.entrySet()) {
		        if (Objects.equals(value, entry.getValue())) {
		            return entry.getKey();
		        }
		    }
		    return null;
		}

}

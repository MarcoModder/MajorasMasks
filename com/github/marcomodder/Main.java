package com.github.marcomodder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Main extends JavaPlugin implements Listener {
	
	public static Main instance;
	
	private static File DUNG_DATA_FOLDER;
	public static List<Location> locMap = new ArrayList<>();
	private static LocationStorage storage;
	
	//Masks codes
	public String[] codes = {"GFSG-TGER-BVSG","GFSG-TGER-BVSA","GFSG-TGER-BVST","GFSG-TGER-BVSP","GFSG-TGER-BVSZ","SGHS-YTHF-VSSG","SGHS-YTHF-VSSA","SGHS-YTHF-VSSV","SGHS-YTHF-VSST", "SGHS-YTHF-VSSZ","PMQL-EQSE-CZRA",
			"PMQL-EQSE-CZRR", "PMQL-EQSE-CZRQ" , "PMQL-EQSE-CZRB", "PMQL-EQSE-CZRZ","OZLW-AIDM-WJAY","OZLW-AIDM-WJAS","OZLW-AIDM-WJAU","OZLW-AIDM-WJAG","OZLW-AIDM-WJAZ",
			"AYTR-SUXZ-KOQA","AYTR-SUXZ-KOQF","AYTR-SUXZ-KOQS" , "AYTR-SUXZ-KOQQ","AYTR-SUXZ-KOQZ","ZQAI-DIGW-REMX","ZQAI-DIGW-REMA","ZQAI-DIGW-REMC","ZQAI-DIGW-REML","ZQAI-DIGW-REMZ",
			"IEKZ-SJEA-HWQA","IEKZ-SJEA-HWQR","IEKZ-SJEA-HWQT","IEKZ-SJEA-HWQJ","IEKZ-SJEA-HWQZ","KUZQ-YOWA-SFMA","KUZQ-YOWA-SFMF","KUZQ-YOWA-SFMS","KUZQ-YOWA-SFMT","KUZQ-YOWA-SFMZ",
			"TAQL-DIEN-GOLA","TAQL-DIEN-GOLF","TAQL-DIEN-GOLY","TAQL-DIEN-GOLR","TAQL-DIEN-GOLZ","XSPZ-AKEA-XKER","XSPZ-AKEA-XKEA","XSPZ-AKEA-XKED","XSPZ-AKEA-XKEG","XSPZ-AKEA-XKEZ",
			"LOAZ-HQHX-AHXP","LOAZ-HQHX-AHXS","LOAZ-HQHX-AHXF","LOAZ-HQHX-AHXH","LOAZ-HQHX-AHXZ"};
	
	@Override
	public void onEnable()
	{
		System.out.println("[MajorasMasks]Loading plugin...");
		instance = this;
		commands();
		events();
		storage();
		config();
		checkGolem();
		//Files / Storage
		DUNG_DATA_FOLDER = new File(getDataFolder().getAbsolutePath() + File.separator + "data" + File.separator);
	    storage = new LocationStorage();
		if (!DUNG_DATA_FOLDER.exists())
	    {
	      if (DUNG_DATA_FOLDER.mkdirs()) {
	        getLogger().info("[MajorasMasks]Created location data folder.");
	      }
	    }
	    else {
	      try
	      {
	        storage.loadHolo();
	      }
	      catch (IOException localIOException) {}
	    }
		System.out.println("[MajorasMasks]Succesfully loaded majorasmasks!");
	}
	
	@Override
	public void onDisable()
	{
		System.out.println("[MajorasMasks]Disabling plugin...");
	    try
	    {
	      storage.saveLocations();
	    }
	    catch (IOException localIOException)
	    {
	      System.out.println("[MajorasMasks]There was an error saving locations!");
	    }
		instance = null;
	}
	
	public static Main getInstance()
	{
		return instance;
	}
	
	public void commands()
	{
		getCommand("heads").setExecutor(new HeadsCMD());
	}
	
	public void events()
	{
		registerEvent(new Listeners());
		registerEvent(this);
	}
	
	public void storage()
	{
	    
	}
	
	public void config()
	{
		String[] list = {"", "§b{type} head!", "", "Your Lore ^_^"};
		String[] listx = {"", "§bTest Lore", "", "Your Lore ^_^"};
		int i = 0;
		int z = 4;
		getConfig().addDefault("Masks.Chicken.Tiers.I.itemLore", Arrays.asList(listx));
		List<String> lista = getConfig().getStringList("Masks.Chicken.Tiers.I.itemLore");
		lista.add("");
		lista.add("§bTest Lore");
		lista.add("");
		lista.add("Your Lore ^_^");
		//Msgs
		getConfig().addDefault("Messages.NotEnoughHeads", "You don't have enough heads!");
		getConfig().addDefault("Messages.SuccesfullyPurchased", "Sucessfully purchased!");
		//Effects
		getConfig().addDefault("Effects.Messages.Chicken", "Chicken Effect");
		getConfig().addDefault("Effects.Messages.Sheep", "Sheep Effect");
		getConfig().addDefault("Effects.Messages.Cow", "Cow Effect");
		getConfig().addDefault("Effects.Messages.Spider", "Spider Effect");
		getConfig().addDefault("Effects.Messages.Zombie", "Zombie Effect");
		getConfig().addDefault("Effects.Messages.Skeleton", "Skeleton Effect");
		getConfig().addDefault("Effects.Messages.Magma", "Magma Effect");
		getConfig().addDefault("Effects.Messages.Blaze", "Blaze Effect");
		getConfig().addDefault("Effects.Messages.EnderMan", "Enderman Effect");
		getConfig().addDefault("Effects.Messages.Creeper", "Creeper Effect");
		//Heads
		getConfig().addDefault("head-drop-percentage", "0.50%");
		getConfig().addDefault("head-name", "{type} Head");
		getConfig().addDefault("head-lore", Arrays.asList(list));
		getConfig().addDefault("GUI.headDisplayName", "{type} head!");
		getConfig().addDefault("GUI.headLore", Arrays.asList(list));
		//Masks
		getConfig().addDefault("MasksPrizes.Tiers.I", 1280);
		getConfig().addDefault("MasksPrizes.Tiers.II", 2304);
		getConfig().addDefault("MasksPrizes.Tiers.III", 3456);
		getConfig().addDefault("MasksPrizes.Tiers.IV", 4608);
		getConfig().addDefault("MasksPrizes.Tiers.V", 5604);
		//Chicken
		getConfig().addDefault("Masks.Chicken.Tiers.I.itemName", "Chicken Tier I");
		getConfig().addDefault("Masks.Chicken.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Chicken.Tiers.II.itemName", "Chicken Tier II");
		getConfig().addDefault("Masks.Chicken.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Chicken.Tiers.III.itemName", "Chicken Tier III");
		getConfig().addDefault("Masks.Chicken.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Chicken.Tiers.IV.itemName", "Chicken Tier IV");
		getConfig().addDefault("Masks.Chicken.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Chicken.Tiers.V.itemName", "Chicken Tier V");
		getConfig().addDefault("Masks.Chicken.Tiers.V.itemLore", Arrays.asList(listx));
		//Sheep
		getConfig().addDefault("Masks.Sheep.Tiers.I.itemName", "Sheep Tier I");
		getConfig().addDefault("Masks.Sheep.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Sheep.Tiers.II.itemName", "Sheep Tier II");
		getConfig().addDefault("Masks.Sheep.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Sheep.Tiers.III.itemName", "Sheep Tier III");
		getConfig().addDefault("Masks.Sheep.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Sheep.Tiers.IV.itemName", "Sheep Tier IV");
		getConfig().addDefault("Masks.Sheep.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Sheep.Tiers.V.itemName", "Sheep Tier V");
		getConfig().addDefault("Masks.Sheep.Tiers.V.itemLore", Arrays.asList(listx));
		//Cow
		getConfig().addDefault("Masks.Cow.Tiers.I.itemName", "Cow Tier I");
		getConfig().addDefault("Masks.Cow.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Cow.Tiers.II.itemName", "Cow Tier II");
		getConfig().addDefault("Masks.Cow.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Cow.Tiers.III.itemName", "Cow Tier III");
		getConfig().addDefault("Masks.Cow.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Cow.Tiers.IV.itemName", "Cow Tier IV");
		getConfig().addDefault("Masks.Cow.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Cow.Tiers.V.itemName", "Cow Tier V");
		getConfig().addDefault("Masks.Cow.Tiers.V.itemLore", Arrays.asList(listx));
		//Spider
		getConfig().addDefault("Masks.Spider.Tiers.I.itemName", "Spider Tier I");
		getConfig().addDefault("Masks.Spider.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Spider.Tiers.II.itemName", "Spider Tier II");
		getConfig().addDefault("Masks.Spider.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Spider.Tiers.III.itemName", "Spider Tier III");
		getConfig().addDefault("Masks.Spider.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Spider.Tiers.IV.itemName", "Spider Tier IV");
		getConfig().addDefault("Masks.Spider.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Spider.Tiers.V.itemName", "Spider Tier V");
		getConfig().addDefault("Masks.Spider.Tiers.V.itemLore", Arrays.asList(listx));
		//Zombie
		getConfig().addDefault("Masks.Zombie.Tiers.I.itemName", "Zombie Tier I");
		getConfig().addDefault("Masks.Zombie.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Zombie.Tiers.II.itemName", "Zombie Tier II");
		getConfig().addDefault("Masks.Zombie.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Zombie.Tiers.III.itemName", "Zombie Tier III");
		getConfig().addDefault("Masks.Zombie.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Zombie.Tiers.IV.itemName", "Zombie Tier IV");
		getConfig().addDefault("Masks.Zombie.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Zombie.Tiers.V.itemName", "Zombie Tier V");
		getConfig().addDefault("Masks.Zombie.Tiers.V.itemLore", Arrays.asList(listx));
		//Skeleton
		getConfig().addDefault("Masks.Skeleton.Tiers.I.itemName", "Skeleton Tier I");
		getConfig().addDefault("Masks.Skeleton.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Skeleton.Tiers.II.itemName", "Skeleton Tier II");
		getConfig().addDefault("Masks.Skeleton.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Skeleton.Tiers.III.itemName", "Skeleton Tier III");
		getConfig().addDefault("Masks.Skeleton.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Skeleton.Tiers.IV.itemName", "Skeleton Tier IV");
		getConfig().addDefault("Masks.Skeleton.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Skeleton.Tiers.V.itemName", "Skeleton Tier V");
		getConfig().addDefault("Masks.Skeleton.Tiers.V.itemLore", Arrays.asList(listx));
		//Magma
		getConfig().addDefault("Masks.MagmaCube.Tiers.I.itemName", "MagmaCube Tier I");
		getConfig().addDefault("Masks.MagmaCube.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.MagmaCube.Tiers.II.itemName", "MagmaCube Tier II");
		getConfig().addDefault("Masks.MagmaCube.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.MagmaCube.Tiers.III.itemName", "MagmaCube Tier III");
		getConfig().addDefault("Masks.MagmaCube.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.MagmaCube.Tiers.IV.itemName", "MagmaCube Tier IV");
		getConfig().addDefault("Masks.MagmaCube.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.MagmaCube.Tiers.V.itemName", "MagmaCube Tier V");
		getConfig().addDefault("Masks.MagmaCube.Tiers.V.itemLore", Arrays.asList(listx));
		//Blaze
		getConfig().addDefault("Masks.Blaze.Tiers.I.itemName", "Blaze Tier I");
		getConfig().addDefault("Masks.Blaze.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Blaze.Tiers.II.itemName", "Blaze Tier II");
		getConfig().addDefault("Masks.Blaze.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Blaze.Tiers.III.itemName", "Blaze Tier III");
		getConfig().addDefault("Masks.Blaze.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Blaze.Tiers.IV.itemName", "Blaze Tier IV");
		getConfig().addDefault("Masks.Blaze.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Blaze.Tiers.V.itemName", "Blaze Tier V");
		getConfig().addDefault("Masks.Blaze.Tiers.V.itemLore", Arrays.asList(listx));
		//EnderMan
		getConfig().addDefault("Masks.EnderMan.Tiers.I.itemName", "EnderMan Tier I");
		getConfig().addDefault("Masks.EnderMan.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.EnderMan.Tiers.II.itemName", "EnderMan Tier II");
		getConfig().addDefault("Masks.EnderMan.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.EnderMan.Tiers.III.itemName", "EnderMan Tier III");
		getConfig().addDefault("Masks.EnderMan.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.EnderMan.Tiers.IV.itemName", "EnderMan Tier IV");
		getConfig().addDefault("Masks.EnderMan.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.EnderMan.Tiers.V.itemName", "EnderMan Tier V");
		getConfig().addDefault("Masks.EnderMan.Tiers.V.itemLore", Arrays.asList(listx));
		//Creeper
		getConfig().addDefault("Masks.Creeper.Tiers.I.itemName", "Creeper Tier I");
		getConfig().addDefault("Masks.Creeper.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Creeper.Tiers.II.itemName", "Creeper Tier II");
		getConfig().addDefault("Masks.Creeper.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Creeper.Tiers.III.itemName", "Creeper Tier III");
		getConfig().addDefault("Masks.Creeper.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Creeper.Tiers.IV.itemName", "Creeper Tier IV");
		getConfig().addDefault("Masks.Creeper.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.Creeper.Tiers.V.itemName", "Creeper Tier V");
		getConfig().addDefault("Masks.Creeper.Tiers.V.itemLore", Arrays.asList(listx));
		//Golem
		getConfig().addDefault("Masks.IronGolem.Tiers.I.itemName", "IronGolem Tier I");
		getConfig().addDefault("Masks.IronGolem.Tiers.I.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.IronGolem.Tiers.II.itemName", "IronGolem Tier II");
		getConfig().addDefault("Masks.IronGolem.Tiers.II.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.IronGolem.Tiers.III.itemName", "IronGolem Tier III");
		getConfig().addDefault("Masks.IronGolem.Tiers.III.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.IronGolem.Tiers.IV.itemName", "IronGolem Tier IV");
		getConfig().addDefault("Masks.IronGolem.Tiers.IV.itemLore", Arrays.asList(listx));
		getConfig().addDefault("Masks.IronGolem.Tiers.V.itemName", "IronGolem Tier V");
		getConfig().addDefault("Masks.IronGolem.Tiers.V.itemLore", Arrays.asList(listx));
		//Chicken
		getConfig().addDefault("MaskItem.Chicken.Tiers.I.itemName", "Chicken Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Chicken.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//(codes[i++]));
		getConfig().addDefault("MaskItem.Chicken.Tiers.II.itemName", "Chicken Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Chicken.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//GFSG-TGER-BVSA"));
		getConfig().addDefault("MaskItem.Chicken.Tiers.III.itemName", "Chicken Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Chicken.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//GFSG-TGER-BVST"));
		getConfig().addDefault("MaskItem.Chicken.Tiers.IV.itemName", "Chicken Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Chicken.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//GFSG-TGER-BVSP"));
		getConfig().addDefault("MaskItem.Chicken.Tiers.V.itemName", "Chicken Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Chicken.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//GFSG-TGER-BVSZ"));
		//Sheep
		getConfig().addDefault("MaskItem.Sheep.Tiers.I.itemName", "Sheep Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Sheep.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//SGHS-YTHF-VSSG"));
		getConfig().addDefault("MaskItem.Sheep.Tiers.II.itemName", "Sheep Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Sheep.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//SGHS-YTHF-VSSA"));
		getConfig().addDefault("MaskItem.Sheep.Tiers.III.itemName", "Sheep Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Sheep.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//SGHS-YTHF-VSSV"));
		getConfig().addDefault("MaskItem.Sheep.Tiers.IV.itemName", "Sheep Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Sheep.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//SGHS-YTHF-VSST"));
		getConfig().addDefault("MaskItem.Sheep.Tiers.V.itemName", "Sheep Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Sheep.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//SGHS-YTHF-VSSZ"));
		//Cow
		getConfig().addDefault("MaskItem.Cow.Tiers.I.itemName", "Cow Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Cow.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//PMQL-EQSE-CZRA"));
		getConfig().addDefault("MaskItem.Cow.Tiers.II.itemName", "Cow Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Cow.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//PMQL-EQSE-CZRR"));
		getConfig().addDefault("MaskItem.Cow.Tiers.III.itemName", "Cow Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Cow.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//PMQL-EQSE-CZRQ"));
		getConfig().addDefault("MaskItem.Cow.Tiers.IV.itemName", "Cow Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Cow.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//PMQL-EQSE-CZRB"));
		getConfig().addDefault("MaskItem.Cow.Tiers.V.itemName", "Cow Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Cow.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//PMQL-EQSE-CZRZ"));
		//Spider
		getConfig().addDefault("MaskItem.Spider.Tiers.I.itemName", "Spider Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Spider.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//OZLW-AIDM-WJAY"));
		getConfig().addDefault("MaskItem.Spider.Tiers.II.itemName", "Spider Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Spider.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//OZLW-AIDM-WJAS"));
		getConfig().addDefault("MaskItem.Spider.Tiers.III.itemName", "Spider Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Spider.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//OZLW-AIDM-WJAU"));
		getConfig().addDefault("MaskItem.Spider.Tiers.IV.itemName", "Spider Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Spider.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//OZLW-AIDM-WJAG"));
		getConfig().addDefault("MaskItem.Spider.Tiers.V.itemName", "Spider Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Spider.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//OZLW-AIDM-WJAZ"));
		//Zombie
		getConfig().addDefault("MaskItem.Zombie.Tiers.I.itemName", "Zombie Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Zombie.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//AYTR-SUXZ-KOQA"));
		getConfig().addDefault("MaskItem.Zombie.Tiers.II.itemName", "Zombie Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Zombie.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//AYTR-SUXZ-KOQF"));
		getConfig().addDefault("MaskItem.Zombie.Tiers.III.itemName", "Zombie Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Zombie.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//AYTR-SUXZ-KOQS"));
		getConfig().addDefault("MaskItem.Zombie.Tiers.IV.itemName", "Zombie Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Zombie.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//AYTR-SUXZ-KOQQ"));
		getConfig().addDefault("MaskItem.Zombie.Tiers.V.itemName", "Zombie Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Zombie.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//AYTR-SUXZ-KOQZ"));
		//Skeleton
		getConfig().addDefault("MaskItem.Skeleton.Tiers.I.itemName", "Skeleton Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Skeleton.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//ZQAI-DIGW-REMX"));
		getConfig().addDefault("MaskItem.Skeleton.Tiers.II.itemName", "Skeleton Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Skeleton.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//ZQAI-DIGW-REMA"));
		getConfig().addDefault("MaskItem.Skeleton.Tiers.III.itemName", "Skeleton Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Skeleton.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//ZQAI-DIGW-REMC"));
		getConfig().addDefault("MaskItem.Skeleton.Tiers.IV.itemName", "Skeleton Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Skeleton.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//ZQAI-DIGW-REML"));
		getConfig().addDefault("MaskItem.Skeleton.Tiers.V.itemName", "Skeleton Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Skeleton.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//ZQAI-DIGW-REMZ"));
		//Magma
		getConfig().addDefault("MaskItem.MagmaCube.Tiers.I.itemName", "MagmaCube Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.MagmaCube.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//IEKZ-SJEA-HWQA"));
		getConfig().addDefault("MaskItem.MagmaCube.Tiers.II.itemName", "MagmaCube Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.MagmaCube.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//IEKZ-SJEA-HWQR"));
		getConfig().addDefault("MaskItem.MagmaCube.Tiers.III.itemName", "MagmaCube Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.MagmaCube.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//IEKZ-SJEA-HWQT"));
		getConfig().addDefault("MaskItem.MagmaCube.Tiers.IV.itemName", "MagmaCube Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.MagmaCube.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//IEKZ-SJEA-HWQJ"));
		getConfig().addDefault("MaskItem.MagmaCube.Tiers.V.itemName", "MagmaCube Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.MagmaCube.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//IEKZ-SJEA-HWQZ"));
		//Blaze
		getConfig().addDefault("MaskItem.Blaze.Tiers.I.itemName", "Blaze Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Blaze.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//KUZQ-YOWA-SFMA"));
		getConfig().addDefault("MaskItem.Blaze.Tiers.II.itemName", "Blaze Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Blaze.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//KUZQ-YOWA-SFMF"));
		getConfig().addDefault("MaskItem.Blaze.Tiers.III.itemName", "Blaze Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Blaze.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//KUZQ-YOWA-SFMS"));
		getConfig().addDefault("MaskItem.Blaze.Tiers.IV.itemName", "Blaze Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Blaze.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//KUZQ-YOWA-SFMT"));
		getConfig().addDefault("MaskItem.Blaze.Tiers.V.itemName", "Blaze Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Blaze.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//KUZQ-YOWA-SFMZ"));
		//EnderMan
		getConfig().addDefault("MaskItem.EnderMan.Tiers.I.itemName", "EnderMan Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.EnderMan.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//TAQL-DIEN-GOLA"));
		getConfig().addDefault("MaskItem.EnderMan.Tiers.II.itemName", "EnderMan Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.EnderMan.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//TAQL-DIEN-GOLF"));
		getConfig().addDefault("MaskItem.EnderMan.Tiers.III.itemName", "EnderMan Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.EnderMan.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//TAQL-DIEN-GOLY"));
		getConfig().addDefault("MaskItem.EnderMan.Tiers.IV.itemName", "EnderMan Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.EnderMan.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//TAQL-DIEN-GOLR"));
		getConfig().addDefault("MaskItem.EnderMan.Tiers.V.itemName", "EnderMan Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.EnderMan.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//TAQL-DIEN-GOLZ"));
		//Creeper
		getConfig().addDefault("MaskItem.Creeper.Tiers.I.itemName", "Creeper Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Creeper.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//XSPZ-AKEA-XKER"));
		getConfig().addDefault("MaskItem.Creeper.Tiers.II.itemName", "Creeper Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Creeper.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//XSPZ-AKEA-XKEA"));
		getConfig().addDefault("MaskItem.Creeper.Tiers.III.itemName", "Creeper Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Creeper.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//XSPZ-AKEA-XKED"));
		getConfig().addDefault("MaskItem.Creeper.Tiers.IV.itemName", "Creeper Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Creeper.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//XSPZ-AKEA-XKEG"));
		getConfig().addDefault("MaskItem.Creeper.Tiers.V.itemName", "Creeper Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.Creeper.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//XSPZ-AKEA-XKEZ"));
		//Golem
		getConfig().addDefault("MaskItem.IronGolem.Tiers.I.itemName", "IronGolem Tier I Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.IronGolem.Tiers.I.itemLore", new ArrayList<>(lista));lista.remove(z);//LOAZ-HQHX-AHXP"));
		getConfig().addDefault("MaskItem.IronGolem.Tiers.II.itemName", "IronGolem Tier II Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.IronGolem.Tiers.II.itemLore", new ArrayList<>(lista));lista.remove(z);//LOAZ-HQHX-AHXS"));
		getConfig().addDefault("MaskItem.IronGolem.Tiers.III.itemName", "IronGolem Tier III Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.IronGolem.Tiers.III.itemLore", new ArrayList<>(lista));lista.remove(z);//LOAZ-HQHX-AHXF"));
		getConfig().addDefault("MaskItem.IronGolem.Tiers.IV.itemName", "IronGolem Tier IV Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.IronGolem.Tiers.IV.itemLore", new ArrayList<>(lista));lista.remove(z);//LOAZ-HQHX-AHXH"));
		getConfig().addDefault("MaskItem.IronGolem.Tiers.V.itemName", "IronGolem Tier V Mask");
		lista.add(codes[i++]);getConfig().addDefault("MaskItem.IronGolem.Tiers.V.itemLore", new ArrayList<>(lista));lista.remove(z);//LOAZ-HQHX-AHXZ"));
		i = 0;
	    getConfig().options().copyDefaults(true);
	    saveConfig();
	}
	
	private void registerEvent(Listener listener)
	{
		Bukkit.getServer().getPluginManager().registerEvents(listener, this);
	}
	  
	  
	  
	  public void checkGolem()
	  {
		  Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
				public void run() {
					for(Player p : Bukkit.getOnlinePlayers())
					{
						int j = 0;
						for(ItemStack i : p.getInventory().getContents())
						{
							if(i != null)
							{
								if(i.hasItemMeta() && i.getAmount() == 1)
								{
									if(i.getItemMeta().getLore() != null)
									{
										for(String s : i.getItemMeta().getLore())
										{
											if(s.toUpperCase().contains(codes[54]))
											{
												p.setMaxHealth(30.0);
												p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,6000, 1));
												j = 1;
											}
											else if(s.toUpperCase().contains(codes[53]))
											{
												p.setMaxHealth(28.0);
												p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,6000, 1));
												j = 1;
											}
											else if(s.toUpperCase().contains(codes[52]))
											{
												p.setMaxHealth(26.0);
												p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,6000, 1));
												j = 1;
											}
											else if(s.toUpperCase().contains(codes[51]))
											{
												p.setMaxHealth(24.0);
												p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,6000, 1));
												j = 1;
											}
											else if(s.toUpperCase().contains(codes[50]))
											{
												p.setMaxHealth(22.0);
												p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,6000, 1));
												j = 1;
											}
										}
									}
									}
							}
						}
						if(j == 0)
						{
							p.setMaxHealth(20.0);
							p.removePotionEffect(PotionEffectType.SLOW);
						}
						j = 0;
					}
				
				}}, 0L, 40L);
	  }//Repeating it every second
	  
	  
	  public static LocationStorage getDungeonStorage()
	  {
	    return storage;
	  }
	  
	  public static File getSignDataFolder()
	  {
	    return DUNG_DATA_FOLDER;
	  }

}

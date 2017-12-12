package com.github.marcomodder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils {
	
	public static Map<Player,Boolean> skelCooldown = new HashMap<>();
	public static Map<Player,Boolean> magmaCooldown = new HashMap<>();
	public static Map<Player,Boolean> blazeCooldown = new HashMap<>();
	public static Map<Player,Boolean> endermanCooldown = new HashMap<>();
	public static Map<Player,Boolean> creeperCooldown = new HashMap<>();
	
	
	public static void openTierInv(Player p, String headName)
	{
		if(headName.toLowerCase().contains("chicken"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Chicken.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Chicken.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Chicken.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Chicken.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Chicken.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Chicken.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Chicken.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Chicken.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Chicken.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Chicken.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("sheep"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Sheep.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Sheep.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Sheep.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Sheep.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Sheep.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Sheep.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Sheep.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Sheep.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Sheep.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Sheep.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("cow"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Cow.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Cow.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Cow.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Cow.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Cow.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Cow.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Cow.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Cow.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Cow.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Cow.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("spider"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Spider.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Spider.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Spider.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Spider.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Spider.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Spider.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Spider.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Spider.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Spider.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Spider.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("zombie"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Zombie.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Zombie.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Zombie.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Zombie.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Zombie.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Zombie.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Zombie.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Zombie.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Zombie.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Zombie.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("skeleton"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Skeleton.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Skeleton.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Skeleton.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Skeleton.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Skeleton.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Skeleton.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Skeleton.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Skeleton.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Skeleton.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Skeleton.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("magma"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.MagmaCube.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.MagmaCube.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.MagmaCube.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.MagmaCube.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.MagmaCube.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.MagmaCube.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.MagmaCube.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.MagmaCube.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.MagmaCube.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.MagmaCube.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("blaze"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Blaze.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Blaze.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Blaze.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Blaze.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Blaze.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Blaze.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Blaze.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Blaze.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Blaze.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Blaze.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("enderman"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.EnderMan.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.EnderMan.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.EnderMan.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.EnderMan.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.EnderMan.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.EnderMan.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.EnderMan.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.EnderMan.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.EnderMan.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.EnderMan.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("creeper"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Creeper.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Creeper.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Creeper.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Creeper.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Creeper.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Creeper.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Creeper.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Creeper.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.Creeper.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.Creeper.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
		if(headName.toLowerCase().contains("iron"))
		{
			Inventory inv = Bukkit.createInventory(p, 9, "§e§lMasks Purchaser");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack wPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 0);
			ItemMeta wPaneMeta = wPane.getItemMeta();
			wPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.IronGolem.Tiers.I.itemName"));
			wPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.IronGolem.Tiers.I.itemLore"));
			wPane.setItemMeta(wPaneMeta);
			
			ItemStack gPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 5);
			ItemMeta gPaneMeta = gPane.getItemMeta();
			gPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.IronGolem.Tiers.II.itemName"));
			gPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.IronGolem.Tiers.II.itemLore"));
			gPane.setItemMeta(gPaneMeta);
			
			ItemStack yPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 4);
			ItemMeta yPaneMeta = yPane.getItemMeta();
			yPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.IronGolem.Tiers.III.itemName"));
			yPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.IronGolem.Tiers.III.itemLore"));
			yPane.setItemMeta(yPaneMeta);
			
			ItemStack oPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 1);
			ItemMeta oPaneMeta = oPane.getItemMeta();
			oPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.IronGolem.Tiers.IV.itemName"));
			oPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.IronGolem.Tiers.IV.itemLore"));
			oPane.setItemMeta(oPaneMeta);
			
			ItemStack rPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 14);
			ItemMeta rPaneMeta = rPane.getItemMeta();
			rPaneMeta.setDisplayName(Main.getInstance().getConfig().getString("Masks.IronGolem.Tiers.V.itemName"));
			rPaneMeta.setLore(Main.getInstance().getConfig().getStringList("Masks.IronGolem.Tiers.V.itemLore"));
			rPane.setItemMeta(rPaneMeta);
			
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			
			inv.setItem(2, wPane);
			inv.setItem(3, gPane);
			inv.setItem(4, yPane);
			inv.setItem(5, oPane);
			inv.setItem(6, rPane);
			
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			
			p.openInventory(inv);
		}
	}
	
	
	public static void chickenMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("chicken"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("chicken") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask") && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.CHICKEN.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Chicken.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Chicken.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("GFSG-TGER-BVSG"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".ChickenTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("chicken"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVSG"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVSG") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("chicken") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CHICKEN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Chicken.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Chicken.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("GFSG-TGER-BVSA"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ChickenTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("chicken"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVSA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVSA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("chicken") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CHICKEN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Chicken.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Chicken.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("GFSG-TGER-BVST"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ChickenTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("chicken"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVST"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVST") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("chicken") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CHICKEN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Chicken.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Chicken.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("GFSG-TGER-BVSP"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ChickenTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("chicken"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVSP"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("GFSG-TGER-BVSP") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("chicken") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CHICKEN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Chicken.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Chicken.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("GFSG-TGER-BVSZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ChickenTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void sheepMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean haveMask = false;
    	boolean cycled = true;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("sheep"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("sheep") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.SHEEP.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Sheep.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Sheep.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("SGHS-YTHF-VSSG"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".SheepTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("sheep"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSSG"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSSG") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("sheep") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SHEEP.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Sheep.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Sheep.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("SGHS-YTHF-VSSA"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SheepTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("sheep"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSSA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSSA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("sheep") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SHEEP.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Sheep.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Sheep.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("SGHS-YTHF-VSSV"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SheepTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("sheep"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSSV"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSSV") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("sheep") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SHEEP.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Sheep.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Sheep.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("SGHS-YTHF-VSST"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SheepTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("sheep"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSST"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("SGHS-YTHF-VSST") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("sheep") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SHEEP.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Sheep.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Sheep.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("SGHS-YTHF-VSSZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SheepTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void cowMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("cow"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("cow") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.COW.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Cow.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Cow.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("PMQL-EQSE-CZRA"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".CowTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("cow"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("cow") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.COW.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Cow.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Cow.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("PMQL-EQSE-CZRR"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CowTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("cow"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRR"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRR") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("cow") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.COW.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Cow.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Cow.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("PMQL-EQSE-CZRQ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CowTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("cow"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRQ"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRQ") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("cow") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.COW.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Cow.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Cow.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("PMQL-EQSE-CZRB"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CowTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("cow"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRB"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("PMQL-EQSE-CZRB") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("cow") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.COW.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Cow.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Cow.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("PMQL-EQSE-CZRZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CowTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void spiderMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("spider"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("spider") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.SPIDER.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Spider.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Spider.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("OZLW-AIDM-WJAY"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".SpiderTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("spider"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAY"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAY") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("spider") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SPIDER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Spider.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Spider.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("OZLW-AIDM-WJAS"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SpiderTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("spider"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAS"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAS") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("spider") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SPIDER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Spider.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Spider.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("OZLW-AIDM-WJAU"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SpiderTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("spider"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAU"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAU") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("spider") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SPIDER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Spider.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Spider.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("OZLW-AIDM-WJAG"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SpiderTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("spider"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAG"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("OZLW-AIDM-WJAG") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("spider") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SPIDER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Spider.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Spider.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("OZLW-AIDM-WJAZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SpiderTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void zombieMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("zombie"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("zombie") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.ZOMBIE.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Zombie.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Zombie.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("AYTR-SUXZ-KOQA"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".ZombieTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("zombie"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("zombie") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ZOMBIE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Zombie.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Zombie.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("AYTR-SUXZ-KOQF"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ZombieTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("zombie"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQF"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQF") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("zombie") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ZOMBIE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Zombie.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Zombie.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("AYTR-SUXZ-KOQS"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ZombieTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("zombie"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQS"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQS") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("zombie") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ZOMBIE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Zombie.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Zombie.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("AYTR-SUXZ-KOQQ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ZombieTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("zombie"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQQ"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("AYTR-SUXZ-KOQQ") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("zombie") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ZOMBIE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Zombie.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Zombie.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("AYTR-SUXZ-KOQZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".ZombieTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void skeletonMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("skeleton"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("skeleton") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.SKELETON.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Skeleton.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Skeleton.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("ZQAI-DIGW-REMX"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".SkeletonTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("skeleton"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REMX"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REMX") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("skeleton") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SKELETON.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Skeleton.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Skeleton.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("ZQAI-DIGW-REMA"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SkeletonTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("skeleton"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REMA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REMA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("skeleton") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SKELETON.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Skeleton.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Skeleton.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("ZQAI-DIGW-REMC"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SkeletonTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("skeleton"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REMC"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REMC") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("skeleton") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SKELETON.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Skeleton.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Skeleton.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("ZQAI-DIGW-REML"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SkeletonTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("skeleton"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REML"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("ZQAI-DIGW-REML") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("skeleton") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.SKELETON.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Skeleton.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Skeleton.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("ZQAI-DIGW-REMZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".SkeletonTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void magmaMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.MAGMA_CUBE.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.MagmaCube.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.MagmaCube.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("IEKZ-SJEA-HWQA"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".MagmaCubeTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.MAGMA_CUBE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.MagmaCube.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.MagmaCube.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("IEKZ-SJEA-HWQR"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".MagmaCubeTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQR"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQR") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.MAGMA_CUBE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.MagmaCube.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.MagmaCube.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("IEKZ-SJEA-HWQT"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".MagmaCubeTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQT"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQT") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.MAGMA_CUBE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.MagmaCube.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.MagmaCube.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("IEKZ-SJEA-HWQJ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".MagmaCubeTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQJ"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("IEKZ-SJEA-HWQJ") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("lavaslime") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.MAGMA_CUBE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.MagmaCube.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.MagmaCube.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("IEKZ-SJEA-HWQZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".MagmaCubeTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void blazeMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("blaze"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("blaze") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.BLAZE.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Blaze.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Blaze.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("KUZQ-YOWA-SFMA"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".BlazeTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("blaze"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("blaze") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.BLAZE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Blaze.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Blaze.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("KUZQ-YOWA-SFMF"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".BlazeTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("blaze"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMF"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMF") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("blaze") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.BLAZE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Blaze.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Blaze.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("KUZQ-YOWA-SFMS"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".BlazeTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("blaze"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMS"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMS") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("blaze") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.BLAZE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Blaze.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Blaze.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("KUZQ-YOWA-SFMT"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".BlazeTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("blaze"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMT"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("KUZQ-YOWA-SFMT") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("blaze") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.BLAZE.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Blaze.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Blaze.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("KUZQ-YOWA-SFMZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".BlazeTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void endMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("enderman"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("enderman") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask") && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.ENDERMAN.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.EnderMan.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.EnderMan.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("TAQL-DIEN-GOLA"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".EnderManTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("enderman"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			Bukkit.broadcastMessage("Have: " + have + " Need: " + price);
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("enderman") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ENDERMAN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.EnderMan.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.EnderMan.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("TAQL-DIEN-GOLF"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".EnderManTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("enderman"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLF"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLF") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("enderman") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ENDERMAN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.EnderMan.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.EnderMan.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("TAQL-DIEN-GOLY"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".EnderManTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("enderman"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLY"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLY") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("enderman") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ENDERMAN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.EnderMan.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.EnderMan.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("TAQL-DIEN-GOLR"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".EnderManTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("enderman"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLR"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("TAQL-DIEN-GOLR") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("enderman") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.ENDERMAN.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.EnderMan.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.EnderMan.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("TAQL-DIEN-GOLZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".EnderManTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void creeperMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("creeper"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("creeper") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.CREEPER.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Creeper.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Creeper.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("XSPZ-AKEA-XKER"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".CreeperManTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("creeper"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKER"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKER") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("creeper") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CREEPER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Creeper.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Creeper.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("XSPZ-AKEA-XKEA"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CreeperManTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("creeper"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKEA"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKEA") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("creeper") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CREEPER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Creeper.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Creeper.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("XSPZ-AKEA-XKED"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CreeperManTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("creeper"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKED"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKED") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("creeper") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CREEPER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Creeper.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Creeper.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("XSPZ-AKEA-XKEG"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CreeperManTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("creeper"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKEG"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("XSPZ-AKEA-XKEG") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("creeper") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.CREEPER.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.Creeper.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.Creeper.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("XSPZ-AKEA-XKEZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".CreeperManTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}
	
	public static void golemMask(ItemStack is,Player p)
	{
		byte b = is.getData().getData();
    	int price = 0;
    	int have = 0;
    	boolean cycled = true;
    	boolean haveMask = false;
    	switch(b)
    	{                		
    		//Tier I
    		case 0:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.I");
    			have = 0;
    			for(ItemStack i : p.getInventory().getContents())
    			{
    				if(i != null)
    				{
        				if(i.hasItemMeta())
        				{
        					if(i.getItemMeta().getDisplayName().toLowerCase().contains("golem"))
        					{
        						have = have + i.getAmount();
        					}
        				}
    				}
    			}
    			cycled = true;
    			if(have >= price)
    			{
    				for(int i=0;i<price;i++)
    				{
    					for(ItemStack z : p.getInventory().getContents())
    					{
    						if(z != null)
    						{
    							if(z.hasItemMeta())
    							{
    								if(z.getItemMeta().getDisplayName().toLowerCase().contains("golem") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
    								{
    									if(z.getAmount() == 1)
    									{
    										z.setType(Material.JUKEBOX);
    										p.getInventory().remove(Material.JUKEBOX);
    										p.updateInventory();
    									}
    									else
    									{
    										z.setAmount(z.getAmount() - 1);
    									}
    									cycled = false;
    								}
    							}
    						}
    					}
    					cycled  = true;
    				}
    				p.updateInventory();
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
    				p.closeInventory();
    				ItemStack mask = Head.Mob.IRON_GOLEM.getHead();
    				ItemMeta maskMeta = mask.getItemMeta();
    				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.IronGolem.Tiers.I.itemName"));
    				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.IronGolem.Tiers.I.itemLore");
    				int length = 10;
    			    boolean useLetters = true;
    			    boolean useNumbers = false;
    			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    				String message = generatedString;
    				StringBuilder builder = new StringBuilder();
    				for(char c : message.toCharArray())
    				{
    					builder.append(ChatColor.COLOR_CHAR).append(c);
    				}
    				String hidden = builder.toString();
    				List<String> loresF = new ArrayList<>();
    				for(String s : lores)
    				{
    					if(s.toUpperCase().contains("LOAZ-HQHX-AHXP"))
    					{
    						s = s+hidden;
    						loresF.add(s);
    					}
    					else
    					{
    						loresF.add(s);
    					}
    				}
    				maskMeta.setLore(loresF);
    				mask.setItemMeta(maskMeta);
    				p.getInventory().addItem(mask);
    				//(p, true, ".IronGolemTierIMask");
    				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
    			}
    			else
    			{
    				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
    				p.closeInventory();
    			}
    			break;
    		//Tier II
    		case 5:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.II");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("golem"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXP"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXP") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("golem") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.IRON_GOLEM.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.IronGolem.Tiers.II.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.IronGolem.Tiers.II.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("LOAZ-HQHX-AHXS"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".IronGolemTierIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier III
    		case 4:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.III");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("golem"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXS"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXS") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("golem") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.IRON_GOLEM.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.IronGolem.Tiers.III.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.IronGolem.Tiers.III.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("LOAZ-HQHX-AHXF"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".IronGolemTierIIIMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier IV
    		case 1:	price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.IV");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("golem"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXF"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXF") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("golem") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.IRON_GOLEM.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.IronGolem.Tiers.IV.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.IronGolem.Tiers.IV.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("LOAZ-HQHX-AHXH"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".IronGolemTierIVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    		//Tier V
    		case 14:  price = Main.getInstance().getConfig().getInt("MasksPrizes.Tiers.V");
			have = 0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
    				if(i.hasItemMeta())
    				{
    					if(i.getItemMeta().getDisplayName().toLowerCase().contains("golem"))
    					{
    						have = have + i.getAmount();
    					}
    				}
				}
			}
			cycled = true;
			if(have >= price)
			{
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXH"))
								{
									haveMask = true;
								}
							}
						}
					}
				}
			}
			if(have >= price && haveMask)
			{
				haveMask = false;
				int j = 0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains("LOAZ-HQHX-AHXH") && j == 0)
								{
									i.setType(Material.JUKEBOX);
									p.getInventory().remove(Material.JUKEBOX);
									p.updateInventory();
									j = 1;
								}
							}
						}
					}
				}
				for(int i=0;i<price;i++)
				{
					for(ItemStack z : p.getInventory().getContents())
					{
						if(z != null)
						{
							if(z.hasItemMeta())
							{
								if(z.getItemMeta().getDisplayName().toLowerCase().contains("golem") && cycled && !z.getItemMeta().getDisplayName().toLowerCase().contains("mask"))
								{
									if(z.getAmount() == 1)
									{
										z.setType(Material.JUKEBOX);
										p.getInventory().remove(Material.JUKEBOX);
										p.updateInventory();
									}
									else
									{
										z.setAmount(z.getAmount() - 1);
									}
									cycled = false;
								}
							}
						}
					}
					cycled  = true;
				}
				p.updateInventory();
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.SuccesfullyPurchased"));
				p.closeInventory();
				ItemStack mask = Head.Mob.IRON_GOLEM.getHead();
				ItemMeta maskMeta = mask.getItemMeta();
				maskMeta.setDisplayName(Main.getInstance().getConfig().getString("MaskItem.IronGolem.Tiers.V.itemName"));
				List<String> lores = Main.getInstance().getConfig().getStringList("MaskItem.IronGolem.Tiers.V.itemLore");
				int length = 10;
			    boolean useLetters = true;
			    boolean useNumbers = false;
			    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
				String message = generatedString;
				StringBuilder builder = new StringBuilder();
				for(char c : message.toCharArray())
				{
					builder.append(ChatColor.COLOR_CHAR).append(c);
				}
				String hidden = builder.toString();
				List<String> loresF = new ArrayList<>();
				for(String s : lores)
				{
					if(s.toUpperCase().contains("LOAZ-HQHX-AHXZ"))
					{
						s = s+hidden;
						loresF.add(s);
					}
					else
					{
						loresF.add(s);
					}
				}
				maskMeta.setLore(loresF);
				mask.setItemMeta(maskMeta);
				p.getInventory().addItem(mask);
				//(p, true, ".IronGolemTierVMask");
				p.playSound(p.getLocation(), Sound.ORB_PICKUP, 10, 1);
			}
			else
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Messages.NotEnoughHeads"));
				p.closeInventory();
			}
    			break;
    	}
	}

}

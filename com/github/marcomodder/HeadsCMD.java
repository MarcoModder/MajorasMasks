package com.github.marcomodder;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HeadsCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player))
		{
			return true;
		}
		Player p = (Player) sender;
		if(args.length == 0)
		{
			Inventory inv = Bukkit.createInventory(p, 27, "§e§lMasks");
			ItemStack bPane = new ItemStack(Material.STAINED_GLASS_PANE,1,(short) 15);
			
			ItemStack chicken = Head.Mob.CHICKEN.getHead();
			ItemStack sheep = Head.Mob.SHEEP.getHead();
			ItemStack cow = Head.Mob.COW.getHead();
			ItemStack caveSpider = Head.Mob.CAVE_SPIDER.getHead();
			ItemStack spider = Head.Mob.SPIDER.getHead();
			ItemStack zombie = Head.Mob.ZOMBIE.getHead();
			ItemStack skeleton = Head.Mob.SKELETON.getHead();
			ItemStack magma = Head.Mob.MAGMA_CUBE.getHead();
			ItemStack blaze = Head.Mob.BLAZE.getHead();
			ItemStack enderman = Head.Mob.ENDERMAN.getHead();
			ItemStack creeper = Head.Mob.CREEPER.getHead();
			ItemStack golem = Head.Mob.IRON_GOLEM.getHead();
			
			ItemMeta im = chicken.getItemMeta();
			String chick = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String chickE = chick.replace("{type}", "Chicken");
			im.setDisplayName(chickE);
			im.setLore(lores("Chicken"));
			chicken.setItemMeta(im);
			
			ItemMeta iv = sheep.getItemMeta();
			String chickk = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String chickEE = chickk.replace("{type}", "Sheep");
			iv.setDisplayName(chickEE);
			iv.setLore(lores("Sheep"));
			sheep.setItemMeta(iv);
			
			ItemMeta ivv = cow.getItemMeta();
			String chickkk = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String chickEEE = chickkk.replace("{type}", "Cow");
			ivv.setLore(lores("Cow"));
			ivv.setDisplayName(chickEEE);
			cow.setItemMeta(ivv);
			
			ItemMeta ia = cow.getItemMeta();
			String holo = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String holox = holo.replace("{type}", "Cave Spider");
			ia.setLore(lores("Cave Spider"));
			ia.setDisplayName(holox);
			caveSpider.setItemMeta(ia);
			
			ItemMeta iva = spider.getItemMeta();
			String holov = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String holoxv = holov.replace("{type}", "Spider");
			iva.setLore(lores("Spider"));
			iva.setDisplayName(holoxv);
			spider.setItemMeta(iva);
			
			ItemMeta ib = zombie.getItemMeta();
			String gee = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String geex = gee.replace("{type}", "Zombie");
			ib.setLore(lores("Zombie"));
			ib.setDisplayName(geex);
			zombie.setItemMeta(ib);
			
			ItemMeta ic = skeleton.getItemMeta();
			String geec = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String geexc = geec.replace("{type}", "Skeleton");
			ic.setLore(lores("Skeleton"));
			ic.setDisplayName(geexc);
			skeleton.setItemMeta(ic);
			
			ItemMeta iz = magma.getItemMeta();
			String geecz = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String geexcz = geecz.replace("{type}", "Magma Cube");
			iz.setLore(lores("Magma Cube"));
			iz.setDisplayName(geexcz);
			magma.setItemMeta(iz);
			
			ItemMeta bz = blaze.getItemMeta();
			String geeczb = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String geexczb = geeczb.replace("{type}", "Blaze");
			bz.setLore(lores("Blaze"));
			bz.setDisplayName(geexczb);
			blaze.setItemMeta(bz);
			
			
			ItemMeta vz = enderman.getItemMeta();
			String geeczbv = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String geexczbv = geeczbv.replace("{type}", "Enderman");
			vz.setLore(lores("Enderman"));
			vz.setDisplayName(geexczbv);
			enderman.setItemMeta(vz);
			
			ItemMeta vzz = creeper.getItemMeta();
			String geeczbvz = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String geexczbvz = geeczbvz.replace("{type}", "Creeper");
			vzz.setLore(lores("Creeper"));
			vzz.setDisplayName(geexczbvz);
			creeper.setItemMeta(vzz);
			
			ItemMeta xx = golem.getItemMeta();
			String geeczbvzf = Main.getInstance().getConfig().getString("GUI.headDisplayName");
			String geexczbvzf = geeczbvzf.replace("{type}", "Iron Golem");
			xx.setLore(lores("Iron Golem"));
			xx.setDisplayName(geexczbvzf);
			golem.setItemMeta(xx);
			
			// .setItem
			inv.setItem(0, bPane);
			inv.setItem(1, bPane);
			inv.setItem(2, bPane);
			inv.setItem(6, bPane);
			inv.setItem(7, bPane);
			inv.setItem(8, bPane);
			inv.setItem(9, bPane);
			inv.setItem(10, bPane);
			inv.setItem(16, bPane);
			inv.setItem(17, bPane);
			inv.setItem(18, bPane);
			inv.setItem(19, bPane);
			inv.setItem(20, bPane);
			inv.setItem(24, bPane);
			inv.setItem(25, bPane);
			inv.setItem(26, bPane);
			
			inv.setItem(3, chicken);
			inv.setItem(4, sheep);
			inv.setItem(5, cow);
			
			inv.setItem(15, blaze);
			inv.setItem(11, spider);
			inv.setItem(12, zombie);
			inv.setItem(13, skeleton);
			inv.setItem(14, magma);
			
			inv.setItem(21, enderman);
			inv.setItem(22, creeper);
			inv.setItem(23, golem);
			
			p.openInventory(inv);
		}
		else if(args.length == 1 && p.isOp())
		{
			if(args[0].equalsIgnoreCase("cauldron"))
			{
				p.sendMessage("§aSuccesfully added masks cauldron item to your inventory!");
				
				ItemStack cauldron = new ItemStack(Material.CAULDRON_ITEM,1);
				ItemMeta meta = cauldron.getItemMeta();
				meta.setDisplayName("§e§lMajoras Masks §8(§7Place§8)");
				cauldron.setItemMeta(meta);
				
				p.getInventory().addItem(cauldron);
				return true;
			}
			else
			{
				p.sendMessage("§cCorrect usage /heads cauldron !");
				return true;
			}
		}
		else
		{
			return true;
		}
		return true;
	}
	
	
	public List<String> lores(String replaceWith)
	{
		List<String> temp = new ArrayList<>();
		for(String s : Main.getInstance().getConfig().getStringList("GUI.headLore"))
		{
			if(s.toLowerCase().contains("{type}"))
			{
				String t = s.replace("{type}", replaceWith);
				temp.add(t);
			}
			else
			{
				temp.add(s);
			}
		}
		return temp;
	}

}

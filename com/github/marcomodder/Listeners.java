package com.github.marcomodder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class Listeners implements Listener {
	
	@EventHandler
	public void onMobDeath(EntityDeathEvent e)
	{
		if(!(e.getEntity().getKiller() instanceof Player))
		{
			return;
		}
		else
		{
			Entity mob = e.getEntity();
			EntityType type = mob.getType();
			if(type == EntityType.PIG || type == EntityType.CHICKEN || type == EntityType.SHEEP || type == EntityType.COW || type == EntityType.SPIDER || type == EntityType.ZOMBIE || type == EntityType.SKELETON || type == EntityType.MAGMA_CUBE || type == EntityType.BLAZE || type == EntityType.ENDERMAN || type == EntityType.CREEPER || type == EntityType.IRON_GOLEM)
			{
				ItemStack i = new ItemStack(Material.WOOD);
				if(type == EntityType.ZOMBIE)
				{
					i = Head.Mob.ZOMBIE.getHead();
				}
				else if(type == EntityType.CREEPER)
				{
					i = Head.Mob.CREEPER.getHead();
				}
				else if(type == EntityType.SKELETON)
				{
					i = Head.Mob.SKELETON.getHead();
				}
				else if(type == EntityType.CHICKEN)
				{
					i = Head.Mob.CHICKEN.getHead();;
				}
				else if(type == EntityType.SPIDER)
				{
					i = Head.Mob.SPIDER.getHead();
				}
				else if(type == EntityType.SHEEP)
				{
					i = Head.Mob.SHEEP.getHead();
				}
				else if(type == EntityType.MAGMA_CUBE)
				{
					i = Head.Mob.MAGMA_CUBE.getHead();
				}
				else if(type == EntityType.BLAZE)
				{
					i = Head.Mob.BLAZE.getHead();
				}
				else if(type == EntityType.IRON_GOLEM)
				{
					i = Head.Mob.IRON_GOLEM.getHead();
				}
				else if(type == EntityType.ENDERMAN)
				{
					i = Head.Mob.ENDERMAN.getHead();
				}
				else if(type == EntityType.COW)
				{
					i = Head.Mob.COW.getHead();
				}
				String initialPercentage = Main.getInstance().getConfig().getString("head-drop-percentage");
				String configPercentage = initialPercentage.replace("%", "");
				double finalPercentage = Double.parseDouble(configPercentage) / 100 ;
				double d = Math.random();
				if(d < finalPercentage)
				{
					//Here we drop the head
					ItemStack head = i;
					ItemMeta headMeta = head.getItemMeta();
					String name = Main.getInstance().getConfig().getString("head-name");
					String fName = name.replace("{type}", mob.getType().getName());
					headMeta.setDisplayName(fName);
					List<String> lista = Main.getInstance().getConfig().getStringList("head-lore");
					List<String> listaDef = new ArrayList<String>();
					for(String s : lista)
					{
						if(s.contains("{type}"))
						{
							String string = s.replace("{type}", mob.getType().getName());
							listaDef.add(string);
						}
						else
						{
							listaDef.add(s);
						}
					}
					headMeta.setLore(listaDef);
					head.setItemMeta(headMeta);
					Player p = e.getEntity().getKiller();
					p.getInventory().addItem(head);
				}
			}
		}
	}
	
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e)
	{
		Player p = e.getPlayer();
		if(e.getBlock().getType() == Material.SKULL)
		{
			e.setCancelled(true);
		}
	}
	
	
	
	// GUI
	@EventHandler
    public void onClick(InventoryClickEvent e)
    {
        if(e.getInventory().getName().equalsIgnoreCase("§e§lMasks"))
        {
            if(e.getCurrentItem() != null && e.getCurrentItem().getType() != null)
            {
                Player p = (Player) e.getWhoClicked();
                ItemStack is = e.getCurrentItem();
                if(is.getType() == Material.STAINED_GLASS_PANE)
                {
                	e.setCancelled(true);
                }
                 else
                 {
                    	e.setCancelled(true);
                    	p.closeInventory();
                    	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
                        {
                          public void run()
                          {
                          	Utils.openTierInv(p,is.getItemMeta().getDisplayName());
                          }
                        }, 3);
                }
            }
        }
        if(e.getInventory().getName().equalsIgnoreCase("§e§lMasks Purchaser"))
        {
            if(e.getCurrentItem() != null && e.getCurrentItem().getType() != null)
            {
                Player p = (Player) e.getWhoClicked();
                ItemStack is = e.getCurrentItem();
                if(is.hasItemMeta() && is.getType() == Material.STAINED_GLASS_PANE)
                {
                	e.setCancelled(true);
                	p.closeInventory();
                	//Chicken
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("chicken"))
                	{
                		Utils.chickenMask(is, p);
                	}
                	//Cow
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("cow"))
                	{
                		Utils.cowMask(is, p);
                	}
                	//Sheep
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("sheep"))
                	{
                		Utils.sheepMask(is, p);
                	}
                	//Cow
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("sheep"))
                	{
                		Utils.cowMask(is, p);
                	}
                	//Spider
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("spider"))
                	{
                		Utils.spiderMask(is, p);
                	}
                	//Zombie
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("zombie"))
                	{
                		Utils.zombieMask(is, p);
                	}
                	//Skeleton
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("skeleton"))
                	{
                		Utils.skeletonMask(is, p);
                	}
                	//Magma
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("magma"))
                	{
                		Utils.magmaMask(is, p);
                	}
                	//Blaze
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("blaze"))
                	{
                		Utils.blazeMask(is, p);
                	}
                	//Blaze
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("enderman"))
                	{
                		Utils.endMask(is, p);
                	}
                	//Creeper
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("creeper"))
                	{
                		Utils.creeperMask(is, p);
                	}
                	//Golem
                	if(is.getItemMeta().getDisplayName().toLowerCase().contains("golem"))
                	{
                		Utils.golemMask(is, p);
                	}
                }
                else
                {
                	e.setCancelled(true);
                }
            }
        }
    }
	
	
	
	//Effects
	@EventHandler
	public void onFall(EntityDamageEvent e)
	{
		if(!(e.getEntity() instanceof Player))
		{
			return;
		}
		else
		{
			Player p = (Player) e.getEntity();
			if(e.getCause() == DamageCause.FALL)
			{
				Double d = Math.random();
				boolean I = false;
				boolean II = false;
				boolean III = false;
				boolean IV = false;
				boolean V = false;
				Double dob = 0.0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							if(i.getItemMeta().hasLore())
							{
								for(String s : i.getItemMeta().getLore())
								{
									if(s.toUpperCase().contains(Main.getInstance().codes[0]))
									{
										I = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[1]))
									{
										II = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[2]))
									{
										III = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[3]))
									{
										IV = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[4]))
									{
										V = true;
									}
								}
							}
						}
					}
				}
				if(I)
				{
					dob = 0.10;
				}
				if(II)
				{
					dob = 0.30;
				}
				if(III)
				{
					dob = 0.50;
				}
				if(IV)
				{
					dob = 0.70;
				}
				if(V)
				{
					dob = 1.00;
				}
				if(d < dob)
				{
					p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Chicken"));
					e.setCancelled(true);
				}
			}
		}
	}
	
	//Sheep
	@EventHandler
	public void onHit(EntityDamageByEntityEvent e)
	{
		if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
		{
			return;
		}
		else
		{
			Player p = (Player) e.getEntity();
			Player damager = (Player) e.getDamager();
			//Percentage calc
			Double d = Math.random();
			boolean I = false;
			boolean II = false;
			boolean III = false;
			boolean IV = false;
			boolean V = false;
			Double dob = 0.0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
					if(i.hasItemMeta())
					{
						if(i.getItemMeta().hasLore())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains(Main.getInstance().codes[5]))
								{
									I = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[6]))
								{
									II = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[7]))
								{
									III = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[8]))
								{
									IV = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[9]))
								{
									V = true;
								}
							}
						}
						}
				}
			}
			if(I)
			{
				dob = 0.02;
			}
			if(II)
			{
				dob = 0.03;
			}
			if(III)
			{
				dob = 0.04;
			}
			if(IV)
			{
				dob = 0.05;
			}
			if(V)
			{
				dob = 0.07;
			}
			if(d < dob)
			{
				p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Sheep"));
				damager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100, 5));
			}
		}
	}
	
	
	//Cow
	@EventHandler
	public void onCow(EntityDamageByEntityEvent e)
	{
		if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
		{
			return;
		}
		else
		{
			Player p = (Player) e.getEntity();
			Player damager = (Player) e.getDamager();
			//Percentage calc
			Double d = Math.random();
			boolean I = false;
			boolean II = false;
			boolean III = false;
			boolean IV = false;
			boolean V = false;
			Double dob = 0.0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
					if(i.hasItemMeta())
					{
						if(i.getItemMeta().hasLore())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains(Main.getInstance().codes[10]))
								{
									I = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[11]))
								{
									II = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[12]))
								{
									III = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[13]))
								{
									IV = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[14]))
								{
									V = true;
								}
							}
						}
					}
				}
			}
			if(I)
			{
				dob = 0.09;
			}
			if(II)
			{
				dob = 0.12;
			}
			if(III)
			{
				dob = 0.15;
			}
			if(IV)
			{
				dob = 0.20;
			}
			if(V)
			{
				dob = 0.25;
			}
			if(d < dob)
			{
				p.removePotionEffect(PotionEffectType.SLOW);
				p.removePotionEffect(PotionEffectType.POISON);
				p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Cow"));
			}
		}
	}
	
	
	
	//Spider
	@EventHandler
	public void onSpider(EntityDamageByEntityEvent e)
	{
		if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
		{
			return;
		}
		else
		{
			Player p = (Player) e.getEntity();
			Player damager = (Player) e.getDamager();
			//Percentage calc
			Double d = Math.random();
			boolean I = false;
			boolean II = false;
			boolean III = false;
			boolean IV = false;
			boolean V = false;
			Double dob = 0.0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
					if(i.hasItemMeta())
					{
						if(i.getItemMeta().hasLore())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains(Main.getInstance().codes[15]))
								{
									I = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[16]))
								{
									II = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[17]))
								{
									III = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[18]))
								{
									IV = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[19]))
								{
									V = true;
								}
							}
						}
					}
				}
			}
			if(I)
			{
				dob = 1.00;
			}
			if(II)
			{
				dob = 0.02;
			}
			if(III)
			{
				dob = 0.03;
			}
			if(IV)
			{
				dob = 0.04;
			}
			if(V)
			{
				dob = 0.05;
			}
			if(d < dob)
			{
				damager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100, 10));
				p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Spider"));
			}
		}
	}
	
	
	//Zombie
	@EventHandler
	public void onZombie(EntityDamageByEntityEvent e)
	{
		if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
		{
			return;
		}
		else
		{
			Player p = (Player) e.getEntity();
			Player damager = (Player) e.getDamager();
			//Percentage calc
			Double d = Math.random();
			boolean I = false;
			boolean II = false;
			boolean III = false;
			boolean IV = false;
			boolean V = false;
			Double dob = 0.0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
					if(i.hasItemMeta())
					{
						if(i.getItemMeta().hasLore())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains(Main.getInstance().codes[20]))
								{
									I = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[21]))
								{
									II = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[22]))
								{
									III = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[23]))
								{
									IV = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[24]))
								{
									V = true;
								}
							}
						}
					}
				}
			}
			if(I)
			{
				dob = 1.00;
			}
			if(II)
			{
				dob = 0.02;
			}
			if(III)
			{
				dob = 0.03;
			}
			if(IV)
			{
				dob = 0.04;
			}
			if(V)
			{
				dob = 0.05;
			}
			if(d < dob)
			{
				Location loc = damager.getLocation();
				Zombie zmb = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				zmb.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,200, 3));
				zmb.setBaby(true);
				Zombie zmbb = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				zmbb.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,200, 3));
				zmbb.setBaby(true);
				Zombie zmbbb = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				zmbbb.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,200, 3));
				zmbbb.setBaby(true);
				Zombie zmbbz = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				zmbbz.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,200, 3));
				zmbbz.setBaby(true);
				Zombie zmbbx = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
				zmbbx.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,200, 3));
				zmbbx.setBaby(true);
				List<Zombie> zombies = new ArrayList<Zombie>();
				zombies.add(zmbbx);
				zombies.add(zmbbz);
				zombies.add(zmbbb);
				zombies.add(zmbb);
				zombies.add(zmb);
				p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Zombie"));
            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
                {
                  public void run()
                  {
                  	for(Zombie z : zombies)
                  	{
                  		z.remove();
                  	}
                  }
                }, 200);
			}
		}
	}
	
	
	//Skeleton
	@EventHandler
	public void onSkeleton(EntityDamageByEntityEvent e)
	{
		if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
		{
			return;
		}
		else
		{
			Player p = (Player) e.getEntity();
			Player damager = (Player) e.getDamager();
			//Percentage calc
			Double d = Math.random();
			boolean I = false;
			boolean II = false;
			boolean III = false;
			boolean IV = false;
			boolean V = false;
			Double dob = 0.0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
					if(i.hasItemMeta())
					{
						if(i.getItemMeta().hasLore())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains(Main.getInstance().codes[25]))
								{
									I = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[26]))
								{
									II = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[27]))
								{
									III = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[28]))
								{
									IV = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[29]))
								{
									V = true;
								}
							}
						}
					}
				}
			}
			if(I)
			{
				dob = 0.01;
			}
			if(II)
			{
				dob = 0.02;
			}
			if(III)
			{
				dob = 0.03;
			}
			if(IV)
			{
				dob = 0.04;
			}
			if(V)
			{
				dob = 0.05;
			}
			if(d < dob)
			{
				if(!Utils.skelCooldown.containsKey(damager))
				{
					damager.addPotionEffect(new PotionEffect(PotionEffectType.POISON,400, 2));
					damager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,400, 2));
					Utils.skelCooldown.put(damager, true);
					p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Skeleton"));
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	                {
	                  public void run()
	                  {
	                	  Utils.skelCooldown.put(damager, false);
	                  }
	                }, 1200);
				}
				else if(!Utils.skelCooldown.get(damager))
				{
					damager.addPotionEffect(new PotionEffect(PotionEffectType.POISON,400, 2));
					damager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,400, 2));
					p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Skeleton"));
					Utils.skelCooldown.put(damager, true);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	                {
	                  public void run()
	                  {
	                	  Utils.skelCooldown.put(damager, false);
	                  }
	                }, 1200);
				}
				else
				{
					
				}
			}
		}
	}
	
	
	//Magma
	@EventHandler
	public void onMagma(EntityDamageByEntityEvent e)
	{
		if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
		{
			return;
		}
		else
		{
			Player p = (Player) e.getEntity();
			Player damager = (Player) e.getDamager();
			//Percentage calc
			Double d = Math.random();
			boolean I = false;
			boolean II = false;
			boolean III = false;
			boolean IV = false;
			boolean V = false;
			Double dob = 0.0;
			for(ItemStack i : p.getInventory().getContents())
			{
				if(i != null)
				{
					if(i.hasItemMeta())
					{
						if(i.getItemMeta().hasLore())
						{
							for(String s : i.getItemMeta().getLore())
							{
								if(s.toUpperCase().contains(Main.getInstance().codes[30]))
								{
									I = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[31]))
								{
									II = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[32]))
								{
									III = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[33]))
								{
									IV = true;
								}
								if(s.toUpperCase().contains(Main.getInstance().codes[34]))
								{
									V = true;
								}
							}
						}
					}
				}
			}
			if(I)
			{
				dob = 0.02;
			}
			if(II)
			{
				dob = 0.03;
			}
			if(III)
			{
				dob = 0.04;
			}
			if(IV)
			{
				dob = 0.05;
			}
			if(V)
			{
				dob = 0.06;
			}
			if(d < dob)
			{
				if(!Utils.magmaCooldown.containsKey(p))
				{
					p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,200, 10));
					p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Magma"));
					Utils.magmaCooldown.put(p, true);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	                {
	                  public void run()
	                  {
	                	  Utils.magmaCooldown.put(p, false);
	                  }
	                }, 1200);
				}
				else if(!Utils.magmaCooldown.get(p))
				{
					p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,200, 10));
					p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Magma"));
					Utils.magmaCooldown.put(p, true);
	            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	                {
	                  public void run()
	                  {
	                	  Utils.magmaCooldown.put(p, false);
	                  }
	                }, 1200);
				}
				else
				{
					
				}
			}
		}
	}
	
		//Blaze
		@EventHandler
		public void onBlaze(EntityDamageByEntityEvent e)
		{
			if(e.getDamager() instanceof Arrow)
			{
			    if(((Arrow)e.getDamager()).getShooter() instanceof Player)
			    {
			        Player p = (Player)(((Arrow)e.getDamager()).getShooter());
			        Player damager = (Player) e.getEntity();
					//Percentage calc
					Double d = Math.random();
					boolean I = false;
					boolean II = false;
					boolean III = false;
					boolean IV = false;
					boolean V = false;
					Double dob = 0.0;
					for(ItemStack i : p.getInventory().getContents())
					{
						if(i != null)
						{
							if(i.hasItemMeta())
							{
								if(i.getItemMeta().hasLore())
								{
									for(String s : i.getItemMeta().getLore())
									{
										if(s.toUpperCase().contains(Main.getInstance().codes[35]))
										{
											I = true;
										}
										if(s.toUpperCase().contains(Main.getInstance().codes[36]))
										{
											II = true;
										}
										if(s.toUpperCase().contains(Main.getInstance().codes[37]))
										{
											III = true;
										}
										if(s.toUpperCase().contains(Main.getInstance().codes[38]))
										{
											IV = true;
										}
										if(s.toUpperCase().contains(Main.getInstance().codes[39]))
										{
											V = true;
										}
									}
								}
							}
						}
					}
					if(I)
					{
						dob = 0.01;
					}
					if(II)
					{
						dob = 0.02;
					}
					if(III)
					{
						dob = 0.03;
					}
					if(IV)
					{
						dob = 0.04;
					}
					if(V)
					{
						dob = 0.05;
					}
					if(d < dob)
					{
						if(!Utils.blazeCooldown.containsKey(p))
						{
							Utils.blazeCooldown.put(p, true);
							p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Blaze"));
							Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
			                {
			                  public void run()
			                  {
								damager.setVelocity(new Vector(0,6,0));
			                  }
			                }, 1);
							Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
			                {
			                  public void run()
			                  {
			                	  Utils.blazeCooldown.put(p, false);
			                  }
			                }, 1200);
						}
						else if(!Utils.blazeCooldown.get(p))
						{
							Utils.blazeCooldown.put(p, true);
							p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Blaze"));
							Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
			                {
			                  public void run()
			                  {
								damager.setVelocity(new Vector(0,6,0));
			                  }
			                }, 1);
							Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
			                {
			                  public void run()
			                  {
			                	  Utils.blazeCooldown.put(p, false);
			                  }
			                }, 1200);
						}
						else
						{

						}
					}
			    }
			}
		}
		
		
		//Enderman
		@EventHandler
		public void onEnd(EntityDamageByEntityEvent e)
		{
			if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			{
				return;
			}
			else
			{
				Player p = (Player) e.getEntity();
				Player damager = (Player) e.getDamager();
				//Percentage calc
				Double d = Math.random();
				boolean I = false;
				boolean II = false;
				boolean III = false;
				boolean IV = false;
				boolean V = false;
				Double dob = 0.0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							if(i.getItemMeta().hasLore())
							{
								for(String s : i.getItemMeta().getLore())
								{
									if(s.toUpperCase().contains(Main.getInstance().codes[40]))
									{
										I = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[41]))
									{
										II = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[42]))
									{
										III = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[43]))
									{
										IV = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[44]))
									{
										V = true;
									}
								}
							}
						}
					}
				}
				if(I)
				{
					dob = 0.01;
				}
				if(II)
				{
					dob = 0.02;
				}
				if(III)
				{
					dob = 0.03;
				}
				if(IV)
				{
					dob = 0.04;
				}
				if(V)
				{
					dob = 0.05;
				}
				if(d < dob)
				{
					if(!Utils.endermanCooldown.containsKey(damager))
					{
						damager.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,200, 1));
						Random rand = new Random();
						int c = rand.nextInt(11);
						Location loc = new Location(damager.getWorld(),damager.getLocation().getX()+c/2,damager.getLocation().getY(),damager.getLocation().getZ()+c/2);
						damager.teleport(loc);
						p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.EnderMan"));
						Utils.endermanCooldown.put(damager, true);
		            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
		                {
		                  public void run()
		                  {
		                	  Utils.endermanCooldown.put(damager, false);
		                  }
		                }, 1200);
					}
					else if(!Utils.endermanCooldown.get(damager))
					{
						damager.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,200, 1));
						Random rand = new Random();
						int c = rand.nextInt(11);
						Location loc = new Location(damager.getWorld(),damager.getLocation().getX()+c/2,damager.getLocation().getY(),damager.getLocation().getZ()+c/2);
						damager.teleport(loc);
						p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.EnderMan"));
						Utils.endermanCooldown.put(damager, true);
		            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
		                {
		                  public void run()
		                  {
		                	  Utils.endermanCooldown.put(damager, false);
		                  }
		                }, 1200);
					}
					else
					{
						
					}
				}
			}
		}
		
		
		//Creeper
		@EventHandler
		public void onCreeper(EntityDamageByEntityEvent e)
		{
			if(!(e.getEntity() instanceof Player && e.getDamager() instanceof Player))
			{
				return;
			}
			else
			{
				Player p = (Player) e.getEntity();
				Player damager = (Player) e.getDamager();
				//Percentage calc
				Double d = Math.random();
				boolean I = false;
				boolean II = false;
				boolean III = false;
				boolean IV = false;
				boolean V = false;
				Double dob = 0.0;
				for(ItemStack i : p.getInventory().getContents())
				{
					if(i != null)
					{
						if(i.hasItemMeta())
						{
							if(i.getItemMeta().hasLore())
							{
								for(String s : i.getItemMeta().getLore())
								{
									if(s.toUpperCase().contains(Main.getInstance().codes[45]))
									{
										I = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[46]))
									{
										II = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[47]))
									{
										III = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[48]))
									{
										IV = true;
									}
									if(s.toUpperCase().contains(Main.getInstance().codes[49]))
									{
										V = true;
									}
								}
							}
						}
					}
				}
				if(I)
				{
					dob = 0.01;
				}
				if(II)
				{
					dob = 0.02;
				}
				if(III)
				{
					dob = 0.03;
				}
				if(IV)
				{
					dob = 0.04;
				}
				if(V)
				{
					dob = 0.05;
				}
				if(d < dob)
				{
					if(!Utils.creeperCooldown.containsKey(damager))
					{
					    Damageable dam = (Damageable) damager;
					    double health = dam.getHealth();
						damager.setHealth(health - 6.0);
						p.sendMessage(Main.getInstance().getConfig().getString("Effects.Messages.Creeper"));
						Utils.creeperCooldown.put(damager, true);
		            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
		                {
		                  public void run()
		                  {
		                	  Utils.creeperCooldown.put(damager, false);
		                  }
		                }, 1200);
					}
					else if(!Utils.creeperCooldown.get(damager))
					{
					    Damageable dam = (Damageable) damager;
					    double health = dam.getHealth();
						damager.setHealth(health - 6.0);
						Utils.creeperCooldown.put(damager, true);
		            	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
		                {
		                  public void run()
		                  {
		                	  Utils.creeperCooldown.put(damager, false);
		                  }
		                }, 1200);
					}
					else
					{
						
					}
				}
			}
		}
		
		
		@EventHandler
	    public void onPlayerInteract(PlayerInteractEvent event) {
	        if(true)
	        {
	        	Action a = event.getAction();
		        ItemStack is = event.getItem();
		 
		        if(a == Action.LEFT_CLICK_AIR || a == Action.LEFT_CLICK_BLOCK || a == Action.PHYSICAL)
		        {
		            return;
		        }
		
	        	if(event.getClickedBlock() != null)
	        	{
	    	        Block b = event.getClickedBlock();
	    	        if(b.getType() == Material.CAULDRON && Main.locMap.contains(b.getLocation()))
	    	        {
	    	        	Bukkit.dispatchCommand(event.getPlayer(), "heads");
	    	        }
	        	}
	        }
		}
		
		
		@EventHandler(priority=EventPriority.LOW)
		  public void eventListener(BlockPlaceEvent event)
		  {
		     Player p = event.getPlayer();
		     if(event.getBlock().getType() == Material.CAULDRON)
		     {
		    	 if(event.getItemInHand().hasItemMeta())
		    	 {
			    	 if(event.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lMajoras Masks §8(§7Place§8)"))
			    	 {

			    		 Location loc = event.getBlock().getLocation();
						 Main.getDungeonStorage().add(loc);
						 Main.locMap.add(loc);
			    	 } 
		    	 }
		     }
		  }

}

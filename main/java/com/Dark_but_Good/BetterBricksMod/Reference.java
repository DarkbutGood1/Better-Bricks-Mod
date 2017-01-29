package com.Dark_but_Good.BetterBricksMod;

public class Reference {

	public static final String MOD_ID = "dbgbbm";
	public static final String NAME = "BetterBricksMod";
	public static final String VERSION = "0.5";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	public static final String CLIENT_PROXY_CLASS = "com.Dark_but_Good.BetterBricksMod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Dark_but_Good.BetterBricksMod.proxy.ServerProxy";
	
	public static enum BetterBricksModItems {
		POSITIONCONTROLWAND("positioncontrolwand", "ItemPositioncontrolwand");
		
		private String unlocalizedName;
		private String registyName;
		
		BetterBricksModItems(String unlocalizedName, String registyName) {
		this.unlocalizedName = unlocalizedName;
		this.registyName = registyName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistyName(){
			return registyName;
		}
		
	}
}
package com.Dark_but_Good.BetterBricksMod.proxy;

import init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
	}

}

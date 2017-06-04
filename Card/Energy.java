//package com.pokemon.Card;

import java.awt.image.BufferedImage;

//import Enums.CardCategory;
//import Enums.CardType;
//import Main.ImageLoader;

public class Energy extends Card {
	private BufferedImage icon;
	private CardCategory catagory;

	public Energy(String url, CardCategory catagory) {
		super(url, CardType.Engergy, catagory);
		this.catagory = catagory;
		ImageLoader loader = new ImageLoader();
		this.icon = loader.load("/" + catagory.toString().substring(0, 1).toLowerCase() + "Icon.png");
	}

	

	public BufferedImage getIcon() {
		return icon;
	}

}

package models.food;

import java.util.*;

import models.TypeOfSeat;

public class FoodService {

	private List<Food> foodList = new ArrayList<Food>();

	public void FoodMenu(TypeOfSeat seatClass) {
		if (seatClass.equals(TypeOfSeat.ECONOMY_CLASS)) {
			initalizeEconomyFood();
		}
		else {
			initalizeFirstFood();
		}
	}

	public List<Food> getMenu() {
		return foodList;
	}

	private void initalizeEconomyFood() {
		foodList.add(new Food("Sandwishes", 45));
		foodList.add(new Food("Hamburger", 65));
		foodList.add(new Food("Veggieburger", 65));
		foodList.add(new Food("Samon Sallad", 65));
		foodList.add(new Food("Swedish Meatballs", 65));
		foodList.add(new Food("Pancakes", 45));
		foodList.add(new Food("IceCream", 45));
	}

	private void initalizeFirstFood() {
		foodList.add(new Food("Lobster", 450));
		foodList.add(new Food("Veggieburger deluxe", 250));
		foodList.add(new Food("Mushroom stew", 125));
		foodList.add(new Food("Veggie Sallad", 100));
		foodList.add(new Food("Lemon Cheesecake", 125));
		foodList.add(new Food("Strawberry Cheesecake", 125));
		foodList.add(new Food("Waffles and icecream", 100));
	}

	public void setMenu(List<Food> foodList) {
		this.foodList = foodList;
	}

}

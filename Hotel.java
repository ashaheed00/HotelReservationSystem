// Hotel class

public class Hotel {
	private String name;
	private int weekdayRateRegular, weekendRateRegular, weekdayRateReward, weekendRateReward, ratings;

	public Hotel(String name, int weekdayRateRegular, int weekendRateRegular, int weekdayRateReward,
			int weekendRateReward, int ratings) {
		super();
		this.name = name;
		this.weekdayRateRegular = weekdayRateRegular;
		this.weekendRateRegular = weekendRateRegular;
		this.weekdayRateReward = weekdayRateReward;
		this.weekendRateReward = weekendRateReward;
		this.ratings = ratings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeekdayRateRegular() {
		return weekdayRateRegular;
	}

	public void setWeekdayRateRegular(int weekdayRateRegular) {
		this.weekdayRateRegular = weekdayRateRegular;
	}

	public int getWeekendRateRegular() {
		return weekendRateRegular;
	}

	public void setWeekendRateRegular(int weekendRateRegular) {
		this.weekendRateRegular = weekendRateRegular;
	}

	public int getWeekdayRateReward() {
		return weekdayRateReward;
	}

	public void setWeekdayRateReward(int weekdayRateReward) {
		this.weekdayRateReward = weekdayRateReward;
	}

	public int getWeekendRateReward() {
		return weekendRateReward;
	}

	public void setWeekendRateReward(int weekendRateReward) {
		this.weekendRateReward = weekendRateReward;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

}
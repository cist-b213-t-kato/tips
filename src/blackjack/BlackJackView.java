package blackjack;

public class BlackJackView implements Observer{

	private BlackJackModel model;

	public BlackJackView(BlackJackModel model){
		this.model = model;
		model.observers.add(this);
	}

	@Override
	public void update() {
		BlackJackActor player = model.getPlayer();
		BlackJackActor dealer = model.getDealer();

        System.out.println();
        dealer.shows();
        player.shows();
        System.out.println(model.getMessage());

	}

}

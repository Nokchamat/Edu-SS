package GameLevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn은 레벨이 부족합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("------- 중급자 레벨입니다. ------");
	}
	

}

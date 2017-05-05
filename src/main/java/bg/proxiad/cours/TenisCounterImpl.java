package bg.proxiad.cours;

import org.springframework.stereotype.Component;

@Component
public class TenisCounterImpl implements TenisCounter {
	
	private TenisCounterCongfig config;
	
	int[] currentScore = new int[] {0, 0};

	@Override
	public void init(TenisCounterCongfig config) {
		this.config = config;
	}

	@Override
	public void addPoint(PointInfo point) {
		if (point.isPlayer1()) {
			currentScore[0]++;
		} else {
			currentScore[1]++;
		}

	}

	@Override
	public ScoreInfo getScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

}

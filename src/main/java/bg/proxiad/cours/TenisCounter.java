package bg.proxiad.cours;

public interface TenisCounter {

	void init(TenisCounterCongfig config);
	
	void addPoint(PointInfo point);
	
	ScoreInfo getScore();
	
	void reset();
}

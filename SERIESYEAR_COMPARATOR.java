import java.util.Comparator;

public class SERIESYEAR_COMPARATOR {
	
		public int compare(Series series1, Series series2) 
		{
			int num;
			Integer series1Year = new Integer(0);
			Integer series2Year = new Integer(0);
			// sorts by year
			series1Year = Integer.getInteger(series1.getStartingYear());
			series2Year = Integer.getInteger(series2.getStartingYear());
			num = series1Year.compareTo(series2Year);
			return num;
			
		}
			
		
}

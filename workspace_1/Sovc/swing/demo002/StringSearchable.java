/*package demo002;

import java.awt.*;
import java.util.*;

public class StringSearchable implements Searchable<String, String> {
	private List<String> terms = new ArrayList<String>();
	public StringSearchable(List<String> terms){
		this.terms.addAll(terms);
	}	

	@Override
	public Collection<String> search(String value) {
		List<String> founds = new ArrayList<String>();
		for ( String s : terms ){
			if ( s.indexOf(value) == 0 ){
				founds.add(s);
			}
		}
		return founds;
	}
}
*/
package ar.edu.unq.po2.tp8.template.wikipedia;

import java.util.List;

public class MismaLetraInicial implements FiltroWikipedia{

	public static List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> pages) {
		return pages.stream().filter(p -> p.getTitle().charAt(0) == page.getTitle().charAt(0)).toList();
	}

}

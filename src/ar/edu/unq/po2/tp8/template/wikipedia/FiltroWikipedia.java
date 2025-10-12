package ar.edu.unq.po2.tp8.template.wikipedia;

import java.util.List;

public interface FiltroWikipedia {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedias);
}

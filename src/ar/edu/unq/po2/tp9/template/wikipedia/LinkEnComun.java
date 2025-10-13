package ar.edu.unq.po2.tp9.template.wikipedia;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkEnComun implements FiltroWikipedia {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> pages) {
		Set<String> pageLinksTitles = page.getLinks().stream().map(WikipediaPage::getTitle).collect(Collectors.toSet());
		
		return pages.stream()
				.filter(p -> p.getLinks().stream().map(WikipediaPage::getTitle).anyMatch(pageLinksTitles::contains)).collect(Collectors.toList());
	}



}

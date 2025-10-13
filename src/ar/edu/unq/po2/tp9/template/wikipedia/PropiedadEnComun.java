package ar.edu.unq.po2.tp9.template.wikipedia;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PropiedadEnComun implements FiltroWikipedia {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		Set<String> baseProperties = page.getInfobox().keySet();
				
		return wikipedia.stream()
                .filter(p -> p.getInfobox().keySet().stream()
                              .anyMatch(baseProperties::contains))
                .collect(Collectors.toList());
	}
}

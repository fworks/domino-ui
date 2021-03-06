package org.dominokit.domino.ui.scroll;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;

import static org.jboss.gwt.elemento.core.Elements.div;

public class HScrollPanel extends BaseDominoElement<HTMLDivElement, HScrollPanel> {

    private HTMLDivElement element = div().css("h-scroll-panel").asElement();

    public static HScrollPanel create(){
        return new HScrollPanel();
    }

    @Override
    public HTMLDivElement asElement() {
        return element;
    }
}

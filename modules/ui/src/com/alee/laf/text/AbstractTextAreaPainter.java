package com.alee.laf.text;

import com.alee.painter.Painter;
import com.alee.painter.SpecificPainter;

import javax.swing.plaf.basic.BasicTextUI;
import javax.swing.text.JTextComponent;

/**
 * Base interface for JTextComponent component painters.
 *
 * @author Alexandr Zernov
 */

public interface AbstractTextAreaPainter<E extends JTextComponent, U extends BasicTextUI> extends Painter<E, U>, SpecificPainter
{
}
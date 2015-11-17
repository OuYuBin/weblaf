package com.alee.laf.spinner;

import com.alee.painter.Painter;
import com.alee.painter.SpecificPainter;

import javax.swing.*;

/**
 * Base interface for JSpinner component painters.
 *
 * @author Alexandr Zernov
 */

public interface SpinnerPainter<E extends JSpinner, U extends WebSpinnerUI> extends Painter<E, U>, SpecificPainter
{
}
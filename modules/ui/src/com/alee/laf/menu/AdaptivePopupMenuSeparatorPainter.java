package com.alee.laf.menu;

import com.alee.painter.AdaptivePainter;
import com.alee.painter.Painter;

import javax.swing.*;

/**
 * Simple PopupMenuSeparatorPainter adapter class.
 * It is used to install simple non-specific painters into WebPopupMenuSeparatorUI.
 *
 * @author Alexandr Zernov
 */

public class AdaptivePopupMenuSeparatorPainter<E extends JPopupMenu.Separator, U extends WebPopupMenuSeparatorUI>
        extends AdaptivePainter<E, U> implements PopupMenuSeparatorPainter<E, U>
{
    /**
     * Constructs new AdaptivePopupMenuSeparatorPainter for the specified painter.
     *
     * @param painter painter to adapt
     */
    public AdaptivePopupMenuSeparatorPainter ( final Painter painter )
    {
        super ( painter );
    }
}

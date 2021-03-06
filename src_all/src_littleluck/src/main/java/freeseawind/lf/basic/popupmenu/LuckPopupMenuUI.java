package freeseawind.lf.basic.popupmenu;

import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPopupMenuUI;

/**
 * <p>
 * PopupMenuUI实现类，设置组件为不完全透明。
 * <p>
 *
 * <p>
 * The PopupMenuUI implementation class sets the component to be completely
 * transparent.
 * </p>
 * <p>
 * See Also:{@link LuckPopupMenuSeparatorUI}, {@link LuckPopupMenuUIBundle}.
 * </p>
 *
 * @author freeseawind@github
 * @version 1.0
 *
 */
public class LuckPopupMenuUI extends BasicPopupMenuUI
{
    public static ComponentUI createUI(JComponent c)
    {
        return new LuckPopupMenuUI();
    }

    public LuckPopupMenuUI()
    {
        super();
    }

    public void installUI(JComponent c)
    {
        super.installUI(c);
    }

    public void installDefaults()
    {
        super.installDefaults();

        LookAndFeel.installProperty(popupMenu, "opaque", Boolean.FALSE);
    }
}

package org.wordpress.android.ui.menus.items;

import android.content.Context;

import org.wordpress.android.R;
import org.wordpress.android.models.MenuItemModel;

/**
 */
public class TestimonialItemEditor extends BaseMenuItemEditor {
    public TestimonialItemEditor(Context context) {
        super(context);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.page_menu_item_edit_view;
    }

    @Override
    public MenuItemModel getMenuItem() {
        MenuItemModel menuItem = new MenuItemModel();
        return menuItem;
    }

    @Override
    public void onSave() {
    }

    @Override
    public void onDelete() {
    }
}
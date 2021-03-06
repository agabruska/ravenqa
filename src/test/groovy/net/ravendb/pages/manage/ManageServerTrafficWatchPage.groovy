package net.ravendb.pages.manage

import net.ravendb.modules.manage.ManageServerMenu;
import geb.Page


class ManageServerTrafficWatchPage extends Page {

    static at = {
        configureConnectionButton
        menu
    }

    static content = {
        menu { module ManageServerMenu }

        configureConnectionButton { $("button", text:"Configure Connection") }
    }
}

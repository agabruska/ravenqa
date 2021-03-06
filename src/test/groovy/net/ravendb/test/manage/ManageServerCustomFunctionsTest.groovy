package net.ravendb.test.manage

import net.ravendb.pages.ResourcesPage
import net.ravendb.pages.manage.ManageServerGlobalConfigurationPage;
import net.ravendb.pages.manage.ManageServerPage;
import net.ravendb.test.TestBase;

import org.testng.annotations.Test


class ManageServerCustomFunctionsTest extends TestBase {

    /**
     * User can create and delete Global Configuration for Custom Functions.
     * @Step Click Manage Server button on Resources page.
     * @Step Choose Global Configuration from left menu.
     * @Step Create Custom Functions configuration.
     * @verification Configuration created and deleted.
     */
    @Test(groups="Smoke")
    void canCreateAndDeleteCustomFunctionsConfiguration() {
        at ResourcesPage

        manageYourServerButton.click()
        waitFor { at ManageServerPage }

        menu.globalConfigurationLink.click()
        waitFor { at ManageServerGlobalConfigurationPage }

        customFunctionsTab.click()
        waitFor { customFunctions.createGlobalConfigurationForCustomFunctionsButton.displayed }

        customFunctions.createGlobalConfigurationForCustomFunctionsButton.click()
        customFunctions.typeJavascript("exports.greet = function(name) {return \"Hello\" + name + \"!\"}")
        customFunctions.save()
        customFunctions.remove()
    }
}

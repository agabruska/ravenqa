package net.ravendb

import net.ravendb.pages.ManageServerGlobalConfigurationPage
import net.ravendb.pages.ManageServerPage
import net.ravendb.pages.ResourcesPage

import org.testng.annotations.Test


class ManageServerVersioningTest extends TestBase {

    /**
     * User can create and delete Global Configuration for Versioning.
     * @Step Click Manage Server button on Resources page.
     * @Step Choose Global Configuration from left menu.
     * @Step Create Versioning configuration.
     * @verification Configuration created and deleted.
     */
    @Test(groups="Smoke",enabled=false)
    void canCreateAndDeleteVersioningConfiguration() {
        at ResourcesPage

        manageYourServerButton.click()
        waitFor { at ManageServerPage }

        menu.globalConfigurationLink.click()
        waitFor { at ManageServerGlobalConfigurationPage }

        versioningTab.click()
        waitFor { versioning.createGlobalConfigurationForVersioningButton.displayed }

        versioning.createGlobalConfigurationForVersioningButton.click()
        versioning.add()
        versioning.add()
        versioning.save()
        versioning.remove()
    }
}

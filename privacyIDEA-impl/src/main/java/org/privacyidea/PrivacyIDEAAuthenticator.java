package org.privacyidea;

import java.io.IOException;
import javax.annotation.Nonnull;

import net.shibboleth.idp.plugin.IdPPlugin;
import net.shibboleth.idp.plugin.PluginException;
import net.shibboleth.idp.plugin.PropertyDrivenIdPPlugin;

/**
 * privacyIDEA MFA plugin for the Shibboleth IdP.
 */
public class PrivacyIDEAAuthenticator extends PropertyDrivenIdPPlugin
{
    /**
     * Constructor.
     *
     * @param PrivacyIDEAPlugin type of plugin
     * @throws IOException      if properties can't be loaded
     * @throws PluginException  if another error occurs
     */
    public PrivacyIDEAAuthenticator(@Nonnull final Class<? extends IdPPlugin> PrivacyIDEAAuthenticator) throws IOException, PluginException
    {
        super(PrivacyIDEAAuthenticator);
    }
}
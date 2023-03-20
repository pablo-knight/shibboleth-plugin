package org.privacyidea;

import java.io.IOException;
import javax.annotation.Nonnull;

import net.shibboleth.idp.plugin.IdPPlugin;
import net.shibboleth.idp.plugin.PluginException;
import net.shibboleth.idp.plugin.PropertyDrivenIdPPlugin;

/**
 * Plugin description about the webauthn plugin.
 */
public class Authenticator extends PropertyDrivenIdPPlugin
{
    /**
     * Constructor.
     *
     * @param Authenticator type of plugin
     * @throws IOException     if properties can't be loaded
     * @throws PluginException if another error occurs
     */
    public Authenticator(@Nonnull final Class<? extends IdPPlugin> Authenticator) throws IOException, PluginException
    {
        super(Authenticator);
    }
}
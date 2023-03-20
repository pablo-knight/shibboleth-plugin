package org.privacyidea;

import java.io.IOException;

import net.shibboleth.idp.module.ModuleException;
import net.shibboleth.idp.module.impl.PluginIdPModule;


/**
 * {@link IdPModule IdP Module} implementation.
 */
public class ExampleModule extends PluginIdPModule{
    
    /**
     * Constructor.
     *  
     * @throws ModuleException on error
     * @throws IOException on error
     */
    public ExampleModule() throws IOException, ModuleException {
        super(ExampleModule.class);
    }
    

}
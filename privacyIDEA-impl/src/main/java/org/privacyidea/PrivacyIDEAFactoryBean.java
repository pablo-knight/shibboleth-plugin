package org.privacyidea;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class PrivacyIDEAFactoryBean extends AbstractFactoryBean<PrivacyIDEA>
{
    private final String serverURL;
    private final String realm;
    private final String authenticationFlow;
    private final String serviceAccountName;
    private final String serviceAccountPass;
    private final String serviceAccountRealm;
    private final boolean doLog;

    public PrivacyIDEAFactoryBean()
    {}

    public Class<?> getObjectType() {
        return PrivacyIDEA.class;
    }

    @Override
    protected @NotNull PrivacyIDEA createInstance() throws Exception
    {
        return new PrivacyIDEA();
    }

}

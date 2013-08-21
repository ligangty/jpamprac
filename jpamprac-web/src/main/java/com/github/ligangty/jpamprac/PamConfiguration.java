/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ligangty.jpamprac;

import net.sf.jpam.Pam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.configuration.Configuration;

/**
 *
 * @author gli
 */
public class PamConfiguration {

    private static final String PAM_SERVICE_NAME = "pam.serviceName";
    private Configuration configuration;
    private Pam pam = null;

    /**
     * Creates new instance of LdapConfiguration.
     *
     * @param configuration configuration
     */
    public PamConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Pam getPAM() {
        if (pam == null) {
            pam = newInstance();
        }
        return pam;
    }

    private Pam newInstance() {
        Pam result = null;
        String serviceName = configuration.getString(PAM_SERVICE_NAME, null);
        if (serviceName == null) {
            Logger logger = LoggerFactory.getLogger(getClass());
            logger.error("Unable to determine PAM service name. Please check that '" + PAM_SERVICE_NAME + "' property is set in 'sonar.properties' in ");
        } else {
            result = new Pam(serviceName);
        }

        return result;
    }
}

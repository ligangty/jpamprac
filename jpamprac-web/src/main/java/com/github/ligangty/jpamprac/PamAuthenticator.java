/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.ligangty.jpamprac;

/**
 *
 * @author gli
 */
public class PamAuthenticator {

    private PamConfiguration configuration;

    /**
     * Creates a new instance of PamAuthenticator with specified configuration.
     *
     * @param configuration PAM configuration
     */
    public PamAuthenticator(PamConfiguration configuration) {
        this.configuration = configuration;
    }

    public void init() {
    }

    public boolean authenticate(final String login, final String password) {
        return configuration.getPAM().authenticateSuccessful(login, password);
    }
}
